fun main (){

    print("!!! Welcome to Recipe Maker !!!\n\n")

    var recipe = ""
    var option = 0

    while (option != 3){
        println("Select your option: \n")
        println("1. Do a recipes\n" +
                "2. Look my recipes\n" +
                "3.Exit \n")

        println("Option: ")
        option = readLine()!!.toInt()

        if (option == 1){
            var returned = true

            println("Títle recipe: ")
            recipe += readLine() + "\n\n"

                while (returned) {
                    println("Select a ingredient: \n")

                    println("1.Water")
                    println("2.Milk")
                    println("3.Meat")
                    println("4.Vegetable")
                    println("5.Fruits")
                    println("6.Cereal")
                    println("7.Eggs")
                    println("8.Oil")

                    println("\n ingredient: ")
                    when (readLine()!!.toInt()){
                        1 -> recipe += "Water\n"
                        2 -> recipe += "Milk\n"
                        3 -> recipe += "Meat\n"
                        4 -> recipe += "Vegetable\n"
                        5 -> recipe += "Fruits\n"
                        6 -> recipe += "Cereal\n"
                        7 -> recipe += "Eggs\n"
                        8 -> recipe += "Oil\n"
                        else -> println("\n Option selected don´t exists")
                    }

                    println("\nDo you Wish other ingredient? \n1- Yes\n2-No\nOption: ")
                    if (readLine()!!.toInt()==2){
                        recipe += "**********************\n\n"
                        returned = false
                    }else if (readLine()!!.toInt()==1){
                        returned = true
                    }else{
                        println("\nOption wrong")
                        returned = false
                    }
                }
        }else if (option ==2){
            if (recipe.equals("")){
                println("\nDon´t have nothing in the recipe")
            }else {
                println("\n Your recipes are: \n")
                println(recipe)
            }
        }else {
            println("\n\n Thanks for use our program")
        }
    }

}