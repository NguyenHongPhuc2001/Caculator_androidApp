package hcmute.edu.vn19110267.caculator_15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, Dotbtn, Cbtn,
            nhan, chia, cong, tru, bang;
    TextView manhinh_1, manhinh_2, manhinh_3;
    boolean checkCong, checkTru, checkNhan, checkChia, checkDot, checkBang;
    double val_1, val_2, temp = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        btn_Onclick();


        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manhinh_1 == null) {
                    manhinh_1.setText("");
                } else {
                    if (temp == 0) {
                        if (checkBang == true) {
                            val_1 = Double.parseDouble(manhinh_3.getText() + "");
                        } else {
                            val_1 = Double.parseDouble(manhinh_1.getText() + "");
                        }
                        checkCong = true;
                        temp = temp + val_1;
                        manhinh_1.setText(null);
                        manhinh_2.setText("+");
                    } else {
                        val_1 = Double.parseDouble(manhinh_1.getText() + "");
                        checkCong = true;
                        manhinh_1.setText("");
                        manhinh_2.setText("+");
                        if (checkTru == true) {
                            temp = temp - val_1;
                            checkTru = false;
                        } else if (checkNhan == true) {
                            temp = temp * val_1;
                            checkNhan = false;
                        } else if (checkChia) {
                            temp = temp / val_1;
                            checkChia = false;
                        } else {
                            temp = temp + val_1;
                        }
                    }
                }
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manhinh_1.getText() == "") {
                    manhinh_1.setText(manhinh_1.getText() + "-");
                } else {
                    if (temp == 0) {
                        if (checkBang == true) {
                            val_1 = Double.parseDouble(manhinh_3.getText() + "");
                        } else {
                            val_1 = Double.parseDouble(manhinh_1.getText() + "");
                        }
                        checkTru = true;
                        temp = temp + val_1;
                        manhinh_1.setText("");
                        manhinh_2.setText("-");
                    } else {
                        val_1 = Double.parseDouble(manhinh_1.getText() + "");
                        checkTru = true;
                        manhinh_1.setText("");
                        manhinh_2.setText("-");
                        if (checkCong == true) {
                            temp = temp + val_1;
                            checkCong = false;
                        } else if (checkNhan == true) {
                            temp = temp * val_1;
                            checkNhan = false;
                        } else if (checkChia == true) {
                            temp = temp / val_1;
                            checkChia = false;
                        } else {
                            temp = temp - val_1;
                        }
                    }
                }
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manhinh_1.getText() == "") {
                    manhinh_1.setText("");
                } else {
                    if (temp == 0) {
                        if (checkBang == true) {
                            val_1 = Double.parseDouble(manhinh_3.getText() + "");
                        } else {
                            val_1 = Double.parseDouble(manhinh_1.getText() + "");
                        }
                        checkNhan = true;
                        temp = temp + val_1;
                        manhinh_1.setText("");
                        manhinh_2.setText("x");
                    } else {
                        val_1 = Double.parseDouble(manhinh_1.getText() + "");
                        checkNhan = true;
                        manhinh_1.setText("");
                        manhinh_2.setText("x");
                        if (checkCong == true) {
                            temp = temp + val_1;
                            checkCong = false;
                        } else if (checkTru == true) {
                            temp = temp - val_1;
                            checkTru = false;
                        } else if (checkChia == true) {
                            temp = temp / val_1;
                            checkChia = false;
                        } else {
                            temp = temp * val_1;
                        }
                    }
                }
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (manhinh_1 == null) {
                    manhinh_1.setText("");
                } else {
                    if (temp == 0) {
                        if (checkBang == true) {
                            val_1 = Double.parseDouble(manhinh_3.getText() + "");
                        } else {
                            val_1 = Double.parseDouble(manhinh_1.getText() + "");
                        }
                        checkChia = true;
                        temp = temp + val_1;
                        manhinh_1.setText("");
                        manhinh_2.setText("÷");
                    } else {
                        val_1 = Double.parseDouble(manhinh_1.getText() + "");
                        checkChia = true;
                        manhinh_1.setText("");
                        manhinh_2.setText("÷");
                        if (checkCong == true) {
                            temp = temp + val_1;
                            checkCong = false;
                        } else if (checkTru == true) {
                            temp = temp + val_1;
                            checkTru = false;
                        } else if (checkNhan == true) {
                            temp = temp * val_1;
                            checkNhan = false;
                        } else {
                            temp = temp / val_1;
                        }
                    }
                }
            }
        });

        Cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText("");
                manhinh_2.setText("");
                manhinh_3.setText("");
                checkCong = false;
                checkTru = false;
                checkChia = false;
                checkNhan = false;
                checkDot = false;
                checkBang = false;
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val_2 = Double.parseDouble(manhinh_1.getText() + "");
                if (checkCong == true) {
                    double tong = temp + val_2;
                    if (Math.ceil(tong) != Math.floor(tong)) {
                        manhinh_3.setText(tong + "");
                    } else {
                        manhinh_3.setText((int) tong + "");
                    }
                    checkCong = false;
                    temp = 0;
                }

                if (checkTru == true) {
                    double tong = temp - val_2;
                    if (Math.ceil(tong) != Math.floor(tong)) {
                        manhinh_3.setText(tong + "");
                    } else {
                        manhinh_3.setText((int) tong + "");
                    }
                    checkTru = false;
                    temp = 0;
                }

                if (checkNhan == true) {
                    double tong = temp * val_2;
                    if (Math.ceil(tong) != Math.floor(tong)) {
                        manhinh_3.setText(tong + "");
                    } else {
                        manhinh_3.setText((int) tong + "");
                    }
                    checkNhan = false;
                    temp = 0;
                }

                if (checkChia == true) {
                    double tong = temp / val_2;
                    if (Math.ceil(tong) != Math.floor(tong)) {
                        manhinh_3.setText(tong + "");
                    } else {
                        manhinh_3.setText((int) tong + "");
                    }
                    checkChia = false;
                    temp = 0;
                }
                checkBang = true;
            }
        });
    }


    private void Anhxa() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        Dotbtn = (Button) findViewById(R.id.btncham);
        Cbtn = (Button) findViewById(R.id.btnC);
        cong = (Button) findViewById(R.id.btncong);
        tru = (Button) findViewById(R.id.btntru);
        nhan = (Button) findViewById(R.id.btnnhan);
        chia = (Button) findViewById(R.id.btnchia);
        bang = (Button) findViewById(R.id.btnbang);
        manhinh_1 = (TextView) findViewById(R.id.manhinh_1);
        manhinh_2 = (TextView) findViewById(R.id.manhinh_2);
        manhinh_3 = (TextView) findViewById(R.id.manhinh_3);
    }

    private void btn_Onclick() {
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + "9");
            }
        });

        Dotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manhinh_1.setText(manhinh_1.getText() + ".");
            }
        });
    }
}