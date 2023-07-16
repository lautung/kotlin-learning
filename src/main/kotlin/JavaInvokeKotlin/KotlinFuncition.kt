package JavaInvokeKotlin



fun kotlinPrintln() {
    println("调用kotlinPrintln")
}

fun String.kotlinPrintln() {
    println(this)
}

fun String.setValueCallBack(block:()->Unit){
    block()
}

fun String.setValueCallBack2(block: (String) -> String){
    val string:String=block(this)
    println(string)
}

fun String.setValueCallBack3(block: String.() -> String){
    val string:String=this.block()
    println(string)
}

fun String.setValueCallBack11(block: Int.(String) -> Unit){
    11.block("十一")
    block(11,"十一")
}