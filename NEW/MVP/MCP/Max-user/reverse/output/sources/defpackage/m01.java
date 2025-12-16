package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class m01 extends vhd {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    public /* synthetic */ m01(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        switch (this.a) {
            case 0:
                int i = 0;
                int iR = RecyclerView.R(view);
                phd adapter = recyclerView.getAdapter();
                kg1 kg1Var = adapter instanceof kg1 ? (kg1) adapter : null;
                if (kg1Var != null && iR >= 0 && iR < kg1Var.j()) {
                    t98 t98Var = (t98) kg1Var.C(iR);
                    n01 n01Var = t98Var instanceof n01 ? (n01) t98Var : null;
                    t98 t98VarG = kg1Var.G(iR + 1);
                    n01 n01Var2 = t98VarG instanceof n01 ? (n01) t98VarG : null;
                    boolean z = iR == 0;
                    boolean z2 = iR == kg1Var.j() - 1;
                    rect.left = 0;
                    rect.right = 0;
                    int i2 = this.b;
                    rect.top = z ? 0 : i2;
                    if (z2) {
                        i = this.c;
                    } else {
                        if (!fni.a(n01Var != null ? num : null, n01Var2 == null ? null : 0)) {
                            i = i2;
                        }
                    }
                    rect.bottom = i;
                    break;
                }
                break;
            case 1:
                int iR2 = RecyclerView.R(view);
                phd adapter2 = recyclerView.getAdapter();
                oc1 oc1Var = adapter2 instanceof oc1 ? (oc1) adapter2 : null;
                if (oc1Var != null && iR2 >= 0 && iR2 < oc1Var.j()) {
                    t98 t98Var2 = (t98) oc1Var.C(iR2);
                    te1 te1Var = t98Var2 instanceof te1 ? (te1) t98Var2 : null;
                    t98 t98VarG2 = oc1Var.G(iR2 + 1);
                    te1 te1Var2 = t98VarG2 instanceof te1 ? (te1) t98VarG2 : null;
                    int i3 = this.c;
                    rect.left = i3;
                    rect.right = i3;
                    rect.top = 0;
                    rect.bottom = fni.a(te1Var != null ? Integer.valueOf(te1Var.t()) : null, te1Var2 != null ? Integer.valueOf(te1Var2.t()) : null) ? 0 : this.b;
                    break;
                }
                break;
            case 2:
                int iR3 = RecyclerView.R(view);
                phd adapter3 = recyclerView.getAdapter();
                koe koeVar = adapter3 instanceof koe ? (koe) adapter3 : null;
                if (koeVar != null && iR3 >= 0 && iR3 < koeVar.j()) {
                    ioe ioeVar = (ioe) ((t98) koeVar.C(iR3));
                    ioe ioeVar2 = (ioe) koeVar.G(iR3 + 1);
                    rect.top = iR3 == 0 ? this.b : 0;
                    rect.bottom = (ioeVar2 == null || ioeVar.t() != ioeVar2.t()) ? this.c : 0;
                    break;
                }
                break;
            case 3:
                int iR4 = RecyclerView.R(view);
                phd adapter4 = recyclerView.getAdapter();
                koe koeVar2 = adapter4 instanceof koe ? (koe) adapter4 : null;
                if (koeVar2 != null && iR4 >= 0 && iR4 < koeVar2.j()) {
                    rect.top = iR4 == 0 ? this.b : this.c;
                    break;
                }
                break;
            case 4:
                int i4 = this.b;
                rect.top = i4;
                rect.bottom = i4;
                if (iidVar.b() != 1) {
                    int iR5 = RecyclerView.R(view);
                    int iB = iidVar.b() - 1;
                    int i5 = this.c;
                    if (iR5 != iB) {
                        if (RecyclerView.R(view) != 0) {
                            int i6 = i5 / 2;
                            rect.left = i6;
                            rect.right = i6;
                            break;
                        } else {
                            rect.left = i4;
                            rect.right = i5 / 2;
                            break;
                        }
                    } else {
                        rect.left = i5 / 2;
                        rect.right = i4;
                        break;
                    }
                } else {
                    rect.left = i4;
                    rect.right = i4;
                    break;
                }
            case 5:
                int iR6 = RecyclerView.R(view);
                int i7 = this.b;
                int iMax = iR6 % ((int) Math.max(1.0d, i7));
                int iMax2 = (int) Math.max(1.0d, i7);
                int i8 = this.c;
                rect.left = (iMax * i8) / iMax2;
                rect.right = i8 - (((iMax + 1) * i8) / iMax2);
                if (iR6 >= iMax2) {
                    rect.top = i8;
                    break;
                }
                break;
            case 6:
                int iR7 = RecyclerView.R(view);
                phd adapter5 = recyclerView.getAdapter();
                if (adapter5 != null && iR7 >= 0 && iR7 < adapter5.j()) {
                    boolean z3 = iR7 == 0;
                    boolean z4 = iR7 == adapter5.j() - 1;
                    int i9 = this.b;
                    int i10 = this.c;
                    rect.left = z3 ? i10 : i9;
                    if (z4) {
                        i9 = i10;
                    }
                    rect.right = i9;
                    break;
                }
                break;
            case 7:
                int i11 = this.c;
                rect.left = i11;
                rect.right = i11;
                rect.top = this.b;
                break;
            case 8:
                int iR8 = RecyclerView.R(view);
                int i12 = this.b;
                if (iR8 == 0) {
                    rect.right = i12 / 2;
                } else if (iR8 == iidVar.b() - 1) {
                    rect.left = i12 / 2;
                } else {
                    int i13 = i12 / 2;
                    rect.left = i13;
                    rect.right = i13;
                }
                int i14 = this.c;
                rect.top = i14;
                rect.bottom = i14;
                break;
            default:
                int iR9 = RecyclerView.R(view);
                int iB2 = iidVar.b() - 1;
                int i15 = this.c;
                int i16 = this.b;
                if (iR9 != iB2) {
                    if (RecyclerView.R(view) != 0) {
                        rect.top = i16;
                        rect.bottom = i16;
                        break;
                    } else {
                        rect.top = i15;
                        rect.bottom = i16;
                        break;
                    }
                } else {
                    rect.top = i16;
                    rect.bottom = i15;
                    break;
                }
        }
    }

    public m01(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = kti.d(20 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(12 * vw4.d().getDisplayMetrics().density);
                break;
            case 2:
                this.b = kti.d(24 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(16 * vw4.d().getDisplayMetrics().density);
                break;
            case 3:
                this.b = kti.d(24 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(16 * vw4.d().getDisplayMetrics().density);
                break;
            case 4:
            case 5:
            default:
                float f = 8;
                this.b = kti.d(vw4.d().getDisplayMetrics().density * f);
                kti.d(f * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(16 * vw4.d().getDisplayMetrics().density);
                break;
            case 6:
                this.b = kti.d(2 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(8 * vw4.d().getDisplayMetrics().density);
                break;
        }
    }
}
