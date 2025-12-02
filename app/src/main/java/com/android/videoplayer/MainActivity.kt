package com.android.videoplayer

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.MediaController
import android.widget.VideoView
import androidx.core.net.toUri

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Use XML layout
        setContentView(R.layout.activity_main)

        // Find the VideoView class by its id
        val videoView = findViewById<VideoView>(R.id.testView)

        // Creating MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        // specify the location of media file
        val uri: Uri = "android.resource://${packageName}/raw/video".toUri()

        // Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}