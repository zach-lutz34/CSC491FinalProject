package com.example.cscseniorseminarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        //identifying videoViews and setting them up (parsing) to play each video
        VideoView videoView = findViewById(R.id.vidView1);
        String VideoPath = "android.resource://" + getPackageName() + "/" +
                R.raw.one_leg_one_arm_dumbbell_rdl;
        Uri uri = Uri.parse(VideoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        VideoView videoView2 = findViewById(R.id.vidView2);
        String VideoPath2 = "android.resource://" + getPackageName() + "/" +
                R.raw.bench_press;
        Uri uri2 = Uri.parse(VideoPath2);
        videoView2.setVideoURI(uri2);

        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);

        VideoView videoView3 = findViewById(R.id.vidView3);
        String VideoPath3 = "android.resource://" + getPackageName() + "/" +
                R.raw.db_floor_press;
        Uri uri3 = Uri.parse(VideoPath3);
        videoView3.setVideoURI(uri3);

        MediaController mediaController3 = new MediaController(this);
        videoView3.setMediaController(mediaController3);
        mediaController3.setAnchorView(videoView3);

        VideoView videoView4 = findViewById(R.id.vidView4);
        String VideoPath4 = "android.resource://" + getPackageName() + "/" +
                R.raw.barbell_deadlift;
        Uri uri4 = Uri.parse(VideoPath4);
        videoView4.setVideoURI(uri4);

        MediaController mediaController4 = new MediaController(this);
        videoView4.setMediaController(mediaController4);
        mediaController4.setAnchorView(videoView4);

        VideoView videoView5 = findViewById(R.id.vidView5);
        String VideoPath5 = "android.resource://" + getPackageName() + "/" +
                R.raw.db_bench_press;
        Uri uri5 = Uri.parse(VideoPath5);
        videoView5.setVideoURI(uri5);

        MediaController mediaController5 = new MediaController(this);
        videoView5.setMediaController(mediaController5);
        mediaController5.setAnchorView(videoView5);

        VideoView videoView6 = findViewById(R.id.vidView6);
        String VideoPath6 = "android.resource://" + getPackageName() + "/" +
                R.raw.trap_bar_deadlift;
        Uri uri6 = Uri.parse(VideoPath6);
        videoView6.setVideoURI(uri6);

        MediaController mediaController6 = new MediaController(this);
        videoView6.setMediaController(mediaController6);
        mediaController6.setAnchorView(videoView6);

        VideoView videoView7 = findViewById(R.id.vidView7);
        String VideoPath7 = "android.resource://" + getPackageName() + "/" +
                R.raw.alternating_db_bench_press;
        Uri uri7 = Uri.parse(VideoPath7);
        videoView7.setVideoURI(uri7);

        MediaController mediaController7 = new MediaController(this);
        videoView7.setMediaController(mediaController7);
        mediaController7.setAnchorView(videoView7);

        VideoView videoView8 = findViewById(R.id.vidView8);
        String VideoPath8 = "android.resource://" + getPackageName() + "/" +
                R.raw.db_row;
        Uri uri8 = Uri.parse(VideoPath8);
        videoView8.setVideoURI(uri8);

        MediaController mediaController8 = new MediaController(this);
        videoView8.setMediaController(mediaController8);
        mediaController8.setAnchorView(videoView8);


    }
}