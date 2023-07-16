package JavaInvokeKotlin;


import kotlin.Unit;
import kotlin.jvm.functions.Function0;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        KotlinClass kotlinClass=new KotlinClass();
        kotlinClass.getName();
        KotlinClass.callStaticMethod2();
        String industry = KotlinClass.industry;
        System.out.println(industry);

        KotlinClass.Companion.callStaticMethod1();
        KotlinClass.Companion.callStaticMethod2();
//
        KotlinFuncitionKt.kotlinPrintln();

        KotlinFuncitionKt.setValueCallBack("Hello World",new Function0<Unit>(){

            @Override
            public Unit invoke() {
                System.out.println("java Hello World2");
                return null;
            }
        });

        KotlinClassKt.setSamMethod(new MyCustomCallback() {
            @Override
            public void onCallback() {

            }
        });
    }
}
