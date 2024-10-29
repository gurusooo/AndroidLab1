package com.example.firstlab1;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView greetMessageTextView = findViewById(R.id.greetMessageTextView);
        nameEditText = findViewById(R.id.nameEditText);
        Button submitButton = findViewById(R.id.submitButton);
        String greetMessage = getIntent().getStringExtra("greet");
        greetMessageTextView.setText(greetMessage);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                String name = nameEditText.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("name", name);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}
