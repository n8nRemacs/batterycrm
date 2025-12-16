package defpackage;

import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class vf5 implements Runnable {
    public final /* synthetic */ wf5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public vf5(wf5 wf5Var, int i, int i2) {
        this.a = wf5Var;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wf5 wf5Var = this.a;
        sf5 sf5Var = wf5Var.a;
        EndlessRecyclerView2 endlessRecyclerView2 = wf5Var.d;
        if (this.b == 0) {
            int i = this.c;
        }
        int iZ0 = endlessRecyclerView2.getLinearLayoutManager().Z0();
        phd adapter = endlessRecyclerView2.getAdapter();
        if ((adapter != null ? adapter.j() : 0) - iZ0 <= wf5Var.b && ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.a2) && sf5Var.q())) {
            endlessRecyclerView2.setRefreshingNext(true);
            sf5Var.p();
        }
        int iX0 = endlessRecyclerView2.getLinearLayoutManager().X0();
        if (iX0 < 0 || iX0 > wf5Var.b) {
            return;
        }
        if ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.b2) && sf5Var.g()) {
            endlessRecyclerView2.setRefreshingPrev(true);
            sf5Var.j();
        }
    }
}
