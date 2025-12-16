package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bpa extends dtf implements sm6 {
    public final /* synthetic */ cpa o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpa(cpa cpaVar, Continuation continuation) {
        super(2, continuation);
        this.o = cpaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bpa bpaVar = (bpa) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bpaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bpa(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = cpa.F0;
        cpa cpaVar = this.o;
        cpaVar.t().f("app.calls.incoming.vibration", !cpaVar.t().g.getBoolean("app.calls.incoming.vibration", true));
        tcf tcfVar = cpaVar.y0;
        tcfVar.m(null, new Integer(((Number) tcfVar.getValue()).intValue() + 1));
        return qqg.a;
    }
}
