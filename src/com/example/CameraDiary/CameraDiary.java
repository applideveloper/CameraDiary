package com.example.CameraDiary;

import com.kujirahand.jsWaffle.WaffleActivity;
import com.kujirahand.jsWaffle.model.WaffleFlags;

public class CameraDiary extends WaffleActivity {
    
    /** Set jsWaffle Setting flags */
    @Override
    protected void onSetWaffleFlags(WaffleFlags flags) {
    	super.onSetWaffleFlags(flags);
    	// set flags
    	flags.mainHtmlUrl = "file:///android_asset/www/index.html";
    	flags.keepScreenNotSleep = false;
    	flags.useFullScreen = false;
    	flags.useVerticalScrollBar = false;
    }
    
    
    /** Please add the custom plug-in if it is necessary. */
    @Override
    protected void onAddPlugins() {
    	super.onAddPlugins();
    }

}