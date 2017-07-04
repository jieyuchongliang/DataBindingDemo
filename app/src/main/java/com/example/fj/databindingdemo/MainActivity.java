package com.example.fj.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import com.example.fj.databindingdemo.bean.Person;
import com.example.fj.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Person person;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        person = new Person("name",10,"address");
        binding.setMan(person);//将person对象传入xml文件中
        binding.setMain(this);//将mainactivity对象传入xml文件中
        listenEditChange();
    }

    /**
     * 监听edittext的变化，同步更新UI。DataBinding优势：监控数据的变化，实时更新。
     */
    private void listenEditChange() {
        binding.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                person.setName(s.toString());
                binding.setMan(person);
            }
        });
    }

    public void method(){
        Toast.makeText(this,binding.getMan().getAddress(),Toast.LENGTH_SHORT).show();
    }
}
