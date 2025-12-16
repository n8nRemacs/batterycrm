package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class s99 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v99 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ g19 d;

    public /* synthetic */ s99(v99 v99Var, Pair pair, g19 g19Var, int i) {
        this.a = i;
        this.b = v99Var;
        this.c = pair;
        this.d = g19Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nj4 nj4Var = (nj4) this.b.b.k;
                Pair pair = this.c;
                int iIntValue = ((Integer) pair.first).intValue();
                d99 d99Var = (d99) pair.second;
                d99Var.getClass();
                nj4Var.x(iIntValue, d99Var, this.d);
                break;
            default:
                nj4 nj4Var2 = (nj4) this.b.b.k;
                Pair pair2 = this.c;
                nj4Var2.C(((Integer) pair2.first).intValue(), (d99) pair2.second, this.d);
                break;
        }
    }
}
