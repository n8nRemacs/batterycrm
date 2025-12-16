package defpackage;

/* loaded from: classes2.dex */
public final class wo7 extends fm {
    public final long b;

    public wo7(String str, long j) {
        super(str);
        this.b = j;
    }

    @Override // defpackage.fm
    public final void d(gy7 gy7Var) {
        gy7Var.b0(this.a);
        ((e2) gy7Var).c(Long.toString(this.b));
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
