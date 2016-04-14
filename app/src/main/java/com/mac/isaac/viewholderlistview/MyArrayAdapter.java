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

    static class MyViewHolderItem {
        TextView line1;
        TextView line2;
        ImageView icon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyViewHolderItem myViewHolder;

        if(convertView==null){
            // inflate the layout if the view doesn't exist
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(layoutResourceId, parent, false);
            myViewHolder = new MyViewHolderItem();
            myViewHolder.line1 = (TextView) convertView.findViewById(R.id.first_line);
            myViewHolder.line2 = (TextView) convertView.findViewById(R.id.second_line);
            myViewHolder.icon = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(myViewHolder);
        } else { // if it exists, let's use the ViewHolder pattern
            myViewHolder = (MyViewHolderItem) convertView.getTag();
        }

        // object item based on the position
        RelatedTopic objectItem = data.get(position);

        // get the TextView and then set the text (item name) and tag (item ID) values
        myViewHolder.line1.setText(objectItem.getText());
        TextView line2 = (TextView) convertView.findViewById(R.id.second_line);
        myViewHolder.line2.setText(myViewHolder.line2.getText()+
                "\n"+
                objectItem.getFirstURL());
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
