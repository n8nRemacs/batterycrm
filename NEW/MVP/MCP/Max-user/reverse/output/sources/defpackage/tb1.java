package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tb1 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tb1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tb1 tb1Var = new tb1(2, continuation);
        tb1Var.o = obj;
        return tb1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return svi.e((f84) this.o, null, null, new sb1(2, null), 3);
    }
}
