package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uwd extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uwd uwdVar = (uwd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uwdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uwd uwdVar = new uwd(2, continuation);
        uwdVar.o = obj;
        return uwdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gqe.c.p0().b(":settings/privacy", null);
        return qqg.a;
    }
}
