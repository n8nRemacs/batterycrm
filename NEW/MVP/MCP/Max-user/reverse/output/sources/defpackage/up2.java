package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class up2 extends dtf implements sm6 {
    public final /* synthetic */ y58 X;
    public final /* synthetic */ yq2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up2(yq2 yq2Var, y58 y58Var, Continuation continuation) {
        super(2, continuation);
        this.o = yq2Var;
        this.X = y58Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        up2 up2Var = (up2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        up2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new up2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yq2 yq2Var = this.o;
        kj1 kj1Var = yq2Var.Y;
        y58 y58Var = this.X;
        kj1Var.j(((w58) y58Var).a, true, false, false, new qn2(yq2Var, 1, y58Var));
        return qqg.a;
    }
}
