package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ao2 extends dtf implements sm6 {
    public final /* synthetic */ jo2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao2(jo2 jo2Var, Continuation continuation) {
        super(2, continuation);
        this.o = jo2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ao2 ao2Var = (ao2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ao2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ao2(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        jo2.v(this.o);
        return qqg.a;
    }
}
