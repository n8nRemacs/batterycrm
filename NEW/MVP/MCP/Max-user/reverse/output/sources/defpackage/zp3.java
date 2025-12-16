package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* loaded from: classes2.dex */
public final class zp3 extends dtf implements sm6 {
    public final /* synthetic */ ConfirmPinCodeScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.X = confirmPinCodeScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zp3 zp3Var = (zp3) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zp3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zp3 zp3Var = new zp3(continuation, this.X);
        zp3Var.o = obj;
        return zp3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        ccb ccbVar = new ccb(this.X);
        ccbVar.h(dnf.j(str));
        ccbVar.i();
        return qqg.a;
    }
}
