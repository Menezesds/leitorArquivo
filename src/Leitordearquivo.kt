import java.io.File

internal object fileProperty {
    @JvmStatic
    fun main(args: Array<String>) {
        val fileDirectory = "src/exemplo.csv"

        val lines: List<String> = File(fileDirectory).readLines()
        lines.forEach() { line ->
            var lineList:List<String> = line.split(",")
            var QuotaAmount = lineList[0]
            var StartDate =lineList[1]
            var OwnerName = lineList[2]
            var Username = lineList[3]

            println(QuotaAmount + " " + StartDate + " " + OwnerName + " " + Username)
        }
    }
}
