package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rh0 extends dtf implements sm6 {
    public final /* synthetic */ sh0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh0(sh0 sh0Var, Continuation continuation) {
        super(2, continuation);
        this.o = sh0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rh0 rh0Var = (rh0) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rh0Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rh0(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sh0 sh0Var = this.o;
        sh0Var.a.registerActivityLifecycleCallbacks(sh0Var.f);
        return qqg.a;
    }
}
