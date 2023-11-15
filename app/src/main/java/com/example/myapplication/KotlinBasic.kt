package com.example.myapplication

//import kotlin.Int


//fun main(){
//     val kb = KotlinBasic(name = "sajid",100)
////    println("the interger of : "+KotlinBasic().someInt)
////    println("sum of ab is : "+KotlinBasic().Add(10,20))
////    println("sub of ab is : "+KotlinBasic().Add(50,80))
//    println("the integer is : "+ kb.someInt)
//    println("the sum is : " + kb.Add(5,10))
//}

//class KotlinBasic{
//    val someInt = 10


//    constructor(a:Int, b: Int){
//        var sum = a+b
//        println("The Addition of Sum is : " +sum )
//    }
//    constructor(a: Int, b: Int, c:Int){
//        var sum = a+b+c
//        println("The Addition Of Three Is :" +sum)
//    }
//
//    constructor(name:String, salary:Int){
//        println("Name Of Employee is $name and per mouth salary is $salary"  )
//    }
//
//    fun Add(a:Int,b:Int):Int{
//        return a+b
//
//    }
//
//}

//       COMPANION OBJECT
//
//fun main(){
//    println("digit is " +Companionclass().digit)
//    println("sum of two number is " + Companionclass().add(45,78))
//
//    println("integer is " +Companionclass.integer)
//    println("product "+ Companionclass.product(49,20))
//}
//
//class Companionclass{
//    var digit = 10
//
//    fun add(a:Int,b:Int):Int{
//        return a+b
//    }
//
//    companion object{
//        var integer = 50
//
//        fun product(a: Int , b: Int):Int{
//            return a*b


//        }
//    }
//}

          //Inheritance and Override function


//open class ClassA(){
//   open val name ="john"

//    open fun add(a:Int, b:Int):Int{
//        return a+b
//    }
//}

//class ClassB:ClassA(){
//    override val name: String = "harry"
//
//    override fun add(a: Int, b: Int): Int {
//        val sum =  super.add(a, b)
//        val sqr = sum*sum
//        return sqr
//    }
//}

//fun main(){
//    var classb=ClassB()
//    var classa=ClassA()
//    println("my name is : " + classb.name+ "  " + classa.name)
//    println("sum of add fuction is : " + classb.add(23,44) + " " + classa.add(45,45))
//}


// SUPER AND THIS KEYWORDS

//fun main(){
//    var car = Audi()
//    car.interior(89778)
//}
//
//open class Car {
//    var manufactureno = 38893348
//
//    fun PressBrakes():String {
//        println("Car his be stoped")
//        return "press brakes"
//    }
//
//    fun PressAccl(speed: Int):String {
//        println("Car acclerated speed of " + speed + " km/h")
//        return "press acclerated"
//    }
//
//    fun ChangeGeer(geerno: Int):String {
//        println("Change Geer " + geerno)
//        return "chnage geer"
//    }
//}
//class Audi: Car() {
//    var ChasisNo = 8472
//    init {
//        println("Audi Created " + super.manufactureno)
//        println("step1 " + super.ChangeGeer(1))
//        println("step2 " + super.PressAccl(50))
//        println("step3 " + super.ChangeGeer(3))
//        println("step4 " + super.PressBrakes())
//    }
//
//    fun interior(ChasisNo: Int) {
//        println("Chasisno is " + this.ChasisNo)
//    }
//}

//   INTERFACE

// Define an interface
//interface Shape {
//    fun area(): Double
//    fun perimeter(): Double
//}
//
//// Implement the interface in a class
//class Circle(val radius: Double) : Shape {
//    override fun area(): Double {
//        return Math.PI * radius * radius
//    }
//
//    override fun perimeter(): Double {
//        return 2 * Math.PI * radius
//    }
//}
//
//// Implement the interface in another class
//class Rectangle(val width: Double, val height: Double) : Shape {
//    override fun area(): Double {
//        return width * height
//    }
//
//    override fun perimeter(): Double {
//        return 2 * (width + height)
//    }
//}
//
//fun main() {
//    val circle = Circle(5.0)
//    val rectangle = Rectangle(4.0, 6.0)
//
//    println("Circle - Area: ${circle.area()}, Perimeter: ${circle.perimeter()}")
//    println("Rectangle - Area: ${rectangle.area()}, Perimeter: ${rectangle.perimeter()}")
//}


