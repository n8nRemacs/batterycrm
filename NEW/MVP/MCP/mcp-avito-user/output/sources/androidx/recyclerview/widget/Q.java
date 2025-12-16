package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper.java */
/* loaded from: classes10.dex */
class Q extends C23434z {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P f53733p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(P p12, Context context) {
        super(context);
        this.f53733p = p12;
    }

    @Override // androidx.recyclerview.widget.C23434z, androidx.recyclerview.widget.RecyclerView.y
    public final void e(View view, RecyclerView.y.a aVar) {
        P p12 = this.f53733p;
        RecyclerView recyclerView = p12.f53728a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrC = p12.c(recyclerView.getLayoutManager(), view);
        int i12 = iArrC[0];
        int i13 = iArrC[1];
        int iK2 = k(Math.max(Math.abs(i12), Math.abs(i13)));
        if (iK2 > 0) {
            aVar.b(i12, i13, iK2, this.f54210i);
        }
    }

    @Override // androidx.recyclerview.widget.C23434z
    public final float j(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
