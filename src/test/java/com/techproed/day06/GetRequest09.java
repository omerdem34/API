package com.techproed.day06;

import com.techproed.testBase.DummyTestBase;
import org.junit.Test;

public class GetRequest09  extends DummyTestBase {
/*

    http://dummy.restapiexample.com/api/v1/employees
    url ine bir istek gönderildiğinde,
    status kodun 200,
    gelen body de,
            5. çalışanın isminin "Airi Satou" olduğunu ,
            6. çalışanın maaşının "372000" olduğunu ,
    Toplam 24 tane çalışan olduğunu,
            "Rhona Davidson" ın employee lerden biri olduğunu
"21", "23", "61" yaşlarında employeeler olduğunu test edin

 */

    @Test
    public void test(){


        spec03.pathParam("parametre1","employees");

    }

}
