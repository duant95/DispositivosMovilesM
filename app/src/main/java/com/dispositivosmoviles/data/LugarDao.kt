package com.dispositivosmoviles.data

import androidx.lifecycle.LiveData
import com.dispositivosmoviles.model.Lugar
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.google.firebase.ktx.Firebase

interface LugarDao {
//firebase var
    private var codigoUsuario: String
    private var firestore: FirebaseFirestore

    init {
        val usuario = Firebase.auth.currentUser?.email
        codigoUsuario = "$usuario"
        firestore = FirebaseFirestore.getInstance()
        firestore.firestoreSettings = FirebaseFirestoreSettings.Builder().build()
    }
   fun addLugar(lugar: Lugar){

    }


    fun updateLugar(lugar: Lugar){

    }

    fun deleteLugar(lugar: Lugar){

    }

    fun getLugares() : LiveData<List<Lugar>>{

    }
}