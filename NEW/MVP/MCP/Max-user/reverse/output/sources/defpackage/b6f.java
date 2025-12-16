package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b6f extends bid {
    public boolean a = false;
    public final /* synthetic */ gf4 b;

    public b6f(gf4 gf4Var) {
        this.b = gf4Var;
    }

    @Override // defpackage.bid
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.l();
        }
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}
