package defpackage;

/* loaded from: classes2.dex */
public final class yj5 implements Runnable {
    public final Runnable a;
    public final tj5 b;
    public final uj5 c;

    public yj5(Runnable runnable, tj5 tj5Var, uj5 uj5Var) {
        this.a = runnable;
        this.b = tj5Var;
        this.c = uj5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uj5 uj5Var = this.c;
        long jA = this.b.a();
        try {
            this.a.run();
        } finally {
            uj5Var.a(jA);
        }
    }
}
