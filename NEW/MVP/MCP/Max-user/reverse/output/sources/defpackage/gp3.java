package defpackage;

import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class gp3 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPhoneScreen b;

    public /* synthetic */ gp3(ConfirmPhoneScreen confirmPhoneScreen, int i) {
        this.a = i;
        this.b = confirmPhoneScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ConfirmPhoneScreen confirmPhoneScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ConfirmPhoneScreen.B0;
                hs hsVar = confirmPhoneScreen.o;
                yy7[] yy7VarArr2 = ConfirmPhoneScreen.B0;
                yy7 yy7Var = yy7VarArr2[2];
                int iIntValue = ((Number) hsVar.a(confirmPhoneScreen)).intValue();
                hs hsVar2 = confirmPhoneScreen.c;
                yy7 yy7Var2 = yy7VarArr2[0];
                String str = (String) hsVar2.a(confirmPhoneScreen);
                hs hsVar3 = confirmPhoneScreen.d;
                yy7 yy7Var3 = yy7VarArr2[1];
                String str2 = (String) hsVar3.a(confirmPhoneScreen);
                hh8 hh8Var = hh8.a;
                return new vp3(iIntValue, str, str2, hh8Var.getAccessor().d(484), new bwf(new c38(6)), new bwf(new c38(5)), hh8Var.getAccessor().d(8), hh8Var.getAccessor().d(139));
            case 1:
                yy7[] yy7VarArr3 = ConfirmPhoneScreen.B0;
                return new jp7(confirmPhoneScreen.getRouter());
            default:
                yy7[] yy7VarArr4 = ConfirmPhoneScreen.B0;
                return z7.e(confirmPhoneScreen.getContext(), t3d.oneme_login_confirm_timer);
        }
    }
}
