package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bu9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.o = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bu9 bu9Var = (bu9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bu9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bu9(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vu9.z(this.o);
        return qqg.a;
    }
}
