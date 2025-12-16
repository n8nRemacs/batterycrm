package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class lre extends vhd {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;

    public lre(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = kti.d(24 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(16 * vw4.d().getDisplayMetrics().density);
                this.d = kti.d(8 * vw4.d().getDisplayMetrics().density);
                this.o = kti.d(12 * vw4.d().getDisplayMetrics().density);
                break;
            default:
                float f = 8;
                this.b = kti.d(vw4.d().getDisplayMetrics().density * f);
                this.c = kti.d(28 * vw4.d().getDisplayMetrics().density);
                this.d = kti.d(f * vw4.d().getDisplayMetrics().density);
                this.o = kti.d(12 * vw4.d().getDisplayMetrics().density);
                break;
        }
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        switch (this.a) {
            case 0:
                int iR = RecyclerView.R(view);
                phd adapter = recyclerView.getAdapter();
                hre hreVar = adapter instanceof hre ? (hre) adapter : null;
                if (hreVar != null && iR >= 0 && iR < hreVar.j()) {
                    t98 t98Var = (t98) hreVar.C(iR);
                    u8e u8eVar = t98Var instanceof u8e ? (u8e) t98Var : null;
                    t98 t98VarG = hreVar.G(iR + 1);
                    u8e u8eVar2 = t98VarG instanceof u8e ? (u8e) t98VarG : null;
                    int i = 0;
                    boolean z = iR == 0;
                    int i2 = this.o;
                    rect.left = i2;
                    rect.right = i2;
                    boolean z2 = u8eVar instanceof r8e;
                    int i3 = this.b;
                    if (!z2 && !z) {
                        i3 = 0;
                    }
                    rect.top = i3;
                    if (!fni.a(u8eVar != null ? Integer.valueOf(u8eVar.t()) : null, u8eVar2 != null ? Integer.valueOf(u8eVar2.t()) : null)) {
                        i = this.c;
                    } else if (u8eVar != null && !u8eVar.g()) {
                        i = this.d;
                    }
                    rect.bottom = i;
                    break;
                }
                break;
            default:
                int iR2 = RecyclerView.R(view);
                phd adapter2 = recyclerView.getAdapter();
                ing ingVar = adapter2 instanceof ing ? (ing) adapter2 : null;
                if (ingVar != null && iR2 >= 0 && iR2 < ingVar.j()) {
                    t98 t98Var2 = (t98) ingVar.C(iR2);
                    fng fngVar = t98Var2 instanceof fng ? (fng) t98Var2 : null;
                    t98 t98VarG2 = ingVar.G(iR2 + 1);
                    fng fngVar2 = t98VarG2 instanceof fng ? (fng) t98VarG2 : null;
                    int i4 = this.d;
                    rect.top = iR2 == 0 ? this.b : fngVar instanceof cng ? i4 : 0;
                    int i5 = this.o;
                    rect.left = (fngVar == null || fngVar.g()) ? 0 : i5;
                    if (fngVar == null || fngVar.g()) {
                        i5 = 0;
                    }
                    rect.right = i5;
                    if (!fni.a(fngVar != null ? Integer.valueOf(fngVar.t()) : null, fngVar2 != null ? Integer.valueOf(fngVar2.t()) : null)) {
                        i4 = this.c;
                    } else if (fngVar == null || fngVar.g() || (fngVar instanceof cng)) {
                        i4 = 0;
                    }
                    rect.bottom = i4;
                    break;
                }
                break;
        }
    }
}
