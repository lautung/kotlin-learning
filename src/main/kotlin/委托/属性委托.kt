package 委托

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//方式一
private class Delegate {
    operator fun getValue(thisRef: Any?,property: KProperty<*>):String{
        return "$thisRef，${property.name}"
    }

    operator fun setValue(thisRef: Any?,property: KProperty<*>,value: String){
        println("$thisRef , ${property.name} , $value")
    }
}

private class Property(){
    var property1:String by Delegate()
}

//方式二
private class DelegateRO:ReadOnlyProperty<Any,String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return "$thisRef，${property.name}"
    }
}

private class DelegateRW:ReadWriteProperty<Any,String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return "$thisRef，${property.name}"
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("$thisRef , ${property.name} , $value")
    }
}

private class Property2 {
    val p2: String by DelegateRO()
    var p3: String by DelegateRW()
}


fun main(){
    //方式一
    val property= Property()
    println(property.property1)
    property.property1="hello world"
    println(property.property1)
    //方式二
    val property2= Property2()
    println(property2.p2)
//    property2.p2="hello world"

    println(property2.p3)
    property2.p3="hello world"
    println(property2.p3)


}
