package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* loaded from: classes2.dex */
public final class og5 extends dtf implements sm6 {
    public final /* synthetic */ EnterPinCodeScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og5(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.X = enterPinCodeScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        og5 og5Var = (og5) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        og5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        og5 og5Var = new og5(continuation, this.X);
        og5Var.o = obj;
        return og5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        tg5 tg5Var = (tg5) this.o;
        EnterPinCodeScreen enterPinCodeScreen = this.X;
        bbd bbdVar = enterPinCodeScreen.d;
        Object targetController = enterPinCodeScreen.getTargetController();
        ng5 ng5Var = targetController instanceof ng5 ? (ng5) targetController : null;
        int iOrdinal = tg5Var.ordinal();
        if (iOrdinal == 0) {
            ((j0c) bbdVar.D(enterPinCodeScreen, EnterPinCodeScreen.o[0])).setState(jq3.SUCCESS);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ((j0c) bbdVar.D(enterPinCodeScreen, EnterPinCodeScreen.o[0])).setState(jq3.ERROR);
        }
        if (ng5Var != null) {
            ere ereVarY0 = ((SettingsPrivacyScreen) ng5Var).y0();
            jve jveVar = ereVarY0.O0;
            int iOrdinal2 = tg5Var.ordinal();
            if (iOrdinal2 == 0) {
                long j = ereVarY0.N0;
                if (j == lbb.i) {
                    xfh.o(ereVarY0, ((q2b) ereVarY0.d).a(), new vqe(ereVarY0, null), 2);
                } else if (j == lbb.j) {
                    ereVarY0.A(fme.i);
                } else if (j == lbb.f) {
                    ereVarY0.A(fme.h);
                } else if (j == lbb.d) {
                    ereVarY0.A(fme.j);
                } else if (j == lbb.c) {
                    ereVarY0.A(fme.l);
                }
                ereVarY0.N0 = 0L;
            } else if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return qqg.a;
    }
}
