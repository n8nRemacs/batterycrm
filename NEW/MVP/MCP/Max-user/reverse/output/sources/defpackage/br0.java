package defpackage;

/* loaded from: classes2.dex */
public final class br0 extends fm {
    public final boolean b;

    public br0(String str, boolean z) {
        super(str);
        this.b = z;
    }

    @Override // defpackage.fm
    public final void d(gy7 gy7Var) {
        gy7Var.b0(this.a);
        ((e2) gy7Var).c(String.valueOf(this.b));
    }

    public final String toString() {
        return this.a + " = " + this.b;
    }
}
