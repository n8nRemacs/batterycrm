package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class w11 extends vhd {
    public final int a;
    public final int b = kti.d(20 * vw4.d().getDisplayMetrics().density);
    public final int c = kti.d(28 * vw4.d().getDisplayMetrics().density);
    public final int d = kti.d(8 * vw4.d().getDisplayMetrics().density);
    public final int o;

    public w11() {
        float f = 12;
        this.a = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.o = kti.d(f * vw4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR = RecyclerView.R(view);
        phd adapter = recyclerView.getAdapter();
        y01 y01Var = adapter instanceof y01 ? (y01) adapter : null;
        if (y01Var != null && iR >= 0 && iR < y01Var.j()) {
            t98 t98Var = (t98) y01Var.C(iR);
            e21 e21Var = t98Var instanceof e21 ? (e21) t98Var : null;
            t98 t98VarG = y01Var.G(iR + 1);
            e21 e21Var2 = t98VarG instanceof e21 ? (e21) t98VarG : null;
            int i = 0;
            boolean z = iR == 0;
            int i2 = this.o;
            rect.left = i2;
            rect.right = i2;
            rect.top = e21Var instanceof d21 ? this.a : z ? this.b : 0;
            if (!fni.a(e21Var != null ? Integer.valueOf(e21Var.t()) : null, e21Var2 != null ? Integer.valueOf(e21Var2.t()) : null)) {
                i = this.c;
            } else if (e21Var != null && !e21Var.g()) {
                i = this.d;
            }
            rect.bottom = i;
        }
    }
}
