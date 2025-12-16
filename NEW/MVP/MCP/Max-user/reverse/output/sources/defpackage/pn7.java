package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pn7 extends dtf implements sm6 {
    public final /* synthetic */ yn7 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn7(yn7 yn7Var, Continuation continuation) {
        super(2, continuation);
        this.X = yn7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pn7 pn7Var = (pn7) l((oh8) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pn7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pn7 pn7Var = new pn7(this.X, continuation);
        pn7Var.o = obj;
        return pn7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        oh8 oh8Var = (oh8) this.o;
        this.X.A0 = oh8Var != null;
        return qqg.a;
    }
}
