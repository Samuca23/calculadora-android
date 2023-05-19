package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_adi;
    private Button btn_sub;
    private Button btn_mul;
    private Button btn_div;
    private Button btn_res;

    private Button btn_c;
    private TextView resultTextView;
    public String Number1;
    public String operador;
    public String Number2;
    public String AntesOperacao;
    public Integer Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.button0);
        btn_1 = findViewById(R.id.button1);
        btn_2 = findViewById(R.id.button2);
        btn_3 = findViewById(R.id.button3);
        btn_4 = findViewById(R.id.button4);
        btn_5 = findViewById(R.id.button5);
        btn_6 = findViewById(R.id.button6);
        btn_7 = findViewById(R.id.button7);
        btn_8 = findViewById(R.id.button8);
        btn_9 = findViewById(R.id.button9);
        btn_c = findViewById(R.id.clear);
        btn_adi = findViewById(R.id.button_adi);
        btn_sub = findViewById(R.id.button_sub);
        btn_mul = findViewById(R.id.button_mul);
        btn_div = findViewById(R.id.button_div);
        btn_res = findViewById(R.id.button_res);
        resultTextView = findViewById(R.id.resultTextView);


        /**
         * Click do botão 0
         */
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 0;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 1
         */
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 1;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 2
         */
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 2;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 3
         */
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 3;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 4
         */
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 4;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 5
         */
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 5;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 6
         */
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 6;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 7
         */
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 7;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 8
         */
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 8;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        /**
         * Click do botão 9
         */
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer valor = 9;
                if (operador == null) {
                    if (Number1 == null) {
                        Number1 = valor.toString();
                    } else {
                        Number1 += valor.toString();
                    }
                    resultTextView.setText(Number1);
                } else {
                    if (Number2 == null) {
                        Number2 = valor.toString();
                    } else {
                        Number2 += valor.toString();
                    }
                    resultTextView.setText(AntesOperacao + Number2);
                }
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText("");
                Number1 = null;
                Number2 = null;
                operador = null;
            }
        });

        /**
         * Click do botão de adição
         */
        btn_adi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operador != null) {
                    operador = "+";
                    resultTextView.setText(Number1 + operador + Number2);
                } else {
                    operador = "+";
                    if (Number1 == null) {
                        Number1 = "";
                    }
                    AntesOperacao = Number1 + operador;
                    resultTextView.setText(AntesOperacao);
                }
            }
        });

        /**
         * Click do botão subtração
         */
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operador != null) {
                    operador = "-";
                    resultTextView.setText(Number1 + operador + Number2);
                } else {
                    operador = "-";
                    if (Number1 == null) {
                        Number1 = "";
                    }
                    AntesOperacao = Number1 + operador;
                    resultTextView.setText(AntesOperacao);
                }
            }
        });

        /**
         * Click do botão multiplicação
         */
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operador != null) {
                    operador = "*";
                    resultTextView.setText(Number1 + operador + Number2);
                } else {
                    operador = "*";
                    if (Number1 == null) {
                        Number1 = "";
                    }
                    AntesOperacao = Number1 + operador;
                    resultTextView.setText(AntesOperacao);
                }
            }
        });

        /**
         * Click do botão dividido
         */
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operador != null) {
                    operador = "/";
                    resultTextView.setText(Number1 + operador + Number2);
                } else {
                    operador = "/";
                    if (Number1 == null) {
                        Number1 = "";
                    }
                    AntesOperacao = Number1 + operador;
                    resultTextView.setText(AntesOperacao);
                }
            }
        });

        /**
         * Click do botão resultado
         */
        btn_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado = 0;
                if (operador != null) {
                    if (Number1 == "" || Number1 == null) {
                        Number1 = "0";
                    }
                    if (Number2 == "" || Number2 == null) {
                        Number2 = "0";
                    }
                    switch (operador) {
                        case "+":
                            Resultado = Integer.parseInt(Number1) + Integer.parseInt(Number2);
                            break;
                        case "-":
                            Resultado = Integer.parseInt(Number1) - Integer.parseInt(Number2);
                            break;
                        case "*":
                            Resultado = Integer.parseInt(Number1) * Integer.parseInt(Number2);
                            break;
                        case "/":
                            Resultado = Integer.parseInt(Number1) / Integer.parseInt(Number2);
                            break;
                        }
                }
                resultTextView.setText(Resultado.toString());
                Number1 = null;
                Number2 = null;
                operador = null;
            }
        });
    }

}