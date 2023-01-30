package tax

class DefaultTaxCalculator : TaxCalculator() {
    override fun calculateTax(vehicle: Vehicle?): Int {
        val emission = vehicle?.co2Emissions
        if (emission != null) {
            when (emission) {
                0 -> {
                    return 0
                }

                in 1..50 -> {
                    return 10
                }

                in 51..75 -> {
                    return 25
                }

                in 76..90 -> {
                    return 105
                }

                in 91..100 -> {
                    return 125
                }

                in 101..110 -> {
                    return 145
                }

                in 111..130 -> {
                    return 165
                }

                in 131..150 -> {
                    return 205
                }

                in 151..170 -> {
                    return 515
                }

                in 171..190 -> {
                    return 830
                }

                in 191..225 -> {
                    return 1240
                }

                in 226..255 -> {
                    return 1760
                }

                else -> {
                    return 2070

                }
            }
        }
        return 0
    }

}