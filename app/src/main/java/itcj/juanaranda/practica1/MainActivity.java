package itcj.juanaranda.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button incrementButton = findViewById(R.id.increment);
        Button decrementButton = findViewById(R.id.decrement);
        TextView textView = findViewById(R.id.count);

        textView.setText(String.valueOf((count)));

        incrementButton.setOnClickListener(v -> {
            if (count >= 5) {
                Toast.makeText(getApplicationContext(), "Ya estuvo compa", Toast.LENGTH_SHORT).show();
            } else {
                count++;
                textView.setText(String.valueOf((count)));
            }

        });

        decrementButton.setOnClickListener(v -> {
            if (count > 0) {
                count--;
                textView.setText(String.valueOf(count));
            } else {
                Toast.makeText(getApplicationContext(), "Ya estuvo compa", Toast.LENGTH_SHORT).show();
            }

        });

    }
}