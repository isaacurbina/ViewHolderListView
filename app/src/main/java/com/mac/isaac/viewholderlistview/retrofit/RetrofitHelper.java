package com.mac.isaac.viewholderlistview.retrofit;

import com.mac.isaac.viewholderlistview.entities.RelatedTopic;
import com.mac.isaac.viewholderlistview.entities.Result;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 3/11/2016.
 */
public class RetrofitHelper {

    public static void main(String[] args) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.duckduckgo.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitInterface rfInterface = retrofit.create(RetrofitInterface.class);

        Call<Result> listCall = rfInterface.listCharacters("simpsons characters");

        Result results = null;

        try {
            results = listCall.execute().body();
            for (RelatedTopic result : results.getRelatedTopics()){
                System.out.println(result.getText());
            }
        } catch (Exception e) {
            //Log.e("MYAPP", "Error: " + e.toString());
        }

        //return results;

    }
}