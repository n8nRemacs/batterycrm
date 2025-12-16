package defpackage;

/* loaded from: classes.dex */
public final class l1 implements Runnable {
    public final ike a;
    public final ha8 b;

    public l1(ike ikeVar, ha8 ha8Var) {
        this.a = ikeVar;
        this.b = ha8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (y1.X.b(this.a, this, y1.f(this.b))) {
            y1.b(this.a);
        }
    }
}
