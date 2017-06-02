package cardSimulation

object PokerProbability {

  /**
   * For a given number of iterations, shuffles a deck, draws a hand and
   * returns a vector with the frequency of each hand category.
   */
  def register(n: Int, deck: Deck): Vector[Int] = ???

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine("number of iterations: ").toInt
    val deck = Deck.full()
    val frequencies = register(n, deck)
    for (i <- Hand.Category.indices) {
        val name = Hand.Category.Name.english(i).capitalize
        val percentages = frequencies(i).toDouble / n * 100
        println(f"$name%-18s $percentages%8.6f%%")
    }
  }
}
