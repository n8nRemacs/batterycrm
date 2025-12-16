package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes2.dex */
public final class zfa extends bid {
    public final b0i a;
    public final em6 b;
    public boolean c;

    public zfa(b0i b0iVar, em6 em6Var) {
        this.a = b0iVar;
        this.b = em6Var;
    }

    @Override // defpackage.bid
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.c = false;
        }
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (this.c) {
            return;
        }
        a layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager == null) {
            return;
        }
        int iU0 = gridLayoutManager.U0();
        int iY0 = gridLayoutManager.Y0();
        b0i b0iVar = this.a;
        int iJ = b0iVar.j();
        if (iU0 == -1) {
            return;
        }
        this.b.invoke(iY0 == iJ + (-1) ? b0iVar.J(iY0) : b0iVar.J(iU0));
    }
}
