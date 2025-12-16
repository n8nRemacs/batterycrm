package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j92 extends dtf implements sm6 {
    public final /* synthetic */ k92 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j92(k92 k92Var, Continuation continuation) {
        super(2, continuation);
        this.o = k92Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        j92 j92Var = (j92) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        j92Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new j92(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        k92 k92Var = this.o;
        w63 w63Var = (w63) k92Var.d.getValue();
        w63Var.i().Z(k92Var.b);
        xfh.r(k92Var.Y, xkc.b);
        return qqg.a;
    }
}
