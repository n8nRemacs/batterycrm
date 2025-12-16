package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class oq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq2(yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.o = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        oq2 oq2Var = (oq2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        oq2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new oq2(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yq2 yq2Var = this.o;
        jve jveVar = yq2Var.k1;
        tcf tcfVar = yq2Var.d1;
        yy7[] yy7VarArr = yq2.u1;
        j09 j09VarE = yq2Var.E();
        hbd hbdVar = yq2Var.e1;
        j09 j09Var = ((lp2) hbdVar.a.getValue()).a;
        boolean z = j09VarE instanceof h09;
        qqg qqgVar = qqg.a;
        if (!z || !fni.a(j09Var, j09VarE)) {
            jveVar.h(Boolean.FALSE);
            return qqgVar;
        }
        lp2 lp2Var = (lp2) hbdVar.a.getValue();
        tcfVar.m(null, new lp2((h09) null, 3));
        tcfVar.setValue(lp2Var);
        jveVar.h(Boolean.TRUE);
        return qqgVar;
    }
}
