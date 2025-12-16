package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class u99 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v99 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ ub8 d;
    public final /* synthetic */ g19 o;

    public /* synthetic */ u99(v99 v99Var, Pair pair, ub8 ub8Var, g19 g19Var, int i) {
        this.a = i;
        this.b = v99Var;
        this.c = pair;
        this.d = ub8Var;
        this.o = g19Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nj4 nj4Var = (nj4) this.b.b.k;
                Pair pair = this.c;
                nj4Var.d(((Integer) pair.first).intValue(), (d99) pair.second, this.d, this.o);
                break;
            default:
                nj4 nj4Var2 = (nj4) this.b.b.k;
                Pair pair2 = this.c;
                nj4Var2.u(((Integer) pair2.first).intValue(), (d99) pair2.second, this.d, this.o);
                break;
        }
    }
}
