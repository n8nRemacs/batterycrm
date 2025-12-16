package defpackage;

/* loaded from: classes.dex */
public final class jy0 implements oe4 {
    public ey0 a;
    public final vv5 b = new vv5(0);
    public final uy0 c = uy0.c;
    public boolean d;
    public oe4 e;
    public int f;

    @Override // defpackage.oe4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ly0 a() {
        oe4 oe4Var = this.e;
        return d(oe4Var != null ? oe4Var.a() : null, this.f, 0);
    }

    public final ly0 c() {
        oe4 oe4Var = this.e;
        return d(oe4Var != null ? oe4Var.a() : null, this.f | 1, -4000);
    }

    public final ly0 d(se4 se4Var, int i, int i2) {
        ey0 ey0Var = this.a;
        ey0Var.getClass();
        return new ly0(ey0Var, se4Var, this.b.a(), (this.d || se4Var == null) ? null : new hy0(ey0Var), this.c, i, i2);
    }
}
