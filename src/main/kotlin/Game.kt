data class Game(val title: String, val releaseYear: Int, val description: String)
{
	//val name : String = title
	//val year : Int = releaseYear

	override fun toString(): String
	{
		return "$title ($releaseYear)\n$description"
	}
}