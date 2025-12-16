package defpackage;

import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class pjd implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RegistrationNeuroAvatarsScreen b;

    public /* synthetic */ pjd(RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen, int i) {
        this.a = i;
        this.b = registrationNeuroAvatarsScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        qqg qqgVar = qqg.a;
        RegistrationNeuroAvatarsScreen registrationNeuroAvatarsScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = RegistrationNeuroAvatarsScreen.D0;
                return registrationNeuroAvatarsScreen.z0() != null ? f1e.AUTH_AVATARS : f1e.SETTINGS_PROFILE_AVATARS;
            case 1:
                yy7[] yy7VarArr2 = RegistrationNeuroAvatarsScreen.D0;
                ((uxa) registrationNeuroAvatarsScreen.X.D(registrationNeuroAvatarsScreen, RegistrationNeuroAvatarsScreen.D0[0])).setCloseBadgeVisibility(registrationNeuroAvatarsScreen.A0().v());
                return qqgVar;
            case 2:
                hs hsVar = registrationNeuroAvatarsScreen.A0;
                yy7 yy7Var = RegistrationNeuroAvatarsScreen.D0[9];
                return new jfa((o8c) hsVar.a(registrationNeuroAvatarsScreen));
            case 3:
                yy7[] yy7VarArr3 = RegistrationNeuroAvatarsScreen.D0;
                return registrationNeuroAvatarsScreen.z0() != null ? new qmb(null, 0, null, null, 1L, null, 47) : qmb.g;
            case 4:
                hs hsVar2 = registrationNeuroAvatarsScreen.z0;
                yy7 yy7Var2 = RegistrationNeuroAvatarsScreen.D0[8];
                Long l = (Long) hsVar2.a(registrationNeuroAvatarsScreen);
                njd njdVarZ0 = registrationNeuroAvatarsScreen.z0();
                bwf bwfVar = new bwf(new pjd(registrationNeuroAvatarsScreen, 2));
                hh8 hh8Var = hh8.a;
                hh8Var.getClass();
                return new oga(l, njdVarZ0, bwfVar, new bwf(new c38(7)), hh8Var.getAccessor().d(484), null, null, 65504);
            case 5:
                yy7[] yy7VarArr4 = RegistrationNeuroAvatarsScreen.D0;
                return new efa(registrationNeuroAvatarsScreen.getContext());
            default:
                yy7[] yy7VarArr5 = RegistrationNeuroAvatarsScreen.D0;
                registrationNeuroAvatarsScreen.A0().t();
                return qqgVar;
        }
    }
}
