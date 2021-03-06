package com.example.bloodline;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DonorList extends ArrayAdapter<UserInformation> {

    private Activity context;
    private List<UserInformation> userInformationList;

    public DonorList(Activity context,List<UserInformation> userInformationList){
        super(context,R.layout.list_layout,userInformationList);
        this.context = context;
        this.userInformationList = userInformationList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);
        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);
        TextView textViewBloodGroup = (TextView) listViewItem.findViewById(R.id.textViewBloodGroup);

        UserInformation userInformation = userInformationList.get(position);

        textViewName.setText(userInformation.getName());
        textViewBloodGroup.setText(userInformation.getDonor_bloodGroup());
        return listViewItem;
    }
}
