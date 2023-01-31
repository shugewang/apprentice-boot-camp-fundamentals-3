package tax

class DefaultTaxCalculator(private val accountForSecondYearTax: Boolean, private val accountForExpensiveCar: Boolean) : TaxCalculator() {
    override fun calculateTax(vehicle: Vehicle?): Int {
        return when (vehicle?.fuelType) {
            FuelType.PETROL -> {
                when (vehicle.co2Emissions) {
                    0 -> 0
                    in 1..50 -> 10
                    in 51..75 -> 25
                    in 76..90 -> 105
                    in 91..100 -> 125
                    in 101..110 -> 145
                    in 111..130 -> 165
                    in 131..150 -> 205
                    in 151..170 -> 515
                    in 171..190 -> 830
                    in 191..225 -> 1240
                    in 226..255 -> 1760
                    else -> 2070
                }
            }
            FuelType.ALTERNATIVE_FUEL -> {
                when (vehicle.co2Emissions) {
                    0 -> 0
                    in 1..50 -> 0
                    in 51..75 -> 15
                    in 76..90 -> 95
                    in 91..100 -> 115
                    in 101..110 -> 135
                    in 111..130 -> 155
                    in 131..150 -> 195
                    in 151..170 -> 505
                    in 171..190 -> 820
                    in 191..225 -> 1230
                    in 226..255 -> 1750
                    else -> 2060
                }
            }
            FuelType.DIESEL -> {
                when (vehicle.co2Emissions) {
                    0 -> 0
                    in 1..50 -> 25
                    in 51..75 -> 105
                    in 76..90 -> 125
                    in 91..100 -> 145
                    in 101..110 -> 165
                    in 111..130 -> 205
                    in 131..150 -> 515
                    in 151..170 -> 830
                    in 171..190 -> 1240
                    in 191..225 -> 1760
                    in 226..255 -> 2070
                    else -> 2070
                }
            } else -> 0
        }
    }
}