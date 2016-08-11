package qq.app01.com.myxuanke;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Type;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.view.View.generateViewId;

public class Main2Activity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Intent intent = getIntent();
        final String massage = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        final TextView textView = (TextView) findViewById(R.id.text1);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.a2r2);

        assert textView != null;
        if ("rl1".equals(massage)) {
            textView.setText(R.string.t1);
            relativeLayout.setGravity(Gravity.CENTER);

            RelativeLayout r1 = new RelativeLayout(Main2Activity.this);
            r1.setId(generateViewId());
            TextView textView1 = new TextView(Main2Activity.this);
            textView1.setText(R.string.name);
            textView1.setId(generateViewId());
            textView1.setPadding(20, 10, 20, 20);
            textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.sy_color));
            textView1.setTextSize(20);
            r1.addView(textView1);


            EditText editText1 = new EditText(Main2Activity.this);
            editText1.setBackgroundResource(R.drawable.biankuang2);
            RelativeLayout.LayoutParams ed_param = new RelativeLayout.LayoutParams(500, 110);
            ed_param.addRule(RelativeLayout.RIGHT_OF, textView1.getId());
            editText1.setLayoutParams(ed_param);
            r1.addView(editText1);
            relativeLayout.addView(r1);


            RelativeLayout r3 = new RelativeLayout(Main2Activity.this);
            r3.setId(generateViewId());

            TextView textView3 = new TextView(Main2Activity.this);
            textView3.setText("性别:");
            textView3.setId(generateViewId());
            textView3.setTextColor(ContextCompat.getColor(textView3.getContext(), R.color.sy_color));
            textView3.setTextSize(20);
            textView3.setPadding(20, 10, 20, 0);
            r3.addView(textView3);

            RadioGroup rg1 = new RadioGroup(Main2Activity.this);
            rg1.setOrientation(LinearLayout.HORIZONTAL);
            RelativeLayout.LayoutParams rg1p = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            rg1p.addRule(RelativeLayout.RIGHT_OF, textView3.getId());
            rg1.setLayoutParams(rg1p);

            RadioButton rb1 = new RadioButton(Main2Activity.this);
            LinearLayout.LayoutParams rb1_param = new LinearLayout.LayoutParams(250, ViewGroup.LayoutParams.WRAP_CONTENT);
            rb1.setLayoutParams(rb1_param);
            rb1.setText("男");


            RadioButton rb2 = new RadioButton(Main2Activity.this);
            rb2.setText("女");
            LinearLayout.LayoutParams rb2_param = new LinearLayout.LayoutParams(250, ViewGroup.LayoutParams.WRAP_CONTENT);
            rb2.setLayoutParams(rb2_param);


            rg1.addView(rb1);
            rg1.addView(rb2);

            r3.addView(rg1);

            RelativeLayout.LayoutParams rl2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            rl2.addRule(RelativeLayout.BELOW, r1.getId());
            rl2.setMargins(0, 30, 0, 0);
            r3.setLayoutParams(rl2);
            relativeLayout.addView(r3);


            RelativeLayout r2 = new RelativeLayout(Main2Activity.this);
               r2.setId(generateViewId());

            TextView textView2 = new TextView(Main2Activity.this);
            textView2.setText(R.string.age);
            textView2.setId(generateViewId());
            textView2.setPadding(20, 10, 20, 20);
            textView2.setTextColor(ContextCompat.getColor(textView2.getContext(), R.color.sy_color));
            textView2.setTextSize(20);
            r2.addView(textView2);


            EditText editText2 = new EditText(Main2Activity.this);
            editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
            editText2.setBackgroundResource(R.drawable.biankuang2);
            RelativeLayout.LayoutParams ed2_param = new RelativeLayout.LayoutParams(500, 110);
            ed2_param.addRule(RelativeLayout.RIGHT_OF, textView2.getId());
            editText2.setLayoutParams(ed2_param);
            r2.addView(editText2);

            RelativeLayout.LayoutParams rl1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            rl1.addRule(RelativeLayout.BELOW, r3.getId());
            rl1.setMargins(0, 30, 0, 0);
            r2.setLayoutParams(rl1);
            relativeLayout.addView(r2);

            final Button button = new Button(Main2Activity.this);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    textView.setText(R.string.chaxun);


                    button.setVisibility(View.GONE);

                    final TextView textView1 = new TextView(Main2Activity.this);
                    textView1.setText(R.string.jieguotxt);
                    textView1.setTextSize(35);
                    textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.sy_color));
                    RelativeLayout.LayoutParams t1params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    t1params.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    textView1.setLayoutParams(t1params);
                    relativeLayout.addView(textView1);

                }
            });
            button.setBackgroundResource(R.drawable.yuanjiao);
            button.setText(R.string.chaxunxinxi);
            RelativeLayout.LayoutParams btn = new RelativeLayout.LayoutParams(400, 150);
            btn.addRule(RelativeLayout.BELOW, r2.getId());
            btn.setMargins(150, 150, 0, 0);
            button.setLayoutParams(btn);

            relativeLayout.addView(button);


        } else {
            if ("rl2".equals(massage)) {

                textView.setText(R.string.t2);
                final GridView gridView = new GridView(Main2Activity.this);
                gridView.setId(generateViewId());
                gridView.setNumColumns(4);
                RelativeLayout.LayoutParams g1params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                gridView.setLayoutParams(g1params);

                BaseAdapter baseAdapter = new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return 24;
                    }

                    @Override
                    public Object getItem(int i) {
                        return null;
                    }

                    @Override
                    public long getItemId(int i) {
                        return i;
                    }

                    @Override
                    public View getView(int i, View view, ViewGroup viewGroup) {
                        RelativeLayout sds = new RelativeLayout(Main2Activity.this);
                        TextView textView = new TextView(Main2Activity.this);

                        textView.setBackgroundResource(R.drawable.biankuang);
                        RelativeLayout.LayoutParams tt = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 130);
                        textView.setLayoutParams(tt);
                        sds.addView(textView);
                        return sds;
                    }
                };
                gridView.setAdapter(baseAdapter);

                relativeLayout.setPadding(40, 80, 40, 40);
                relativeLayout.addView(gridView);
                final Button button = new Button(Main2Activity.this);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textView.setText(R.string.chaxun);
                        gridView.setVisibility(View.GONE);
                        button.setVisibility(View.GONE);
                        final TextView textView1 = new TextView(Main2Activity.this);
                        textView1.setText(R.string.jieguotxt);
                        textView1.setTextSize(35);
                        textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.sy_color));
                        RelativeLayout.LayoutParams t1params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                        t1params.addRule(RelativeLayout.CENTER_HORIZONTAL);
                        textView1.setLayoutParams(t1params);
                        relativeLayout.addView(textView1);
                    }
                });
                button.setBackgroundResource(R.drawable.yuanjiao);
                button.setText(R.string.chaxunxinxi);
                RelativeLayout.LayoutParams btn = new RelativeLayout.LayoutParams(400, 150);
                btn.addRule(RelativeLayout.CENTER_HORIZONTAL);
                btn.addRule(RelativeLayout.BELOW, gridView.getId());
                btn.setMargins(0, 70, 0, 0);
                button.setLayoutParams(btn);

                relativeLayout.addView(button);

            } else {
                if ("rl3".equals(massage)) {
                    textView.setText(R.string.t3);
                    final TextView textView1 = new TextView(Main2Activity.this);
                    textView1.setId(generateViewId());
                    textView1.setPadding(10, 5, 10, 5);
                    textView1.setText(R.string.name);
                    textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.sy_color));


                    final EditText editext = new EditText(Main2Activity.this);
                    editext.setId(generateViewId());


                    final Button button = new Button(Main2Activity.this);
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            textView.setText(R.string.chaxun);
                            textView1.setVisibility(View.GONE);
                            editext.setVisibility(View.GONE);
                            button.setVisibility(View.GONE);

                            final TextView textView1 = new TextView(Main2Activity.this);
                            textView1.setText(R.string.jieguotxt);
                            textView1.setTextSize(35);
                            textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.sy_color));
                            RelativeLayout.LayoutParams t1params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                            t1params.addRule(RelativeLayout.CENTER_HORIZONTAL);
                            textView1.setLayoutParams(t1params);
                            relativeLayout.addView(textView1);

                        }
                    });
                    button.setBackgroundResource(R.drawable.yuanjiao);
                    button.setText(R.string.chaxunxinxi);
                    RelativeLayout.LayoutParams btn = new RelativeLayout.LayoutParams(400, 150);
                    btn.addRule(RelativeLayout.CENTER_HORIZONTAL);
