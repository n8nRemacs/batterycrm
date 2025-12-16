package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rq5 extends dtf implements sm6 {
    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rq5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rq5(2, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return Boolean.valueOf(((fxa) t0i.a.getAccessor().c(31)).b());
    }
}
