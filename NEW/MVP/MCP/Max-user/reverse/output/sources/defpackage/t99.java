package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class t99 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v99 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ t99(v99 v99Var, Pair pair, int i) {
        this.a = i;
        this.b = v99Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nj4 nj4Var = (nj4) this.b.b.k;
                Pair pair = this.c;
                nj4Var.z(((Integer) pair.first).intValue(), (d99) pair.second);
                break;
            case 1:
                nj4 nj4Var2 = (nj4) this.b.b.k;
                Pair pair2 = this.c;
                nj4Var2.B(((Integer) pair2.first).intValue(), (d99) pair2.second);
                break;
            default:
                nj4 nj4Var3 = (nj4) this.b.b.k;
                Pair pair3 = this.c;
                nj4Var3.w(((Integer) pair3.first).intValue(), (d99) pair3.second);
                break;
        }
    }
}
