package jp.vno.gominohi.viewmodels
import kotlinx.serialization.*


@Serializable
class Schedule(val name:String, val colorCode: String) {
    val Schedules: MutableList<Schedule> = mutableListOf()
}