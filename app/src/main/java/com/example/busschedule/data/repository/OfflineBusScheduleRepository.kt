package com.example.busschedule.data.repository

import com.example.busschedule.data.dao.BusSheduleDao
import com.example.busschedule.data.model.BusSchedule
import kotlinx.coroutines.flow.Flow

class OfflineBusScheduleRepository(private val busSheduleDao: BusSheduleDao) :
    BusScheduleRepository {
    override fun getAllItems(): Flow<List<BusSchedule>> = busSheduleDao.getAllItems()

    override fun getItemsByName(name: String): Flow<List<BusSchedule>> = busSheduleDao.getItemsByName(name)
}