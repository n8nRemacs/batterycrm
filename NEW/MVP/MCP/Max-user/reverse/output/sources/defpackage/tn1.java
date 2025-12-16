package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tn1 extends dtf implements sm6 {
    public final /* synthetic */ wo1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn1(wo1 wo1Var, Continuation continuation) {
        super(2, continuation);
        this.X = wo1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tn1 tn1Var = (tn1) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tn1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tn1 tn1Var = new tn1(this.X, continuation);
        tn1Var.o = obj;
        return tn1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xfh.r(this.X.L0, (cda) this.o);
        return qqg.a;
    }
}
