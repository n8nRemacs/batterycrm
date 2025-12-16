package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes10.dex */
class N {
    public static int a(RecyclerView.z zVar, I i12, View view, View view2, RecyclerView.m mVar, boolean z12) {
        if (mVar.e0() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z12) {
            return Math.abs(RecyclerView.m.t0(view) - RecyclerView.m.t0(view2)) + 1;
        }
        return Math.min(i12.n(), i12.d(view2) - i12.g(view));
    }

    public static int b(RecyclerView.z zVar, I i12, View view, View view2, RecyclerView.m mVar, boolean z12, boolean z13) {
        if (mVar.e0() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z13 ? Math.max(0, (zVar.b() - Math.max(RecyclerView.m.t0(view), RecyclerView.m.t0(view2))) - 1) : Math.max(0, Math.min(RecyclerView.m.t0(view), RecyclerView.m.t0(view2)));
        if (z12) {
            return Math.round((iMax * (Math.abs(i12.d(view2) - i12.g(view)) / (Math.abs(RecyclerView.m.t0(view) - RecyclerView.m.t0(view2)) + 1))) + (i12.m() - i12.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.z zVar, I i12, View view, View view2, RecyclerView.m mVar, boolean z12) {
        if (mVar.e0() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z12) {
            return zVar.b();
        }
        return (int) (((i12.d(view2) - i12.g(view)) / (Math.abs(RecyclerView.m.t0(view) - RecyclerView.m.t0(view2)) + 1)) * zVar.b());
    }
}
