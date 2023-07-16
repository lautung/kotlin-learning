package JavaInvokeKotlin

class KotlinClass {


    companion object{
        var school:String ="清北大学"


        @JvmField
        var industry:String ="IT"


        fun callStaticMethod1() {
            println("调用静态方法1")
        }

        @JvmStatic
        fun callStaticMethod2() {
            println("调用静态方法2")
        }
    }

    val name = "你好"

    fun printName() {
        println("$name")
    }

    var age:Int = 0
        get() {
            return 28
        }
        set(value) {
            println("perfrom age-set()")
            field = value
        }


}

interface MyCustomCallback {

    fun onCallback()
}

fun setSamMethod(callback: MyCustomCallback) {

    callback.onCallback()
}

fun main() {
    setSamMethod(object : MyCustomCallback{
        override fun onCallback() {

        }

    })
}
