package tieto.bank.admin



import grails.test.mixin.*
import grails.validation.*

import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Payment)
class PaymentTests {

	void testSomething() {
		Payment p = new Payment()
		p.amount = 5000
		p.save(failonError:true)
	}

	void testToFail(){
		shouldFail(ValidationException) {
			Payment p = new Payment()
			p.amount = 0
			p.save(failonError:true)
		}
	}
}
