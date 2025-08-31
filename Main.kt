fun main() {
    print("enter a number : ")

    var n = readln().toInt()
    var x = 1
    while (x<=n) {
        var s= 1
        while (s <= n-x ){
            print(" ")
            s++
        }
        var z = 1
        while (z <= x){
            print("* ")
            z++
        }
        println()
        x++


    }



}
