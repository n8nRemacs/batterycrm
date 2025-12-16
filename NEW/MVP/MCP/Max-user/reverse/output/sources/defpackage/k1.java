package defpackage;

/* loaded from: classes.dex */
public final class k1 implements Runnable {
    public final hke a;
    public final ha8 b;

    public k1(hke hkeVar, ha8 ha8Var) {
        this.a = hkeVar;
        this.b = ha8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (x1.X.b(this.a, this, x1.h(this.b))) {
            x1.e(this.a, false);
        }
    }
}
