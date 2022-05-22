class Mobile {

        var brand:String = ""
        var Model:String = ""
        var MRP:Int = 0
        var discount:Int = 0

    fun getActualPrice():Int{
        discount = (MRP*discount) / 100
        return discount
    }
    fun insert (b:String,m:String,mrp:Int,d:Int ){
        brand=b
        Model=m
        MRP=mrp
        discount=d
    }
    fun printDetails(d:Int){
        println("mobile brand: ${brand} \n mobile model: ${Model} \n mobile MRP: ${MRP} $\n mobile discount: ${d} $\n ")
        }
    }


fun main(args:Array<String>) {
    val m = Mobile()
    m.insert("apple","iphone 11", 200,2)
    var d=m.getActualPrice()

    m.printDetails(d)
    m.insert("Samsung","Galaxy S20", 300,5)
    d=m.getActualPrice()
    m.printDetails(d)
    m.insert("OnePlus","7", 150,10)
    d=m.getActualPrice()
    m.printDetails(d)
}