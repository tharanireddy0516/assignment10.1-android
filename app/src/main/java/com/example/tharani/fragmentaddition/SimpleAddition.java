package com.example.tharani.fragmentaddition;
/*import is libraries imported for writing the code
* AppCompatActivity is base class for activities
* Bundle handles the orientation of the activity
*/

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Tharani on 12/4/2017.
 */

public class SimpleAddition extends Fragment {
    /*A Fragment represents a behavior or a portion of user interface in an Activity
    * It is a piece of activity which enables more activity design and is a kind of sub activity
    * It has its own behavior,life cycle,layout*/
    //declaration of variables
    //declaration
    EditText num1,num2;
    Button add;
    TextView txt;
    int res;//initializing

    /**
     * implementing the onCreateView() to provide a layout for a fragment..
     * @param inflater-A LayoutInflater is one of the Android System Services that is responsible for taking your XML files that define a layout,
     *                and converting them into View objects
     * @param container- is important in order for the system to apply layout
     *                   parameters to the root view of the inflated layout, specified
     *                   by the parent view in which it's going.
     * @param savedInstanceState-parameter is a Bundle that provides data
     *                          about the previous instance of the fragment
     * @return- View this is the root of fragment's layout*/
    @Override
    /*here by using onCreateView the system calls back when its time for fragment to draw user interface for its first time*/
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main, container, false);
    num1 = view.findViewById(R.id.fragment);
    num2 =  view.findViewById(R.id.fragmentEditText);
    add = view.findViewById(R.id.fragmentButton);
    txt =  view.findViewById(R.id.textV);


    add.setOnClickListener(new View.OnClickListener() {//here doing view inflating in a onCreateView of fragment by usingOnClickListener
    @Override
    public void onClick(View view) {
    String myNum1=num1.getText().toString();//Getting string for num1
    int mNum1=Integer.parseInt(myNum1);//converting into integer
    String myNum2=num2.getText().toString();//getting string for num2
    int mNum2=Integer.parseInt(myNum2);//converting into integer
    //adding to no
    res=mNum1+mNum2;//performs addition operation
    txt.setText(Integer.toString(res));//setting the text
    }
    });
    return view;//returns view
        /*return means it return from method,causes a program control to transfer back to caller of method*/

    }

    }