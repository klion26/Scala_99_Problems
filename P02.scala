def penultimate[A](l: List[A]): A = l match {
	case h :: _ :: Nil => h
	case _ :: tail => penultimate(tail)
	case _ => throw new NoSuchElementException
}
