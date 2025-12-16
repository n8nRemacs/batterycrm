package defpackage;

import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ef1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallLinkInfoScreen b;

    public /* synthetic */ ef1(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
        this.b = callLinkInfoScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        CallLinkInfoScreen callLinkInfoScreen = this.b;
        switch (i) {
            case 0:
                b6a b6aVar = CallLinkInfoScreen.A0;
                return callLinkInfoScreen.getRouter();
            case 1:
                b6a b6aVar2 = CallLinkInfoScreen.A0;
                return new be0(r34.b(callLinkInfoScreen.getContext(), xza.c), mxa.a, a93.s0.x(callLinkInfoScreen.getContext()).k(), new n8(29), new gf1(0));
            case 2:
                b6a b6aVar3 = CallLinkInfoScreen.A0;
                return new yd0(r34.b(callLinkInfoScreen.getContext(), xza.a), kxa.a, callLinkInfoScreen.getContext(), new n8(23), new n8(24));
            default:
                b6a b6aVar4 = CallLinkInfoScreen.A0;
                return new kj1(new bwf(new ef1(callLinkInfoScreen, i2)), new s2i(callLinkInfoScreen, 0));
        }
    }
}
