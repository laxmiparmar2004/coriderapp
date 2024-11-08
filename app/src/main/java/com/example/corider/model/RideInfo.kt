package com.example.corider.model

data class RideInfo(
    val ride_id: String? = null,
    val driver_id: String,
    val start_location: String,
    val destination: String,
    val departure_time: String,
    val available_seats: Int,
    val price_per_seat: Double,
    val ride_status: String
)
