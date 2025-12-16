package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class wf5 extends bid {
    public final sf5 a;
    public int b = 1;
    public vf5 c;
    public final /* synthetic */ EndlessRecyclerView2 d;

    public wf5(EndlessRecyclerView2 endlessRecyclerView2, sf5 sf5Var) {
        this.d = endlessRecyclerView2;
        this.a = sf5Var;
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        vf5 vf5Var = this.c;
        EndlessRecyclerView2 endlessRecyclerView2 = this.d;
        if (vf5Var != null) {
            endlessRecyclerView2.removeCallbacks(vf5Var);
        }
        vf5 vf5Var2 = new vf5(this, i, i2);
        this.c = vf5Var2;
        endlessRecyclerView2.post(vf5Var2);
    }
}
