package a.librarysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Search , Reserve , Record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Search = (Button) findViewById(R.id.search);

        Reserve = (Button) findViewById(R.id.reserve);

        Record = (Button) findViewById(R.id.bookreturn);

        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext() , SearchActivity.class);
                startActivity(i);



            }
        });




    }

    private void Search(){

    }
}
