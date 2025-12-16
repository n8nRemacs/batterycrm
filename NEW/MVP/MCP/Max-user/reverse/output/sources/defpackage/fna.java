package defpackage;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class fna extends vhd {
    public final int a = kti.d(24 * vw4.d().getDisplayMetrics().density);
    public final int b = kti.d(16 * vw4.d().getDisplayMetrics().density);
    public final int c = kti.d(12 * vw4.d().getDisplayMetrics().density);
    public final int d;
    public final int o;

    public fna() {
        float f = 6;
        this.d = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.o = kti.d(f * vw4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR = RecyclerView.R(view);
        phd adapter = recyclerView.getAdapter();
        zm3 zm3Var = adapter instanceof zm3 ? (zm3) adapter : null;
        if (zm3Var == null) {
            return;
        }
        Pair pairD = zm3Var.D(iR);
        Integer num = pairD.first instanceof noa ? (Integer) pairD.second : -1;
        Object obj = pairD.first;
        noa noaVar = (!(obj instanceof noa) || obj == null) ? null : (noa) obj;
        if (noaVar == null) {
            return;
        }
        int iJ = noaVar.j();
        int iIntValue = num.intValue();
        if (iIntValue < 0 || iIntValue >= iJ) {
            return;
        }
        t98 t98Var = (t98) noaVar.C(num.intValue());
        foa foaVar = t98Var instanceof foa ? (foa) t98Var : null;
        t98 t98VarG = noaVar.G(num.intValue() + 1);
        foa foaVar2 = t98VarG instanceof foa ? (foa) t98VarG : null;
        int i = 0;
        boolean z = num.intValue() == 0 && iR == 0;
        int i2 = this.c;
        rect.left = i2;
        rect.right = i2;
        rect.top = z ? this.a : foaVar instanceof doa ? this.o : 0;
        if (foaVar instanceof doa) {
            i = this.d;
        } else {
            if (!fni.a(foaVar != null ? Integer.valueOf(foaVar.t()) : null, foaVar2 != null ? Integer.valueOf(foaVar2.t()) : null)) {
                i = this.b;
            }
        }
        rect.bottom = i;
    }
}
