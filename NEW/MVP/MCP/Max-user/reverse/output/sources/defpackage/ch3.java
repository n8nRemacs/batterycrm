package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ch3 extends dtf implements sm6 {
    public final /* synthetic */ kh3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch3(kh3 kh3Var, Continuation continuation) {
        super(2, continuation);
        this.o = kh3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ch3 ch3Var = (ch3) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ch3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ch3(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        kh3 kh3Var = this.o;
        kh3Var.l.O(kh3Var, kh3.m[0], svi.e(kh3Var.k, null, i84.b, new ih3(kh3Var, null), 1));
        return qqg.a;
    }
}
