package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pse extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pse pseVar = (pse) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pseVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pse pseVar = new pse(2, continuation);
        pseVar.o = obj;
        return pseVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gqe.c.p0().b(":settings/privacy/pincode?mode=confirm&hash=".concat((String) this.o), null);
        return qqg.a;
    }
}
