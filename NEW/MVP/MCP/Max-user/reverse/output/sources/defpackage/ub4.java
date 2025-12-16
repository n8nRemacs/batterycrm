package defpackage;

/* loaded from: classes2.dex */
public final class ub4 implements oe4 {
    public final oe4 a;
    public final iv6 b;
    public final pl0 c;
    public boolean d;
    public final r5j e = new r5j(13, this);

    public ub4(oe4 oe4Var, iv6 iv6Var, pl0 pl0Var) {
        this.a = oe4Var;
        this.b = iv6Var;
        this.c = pl0Var;
    }

    @Override // defpackage.oe4
    public final se4 a() {
        return new vb4(this.a.a(), this.e, this.c);
    }
}
