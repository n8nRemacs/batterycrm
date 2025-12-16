package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zoa extends dtf implements sm6 {
    public final /* synthetic */ cpa o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoa(cpa cpaVar, Continuation continuation) {
        super(2, continuation);
        this.o = cpaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zoa zoaVar = (zoa) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zoaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zoa(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = cpa.F0;
        cpa cpaVar = this.o;
        long j = cpaVar.t().g.getLong("app.notification.dontDisturbUntil", 0L) == 0 ? -1L : 0L;
        cpaVar.t().h(j, "app.notification.dontDisturbUntil");
        hwa hwaVar = (hwa) cpaVar.o.getValue();
        oxg oxgVar = new oxg();
        oxgVar.b = new Long(j);
        hwaVar.o(new qxg(oxgVar));
        tcf tcfVar = cpaVar.y0;
        tcfVar.m(null, new Integer(((Number) tcfVar.getValue()).intValue() + 1));
        return qqg.a;
    }
}
