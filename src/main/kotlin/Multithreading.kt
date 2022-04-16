fun main(args: Array<String>) {
    val thread1 = Mythreads("Thread 1")
    thread1.start()

    val thread2 = Mythreads("Thread 2")
    thread2.start()

    val thread3 = Mythreads("Thread 3")
    thread3.start()

    thread3.join()

    println("Threading is done!")
}

class Mythreads():Thread(){

    var threadName: String = ""

    constructor(threadName: String): this(){
        this.threadName = threadName
        println(this.threadName + " has started")
    }


    override fun run(){
        var counter = 0
        while(counter < 15){
            println(this.threadName + " Count is: $counter")
            counter++

            try{
                sleep(2000)
            }catch (ex:Exception){
                print(ex.message)
            }
        }
    }
}