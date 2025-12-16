package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class crg {
    public final f84 a;
    public final l24 b;
    public final lzf c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final tcf h;
    public final hbd i;

    public crg(mcf mcfVar, ContextScope contextScope, l24 l24Var, lzf lzfVar, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        ku3 ku3VarN;
        this.a = contextScope;
        this.b = l24Var;
        this.c = lzfVar;
        this.d = k18Var2;
        this.e = k18Var3;
        this.f = k18Var4;
        this.g = k18Var;
        Long lValueOf = null;
        tcf tcfVarA = ucf.a(null);
        this.h = tcfVarA;
        this.i = new hbd(tcfVarA);
        pb2 pb2Var = (pb2) mcfVar.getValue();
        if (pb2Var != null && pb2Var.Q() && ((pb2Var.F() || pb2Var.V()) && (ku3VarN = pb2Var.n()) != null && !ku3VarN.v())) {
            lValueOf = Long.valueOf(ku3VarN.p());
        }
        if (lValueOf != null) {
            gw0.w(gw0.u(new g56(new d53(l24Var.c(lValueOf.longValue()), 12), new bzb(2, this, crg.class, "handleContact", "handleContact(Lru/ok/tamtam/contacts/Contact;)V", 4, 28), 1), ((q2b) lzfVar).b()), contextScope);
        }
    }
}
