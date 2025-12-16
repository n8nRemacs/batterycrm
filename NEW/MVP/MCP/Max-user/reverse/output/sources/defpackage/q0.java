package defpackage;

/* loaded from: classes.dex */
public final class q0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ af4 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ r0 d;

    public q0(r0 r0Var, boolean z, af4 af4Var, boolean z2) {
        this.d = r0Var;
        this.a = z;
        this.b = af4Var;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a;
        r0 r0Var = this.d;
        af4 af4Var = this.b;
        if (z) {
            af4Var.b(r0Var);
        } else if (this.c) {
            af4Var.c();
        } else {
            af4Var.d(r0Var);
        }
    }
}
