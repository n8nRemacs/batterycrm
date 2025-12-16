package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public final class k3e extends i3 {
    public final RecyclerView c;

    public k3e(View view, RecyclerView recyclerView) {
        super(13, view);
        this.c = recyclerView;
    }

    @Override // defpackage.i3
    public final void k0(Rect rect, Rect rect2) {
        if (rect.height() > rect2.height()) {
            Log.w("ContextMenu.ScrollHelper", "Can't fit view into desired rect!");
            return;
        }
        int i = rect.top;
        int i2 = rect2.top;
        boolean z = false;
        RecyclerView recyclerView = this.c;
        if (i < i2) {
            int i3 = i - i2;
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int i4 = iComputeVerticalScrollOffset + i3;
            if (iComputeVerticalScrollOffset > 0) {
                recyclerView.scrollBy(0, i3);
            }
            if (i4 < 0) {
                recyclerView.c0(Math.abs(i4));
                recyclerView.Y();
            }
            rect.offset(0, -i3);
            return;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 > i6) {
            int i7 = i5 - i6;
            int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange() - (recyclerView.computeVerticalScrollExtent() + recyclerView.computeVerticalScrollOffset());
            if (iComputeVerticalScrollRange < 0) {
                iComputeVerticalScrollRange = 0;
            }
            if (iComputeVerticalScrollRange > 0) {
                recyclerView.scrollBy(0, i7);
            }
            int i8 = iComputeVerticalScrollRange - i7;
            a layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            phd adapter = recyclerView.getAdapter();
            int iJ = (adapter != null ? adapter.j() : 1) - 1;
            boolean z2 = linearLayoutManager != null && linearLayoutManager.U0() == 0;
            if (linearLayoutManager != null && linearLayoutManager.Y0() == iJ) {
                z = true;
            }
            if (z2 && z) {
                recyclerView.c0(-i7);
            } else if (i8 < 0) {
                recyclerView.c0(i8);
            }
        }
    }
}
