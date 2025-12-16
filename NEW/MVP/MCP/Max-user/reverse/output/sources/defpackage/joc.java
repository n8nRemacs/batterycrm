package defpackage;

/* loaded from: classes.dex */
public final class joc implements b99 {
    public final oe4 a;
    public final xu9 b;
    public final te8 c;
    public final tha d;
    public final int e;

    public joc(oe4 oe4Var) {
        this(oe4Var, new pm4());
    }

    @Override // defpackage.b99
    public final ck0 a(k09 k09Var) {
        k09Var.b.getClass();
        return new loc(k09Var, this.a, this.b, this.c.q(k09Var), this.d, this.e, null);
    }

    public joc(oe4 oe4Var, pm4 pm4Var) {
        xu9 xu9Var = new xu9(21, pm4Var);
        te8 te8Var = new te8();
        tha thaVar = new tha(18);
        this.a = oe4Var;
        this.b = xu9Var;
        this.c = te8Var;
        this.d = thaVar;
        this.e = 1048576;
    }
}