//                    btn.addRule(RelativeLayout.BELOW,gridView.getId());
                    btn.setMargins(0, 70, 0, 0);
                    button.setLayoutParams(btn);

                    relativeLayout.addView(button);

                } else {
                    if ("rl4".equals(massage)) {

                        textView.setText(R.string.t4);
                        final GridView gridView = new GridView(Main2Activity.this);
                        gridView.setId(generateViewId());
                        gridView.setNumColumns(4);
                        RelativeLayout.LayoutParams g1params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

                        gridView.setLayoutParams(g1params);

                        BaseAdapter baseAdapter = new BaseAdapter() {
                            @Override
                            public int getCount() {
                                return 24;
                            }

                            @Override
                            public Object getItem(int i) {
                                return null;
                            }

                            @Override
                            public long getItemId(int i) {
                                return i;
                            }

                            @Override
                            public View getView(int i, View view, ViewGroup viewGroup) {
                                RelativeLayout sds = new RelativeLayout(Main2Activity.this);
                                TextView textView = new TextView(Main2Activity.this);

                                textView.setBackgroundResource(R.drawable.biankuang);
                                RelativeLayout.LayoutParams tt = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 130);
                                textView.setLayoutParams(tt);
                                sds.addView(textView);
                                return sds;
                            }
                        };
                        gridView.setAdapter(baseAdapter);

                        relativeLayout.setPadding(40, 80, 40, 40);
                        relativeLayout.addView(gridView);
                        final Button button = new Button(Main2Activity.this);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                textView.setText(R.string.chaxun);
                                gridView.setVisibility(View.GONE);
                                button.setVisibility(View.GONE);

                                final TextView textView1 = new TextView(Main2Activity.this);
                                textView1.setText(R.string.jieguotxt);
                                textView1.setTextSize(35);
                                textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.sy_color));
                                RelativeLayout.LayoutParams t1params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                                t1params.addRule(RelativeLayout.CENTER_HORIZONTAL);
                                textView1.setLayoutParams(t1params);
                                relativeLayout.addView(textView1);

                            }
                        });
                        button.setBackgroundResource(R.drawable.yuanjiao);
                        button.setText(R.string.chaxunxinxi);
                        RelativeLayout.LayoutParams btn = new RelativeLayout.LayoutParams(400, 150);
                        btn.addRule(RelativeLayout.CENTER_HORIZONTAL);
                        btn.addRule(RelativeLayout.BELOW, gridView.getId());
                        btn.setMargins(0, 70, 0, 0);
                        button.setLayoutParams(btn);

                        relativeLayout.addView(button);


                    } else {
                        if ("rl5".equals(massage)) {
                            textView.setText(R.string.t5);
                            final TextView textView1 = new TextView(Main2Activity.this);
                            textView1.setText(R.string.bangzhutxt);
                            textView1.setTextSize(35);
                            textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.sy_color));
                            RelativeLayout.LayoutParams t1params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                            t1params.addRule(RelativeLayout.CENTER_HORIZONTAL);
                            textView1.setLayoutParams(t1params);
                            relativeLayout.addView(textView1);

                        } else {
                            if ("rl6".equals(massage)) {
                                relativeLayout.setPadding(50, 50, 50, 50);
                                final TextView textView1 = new TextView(Main2Activity.this);
                                textView1.setText("是否退出系统？");
                                textView1.setId(generateViewId());
                                textView1.setTextSize(25);
                                textView1.setPadding(100, 10, 50, 10);
                                textView1.setBackgroundResource(R.drawable.yuanjiao);
                                textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.text_color));
                                RelativeLayout.LayoutParams t1params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                                t1params.addRule(RelativeLayout.CENTER_HORIZONTAL);
                                textView1.setLayoutParams(t1params);
                                relativeLayout.addView(textView1);

                                final TextView textView2 = new TextView(Main2Activity.this);

                                textView2.setText("是");
                                textView2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
