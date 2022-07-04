package com.example.android.hilt.data

import java.util.LinkedList
import javax.inject.Inject

class LoggerInMemoryDataSource @Inject constructor() : LoggerDataSource {

    private val logs = LinkedList<Log>()

    override fun addLog(msg: String) {
        logs.add(Log(msg = msg, timestamp = System.currentTimeMillis()))
    }

    override fun getAllLogs(callback: (List<Log>) -> Unit) {
        callback.invoke(logs)
    }

    override fun removeLogs() {
        logs.clear()
    }
}