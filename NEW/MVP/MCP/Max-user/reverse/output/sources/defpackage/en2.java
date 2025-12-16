package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class en2 extends dtf implements sm6 {
    public final /* synthetic */ fn2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en2(fn2 fn2Var, Continuation continuation) {
        super(2, continuation);
        this.X = fn2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        en2 en2Var = (en2) l((w8h) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        en2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        en2 en2Var = new en2(this.X, continuation);
        en2Var.o = obj;
        return en2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        w8h w8hVar = (w8h) this.o;
        int i = fn2.M0;
        this.X.v(w8hVar);
        return qqg.a;
    }
}
