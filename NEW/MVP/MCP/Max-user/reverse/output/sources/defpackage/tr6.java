package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tr6 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tr6) l((ku3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tr6 tr6Var = new tr6(2, continuation);
        tr6Var.o = obj;
        return tr6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ku3 ku3Var = (ku3) this.o;
        return Boolean.valueOf((ku3Var == null || ku3Var.B()) ? false : true);
    }
}
