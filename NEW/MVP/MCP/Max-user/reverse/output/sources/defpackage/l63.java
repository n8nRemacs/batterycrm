package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class l63 extends dtf implements sm6 {
    public final /* synthetic */ w63 X;
    public final /* synthetic */ k18 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l63(k18 k18Var, w63 w63Var, Continuation continuation) {
        super(2, continuation);
        this.o = k18Var;
        this.X = w63Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        l63 l63Var = (l63) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        l63Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new l63(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((ve2) this.o.getValue()).G = this.X.b;
        return qqg.a;
    }
}
