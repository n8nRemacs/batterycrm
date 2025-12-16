package defpackage;

/* loaded from: classes.dex */
public final class g7d extends xfh {
    public final zi1 b;
    public final qv1 c;
    public final hbd d;

    public g7d(zi1 zi1Var, qv1 qv1Var) {
        Object value;
        n5g n5gVar;
        p5g p5gVar;
        this.b = zi1Var;
        this.c = qv1Var;
        tcf tcfVarA = ucf.a(i7d.c);
        this.d = new hbd(tcfVarA);
        do {
            value = tcfVarA.getValue();
            i7d i7dVar = (i7d) value;
            cnb cnbVarD = this.c.d();
            cnb cnbVar = (cnb) ((onb) ((tcf) this.c.e()).getValue()).c.get(this.b);
            bj1 bj1Var = cnbVarD.a;
            n5gVar = fni.a(bj1Var.getId(), this.b) ? new n5g(m0b.H1) : new n5g(m0b.G1);
            p5gVar = null;
            p5gVar = null;
            if (!fni.a(bj1Var.getId(), this.b) && bj1Var.m()) {
                int i = m0b.F1;
                String name = cnbVar != null ? cnbVar.b.getName() : null;
                p5gVar = new p5g(i, ys.D(new Object[]{name == null ? "" : name}));
            }
            i7dVar.getClass();
        } while (!tcfVarA.c(value, new i7d(n5gVar, p5gVar)));
    }
}
