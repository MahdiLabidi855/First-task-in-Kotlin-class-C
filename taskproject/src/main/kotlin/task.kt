class Mobile {

        var brand:String = ""
        var Model:String = ""
        var MRP:Int = 0
        var discount:Int = 0

    fun getActualPrice():Int{
        return discount
    }
    fun insert (b:String,m:String,mrp:Int,d:Int ){
        brand=b
        Model=m
        MRP=mrp
        discount=d
    }
    fun printDetails(){
        println("mobile brand: ${brand} \n mobile model: ${Model} \n mobile MRP: ${MRP} $\n mobile discount: ${discount} $\n ")
        }
    }


fun main(args:Array<String>) {
    val m = Mobile()
    m.insert("apple","iphone 11", 200,50)
    var d=m.getActualPrice()
    println("the desciont is: $d")
    m.printDetails()
    m.insert("Samsung","Galaxy S20", 300,20)
    d=m.getActualPrice()
    println("the desciont is: $d")
    m.printDetails()
    m.insert("OnePlus","7", 150,20)
    d=m.getActualPrice()
    println("the desciont is: $d")
    m.printDetails()
}