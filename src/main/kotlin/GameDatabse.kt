class GameDatabse constructor(private val games : MutableList<Game>)
{
	init
	{
		games.sortWith(
			compareBy(String.CASE_INSENSITIVE_ORDER, { it.title} )
		)
	}

	fun find(match : String) : Game?
	{
		return games.find { it.title.lowercase().contains(match.lowercase()) }
	}
}