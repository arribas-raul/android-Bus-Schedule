package com.example.busschedule.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.busschedule.data.model.BusSchedule
import kotlinx.coroutines.flow.Flow

@Dao
interface BusSheduleDao {
    @Query(
        """
        SELECT * 
        from schedule 
        ORDER BY arrival_time ASC
        """
    )
    fun getAllItems(): Flow<List<BusSchedule>>

    @Query(
        """
        SELECT * 
        FROM schedule 
        WHERE stop_name = :name 
        ORDER BY arrival_time ASC 
        """
    )
    fun getItemsByName(name: String): Flow<List<BusSchedule>>
}