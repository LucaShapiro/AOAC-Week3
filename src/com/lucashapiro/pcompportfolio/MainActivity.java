package com.lucashapiro.pcompportfolio;

import java.io.IOException;
import java.io.InputStream;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.VideoView;

public class MainActivity extends Activity implements OnClickListener {
	
	Button newProject;
	Button oldProjects;
	Button browseProjects;
	ImageView imageView;
	LayoutInflater inflater;
	View browseView;
	
	//from Browse Projects
	Button thisProject;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		newProject = (Button) this.findViewById(R.id.newproject);
		newProject.setOnClickListener(this);
		
		oldProjects = (Button) this.findViewById(R.id.oldprojects);
		oldProjects.setOnClickListener(this);
		
		browseProjects = (Button) this.findViewById(R.id.browseprojects);
		browseProjects.setOnClickListener(this);
		
		imageView = (ImageView) this.findViewById(R.id.imageView1);
		
		inflater = LayoutInflater.from(this);
        browseView = inflater.inflate(R.layout.browse_projects, null);
		
        thisProject = (Button) this.findViewById(R.id.thisproject);
		thisProject.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if (v == newProject) {
			setContentView(R.layout.activity_new_project);
		}
		if (v == oldProjects) {
			setContentView(R.layout.activity_old_projects);
		}
		if (v == browseProjects) {
			setContentView(R.layout.browse_projects);
		}
		if (v == thisProject) {
			setContentView(R.layout.activity_new_project);
		}
		
	}
	
	public class ViewTheVideo extends Activity 
	{
	    VideoView vv;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        vv = (VideoView) this.findViewById(R.id.videoview);
			Uri videoUri = Uri.parse(Environment.getExternalStorageDirectory().getPath() + "/TestMovie.mp4");
	        vv.setVideoURI(videoUri);
	        vv.start();
	    }
	}

}
