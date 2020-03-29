package com.example.formationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Puppy extends AppCompatActivity {
int puppyAge;
public Puppy(String name){
    System.out.println("the name is:"+name);
}//end constractor
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Puppy myPupyy=new Puppy("Max");
        myPupyy.setAge(2);
        myPupyy.getAge();

    }


public void setAge(int age){
        puppyAge=age;//end setage
}
public int getAge(){
        System.out.println("Pppy age is : "+puppyAge);
        return puppyAge;//end getage
}

}
