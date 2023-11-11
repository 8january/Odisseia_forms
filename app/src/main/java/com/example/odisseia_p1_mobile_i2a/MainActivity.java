package com.example.odisseia_p1_mobile_i2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    private EditText nomeInput;
    private CheckBox c_one, c_two, c_three, c_four, c_five;
    private Switch s_one;
    private RadioButton r_one, r_two, r_three, r_four, r_five;
    private ToggleButton t_one;
    private String previous;
    private int cc_one = 0, cc_two = 0, cc_three = 0, cc_four = 0, cc_five = 0;
    private int sc_one = 0;
    private int rc_one = 0, rc_two = 0, rc_three = 0, rc_four = 0, rc_five = 0;
    private int tc_one = 0;
    private int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeInput = findViewById(R.id.nomeInput);
        c_one = findViewById(R.id.check_one);
        c_two = findViewById(R.id.check_two);
        c_three = findViewById(R.id.check_three);
        c_four = findViewById(R.id.check_four);
        c_five = findViewById(R.id.check_five);

        s_one = findViewById(R.id.switch_one);

        r_one = findViewById(R.id.radio_one);
        r_two = findViewById(R.id.radio_two);
        r_three = findViewById(R.id.radio_three);
        r_four = findViewById(R.id.radio_four);
        r_five = findViewById(R.id.radio_five);

        t_one = findViewById(R.id.toggleButton);
    }

    public void prev(){
        previous = result.getText().toString() + "\n";
    }


    public void enviar(View view){ total++;
        result = findViewById(R.id.result);
        result.setText("\n" + "Nome completo:" + nomeInput.getText().toString());
        prev();

        result.setText(previous + "Para você, essas são as principais causas de desinteresse:");
        prev();

        boolean hasChecked = false;
        if(c_one.isChecked()){
            String r = c_one.getText().toString();
            result.setText(previous + r);
            prev();
            cc_one++;
            hasChecked = true;
        }

        if(c_two.isChecked()){
            String r = c_two.getText().toString();
            result.setText(previous + r);
            prev();
            cc_two++;
            hasChecked = true;
        }

        if(c_three.isChecked()){
            String r = c_three.getText().toString();
            result.setText(previous + r);
            prev();
            cc_three++;
            hasChecked = true;
        }

        if(c_four.isChecked()){
            String r = c_four.getText().toString();
            result.setText(previous + r);
            prev();
            cc_four++;
            hasChecked = true;
        }

        if(c_five.isChecked()){
            String r = c_five.getText().toString();
            result.setText(previous + r);
            prev();
            cc_five++;
            hasChecked = true;
        }

        if(!hasChecked){
            result.setText(previous + "Nenhuma das opções!");
        }

        result.setText(previous + "Você..");
        prev();

        if(s_one.isChecked()){
            sc_one++;
            result.setText(previous + " já utilizou uma plataforma educacional antes.");
        }else result.setText(previous + " nunca utilizou uma plataforma educacional antes.");
        prev();

        result.setText(previous + "Para você, a função mais atrativa em um software gamificado é: ");
        if(r_one.isChecked()){
            String r = r_one.getText().toString();
            result.setText(previous + r);
            prev();
            rc_one++;

        }else if(r_two.isChecked()){
            String r = r_two.getText().toString();
            result.setText(previous + r);
            prev();
            rc_two++;

        }else if(r_three.isChecked()){
            String r = r_three.getText().toString();
            result.setText(previous + r);
            prev();
            rc_three++;

        }else if(r_four.isChecked()){
            String r = r_four.getText().toString();
            result.setText(previous + r);
            prev();
            rc_four++;

        }else if(r_five.isChecked()){
            String r = r_five.getText().toString();
            result.setText(previous + r);
            prev();
            rc_five++;

        }else result.setText(previous + "Nenhuma das opções!");

        result.setText(previous + "Você..");
        prev();

        if(t_one.isChecked()){
            tc_one++;
            result.setText(previous + "Acredita que a gamificação pode engajar os alunos.");
        }else result.setText(previous + "Não acredita que a gamificação pode engajar os alunos.");
        prev();

        String finalResult = "Resultados gerais:\n" +
                "Quantidade de participantes: " + total +
                "\n2. Em sua perspectiva, quais as principais causas de desinteresse e desmotivação dos alunos, em sala de aula?" +
                "\nAbordagem de ensino repetitiva: " + cc_one +
                "\nFalta de participação ativa dos alunos nas aulas" + cc_two +
                "\nConteúdo desconexo com a realidade do aluno" + cc_three +
                "\nFalta de integração de recursos digitais apropriados" + cc_four +
                "\nNão tratar das dificuldades individuais do aluno" + cc_five +
                "\n3. Softwares educacionais gamificados são ferramentas que integram elementos de jogos" +
                " ao processo de ensinio-aprendizagem. " +
                "Você já utilizou algum software educacional?" +
                "\nSim:" + sc_one +
                "\nNão:" + (total - sc_one) +
                "\n4. Qual a função mais atrativa em um software educacional gamificado?" +
                "\nJogos educacionais" + rc_one +
                "\nQuizzes interativos" + rc_two +
                "\nSistema de recompensa" + rc_three +
                "\nInteração com narrativas" + rc_four +
                "\nCompetições entre usuários" + rc_five +
                "\n5. Você acredita que a utilização de softwares educacionais que utilizam a proposta gamificada" +
                " no ambiente de sala de aula ajuda a engajar e motivar o aluno?" +
                "\nSim:" + tc_one +
                "\nNão:" + (total - tc_one);

        result.setText(previous + "\n" + finalResult);
    }

}