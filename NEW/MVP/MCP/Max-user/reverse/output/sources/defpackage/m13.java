package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m13 extends dtf implements sm6 {
    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        m13 m13Var = (m13) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        m13Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new m13(2, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return qqg.a;
    }
}
