package com.dispositivosmoviles.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Lugar(
    val id: String,
    val nombre: String,
    val correo: String?,
    val web: String?,
    val telefono: String?
) : Parcelable {
    constructor():
            this("","","","","")
}