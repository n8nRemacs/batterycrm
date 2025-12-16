package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* loaded from: classes2.dex */
public final class xp3 extends dtf implements sm6 {
    public final /* synthetic */ ConfirmPinCodeScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.X = confirmPinCodeScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xp3 xp3Var = (xp3) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xp3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xp3 xp3Var = new xp3(continuation, this.X);
        xp3Var.o = obj;
        return xp3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int iOrdinal = ((aq3) this.o).ordinal();
        ConfirmPinCodeScreen confirmPinCodeScreen = this.X;
        if (iOrdinal == 0) {
            ConfirmPinCodeScreen.y0(confirmPinCodeScreen).setErrorText(null);
            mq3 mq3Var = ConfirmPinCodeScreen.y0(confirmPinCodeScreen).I0;
            int childCount = mq3Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                lm7 lm7VarH0 = mq3Var.H0(i);
                if (lm7VarH0 != null) {
                    ((j5f) lm7VarH0).G0.setText((CharSequence) null);
                }
            }
            mq3Var.J0();
            ConfirmPinCodeScreen.y0(confirmPinCodeScreen).setState(jq3.NORMAL);
        } else if (iOrdinal == 1) {
            ConfirmPinCodeScreen.y0(confirmPinCodeScreen).setErrorText(null);
            ConfirmPinCodeScreen.y0(confirmPinCodeScreen).setState(jq3.SUCCESS);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ConfirmPinCodeScreen.y0(confirmPinCodeScreen).setErrorText(z7.e(confirmPinCodeScreen.getContext(), o4d.oneme_settings_privacy_onboarding_error_pin_code_equals));
            ConfirmPinCodeScreen.y0(confirmPinCodeScreen).setState(jq3.ERROR);
        }
        return qqg.a;
    }
}
