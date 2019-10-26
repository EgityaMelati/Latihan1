package com.example.latihan1.database

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class StudentContract(
    val id: Long?,
    val name: String,
    val age: Int,
    val address: String,
    val photo: String,
    val majority: String
) : Parcelable {
    companion object{
        const val TABLE_STUDENT = "table_student"
        const val  ID = "id"
        const val  NAME = "name"
        const val  AGE = "age"
        const val  ADDRESS = "address"
        const val  PHOTO = "photo"
        const val MAJORITY = "majority"
    }
}
