package com.example.niewiel.apka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.orm.SugarRecord;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Test test=new Test("aaa","bbb");
        test.save();

    }



    public class Test extends SugarRecord{

        private String field1;
        private String field2;

        public Test() {
        }

        public Test(String field1, String field2) {
            this.field1 = field1;
            this.field2 = field2;
        }


        @Override
        public String toString() {
            return "Test{" +
                    "field1='" + field1 + '\'' +
                    ", field2='" + field2 + '\'' +
                    '}';
        }

        public String getField1() {
            return field1;
        }

        public void setField1(String field1) {
            this.field1 = field1;
        }

        public String getField2() {
            return field2;
        }

        public void setField2(String field2) {
            this.field2 = field2;
        }
    }
}
