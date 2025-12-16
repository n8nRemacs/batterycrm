package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wjc extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wjc wjcVar = (wjc) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wjcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wjc wjcVar = new wjc(2, continuation);
        wjcVar.o = obj;
        return wjcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (fni.a((cda) this.o, jc3.b)) {
            rfc.c.p0().d();
        }
        return qqg.a;
    }
}
