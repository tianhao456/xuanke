package qq.app01.com.myxuanke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pageC(View view) {
        switch (view.getId()) {
            case R.id.rl1:
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra(EXTRA_MESSAGE, "rl1");
                startActivity(intent);
                break;
            case R.id.rl2:
                Intent intent2 = new Intent(MainActivity.this, Main2Activity.class);
                intent2.putExtra(EXTRA_MESSAGE, "rl2");;
                startActivity(intent2);
                break;
            case R.id.rl3:
                Intent intent3 = new Intent(MainActivity.this, Main2Activity.class);
                intent3.putExtra(EXTRA_MESSAGE, "rl3");
                startActivity(intent3);
                break;
            case R.id.rl4:
                Intent intent4 = new Intent(MainActivity.this, Main2Activity.class);
                intent4.putExtra(EXTRA_MESSAGE, "rl4");
                startActivity(intent4);
                break;
            case R.id.rl5:
                Intent intent5 = new Intent(MainActivity.this, Main2Activity.class);
                intent5.putExtra(EXTRA_MESSAGE, "rl5");
                startActivity(intent5);
                break;
            case R.id.rl6:
                Intent intent6 = new Intent(MainActivity.this, Main2Activity.class);
                intent6.putExtra(EXTRA_MESSAGE, "rl6");
                startActivity(intent6);
                break;
        }
}}
