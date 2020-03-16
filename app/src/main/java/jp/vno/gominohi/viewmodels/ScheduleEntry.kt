package jp.vno.gominohi.viewmodels
import android.graphics.Color
import kotlinx.serialization.*
import kotlinx.serialization.json.*
import java.time.DayOfWeek

interface Schedule
@Serializable
class DayOfWeekSchedule(val weekInMonth: Int, val dayOfWeek: DayOfWeek) : Schedule
@Serializable
class DateSchedule(val date: Int) : Schedule
@Serializable
class ScheduleEntry(val name:String, val colorCode: String) {
    val Schedules: MutableList<Schedule> = mutableListOf()
}