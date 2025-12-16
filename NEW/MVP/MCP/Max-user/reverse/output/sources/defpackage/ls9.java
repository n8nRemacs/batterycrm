package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ls9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.o = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ls9 ls9Var = (ls9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ls9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ls9(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f00 f00Var = this.o.A0;
        f00Var.d.O(f00Var, f00.f[0], gw0.w(new g56(new d53(f00Var.a.c, 12), new e00(f00Var, null), 1), f00Var.c));
        return qqg.a;
    }
}
