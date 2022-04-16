fun main(args: Array<String>) {
    val thread1 = Mythread()
    thread1.start()
}

class Mythread():Thread(){
    var counter = 0

    override fun run(){
        while(counter < 15){
            println("Count is: $counter")
            counter++

            try{
                sleep(2000)
            }catch (ex:Exception){
                print(ex.message)
            }
        }
    }
}