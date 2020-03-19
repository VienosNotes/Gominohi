package jp.vno.gominohi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.vno.gominohi.decorations.ScheduleDecoration
import jp.vno.gominohi.viewmodels.DayOfWeekScheduleEntry
import jp.vno.gominohi.viewmodels.ScheduleEntry
import jp.vno.gominohi.viewmodels.ScheduleEntryAdapter
import java.lang.Exception
import java.time.DayOfWeek

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ScheduleFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv = view.findViewById<RecyclerView>(R.id.scheduleEntryView)
        val adapter = ScheduleEntryAdapter(createDataSet())
        val ctx = this.context ?: throw Exception()

        val mgr = LinearLayoutManager(ctx)
        rv.setHasFixedSize(true)
        rv.addItemDecoration(ScheduleDecoration.createDefaultDecoration(ctx))
        rv.layoutManager = mgr
        rv.adapter = adapter


    }

    private fun createDataSet() = (1..3).map { DayOfWeekScheduleEntry(it, DayOfWeek.of(it)) }

}
