package defpackage;

import one.me.login.inputname.InputNameScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class rm7 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputNameScreen b;

    public /* synthetic */ rm7(InputNameScreen inputNameScreen, int i) {
        this.a = i;
        this.b = inputNameScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        InputNameScreen inputNameScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = InputNameScreen.A0;
                inputNameScreen.D0();
                break;
            case 1:
                CharSequence charSequence = (CharSequence) obj;
                yy7[] yy7VarArr2 = InputNameScreen.A0;
                boolean z = charSequence.length() > 0;
                String string = charSequence.toString();
                hs hsVar = inputNameScreen.y0;
                yy7 yy7Var = InputNameScreen.A0[5];
                hsVar.b(inputNameScreen, string);
                qf qfVarY0 = inputNameScreen.y0();
                qfVarY0.c = true;
                qfVarY0.setEnabled(z);
                xfh.r(inputNameScreen.C0().Z, new m27(1));
                break;
            case 2:
                CharSequence charSequence2 = (CharSequence) obj;
                yy7[] yy7VarArr3 = InputNameScreen.A0;
                xfh.r(inputNameScreen.C0().Z, new m27(2));
                String string2 = charSequence2.toString();
                hs hsVar2 = inputNameScreen.z0;
                yy7 yy7Var2 = InputNameScreen.A0[6];
                hsVar2.b(inputNameScreen, string2);
                inputNameScreen.C0().t(charSequence2.toString(), inputNameScreen.A0().a.isFocused());
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yy7[] yy7VarArr4 = InputNameScreen.A0;
                if (!inputNameScreen.A0().g()) {
                    inputNameScreen.C0().t(inputNameScreen.B0(), zBooleanValue);
                    break;
                }
                break;
        }
        return qqgVar;
    }
}
