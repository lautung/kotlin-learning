package 委托.内置委托

val lazyView by lazy{
    println("我只有第一次初始化的时候才执行哟~")
    "hello world"
}

fun main(){
    //调用:
    println("第1次：${lazyView}")
    println("第2次：${lazyView}")
}