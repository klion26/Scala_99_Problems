/**
 * Find the last element of a list.
 * last(List(1, 1, 2, 3, 5, 8)) => 8
 */
object P01 {
	def lastBuiltin[A](ls: List[A]) = ls.last

	def lastRecursive[A](ls: List[A]): A = ls match {
		case h :: Nil => h
		case h :: tail => lastRecursive(tail)
		case _ => throw new NoSuchElementException
	}
}
