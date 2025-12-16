package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class fmb extends c58 {
    public final /* synthetic */ int q;
    public final /* synthetic */ gf4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fmb(gf4 gf4Var, Context context, int i) {
        super(context);
        this.q = i;
        this.r = gf4Var;
    }

    @Override // defpackage.c58
    public final float d(DisplayMetrics displayMetrics) {
        int i;
        switch (this.q) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // defpackage.c58
    public int f(int i) {
        switch (this.q) {
            case 0:
                return Math.min(100, super.f(i));
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.c58
    public final void l(View view, iid iidVar, gid gidVar) {
        switch (this.q) {
            case 0:
                gf4 gf4Var = this.r;
                int[] iArrB = gf4Var.b(gf4Var.a.getLayoutManager(), view);
                int i = iArrB[0];
                int i2 = iArrB[1];
                int iE = e(Math.max(Math.abs(i), Math.abs(i2)));
                if (iE > 0) {
                    gidVar.b(i, i2, iE, this.j);
                    break;
                }
                break;
            default:
                gf4 gf4Var2 = this.r;
                RecyclerView recyclerView = gf4Var2.a;
                if (recyclerView != null) {
                    int[] iArrB2 = gf4Var2.b(recyclerView.getLayoutManager(), view);
                    int i3 = iArrB2[0];
                    int i4 = iArrB2[1];
                    int iE2 = e(Math.max(Math.abs(i3), Math.abs(i4)));
                    if (iE2 > 0) {
                        gidVar.b(i3, i4, iE2, this.j);
                        break;
                    }
                }
                break;
        }
    }
}
