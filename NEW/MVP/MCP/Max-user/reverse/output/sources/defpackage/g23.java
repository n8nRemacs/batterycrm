package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class g23 implements yhd {
    public final RecyclerView a;
    public final l53 b;
    public final k18 c;
    public boolean d;
    public boolean o;

    public g23(EndlessRecyclerView2 endlessRecyclerView2, l53 l53Var, k18 k18Var) {
        this.a = endlessRecyclerView2;
        this.b = l53Var;
        this.c = k18Var;
    }

    @Override // defpackage.yhd
    public final void b(View view) {
    }

    @Override // defpackage.yhd
    public final void d(View view) {
        RecyclerView recyclerView = this.a;
        View viewI = recyclerView.I(view);
        mid midVarT = viewI == null ? null : recyclerView.T(viewI);
        if (midVarT instanceof tq7) {
            if (this.d) {
                return;
            }
            this.d = true;
            mgb.a(view, new f23(view, this, 0));
            return;
        }
        if ((midVarT instanceof dq5) || (midVarT instanceof zp5)) {
            if (this.o) {
                return;
            }
            this.o = true;
            mgb.a(view, new yn6(view, 7, this));
            return;
        }
        if (!(midVarT instanceof b03) || this.o) {
            return;
        }
        this.o = true;
        mgb.a(view, new f23(view, this, 1));
    }
}
