package defpackage;

import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class qm7 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ qm7(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        InputNameScreen inputNameScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = InputNameScreen.A0;
                return new jp7(inputNameScreen.getRouter());
            case 1:
                yy7[] yy7VarArr2 = InputNameScreen.A0;
                hs hsVar = inputNameScreen.b;
                yy7[] yy7VarArr3 = InputNameScreen.A0;
                yy7 yy7Var = yy7VarArr3[0];
                String str = (String) hsVar.a(inputNameScreen);
                hs hsVar2 = inputNameScreen.c;
                yy7 yy7Var2 = yy7VarArr3[1];
                return new ym7(str, (String) hsVar2.a(inputNameScreen), hh8.a.getAccessor().d(139));
            default:
                yy7[] yy7VarArr4 = InputNameScreen.A0;
                ym7 ym7VarC0 = inputNameScreen.C0();
                hs hsVar3 = inputNameScreen.y0;
                yy7 yy7Var3 = InputNameScreen.A0[5];
                String str2 = (String) hsVar3.a(inputNameScreen);
                String strB0 = inputNameScreen.B0();
                boolean zU = ym7VarC0.u(1, str2);
                boolean zU2 = ym7VarC0.u(2, strB0);
                if (zU && zU2) {
                    xfh.r(ym7VarC0.X, new pm7(new njd(null, ym7VarC0.c, ym7VarC0.d, str2, strB0)));
                }
                inputNameScreen.y0().setActiveButtonLoaderState(!(inputNameScreen.z0().g() || inputNameScreen.A0().g()));
                return qqg.a;
        }
    }
}
