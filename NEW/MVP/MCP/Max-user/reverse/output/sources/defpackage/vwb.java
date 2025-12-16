package defpackage;

import one.me.startconversation.channel.PickSubscribersScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class vwb implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickSubscribersScreen b;

    public /* synthetic */ vwb(PickSubscribersScreen pickSubscribersScreen, int i) {
        this.a = i;
        this.b = pickSubscribersScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        PickSubscribersScreen pickSubscribersScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = PickSubscribersScreen.z0;
                jva onBackPressedDispatcher = pickSubscribersScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            default:
                uaf uafVar = (uaf) obj;
                uafVar.M0();
                yy7[] yy7VarArr2 = PickSubscribersScreen.z0;
                hs hsVar = pickSubscribersScreen.u0;
                yy7 yy7Var = PickSubscribersScreen.z0[1];
                uafVar.s0(uafVar.L0(((Number) hsVar.a(pickSubscribersScreen)).longValue()));
                break;
        }
        return qqgVar;
    }
}
