package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;

/* loaded from: classes.dex */
public final class zj1 extends dtf implements sm6 {
    public final /* synthetic */ CallPresettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj1(Continuation continuation, CallPresettingsScreen callPresettingsScreen) {
        super(2, continuation);
        this.X = callPresettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zj1 zj1Var = (zj1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zj1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zj1 zj1Var = new zj1(continuation, this.X);
        zj1Var.o = obj;
        return zj1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof jc3) {
            c54 c54Var = this.X;
            c54Var.getRouter().B(c54Var);
        } else if (cdaVar instanceof ei4) {
            ca1.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
