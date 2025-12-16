package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nu0 extends dtf implements sm6 {
    public final /* synthetic */ ru0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu0(ru0 ru0Var, Continuation continuation) {
        super(2, continuation);
        this.o = ru0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nu0 nu0Var = (nu0) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nu0Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nu0(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.i.set(true);
        return qqg.a;
    }
}
