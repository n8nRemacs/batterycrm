package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class on2 extends dtf implements sm6 {
    public final /* synthetic */ jo2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on2(jo2 jo2Var, Continuation continuation) {
        super(2, continuation);
        this.o = jo2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((on2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new on2(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = jo2.W0;
        ccb ccbVarD = this.o.D();
        ccbVarD.g(new n5g(x8b.V1));
        ccbVarD.e(new qcb(yud.o));
        return ccbVarD.i();
    }
}
