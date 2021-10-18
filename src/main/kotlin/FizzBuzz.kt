class FizzBuzz {

    fun getFizzBuzz(n: Int): String{
        var result = "";
        if ((n % 3 == 0) and (n % 5 == 0)) {
            result = "fizzbuzz"
        }else if(n % 3 == 0){
            result = "fizz"
        }else if(n % 5 == 0){
            result = "buzz"
        }else{
            result = n.toString()
        }
        return result
    }
}