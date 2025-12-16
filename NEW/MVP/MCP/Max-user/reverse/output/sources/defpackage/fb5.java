package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class fb5 extends vhd {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final int d;

    public fb5(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = kti.d(16 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(8 * vw4.d().getDisplayMetrics().density);
                this.d = kti.d(12 * vw4.d().getDisplayMetrics().density);
                break;
            case 3:
                this.b = kti.d(16 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(8 * vw4.d().getDisplayMetrics().density);
                this.d = kti.d(12 * vw4.d().getDisplayMetrics().density);
                break;
            case 4:
                this.b = kti.d(24 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(7 * vw4.d().getDisplayMetrics().density);
                this.d = kti.d(12 * vw4.d().getDisplayMetrics().density);
                break;
            case 5:
                this.b = kti.d(16 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(8 * vw4.d().getDisplayMetrics().density);
                this.d = kti.d(12 * vw4.d().getDisplayMetrics().density);
                break;
            default:
                this.b = kti.d(24 * vw4.d().getDisplayMetrics().density);
                this.c = kti.d(16 * vw4.d().getDisplayMetrics().density);
                this.d = kti.d(12 * vw4.d().getDisplayMetrics().density);
                break;
        }
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR;
        ky6 ky6Var;
        int iR2;
        ky6 ky6Var2;
        ky6 ky6Var3;
        switch (this.a) {
            case 0:
                phd adapter = recyclerView.getAdapter();
                if (adapter != null && (iR = RecyclerView.R(view)) >= 0 && iR < adapter.j()) {
                    int iD = kti.d(32 * vw4.d().getDisplayMetrics().density);
                    int i = this.b;
                    int iC = n5e.c(recyclerView, iD, i);
                    GridLayoutManager gridLayoutManagerD = x7j.d(recyclerView);
                    if (gridLayoutManagerD != null && (ky6Var = gridLayoutManagerD.K) != null) {
                        int iB = ky6Var.b(iR, i);
                        if (adapter.l(iR) != w5b.q) {
                            int i2 = this.c / 2;
                            rect.bottom = i2;
                            rect.top = i2;
                            rect.left = (iB * iC) / i;
                            rect.right = iC - (((iB + 1) * iC) / i);
                            break;
                        } else {
                            rect.top = this.d;
                            break;
                        }
                    }
                }
                break;
            case 1:
                int iR3 = RecyclerView.R(view);
                phd adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && iR3 >= 0 && iR3 < adapter2.j()) {
                    int i3 = this.d;
                    rect.left = i3;
                    rect.right = i3;
                    if (iR3 != 0) {
                        rect.top = this.c;
                        break;
                    } else {
                        rect.top = this.b;
                        break;
                    }
                }
                break;
            case 2:
                int iR4 = RecyclerView.R(view);
                phd adapter3 = recyclerView.getAdapter();
                kpe kpeVar = adapter3 instanceof kpe ? (kpe) adapter3 : null;
                if (kpeVar != null && iR4 >= 0 && iR4 < kpeVar.j()) {
                    t98 t98Var = (t98) kpeVar.C(iR4);
                    m8e m8eVar = t98Var instanceof m8e ? (m8e) t98Var : null;
                    t98 t98VarG = kpeVar.G(iR4 + 1);
                    m8e m8eVar2 = t98VarG instanceof m8e ? (m8e) t98VarG : null;
                    int i4 = 0;
                    boolean z = iR4 == 0;
                    int i5 = this.d;
                    rect.left = i5;
                    rect.right = i5;
                    int i6 = this.b;
                    rect.top = z ? i6 : 0;
                    if (!fni.a(m8eVar != null ? Integer.valueOf(m8eVar.t()) : null, m8eVar2 != null ? Integer.valueOf(m8eVar2.t()) : null)) {
                        i4 = i6;
                    } else if (m8eVar != null && !m8eVar.g()) {
                        i4 = this.c;
                    }
                    rect.bottom = i4;
                    break;
                }
                break;
            case 3:
                int iR5 = RecyclerView.R(view);
                phd adapter4 = recyclerView.getAdapter();
                aqe aqeVar = adapter4 instanceof aqe ? (aqe) adapter4 : null;
                if (aqeVar != null && iR5 >= 0 && iR5 < aqeVar.j()) {
                    t98 t98Var2 = (t98) aqeVar.C(iR5);
                    i8e i8eVar = t98Var2 instanceof i8e ? (i8e) t98Var2 : null;
                    t98 t98VarG2 = aqeVar.G(iR5 + 1);
                    i8e i8eVar2 = t98VarG2 instanceof i8e ? (i8e) t98VarG2 : null;
                    int i7 = 0;
                    boolean z2 = iR5 == 0;
                    int i8 = this.d;
                    rect.left = i8;
                    rect.right = i8;
                    int i9 = this.b;
                    rect.top = z2 ? i9 : 0;
                    if (!fni.a(i8eVar != null ? Integer.valueOf(i8eVar.t()) : null, i8eVar2 != null ? Integer.valueOf(i8eVar2.t()) : null)) {
                        i7 = i9;
                    } else if (i8eVar != null && !i8eVar.g()) {
                        i7 = this.c;
                    }
                    rect.bottom = i7;
                    break;
                }
                break;
            case 4:
                mid midVarT = recyclerView.T(view);
                if (midVarT != null) {
                    int iR6 = RecyclerView.R(view);
                    phd adapter5 = recyclerView.getAdapter();
                    int i10 = midVarT.X;
                    if (i10 != 0 && adapter5 != null && iR6 >= 0 && iR6 < adapter5.j()) {
                        int i11 = this.d;
                        rect.left = i11;
                        rect.right = i11;
                        int i12 = this.b;
                        if (iR6 != 0) {
                            if (i10 == udb.s) {
                                rect.top = i12;
                                rect.bottom = this.c;
                                break;
                            }
                        } else {
                            rect.top = i12;
                            break;
                        }
                    }
                }
                break;
            case 5:
                int iR7 = RecyclerView.R(view);
                phd adapter6 = recyclerView.getAdapter();
                vre vreVar = adapter6 instanceof vre ? (vre) adapter6 : null;
                if (vreVar != null && iR7 >= 0 && iR7 < vreVar.j()) {
                    t98 t98Var3 = (t98) vreVar.C(iR7);
                    y8e y8eVar = t98Var3 instanceof y8e ? (y8e) t98Var3 : null;
                    t98 t98VarG3 = vreVar.G(iR7 + 1);
                    y8e y8eVar2 = t98VarG3 instanceof y8e ? (y8e) t98VarG3 : null;
                    int i13 = 0;
                    boolean z3 = iR7 == 0;
                    int i14 = this.d;
                    rect.left = i14;
                    rect.right = i14;
                    int i15 = this.b;
                    rect.top = z3 ? i15 : 0;
                    if (!fni.a(y8eVar != null ? Integer.valueOf(y8eVar.t()) : null, y8eVar2 != null ? Integer.valueOf(y8eVar2.t()) : null)) {
                        i13 = i15;
                    } else if (y8eVar != null && !y8eVar.g()) {
                        i13 = this.c;
                    }
                    rect.bottom = i13;
                    break;
                }
                break;
            default:
                phd adapter7 = recyclerView.getAdapter();
                if (adapter7 != null && (iR2 = RecyclerView.R(view)) >= 0 && iR2 < adapter7.j()) {
                    int iD2 = kti.d(81 * vw4.d().getDisplayMetrics().density);
                    int i16 = this.b;
                    int iC2 = n5e.c(recyclerView, iD2, i16);
                    GridLayoutManager gridLayoutManagerD2 = x7j.d(recyclerView);
                    if (gridLayoutManagerD2 != null && (ky6Var2 = gridLayoutManagerD2.K) != null) {
                        int iB2 = ky6Var2.b(iR2, i16);
                        GridLayoutManager gridLayoutManagerD3 = x7j.d(recyclerView);
                        if (((gridLayoutManagerD3 == null || (ky6Var3 = gridLayoutManagerD3.K) == null) ? 1 : ky6Var3.c(iR2)) != i16) {
                            int i17 = this.c / 2;
                            rect.bottom = i17;
                            rect.top = i17;
                            rect.left = (iB2 * iC2) / i16;
                            rect.right = iC2 - (((iB2 + 1) * iC2) / i16);
                            break;
                        } else {
                            rect.top = this.d;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public fb5(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 6:
                this.b = i;
                this.c = i2;
                this.d = kti.d(10 * vw4.d().getDisplayMetrics().density);
                break;
            default:
                this.b = i;
                this.c = i2;
                this.d = kti.d(10 * vw4.d().getDisplayMetrics().density);
                break;
        }
    }
}
