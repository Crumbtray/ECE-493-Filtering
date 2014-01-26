package com.photofilter;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class FilterSettingsActivity extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Display the fragment as the main content.
        getFragmentManager().beginTransaction().replace(android.R.id.content, new FilterSettingsFragment()).commit();
	}
}
