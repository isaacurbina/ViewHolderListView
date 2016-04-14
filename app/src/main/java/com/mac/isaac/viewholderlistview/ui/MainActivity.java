package com.mac.isaac.viewholderlistview.ui;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.mac.isaac.viewholderlistview.MyArrayAdapter;
import com.mac.isaac.viewholderlistview.R;
import com.mac.isaac.viewholderlistview.entities.RelatedTopic;
import com.mac.isaac.viewholderlistview.entities.Result;
import com.mac.isaac.viewholderlistview.retrofit.RetrofitInterface;

import java.util.List;

import butterknife.Bind;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    List<RelatedTopic> charactersList;
    @Bind(R.id.list_view) ListView listView;
    MyArrayAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list_view);

        FetchCharactersList myTask = new FetchCharactersList();
        myTask.execute("simpsons characters");
    }

    private class FetchCharactersList extends AsyncTask<String, Integer, Result> {
        @Override
        protected void onPostExecute(Result results) {
            super.onPostExecute(results);
            Log.i("MYTAG", "onPostExecute()");
            try {
                if (results==null) {
                    Toast.makeText(MainActivity.this, "No results found", Toast.LENGTH_SHORT).show();
                } else {
                    charactersList = results.getRelatedTopics();

                    for (RelatedTopic relatedTopic : results.getRelatedTopics()) {
                        //tvResults.setText(tvResults.getText() + relatedTopic.getText() + "\n");
                        //relatedTopicsList.add(relatedTopic);
                        Log.i("MYTAG", relatedTopic.getText());
                    }
                    myAdapter = new MyArrayAdapter(getApplicationContext(), R.layout.list_item, charactersList);
                    listView.setAdapter(myAdapter);
                }
            } catch (Exception e) {
                Log.e("MYTAG", "ERROR for: " +e.getMessage());
            }
        }

        @Override
        protected Result doInBackground(String... params) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.duckduckgo.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            RetrofitInterface rfInterface = retrofit.create(RetrofitInterface.class);

            Call<Result> listCall = rfInterface.listCharacters(params[0]);

            Result results = null;

            try {
                results = listCall.execute().body();
            } catch (Exception e) {
                Log.e("MYAPP", "Error: " + e.toString());
            }

            return results;
        }
    }
}
