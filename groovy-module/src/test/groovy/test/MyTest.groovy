package test

import spock.lang.Specification

class MyTest extends Specification {

	def test() {
		when:
		def result = new TestHelper().doStuff()

		then:
		result == "hi there"
	}
}
