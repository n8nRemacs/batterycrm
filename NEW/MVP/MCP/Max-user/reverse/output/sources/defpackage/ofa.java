package defpackage;

import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class ofa implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ ofa(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        qqg qqgVar = qqg.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = NeuroAvatarsScreen.K0;
                neuroAvatarsScreen.C0().t();
                return qqgVar;
            case 1:
                yy7[] yy7VarArr2 = NeuroAvatarsScreen.K0;
                ((uxa) neuroAvatarsScreen.X.D(neuroAvatarsScreen, NeuroAvatarsScreen.K0[1])).setCloseBadgeVisibility(neuroAvatarsScreen.C0().v());
                return qqgVar;
            case 2:
                yy7[] yy7VarArr3 = NeuroAvatarsScreen.K0;
                return neuroAvatarsScreen.A0() != null ? f1e.AUTH_AVATARS : f1e.SETTINGS_PROFILE_AVATARS;
            case 3:
                yy7[] yy7VarArr4 = NeuroAvatarsScreen.K0;
                return neuroAvatarsScreen.A0() != null ? new qmb(null, 0, null, null, 0L, null, 47) : qmb.g;
            case 4:
                hs hsVar = neuroAvatarsScreen.D0;
                yy7 yy7Var = NeuroAvatarsScreen.K0[10];
                Long l = (Long) hsVar.a(neuroAvatarsScreen);
                njd njdVarA0 = neuroAvatarsScreen.A0();
                bwf bwfVar = new bwf(new ofa(neuroAvatarsScreen, 6));
                hh8 hh8Var = hh8.a;
                hh8Var.getClass();
                return new oga(l, njdVarA0, bwfVar, new bwf(new c38(7)), hh8Var.getAccessor().d(484), hh8Var.getAccessor().d(8), hh8Var.getAccessor().d(139), 65408);
            case 5:
                yy7[] yy7VarArr5 = NeuroAvatarsScreen.K0;
                return r34.b(neuroAvatarsScreen.getContext(), yud.j0);
            default:
                hs hsVar2 = neuroAvatarsScreen.C0;
                yy7 yy7Var2 = NeuroAvatarsScreen.K0[9];
                return new jfa((o8c) hsVar2.a(neuroAvatarsScreen));
        }
    }
}
