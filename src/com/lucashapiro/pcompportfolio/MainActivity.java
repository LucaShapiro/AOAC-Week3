package com.lucashapiro.pcompportfolio;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	Button newProject;
	Button oldProjects;
	Button browseProjects;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		newProject = (Button) this.findViewById(R.id.newproject);
		newProject.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		setContentView(R.layout.activity_new_project);
		
		
	}

}
