package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class f96 extends vhd {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;
    public final Object d;

    public f96(int i, jl8 jl8Var) {
        this.a = 1;
        this.b = i;
        this.d = jl8Var;
        this.c = kti.d(12 * vw4.d().getDisplayMetrics().density);
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        GridLayoutManager gridLayoutManagerD;
        ky6 ky6Var;
        int iR;
        switch (this.a) {
            case 0:
                int iR2 = RecyclerView.R(view);
                phd adapter = recyclerView.getAdapter();
                if (adapter != null && iR2 >= 0 && iR2 < adapter.j()) {
                    int i = this.c;
                    rect.left = i;
                    rect.right = i;
                    int iG = ((wo4) this.d).g(iR2);
                    if (iG == 0 || iG == 1 || iG == 4) {
                        rect.top = this.b;
                        break;
                    }
                }
                break;
            default:
                phd adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (gridLayoutManagerD = x7j.d(recyclerView)) != null && (ky6Var = gridLayoutManagerD.K) != null && (iR = RecyclerView.R(view)) >= 0 && iR < adapter2.j()) {
                    int iB = ky6Var.b(iR, 8);
                    int iA = ky6Var.a(iR, 8);
                    int iA2 = ky6Var.a(adapter2.j() - 1, 8);
                    int i2 = this.c / 2;
                    if (((Boolean) ((jl8) this.d).invoke()).booleanValue()) {
                        if (iA == 0) {
                            rect.bottom = i2;
                        } else if (iA == iA2) {
                            rect.top = i2;
                        } else {
                            rect.bottom = i2;
                            rect.top = i2;
                        }
                    }
                    int i3 = this.b;
                    rect.left = (iB * i3) / 8;
                    rect.right = i3 - (((iB + 1) * i3) / 8);
                    break;
                }
                break;
        }
    }

    public f96(wo4 wo4Var) {
        this.a = 0;
        this.d = wo4Var;
        this.b = kti.d(16 * vw4.d().getDisplayMetrics().density);
        this.c = kti.d(12 * vw4.d().getDisplayMetrics().density);
    }
}
