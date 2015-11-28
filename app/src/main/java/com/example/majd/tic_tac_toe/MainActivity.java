package com.example.majd.tic_tac_toe;

        import android.app.Activity;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends Activity {

    String[][] c;
    char flag;
    String result;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView playerText;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count=0;
        result= "no";

        c = new String[3][3];

        for(int i =0; i<3; i++)
            for(int j=0; j<3; j++)
                c[i][j]= " ";

        flag = 'X';
        playerText = (TextView)findViewById(R.id.player);
        playerText.setTextColor(Color.BLUE);
        playerText.setText(flag + " Player");

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
    }

    public void clear()
    {
        count=0;
        result="no";

        for(int i =0; i<3; i++)
            for(int j=0; j<3; j++)
                c[i][j]= " ";

        b1.setText(" ");
        b2.setText(" ");
        b3.setText(" ");
        b4.setText(" ");
        b5.setText(" ");
        b6.setText(" ");
        b7.setText(" ");
        b8.setText(" ");
        b9.setText(" ");

        flag = 'X';
        playerText.setTextColor(Color.BLUE);
        playerText.setText(flag + " Player");
    }

    public void check()
    {
        if(c[0][0]!= " " && c[0][0].equals(c[1][1]) && c[0][0].equals(c[2][2])) result = "yes";
        if(c[0][2]!= " " && c[0][2].equals(c[1][1]) && c[0][2].equals(c[2][0])) result = "yes";
        if(c[0][0]!= " " && c[0][0].equals(c[0][1]) && c[0][0].equals(c[0][2])) result = "yes";
        if(c[1][0]!= " " && c[1][0].equals(c[1][1]) && c[1][0].equals(c[1][2])) result = "yes";
        if(c[2][0]!= " " && c[2][0].equals(c[2][1]) && c[2][0].equals(c[2][2])) result = "yes";
        if(c[0][0]!= " " && c[0][0].equals(c[1][0]) && c[0][0].equals(c[2][0])) result = "yes";
        if(c[0][1]!= " " && c[0][1].equals(c[1][1]) && c[0][1].equals(c[2][1])) result = "yes";
        if(c[0][2]!= " " && c[0][2].equals(c[1][2]) && c[0][2].equals(c[2][2])) result = "yes";

        if(result == "yes")
        {
            if(flag == 'X') Toast.makeText(this,"O Player won, Congrates!", Toast.LENGTH_SHORT).show();
            else Toast.makeText(this,"X Player won, Congrates!", Toast.LENGTH_SHORT).show();
            clear();
            //onCreate(null);
        }
        else if(count == 9) {
            Toast.makeText(this, "No one won ", Toast.LENGTH_SHORT).show();
            clear();
        }

        playerText.setText(flag + " Player");
    }

    public void clear_btn_click(View view)
    {
        clear();
    }

    public void b1Click(View view)
    {
        if(flag == 'X')
        {
            b1.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b1.setText("X");
            flag = 'O';
        }
        else
        {
            b1.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b1.setText("O");
            flag = 'X';
        }

        c[0][0] = String.valueOf(b1.getText());

        count++;
        check();
    }

    public void b2Click(View view)
    {
        if(flag == 'X')
        {
            b2.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b2.setText("X");
            flag = 'O';
        }
        else
        {
            b2.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b2.setText("O");
            flag = 'X';
        }

        c[0][1] = String.valueOf(b2.getText());
        count++;
        check();
    }

    public void b3Click(View view)
    {
        if(flag == 'X')
        {
            b3.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b3.setText("X");
            flag = 'O';
        }
        else
        {
            b3.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b3.setText("O");
            flag = 'X';
        }

        c[0][2] = String.valueOf(b3.getText());
        count++;
        check();
    }

    public void b4Click(View view)
    {
        if(flag == 'X')
        {
            b4.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b4.setText("X");
            flag = 'O';
        }
        else
        {
            b4.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b4.setText("O");
            flag = 'X';
        }

        c[1][0] = String.valueOf(b4.getText());
        count++;
        check();
    }

    public void b5Click(View view)
    {
        if(flag == 'X')
        {
            b5.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b5.setText("X");
            flag = 'O';
        }
        else
        {
            b5.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b5.setText("O");
            flag = 'X';
        }

        c[1][1] = String.valueOf(b5.getText());
        count++;
        check();
    }

    public void b6Click(View view)
    {
        if(flag == 'X')
        {
            b6.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b6.setText("X");
            flag = 'O';
        }
        else
        {
            b6.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b6.setText("O");
            flag = 'X';
        }

        c[1][2] = String.valueOf(b6.getText());
        count++;
        check();
    }

    public void b7Click(View view)
    {
        if(flag == 'X')
        {
            b7.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b7.setText("X");
            flag = 'O';
        }
        else
        {
            b7.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b7.setText("O");
            flag = 'X';
        }

        c[2][0] = String.valueOf(b7.getText());
        count++;
        check();
    }

    public void b8Click(View view)
    {
        if(flag == 'X')
        {
            b8.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b8.setText("X");
            flag = 'O';
        }
        else
        {
            b8.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b8.setText("O");
            flag = 'X';
        }

        c[2][1] = String.valueOf(b8.getText());
        count++;
        check();
    }

    public void b9Click(View view)
    {
        if(flag == 'X')
        {
            b9.setTextColor(Color.BLUE);
            playerText.setTextColor(Color.RED);
            b9.setText("X");
            flag = 'O';
        }
        else
        {
            b9.setTextColor(Color.RED);
            playerText.setTextColor(Color.BLUE);
            b9.setText("O");
            flag = 'X';
        }

        c[2][2] = String.valueOf(b9.getText());
        count++;
        check();
    }
}
