package 委托
interface ISayHello{
    fun sayHello(){

    }
}

class DelegateSayHello: ISayHello {
    override fun sayHello() {
        println("Hello World!")
    }
}

class RealSayHello(private val delegateSayHello: DelegateSayHello): ISayHello {
    override fun sayHello() {
        delegateSayHello.sayHello()
    }
}

class RealImp2: ISayHello by DelegateSayHello()

class RealImp3(private val delegate: ISayHello): ISayHello by delegate



fun main(args: Array<String>) {
    //方式1
    val delegateSayHello= DelegateSayHello()
    val realSayHello= RealSayHello(delegateSayHello)
    realSayHello.sayHello()
    //方式2
    val realImp2= RealImp2()
    realImp2.sayHello()
    //方式3
    val realImp3= RealImp3(delegateSayHello)
    realImp3.sayHello()

}