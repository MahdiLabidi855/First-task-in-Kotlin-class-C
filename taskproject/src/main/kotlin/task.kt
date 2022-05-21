open class Mobile {

        var brand:String = ""
        var Model:String = ""
        var MRP:String = ""
        var discount:Int = 0

    fun getActualPrice():Int{
        return discount
    }
    fun insert (b:String,m:String,mrp:String,d:Int ){
        brand=b
        Model=m
        MRP=mrp
        discount=d
    }
    fun printDetails(){
        println("mobile brand: ${brand} \n mobile model: ${Model} \n mobile MRP: ${MRP} \n mobile discount: ${discount} $\n ")
        }
    }


fun main(args:Array<String>) {
    val m = Mobile()
    m.insert("apple","iphone 11", "iOS 13",200)
    var d=m.getActualPrice()
    println("the desciont is: $d")
    m.printDetails()
    m.insert("Samsung","Galaxy S20", "Android 10",100)
    d=m.getActualPrice()
    println("the desciont is: $d")
    m.printDetails()
    m.insert("OnePlus","7", "Android 9 Pie",50)
    d=m.getActualPrice()
    println("the desciont is: $d")
    m.printDetails()
}