package defpackage;

/* loaded from: classes.dex */
public final class ux4 implements brf {
    public final v17 a;
    public final v5c b;
    public final bk5 c;
    public final be7 d;
    public final nx4 e;
    public final nx4 f;
    public final Object g;

    public ux4(v17 v17Var, ff7 ff7Var) {
        v5c v5cVar = ff7Var.o;
        bk5 bk5Var = ff7Var.i;
        be7 be7Var = ff7Var.j;
        nx4 nx4Var = ff7Var.l;
        nx4 nx4Var2 = ff7Var.u;
        this.a = v17Var;
        this.b = v5cVar;
        this.c = bk5Var;
        this.d = be7Var;
        this.e = nx4Var;
        this.f = nx4Var2;
        this.g = ipi.b(1, new rx4(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.brf
    public final Object get() {
        return (tx4) this.g.getValue();
    }
}
