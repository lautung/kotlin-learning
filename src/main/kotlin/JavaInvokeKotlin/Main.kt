package JavaInvokeKotlin

fun main(){
    "String".kotlinPrintln()

    "Hello world".setValueCallBack {
        println("Hello world2")
    }

    "Hello world3".setValueCallBack2 {
        it
    }

    "Hello world4".setValueCallBack3 {
        "$this+++++"
    }
}