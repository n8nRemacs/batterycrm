package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final class lp3 extends dtf implements sm6 {
    public final /* synthetic */ ConfirmPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp3(Continuation continuation, ConfirmPhoneScreen confirmPhoneScreen) {
        super(2, continuation);
        this.X = confirmPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lp3 lp3Var = (lp3) l((String) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lp3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lp3 lp3Var = new lp3(continuation, this.X);
        lp3Var.o = obj;
        return lp3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        yy7[] yy7VarArr = ConfirmPhoneScreen.B0;
        this.X.B0().I0(0, str);
        return qqg.a;
    }
}
