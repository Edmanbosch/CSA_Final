fun main()
{
	println("Hello World!")
	val games = mutableListOf<Game>(
		Game("Danganronpa", 2010, "A deadly game featuring deadly deaths!"),
		Game("Metroid Prime", 2002, "Explore an alien world."),
		Game("Danganronpa 2: Goodbye Despair", 2012, "A deadlier game featuring deadlier deaths!")
	)

	val db : GameDatabse = GameDatabse(games)

	while (true)
	{
		println("Type in a game to view its info, or type 'exit' to close the program")

		val input = readln()
		if (input == "exit")
		{
			break
		}

		val result = db.find(input)
		println(result)
	}

}