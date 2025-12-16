package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ju9 extends dtf implements sm6 {
    public final /* synthetic */ si9 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ w10 Z;
    public final /* synthetic */ vu9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju9(vu9 vu9Var, si9 si9Var, boolean z, w10 w10Var, Continuation continuation) {
        super(2, continuation);
        this.o = vu9Var;
        this.X = si9Var;
        this.Y = z;
        this.Z = w10Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ju9 ju9Var = (ju9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ju9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ju9(this.o, this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.P(this.X.a, this.Y, false, this.Z.e());
        return qqg.a;
    }
}
