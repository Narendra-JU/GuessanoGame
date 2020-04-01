package com.example.narenndranath.smartbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int no;
    int x=10;
    EditText noInput;
    Random r=new Random();
    int Randno=r.nextInt(50-0)+0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       noInput=(EditText)findViewById(R.id.noInput);






        int nooftries=5;
        final Button naruButton = (Button) findViewById(R.id.narusButton);
        naruButton.setOnClickListener(new Button.OnClickListener() {
                                          public void onClick(View v) {
                                              x=x-1;

                                              no=Integer.valueOf(noInput.getText().toString());
                                              TextView triesLeft=(TextView)findViewById(R.id.triesLeft);

                                              TextView naruText = (TextView) findViewById(R.id.narusText);
                                              if(x==0)
                                              {
                                                  naruText.setText("Try Again");
                                                  triesLeft.setText(":( :( :(");
                                                  Randno=r.nextInt(50-0)+0;
                                                  x=10;
                                              }


                                              else if(no>Randno && no<=50) {
                                                  naruText.setText("Choose a Lower No");
                                                  triesLeft.setText(("Tries left "+x));
                                              }
                                              else if(no<Randno)
                                              {
                                                  naruText.setText("Choose a Higher no");
                                                  triesLeft.setText(("Tries left "+x));
                                              }
                                              else if(no==Randno)
                                              {
                                                  naruText.setText("Correct!!!!:)");
                                                  triesLeft.setText((10-x)+" tries!!!");
                                                  Randno=r.nextInt(50-0)+0;
                                                  x=10;

                                              }
                                              else if(no>(int)50)
                                              {
                                                  naruText.setText("No is less than 50");
                                              }
                                              noInput.setText("");


                                          }
                                      }
        );

        naruButton.setOnLongClickListener(
                new Button.OnLongClickListener()
                {
                    public boolean onLongClick(View v)
                    {
                        TextView naruText = (TextView) findViewById(R.id.narusText);
                        naruText.setText("GUESS A NO IDIOT");
                        return true;
                    }
                }
        );






    }
}





