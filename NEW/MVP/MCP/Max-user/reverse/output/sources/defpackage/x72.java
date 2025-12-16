package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x72 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        x72 x72Var = (x72) l((af2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        x72Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x72 x72Var = new x72(2, continuation);
        x72Var.o = obj;
        return x72Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((af2) this.o).h = null;
        return qqg.a;
    }
}