//                                       Intent intent2 =  new Intent(Main2Activity.this,MainActivity.class);
//                                        intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                                        startActivity(intent2);
//                                        startActivity(intent2);
//                                        System.exit(0);


                                    }
                                });
                                textView2.setTextSize(25);
                                textView2.setId(generateViewId());
                                textView2.setPadding(50, 10, 50, 10);
                                textView2.setBackgroundResource(R.drawable.yuanjiao);
                                textView2.setTextColor(ContextCompat.getColor(textView2.getContext(), R.color.text_color));
                                RelativeLayout.LayoutParams t2params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                                t2params.addRule(RelativeLayout.CENTER_HORIZONTAL);
                                t2params.setMargins(0, 150, 0, 0);
                                t2params.addRule(RelativeLayout.BELOW, textView1.getId());
                                textView2.setLayoutParams(t2params);
                                relativeLayout.addView(textView2);

                                final TextView textView3 = new TextView(Main2Activity.this);
                                textView3.setText("否");
                                textView3.setTextSize(25);
                                textView3.setPadding(50, 10, 50, 10);
                                textView3.setBackgroundResource(R.drawable.yuanjiao2);
                                textView3.setTextColor(ContextCompat.getColor(textView3.getContext(), R.color.text_color));
                                RelativeLayout.LayoutParams t3params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                                t3params.addRule(RelativeLayout.CENTER_HORIZONTAL);
                                t3params.setMargins(0, 50, 0, 0);
                                t3params.addRule(RelativeLayout.BELOW, textView2.getId());
                                textView3.setLayoutParams(t3params);
                                relativeLayout.addView(textView3);
                                textView.setText(R.string.t6);

                            }
                        }
                    }
                }
            }
        }
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void fanhui(View view) {
        //            textView1.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                      textView.setText("查询结果");
//                      textView1.setVisibility(View.GONE);
//                    Toast.makeText(Main2Activity.this, "编辑", Toast.LENGTH_SHORT).show();
//                }
//            });

        finish();

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://qq.app01.com.myxuanke/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://qq.app01.com.myxuanke/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
