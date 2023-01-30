package tax

class DefaultTaxCalculator : TaxCalculator() {
    override fun calculateTax(vehicle: Vehicle?): Int {
        when (vehicle?.fuelType) {
            FuelType.PETROL -> {
                return when (vehicle.co2Emissions) {
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
                return when (vehicle.co2Emissions) {
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
            else -> return 0
        }
    }
}