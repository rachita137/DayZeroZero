package tatastrive.application.dayzerozero;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.text.TextUtils.concat;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView t1, t2, t3;
    //declare string
    String string1, string2, string3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        //declare text variable & assign to textview(in xml)
        t1 = findViewById( R.id.textView3 );
        t2 = findViewById( R.id.textView4 );
        t3 = findViewById( R.id.textView5 );
        button = findViewById( R.id.button );
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                string1 = t1.getText().toString().trim();//access value,convert string & white space delete
                string2 = t2.getText().toString().trim();
                string3 = t3.getText().toString().trim();
                //concat
                string3 = string3 + " " + string1 + " " + string2;
                //setting string
                t3.setText(string3);
                t3.setTextColor( getResources().getColor( R.color.colorAccent ) );
                t3.setTextSize( 20 );
                t3.setAllCaps( true );
                t3.setTypeface(null, Typeface.BOLD );
                Toast.makeText( MainActivity.this, "hi", Toast.LENGTH_SHORT ).show();


            }
        } );


    }
}
