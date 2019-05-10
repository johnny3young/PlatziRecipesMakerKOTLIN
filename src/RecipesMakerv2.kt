fun main () {

    print("!!! Welcome to Recipe Maker !!!\n\n")

    var recipe = ""
    var option = 0
    var returned = true

    while (option != 3) {
        println("Select your option: \n")
        println(
            "1. Do a recipes\n" +
            "2. Look my recipes\n" +
            "3.Exit \n"
        )
        println("Option: ")
        option = readLine()!!.toInt()

        if (option == 1){
            println("Title recipe\n")
            recipe += readLine() + ":\n"


        loop@ while (returned){
                println("Select ingredients for you recipe: ")
                println("1.Water")
                println("2.Milk")
                println("3.Meat")
                println("4.Vegetable")
                println("5.Fruits")
                println("6.Cereal")
                println("7.Eggs")
                println("8.Oil")
                println("9.No more ingredients")

            when (readLine()!!.toInt()) {
                1 -> recipe += "Water\n"
                2 -> recipe += "Milk\n"
                3 -> recipe += "Meat\n"
                4 -> recipe += "Vegetable\n"
                5 -> recipe += "Fruits\n"
                6 -> recipe += "Cereal\n"
                7 -> recipe += "Eggs\n"
                8 -> recipe += "Oil\n"
                9 -> {  recipe += "\n"
                        break@loop
                    }
            }
        }
        }else if (option ==2){
        if (recipe.equals("")){
            println("\nDon´t have nothing in the recipe")
        }else {
            println("Your recipes are: \n")
            println("$recipe \n\n")
        }
        }else {
        println("\n\n Thanks for use our program")
    }

    }
}