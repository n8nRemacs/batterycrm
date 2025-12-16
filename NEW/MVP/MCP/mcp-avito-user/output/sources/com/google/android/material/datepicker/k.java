package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.util.C22807v;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j.N;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes6.dex */
class k extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f356538b = E.g(null);

    /* renamed from: c, reason: collision with root package name */
    public final Calendar f356539c = E.g(null);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f356540d;

    public k(MaterialCalendar materialCalendar) {
        this.f356540d = materialCalendar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@N Canvas canvas, @N RecyclerView recyclerView, @N RecyclerView.z zVar) {
        S s5;
        if ((recyclerView.getAdapter() instanceof G) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            G g12 = (G) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.f356540d;
            Iterator it = materialCalendar.f356433h0.z5().iterator();
            while (it.hasNext()) {
                C22807v c22807v = (C22807v) it.next();
                F f12 = c22807v.f44895a;
                if (f12 != 0 && (s5 = c22807v.f44896b) != 0) {
                    long jLongValue = ((Long) f12).longValue();
                    Calendar calendar = this.f356538b;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) s5).longValue();
                    Calendar calendar2 = this.f356539c;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i12 = calendar.get(1) - g12.f356430c.f356434i0.f356407b.f356493d;
                    int i13 = calendar2.get(1) - g12.f356430c.f356434i0.f356407b.f356493d;
                    View viewZ = gridLayoutManager.Z(i12);
                    View viewZ2 = gridLayoutManager.Z(i13);
                    int i14 = gridLayoutManager.f53662H;
                    int i15 = i12 / i14;
                    int i16 = i13 / i14;
                    int i17 = i15;
                    while (i17 <= i16) {
                        if (gridLayoutManager.Z(gridLayoutManager.f53662H * i17) != null) {
                            canvas.drawRect((i17 != i15 || viewZ == null) ? 0 : (viewZ.getWidth() / 2) + viewZ.getLeft(), r10.getTop() + materialCalendar.f356438m0.f356516d.f356507a.top, (i17 != i16 || viewZ2 == null) ? recyclerView.getWidth() : (viewZ2.getWidth() / 2) + viewZ2.getLeft(), r10.getBottom() - materialCalendar.f356438m0.f356516d.f356507a.bottom, materialCalendar.f356438m0.f356520h);
                        }
                        i17++;
                    }
                }
            }
        }
    }
}
