object Upper {
    def upper(strings:String*):Seq[String] = {
        strings.map(_.toUpperCase())
    }
}
for( word <- (Upper.upper("Software"," is"," going"," to"," eat"," the"," world"))) { print(word) }
println()
