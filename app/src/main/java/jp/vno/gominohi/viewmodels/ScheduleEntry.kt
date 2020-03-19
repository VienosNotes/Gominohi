package jp.vno.gominohi.viewmodels

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.vno.gominohi.R
import jp.vno.gominohi.ScheduleEntryViewHolder
import kotlinx.serialization.*
import java.time.DayOfWeek

interface ScheduleEntry
@Serializable
class DayOfWeekScheduleEntry(private val weekInMonth: Int, private val dayOfWeek: DayOfWeek) : ScheduleEntry {
    companion object {
        fun indexFromWeekNum(weekNum: Int) = weekNum - 1
        fun indexFromDoy(doy: DayOfWeek) = doy.value
    }

    val indexWeekNum = weekInMonth - 1
    val indexDayOfWeek = dayOfWeek.value
}
@Serializable
class DateScheduleEntry(val date: Int) : ScheduleEntry

class ScheduleEntryAdapter(val entries: List<ScheduleEntry>) : RecyclerView.Adapter<ScheduleEntryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleEntryViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.custom_view_day_of_week_schedule_entry, parent, false)
        return ScheduleEntryViewHolder(inflate)
    }

    override fun getItemCount(): Int = entries.size

    override fun onBindViewHolder(holder: ScheduleEntryViewHolder, position: Int) {
        val entry: DayOfWeekScheduleEntry = entries[position] as DayOfWeekScheduleEntry
        holder.weekNum.setSelection(entry.indexWeekNum)
        holder.dayOfWeek.setSelection(entry.indexDayOfWeek)
    }

}