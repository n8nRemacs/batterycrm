package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zmc extends dtf implements sm6 {
    public final /* synthetic */ y58 X;
    public final /* synthetic */ pnc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmc(pnc pncVar, y58 y58Var, Continuation continuation) {
        super(2, continuation);
        this.o = pncVar;
        this.X = y58Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zmc zmcVar = (zmc) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zmcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zmc(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pnc pncVar = this.o;
        kj1 kj1Var = pncVar.d;
        y58 y58Var = this.X;
        kj1Var.j(((w58) y58Var).a, true, false, false, new l3b(pncVar, 14, y58Var));
        return qqg.a;
    }
}
