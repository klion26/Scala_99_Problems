/**
 * Find the Kth element of a list.
 */
object P03 {
	def nth[A](k : Int, l : List[A]) : A = {
		if (k >= 0) l(k)
		else throw new NoSuchElementException
	}

	def nthRecursive[A](n : Int, ls: List[A]) : A = (n, ls) match {
			case (0, h :: _ ) => h
			case (n, _ :: tail) => nthRecursive(n - 1, tail)
			case (_, Nil) => throw new NoSuchElementException
	}
}
