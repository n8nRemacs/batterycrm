package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class e61 extends vhd {
    public final int a;
    public final int b = kti.d(20 * vw4.d().getDisplayMetrics().density);
    public final int c = kti.d(28 * vw4.d().getDisplayMetrics().density);
    public final int d;

    public e61() {
        float f = 12;
        this.a = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.d = kti.d(f * vw4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR = RecyclerView.R(view);
        phd adapter = recyclerView.getAdapter();
        c61 c61Var = adapter instanceof c61 ? (c61) adapter : null;
        if (c61Var != null && iR >= 0 && iR < c61Var.j()) {
            t98 t98Var = (t98) c61Var.C(iR);
            i61 i61Var = t98Var instanceof i61 ? (i61) t98Var : null;
            t98 t98VarG = c61Var.G(iR + 1);
            i61 i61Var2 = t98VarG instanceof i61 ? (i61) t98VarG : null;
            boolean z = iR == 0;
            int i = this.d;
            rect.left = i;
            rect.right = i;
            rect.top = i61Var instanceof h61 ? this.a : z ? this.b : 0;
            rect.bottom = fni.a(i61Var != null ? Integer.valueOf(i61Var.t()) : null, i61Var2 != null ? Integer.valueOf(i61Var2.t()) : null) ? 0 : this.c;
        }
    }
}
