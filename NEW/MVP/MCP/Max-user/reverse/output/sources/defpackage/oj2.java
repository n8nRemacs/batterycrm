package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oj2 extends dtf implements sm6 {
    public final /* synthetic */ pj2 X;
    public /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj2(pj2 pj2Var, Continuation continuation) {
        super(2, continuation);
        this.X = pj2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        oj2 oj2Var = (oj2) l(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        oj2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oj2 oj2Var = new oj2(this.X, continuation);
        oj2Var.o = ((Number) obj).floatValue();
        return oj2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.H0.setProgress(this.o * 100);
        return qqg.a;
    }
}