//interface Add{
//    var fristno :Int
//
//    fun add(a:Int, b:Int):Int
//
//    fun add (a:Int, b:Int, c:Int): Int
//}
//
//class ClassA:Add {
//    override var fristno = 12
//
//    override fun add(a: Int, b: Int): Int {
//        return a+b
//    }
//
//    override fun add(a: Int, b: Int, c: Int): Int {
//        return a+b+c
//    }
//
//}
//
//class classB:Add{
//    override var fristno = 40
//
//    override fun add(a: Int, b: Int): Int {
//        return (a+b+b+a)
//    }
//
//    override fun add(a: Int, b: Int, c: Int): Int {
//       return 3*(a+b+c+a+b+c)
//    }

//}

//fun main(){
//    var classA= ClassA()
//    var classB= classB()
//
//    println("the frist number is : " + classA.fristno+" , "+classB.fristno)
//    println("the sum of two number is :" + classA.add(20,48)+", "  +classB.add(36,49))
//    println("the sum of three number is :" + classA.add(363,844,920)+", " +classB.add(34,73,98))
//}


//interface Employee {
//    fun Employee1(name: String, last: String, salary: Int): String
//    fun Employee2(name: String, last: String, salary: Int): String
//}
//
//class Company : Employee {
//    override fun Employee1(name: String, last: String, salary: Int): String {
//        return "Employee 1 data: Name=$name, Last=$last, Salary=$salary"
//    }
//
//    override fun Employee2(name: String, last: String, salary: Int): String {
//        return "Employee 2 data: Name=$name, Last=$last, Salary=$salary"
//    }
//}
//
//fun main() {
//    var employee = Company()
//    println("First employee data is " + employee.Employee1("John", "Smith", 1000))
//    println("Second employee data is " + employee.Employee2("Tim", "Watson", 15000))
//}

//  ABSTRACTION
//ENUM

//fun main(){
//    println("ToDay Is " +Weekday.TUESDAY)
//    for (day in Weekday.values()){
//        if (day.Holiday)
//            println(" " +day+ " is Holiday")
//    }
//}
//
//enum class Weekday(val Holiday:Boolean = false){
//    SUNDAY(true),
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY(true),
//}


// GERENCIS

//class Genclass <T>(value:T){
//    init {
//        println("the vales is " +value)
//        Check<T>(value)
//    }
//}
//fun<T>Check(text:T){
//    println("Recived value is " + text)
//}
//
//fun main(){
////    var genclass = Genclass<String>("Hello")
//    var genclass1 = Genclass(true)
//
//}


//         LAMBADAS


//var num : Int = 11
//
//val sqr:(Int) ->Int = { x -> x*x}
//
//val sum = {x:Int,y:Int -> x+y}
//
//fun main(){
//    println("The Square Of 6 is " + sqr(6))
//    println("The sum of two integer is " + sum(45,43))
//}

//fun square(a:Int):Int{
//    return a*a

//}

//  HIGHER ORDER FUNCTION

// DEGEGATION
//
//fun main(){
//    val Taskmanger = TaskManager(bgTask("Download Task!"), bgExecuteTask("Download Task!") )
//    Taskmanger.Creator()
//    Taskmanger.Execute()
//}
//
//interface Task{
//    fun Creator(){
//    }
//}
//interface ExecuteTask{
//    fun Execute(){
//    }
//}
//
//class bgTask(val taskname :String):Task{
//    override fun Creator(){
//        println("Task :" +taskname+ "Created!")
//    }
//}
//class bgExecuteTask(val taskname:String):ExecuteTask{
//    override fun Execute(){
//        print("task :" +taskname+ "Execute!")
//    }
//}
//
//class TaskManager(val creator:Task, val execute:ExecuteTask): Task by creator,ExecuteTask by execute{
//
//}

//  scope function

class Company(){
    lateinit var name : String
    lateinit var objective  : String
    lateinit var founder : String
}

fun main(){

// we have apply with function and apply function Or Also Function let function

    var name:String = "JHON"

    name.let {
        println("the length of name is " + it.length)
        println("the name is " + it)
        println("the reversed is " + it.reversed())

    }

    val company = Company().apply {
        name= "Android App Development"
        objective = "Computer Science"
        founder ="Android Inc. was founded in Palo Alto, California, in October 2003 by Andy Rubin, Rich Miner, Nick Sears, and Chris White."
    }

    println(company.name)
    println(company.objective)
    println(company.founder)

    with(company){
        println("$name")
    }

    company.also {
        it.name = "Web Developer"
        it.objective="Computer Science"
        it.founder ="Tim Berners-Lee, a British scientist,"
    }

    println(company.name)
    println(company.objective)
    println(company.founder)
}




