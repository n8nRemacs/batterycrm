package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lm8 extends dtf implements sm6 {
    public final /* synthetic */ nm8 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm8(nm8 nm8Var, Continuation continuation) {
        super(2, continuation);
        this.o = nm8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lm8 lm8Var = (lm8) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lm8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lm8(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((jrb) this.o.b.getValue()).f(2, 1);
        return qqg.a;
    }
}
