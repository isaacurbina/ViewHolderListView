package com.mac.isaac.viewholderlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mac.isaac.viewholderlistview.entities.RelatedTopic;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.ButterKnife;

// here's our beautiful adapter
public class MyArrayAdapter extends ArrayAdapter<RelatedTopic> {

    Context mContext;
    int layoutResourceId;
    List<RelatedTopic> data;

    public MyArrayAdapter(Context mContext, int layoutResourceId, List<RelatedTopic> data) {
        super(mContext, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /*
         * The convertView argument is essentially a "ScrapView" as described is Lucas post
         * http://lucasr.org/2012/04/05/performance-tips-for-androids-listview/
         * It will have a non-null value when ListView is asking you recycle the row layout.
         * So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
         */
        if(convertView==null){
            // inflate the layout
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(layoutResourceId, parent, false);
        }

        // object item based on the position
        RelatedTopic objectItem = data.get(position);

        // get the TextView and then set the text (item name) and tag (item ID) values
        TextView line1 = (TextView) convertView.findViewById(R.id.firstLine);
        line1.setText("");
        line1.setText(objectItem.getText());
        TextView line2 = (TextView) convertView.findViewById(R.id.secondLine);
        line2.setText("");
        line2.setText(objectItem.getFirstURL());
        ImageView icon = (ImageView) convertView.findViewById(R.id.icon);
        icon.setImageResource(R.mipmap.ic_launcher);
        try {
            Picasso.with(getContext())
                    .load(objectItem.getIcon().getURL())
                    .placeholder(R.mipmap.ic_launcher)
                    .into(icon);
        } catch(Exception e) {
            Log.e("MYTAG", "Error loading Picasso image: "+e.getMessage()+e.getStackTrace());
        }
        return convertView;
    }

}
