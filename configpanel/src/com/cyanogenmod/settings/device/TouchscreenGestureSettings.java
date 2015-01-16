package com.config.settings.device;

import com.config.settings.device.utils.NodePreferenceActivity;

import android.os.Bundle;

public class TouchscreenGestureSettings extends NodePreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.touchscreen_panel);
    }

}
