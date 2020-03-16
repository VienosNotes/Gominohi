package jp.vno.gominohi.views

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jp.vno.gominohi.viewmodels.ScheduleEntry

class ScheduleEntryView {
}

class ScheduleEntryAdopter(entries: MutableCollection<ScheduleEntry>) : RecyclerView.Adapter<ScheduleEntryAdopter.ScheduleEntryViewHolder>() {

    private val _entries: MutableList<ScheduleEntry> = entries.toMutableList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleEntryViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int = _entries.size


    override fun onBindViewHolder(holder: ScheduleEntryViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ScheduleEntryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}


