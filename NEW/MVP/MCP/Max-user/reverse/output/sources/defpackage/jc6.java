package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jc6 extends dtf implements sm6 {
    public final /* synthetic */ oc6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc6(oc6 oc6Var, Continuation continuation) {
        super(2, continuation);
        this.o = oc6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jc6 jc6Var = (jc6) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jc6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jc6(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ccb ccbVar = (ccb) this.o.Z.getValue();
        ccbVar.g(new n5g(mvd.Y1));
        ccbVar.a(new n5g(mvd.X1));
        ccbVar.i();
        return qqg.a;
    }
}
