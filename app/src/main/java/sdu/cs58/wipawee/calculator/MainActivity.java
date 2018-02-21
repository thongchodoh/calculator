package sdu.cs58.wipawee.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1. ประกาศตัวแปล
  EditText number1EditTaxt, number2EditText;
  Button addButton, deleteButton, plusButton ,divideButton;
  TextView resultTextView;
  int num1, num2, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. ผูกตัวแปลบน JAVA กับelement บน xml
        number1EditTaxt = findViewById(R.id.edtNumber1);
        number2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btnAdd);
        deleteButton = findViewById(R.id.btnDel);
        plusButton = findViewById(R.id.btnPlus);
        divideButton = findViewById(R.id.btnDivide);
        resultTextView = findViewById(R.id.txvResult);
        //3.สั่งให้ปุ่มดักฟังว่าเมื่อ user คลิกที่ปุ่ม lodin
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // แปลงค่าที่รับจาก EdiText เป็นตัวเลข เก็บเป็นตัวแปลชนิด int
                num1 = Integer.parseInt(number1EditTaxt.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 + num2;
                // 4. แสดงผลรับการคำนวณ
                resultTextView.setText(result + " ");

                deleteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // แปลงค่าที่รับจาก EdiText เป็นตัวเลข เก็บเป็นตัวแปลชนิด int
                        num1 = Integer.parseInt(number1EditTaxt.getText().toString().trim());
                        num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                        result = num1 - num2;
                        // 4. แสดงผลรับการคำนวณ
                        resultTextView.setText(result + " ");

                        plusButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // แปลงค่าที่รับจาก EdiText เป็นตัวเลข เก็บเป็นตัวแปลชนิด int
                                num1 = Integer.parseInt(number1EditTaxt.getText().toString().trim());
                                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                                result = num1 * num2;
                                // 4. แสดงผลรับการคำนวณ
                                resultTextView.setText(result + " ");

                                divideButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        // แปลงค่าที่รับจาก EdiText เป็นตัวเลข เก็บเป็นตัวแปลชนิด int
                                        num1 = Integer.parseInt(number1EditTaxt.getText().toString().trim());
                                        num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                                        result = num1 / num2;
                                        // 4. แสดงผลรับการคำนวณ
                                        resultTextView.setText(result + " ");
                                    }
                                });
                            }
                        });


                    }
                }); //end setonclicklistener
            }
        });// end onCreate
    }
 } // end class
