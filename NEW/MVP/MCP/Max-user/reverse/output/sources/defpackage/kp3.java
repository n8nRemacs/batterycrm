package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final class kp3 extends dtf implements sm6 {
    public final /* synthetic */ ConfirmPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp3(Continuation continuation, ConfirmPhoneScreen confirmPhoneScreen) {
        super(2, continuation);
        this.X = confirmPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kp3 kp3Var = (kp3) l((String) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kp3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kp3 kp3Var = new kp3(continuation, this.X);
        kp3Var.o = obj;
        return kp3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        yy7[] yy7VarArr = ConfirmPhoneScreen.B0;
        ConfirmPhoneScreen confirmPhoneScreen = this.X;
        qt7 qt7Var = (qt7) confirmPhoneScreen.A0.D(confirmPhoneScreen, ConfirmPhoneScreen.B0[7]);
        qqg qqgVar = qqg.a;
        if ((qt7Var != null && qt7Var.isActive()) || confirmPhoneScreen.z0 != null) {
            return qqgVar;
        }
        confirmPhoneScreen.E0(str);
        return qqgVar;
    }
}
