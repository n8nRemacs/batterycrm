package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c40 extends dtf implements sm6 {
    public final /* synthetic */ e40 X;
    public final /* synthetic */ k18 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(k18 k18Var, e40 e40Var, Continuation continuation) {
        super(2, continuation);
        this.o = k18Var;
        this.X = e40Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        c40 c40Var = (c40) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        c40Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new c40(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        k18 k18Var = this.o;
        l7a l7aVar = (l7a) k18Var.getValue();
        e40 e40Var = this.X;
        ((b8a) l7aVar).b(e40Var.d);
        svi.e(e40Var.b, null, null, new b40(k18Var, e40Var, null), 3);
        return qqg.a;
    }
}
