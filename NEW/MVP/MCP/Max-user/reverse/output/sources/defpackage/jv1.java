package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jv1 extends dtf implements sm6 {
    public final /* synthetic */ qv1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv1(qv1 qv1Var, Continuation continuation) {
        super(2, continuation);
        this.X = qv1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jv1 jv1Var = (jv1) l((zi1) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jv1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jv1 jv1Var = new jv1(this.X, continuation);
        jv1Var.o = obj;
        return jv1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zi1 zi1Var = (zi1) this.o;
        qv1 qv1Var = this.X;
        if (qv1Var.c().i) {
            qv1Var.i(zi1Var, true);
        } else {
            qv1Var.j(qv1Var.d().a.getId());
        }
        return qqg.a;
    }
}
