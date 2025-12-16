package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class e91 extends vhd {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ e91(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR;
        int iR2;
        switch (this.a) {
            case 0:
                phd adapter = recyclerView.getAdapter();
                if (adapter != null && (iR = RecyclerView.R(view)) >= 0 && iR <= adapter.j() && view.getLayoutParams().width != 0) {
                    int i = this.b;
                    rect.bottom = i;
                    rect.top = i;
                    rect.left = i;
                    rect.right = i;
                    break;
                }
                break;
            case 1:
                phd adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (iR2 = RecyclerView.R(view)) >= 0 && iR2 <= adapter2.j()) {
                    int i2 = this.b;
                    rect.bottom = i2;
                    rect.top = i2;
                    rect.left = i2;
                    rect.right = i2;
                    break;
                }
                break;
            case 2:
                int iR3 = RecyclerView.R(view);
                int i3 = this.b;
                if (iR3 == 0) {
                    rect.top += i3;
                }
                if (iR3 == (recyclerView.getAdapter() != null ? r5.j() : 0) - 1) {
                    rect.bottom = kti.c(i3 * 1.0d) + rect.bottom;
                    break;
                }
                break;
            case 3:
                int iR4 = RecyclerView.R(view);
                int iB = iidVar.b() - 1;
                int i4 = this.b;
                if (iR4 != iB) {
                    if (RecyclerView.R(view) != 0) {
                        rect.left = i4;
                        rect.right = i4;
                        break;
                    } else {
                        rect.left = 0;
                        rect.right = i4;
                        break;
                    }
                } else {
                    rect.left = i4;
                    rect.right = 0;
                    break;
                }
            case 4:
                int i5 = this.b;
                rect.right = i5;
                rect.left = i5;
                break;
            case 5:
                int iS = RecyclerView.S(view);
                int i6 = this.b;
                rect.bottom = i6;
                if (iS == 0) {
                    rect.top = i6;
                    break;
                }
                break;
            default:
                mid midVarT = recyclerView.T(view);
                if (midVarT != null) {
                    int iR5 = RecyclerView.R(view);
                    phd adapter3 = recyclerView.getAdapter();
                    if (midVarT.X != 0 && adapter3 != null && iR5 >= 0 && iR5 < adapter3.j() && iR5 == 0) {
                        int i7 = this.b;
                        rect.top = i7;
                        rect.bottom = i7;
                        break;
                    }
                }
                break;
        }
    }

    public e91() {
        this.a = 6;
        this.b = kti.d(24 * vw4.d().getDisplayMetrics().density);
    }
}
