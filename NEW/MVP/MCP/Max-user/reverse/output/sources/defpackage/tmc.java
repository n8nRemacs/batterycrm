package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tmc extends dtf implements sm6 {
    public final /* synthetic */ pnc X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmc(pnc pncVar, Continuation continuation) {
        super(2, continuation);
        this.X = pncVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tmc tmcVar = (tmc) l((vac) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tmcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tmc tmcVar = new tmc(this.X, continuation);
        tmcVar.o = obj;
        return tmcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vac vacVar = (vac) this.o;
        pnc pncVar = this.X;
        pncVar.R0.setValue(vacVar.a);
        pncVar.N0.setValue(vacVar.b);
        pncVar.P0.setValue(vacVar.c);
        return qqg.a;
    }
}
