package com.zhanghao.youdaonote.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zhanghao.youdaonote.R;
import com.zhanghao.youdaonote.activity.UserInfoActivity;
import com.zhanghao.youdaonote.entity.NoteUser;

/**
 * Created by ZH on 2016/2/21.
 */
public class SettingFragment extends Fragment implements View.OnClickListener {
    private TextView settingFragmentId;
    private RelativeLayout layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View secondView = inflater.inflate(R.layout.setting_fragment,container,false);
        layout = (RelativeLayout) secondView.findViewById(R.id.setting_login);
        settingFragmentId = (TextView) layout.findViewById(R.id.settingFragment_id);
        layout.setOnClickListener(this);
        settingFragmentId.setText(/*TApplication.instance.getUser().getUsername()*/new NoteUser().getUsername());
        return secondView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setting_login:
                Intent i = new Intent(getContext(), UserInfoActivity.class);
                startActivity(i);
                break;


        }
    }
}
