package defpackage;

/* loaded from: classes.dex */
public final class dk1 extends xfh {
    public final tcf X;
    public final hbd Y;
    public final tcf Z;
    public final k18 b;
    public final k18 c;
    public final tcf d;
    public final hbd o;
    public final hbd s0;
    public final ci5 t0;

    public dk1(long j) {
        u91 u91Var = u91.a;
        bwf bwfVarD = u91Var.getAccessor().d(224);
        bwf bwfVarD2 = u91Var.getAccessor().d(8);
        bwf bwfVarD3 = u91Var.getAccessor().d(109);
        this.b = bwfVarD;
        this.c = bwfVarD2;
        this.d = ucf.a(new tj1(null));
        this.o = ((w63) bwfVarD3.getValue()).k(j);
        tcf tcfVarA = ucf.a(new ak1(false));
        this.X = tcfVarA;
        this.Y = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.Z = tcfVarA2;
        this.s0 = new hbd(tcfVarA2);
        this.t0 = new ci5(0);
        svi.e(this.a, null, null, new bk1(this, null), 3);
    }

    public final boolean t() {
        CharSequence charSequence = ((tj1) this.d.getValue()).a;
        pb2 pb2Var = (pb2) this.o.a.getValue();
        return !dnf.k(charSequence, pb2Var != null ? pb2Var.s() : null);
    }

    public final void u(CharSequence charSequence) {
        tcf tcfVar;
        Object value;
        boolean zT;
        o98 o98VarD = ve3.d();
        CharSequence charSequence2 = ((tj1) this.d.getValue()).a;
        o98VarD.add(new uj1((charSequence2 == null || vmf.F(charSequence2)) ? new n5g(b0b.t) : null, charSequence != null ? new r5g(charSequence) : null));
        this.Z.setValue(ve3.a(o98VarD));
        do {
            tcfVar = this.X;
            value = tcfVar.getValue();
            zT = t();
            ((ak1) value).getClass();
        } while (!tcfVar.c(value, new ak1(zT)));
    }
}
