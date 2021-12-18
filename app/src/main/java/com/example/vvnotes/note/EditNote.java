package com.example.vvnotes.note;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import com.example.vvnotes.R;

public class EditNote extends AppCompatActivity {
    Intent data;
    EditText editNoteTitle,editNoteContent;
    FirebaseFirestore fStore;
    ProgressBar spinner;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fStore = fStore.getInstance();
        spinner = findViewById(R.id.progressBar2);
        user = FirebaseAuth.getInstance().getCurrentUser();


        data = getIntent();



        String noteTitle = data.getStringExtra("title");
        String noteContent = data.getStringExtra("content");

        editNoteTitle.setText(noteTitle);
        editNoteContent.setText(noteContent);



    }
}
