package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yd6 extends dtf implements sm6 {
    public final /* synthetic */ ae6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd6(ae6 ae6Var, Continuation continuation) {
        super(2, continuation);
        this.o = ae6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yd6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yd6(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ccb ccbVar = (ccb) this.o.Z.getValue();
        ccbVar.g(new n5g(mvd.Y1));
        ccbVar.a(new n5g(mvd.X1));
        return ccbVar.i();
    }
}
