package com.dispositivosmoviles.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.dispositivosmoviles.model.Lugar

interface LugarDao {

   fun addLugar(lugar: Lugar){

    }


    fun updateLugar(lugar: Lugar){

    }

    fun deleteLugar(lugar: Lugar){

    }

    fun getLugares() : LiveData<List<Lugar>>{

    }
}