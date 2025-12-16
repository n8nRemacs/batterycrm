package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class h62 extends bid {
    public final y0f a;
    public final hn6 b;

    /* JADX WARN: Multi-variable type inference failed */
    public h62(y0f y0fVar, em6 em6Var) {
        this.a = y0fVar;
        this.b = (hn6) em6Var;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [em6, hn6] */
    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iU0;
        GridLayoutManager gridLayoutManagerD = x7j.d(recyclerView);
        if (gridLayoutManagerD == null || (iU0 = gridLayoutManagerD.U0()) == -1) {
            return;
        }
        this.b.invoke((t98) ue3.J(iU0, this.a.d.f));
    }
}
