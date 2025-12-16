package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class vj1 extends vhd {
    public final int a = kti.d(16 * vw4.d().getDisplayMetrics().density);
    public final int b = kti.d(12 * vw4.d().getDisplayMetrics().density);

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR = RecyclerView.R(view);
        phd adapter = recyclerView.getAdapter();
        sj1 sj1Var = adapter instanceof sj1 ? (sj1) adapter : null;
        if (sj1Var != null && iR >= 0 && iR < sj1Var.j()) {
            int i = this.b;
            rect.left = i;
            rect.right = i;
            rect.top = this.a;
            rect.bottom = 0;
        }
    }
}
