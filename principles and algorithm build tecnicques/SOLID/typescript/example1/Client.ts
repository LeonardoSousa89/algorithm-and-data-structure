import Admin from './Admin'
import Customer from './Customer'
import Developer from './Developer'

const admin1 = new Admin('Leonardo Sousa', 'leo@gmail.com.br')
admin1.show()

const customer1 = new Customer('Rodrigo Branas', 'branas@gmail.com.br')
customer1.show()

const developer1 = new Developer('Fábio Akita', 'akitaonrails@gmail.com.br')
developer1.show()