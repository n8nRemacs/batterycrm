package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x43 extends dtf implements sm6 {
    public final /* synthetic */ k53 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(k53 k53Var, Continuation continuation) {
        super(2, continuation);
        this.o = k53Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        x43 x43Var = (x43) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        x43Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new x43(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.b.a();
        return qqg.a;
    }
}
