interface IPayrollCalculator{
    var id : Int
    var name : String
    fun calculate_payroll(): Number {
        return 0
    }
}

open class Employee{
    var id : Int = 0
    var name : String = ""

}

open class SalaryEmployee : Employee(), IPayrollCalculator{
    override fun calculate_payroll(): Number {
        println("This is salary of a Salaried Employee")
        return 0
    }
}

class HourlyEmployee : Employee(), IPayrollCalculator{
    override fun calculate_payroll(): Number {
        println("This is salary of a Hourly Employee")
        return 0
    }
}

class CommissionEmployee : SalaryEmployee(), IPayrollCalculator{
    override fun calculate_payroll(): Number {
        println("This is salary of a Commission Employee")
        return 0
    }
}

fun main(){
    val SE = SalaryEmployee()
    SE.calculate_payroll()
    val HE = HourlyEmployee()
    HE.calculate_payroll()
    val CE = CommissionEmployee()
    CE.calculate_payroll()
}
