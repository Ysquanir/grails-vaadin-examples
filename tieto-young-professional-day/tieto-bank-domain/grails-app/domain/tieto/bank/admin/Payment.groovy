package tieto.bank.admin

class Payment {

	Account to
	Account from
	Integer amount
	Date date

	static constraints = {
		amount min:1
		from nullable:true
		to nullable:true
	}

	def beforeValidate(){
		date = new Date()
	}
}
