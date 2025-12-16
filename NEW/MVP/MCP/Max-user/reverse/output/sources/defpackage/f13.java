package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f13 extends dtf implements sm6 {
    public final /* synthetic */ h13 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f13(h13 h13Var, Continuation continuation) {
        super(2, continuation);
        this.X = h13Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f13 f13Var = (f13) l((f86) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f13Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        f13 f13Var = new f13(this.X, continuation);
        f13Var.o = obj;
        return f13Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.c.setValue((f86) this.o);
        return qqg.a;
    }
}
