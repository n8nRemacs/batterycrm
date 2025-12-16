package defpackage;

/* loaded from: classes.dex */
public final class j61 extends xfh {
    public final k18 b;
    public final tcf c;
    public final hbd d;

    public j61(k18 k18Var) {
        this.b = k18Var;
        tcf tcfVarA = ucf.a(hd5.a);
        this.c = tcfVarA;
        this.d = new hbd(tcfVarA);
        t();
    }

    public final void t() {
        tcf tcfVar;
        Object value;
        o98 o98VarD;
        do {
            tcfVar = this.c;
            value = tcfVar.getValue();
            o98VarD = ve3.d();
            int i = k0b.u;
            o98VarD.add(new h61(new n5g(m0b.W)));
            o98VarD.add(new g61(1, k0b.q, new n5g(m0b.X)));
            o98VarD.add(new g61(3, k0b.r, new n5g(m0b.Y)));
        } while (!tcfVar.c(value, ve3.a(o98VarD)));
    }
}
