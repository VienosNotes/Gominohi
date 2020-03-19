package jp.vno.gominohi.decorations

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import jp.vno.gominohi.R

class ScheduleDecoration(private val space: Int) : RecyclerView.ItemDecoration() {
    companion object {
        @JvmStatic
        fun createDefaultDecoration(ctx: Context) : ScheduleDecoration {
            val spacingInPixels: Int = ctx.resources.getDimensionPixelSize(R.dimen.schedule_margin)
            return ScheduleDecoration(spacingInPixels)
        }
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.top = space
        outRect.left = space
        outRect.right = space
        outRect.bottom = space
    }
}
