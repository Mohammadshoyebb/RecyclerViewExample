package com.example.recyclerviewbexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact_Structure> arr =  new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView recv = findViewById(R.id.RV);
        recv.setLayoutManager(new LinearLayoutManager(this));

        //adding elements in array. here we need 3 elements to add(image,contact number,Contact  Name) by calling the structure class constructor

        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));
        arr.add(new Contact_Structure(R.drawable.a, "Mohammad Arman", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.b, "Mohammad Ali", "8964907613"));
        arr.add(new Contact_Structure(R.drawable.c, "Mohammad Sameer", "967890790"));
        arr.add(new Contact_Structure(R.drawable.d, "Mohammad Arif", "8679465090"));
        arr.add(new Contact_Structure(R.drawable.e, "Mohammad Rehab", "8984509970"));
        arr.add(new Contact_Structure(R.drawable.f, "Mohammad Razique", "9434765643"));
        arr.add(new Contact_Structure(R.drawable.g, "Mohammad Ahmad", "7968780989"));
        arr.add(new Contact_Structure(R.drawable.h, "Mohammad Daiyan", "9668978978"));
        arr.add(new Contact_Structure(R.drawable.i, "Mohammad Imran", "8675980902"));
        arr.add(new Contact_Structure(R.drawable.j, "Mohammad Maaz", "7275986790"));
        arr.add(new Contact_Structure(R.drawable.k, "Ayushman Singh", "7378765487"));
        arr.add(new Contact_Structure(R.drawable.l, "Abhishek Yadav", "6393567898"));
        arr.add(new Contact_Structure(R.drawable.m, "Ravins Katiyar", "9275873412"));
        arr.add(new Contact_Structure(R.drawable.n, "Prince Singh", "8967435490"));
        arr.add(new Contact_Structure(R.drawable.o, "Dev Dixit", "8796780498"));
        arr.add(new Contact_Structure(R.drawable.p, "Udit Tyagi", "9678432680"));
        arr.add(new Contact_Structure(R.drawable.q, "Sushant pratap", "9870484950"));


        RecyclerContactAdapter adt = new RecyclerContactAdapter(this,arr);
        recv.setAdapter(adt);
    }
}