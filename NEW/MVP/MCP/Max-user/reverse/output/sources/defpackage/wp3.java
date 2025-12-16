package defpackage;

import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class wp3 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPinCodeScreen b;

    public /* synthetic */ wp3(ConfirmPinCodeScreen confirmPinCodeScreen, int i) {
        this.a = i;
        this.b = confirmPinCodeScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ConfirmPinCodeScreen confirmPinCodeScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ConfirmPinCodeScreen.X;
                jva onBackPressedDispatcher = confirmPinCodeScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return qqg.a;
            default:
                yy7[] yy7VarArr2 = ConfirmPinCodeScreen.X;
                hs hsVar = confirmPinCodeScreen.a;
                yy7 yy7Var = ConfirmPinCodeScreen.X[0];
                return new dq3((String) hsVar.a(confirmPinCodeScreen));
        }
    }
}
