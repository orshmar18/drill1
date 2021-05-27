package il.co.syntax.drill1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText firstName = findViewById(R.id.first_hint);
        EditText lastName = findViewById(R.id.last_hint);
        Button finishBtn = findViewById(R.id.finish_btn);
        TextView fullName = findViewById(R.id.final_text);

finishBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String first = firstName.getText().toString();

        String last = lastName.getText().toString();

        fullName.setText(first + " " + last);
    }
});



    }
}