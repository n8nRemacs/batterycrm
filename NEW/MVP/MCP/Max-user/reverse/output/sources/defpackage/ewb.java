package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ewb extends dtf implements sm6 {
    public final /* synthetic */ gwb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewb(gwb gwbVar, Continuation continuation) {
        super(2, continuation);
        this.o = gwbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ewb ewbVar = (ewb) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ewbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ewb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gwb gwbVar = this.o;
        ci5 ci5Var = gwbVar.s0;
        tcf tcfVar = gwbVar.Y;
        Double d = ((yvb) tcfVar.getValue()).c;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = ((yvb) tcfVar.getValue()).d;
        xfh.r(ci5Var, new tvb(dDoubleValue, d2 != null ? d2.doubleValue() : 0.0d));
        return qqg.a;
    }
}
