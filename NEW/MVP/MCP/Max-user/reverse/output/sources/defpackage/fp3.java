package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class fp3 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ fp3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ConfirmPhoneScreen.B0;
                confirmPhoneScreen.getRouter().C();
                break;
            default:
                jq3 jq3Var = (jq3) obj;
                yy7[] yy7VarArr2 = ConfirmPhoneScreen.B0;
                if (jq3Var == jq3.SUCCESS) {
                    confirmPhoneScreen.D0().A0.m(null, Boolean.TRUE);
                    break;
                }
                break;
        }
        return qqgVar;
    }
}
