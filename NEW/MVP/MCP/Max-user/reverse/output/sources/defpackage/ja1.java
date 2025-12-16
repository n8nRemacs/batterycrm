package defpackage;

import one.me.calllist.ui.page.CallHistoryPageScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ja1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryPageScreen b;

    public /* synthetic */ ja1(CallHistoryPageScreen callHistoryPageScreen, int i) {
        this.a = i;
        this.b = callHistoryPageScreen;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        CallHistoryPageScreen callHistoryPageScreen = this.b;
        switch (i) {
            case 0:
                v17 v17Var = CallHistoryPageScreen.u0;
                return new pa1(callHistoryPageScreen.requireActivity().getApplicationContext(), callHistoryPageScreen.y0(), (kj1) callHistoryPageScreen.c.getValue());
            case 1:
                v17 v17Var2 = CallHistoryPageScreen.u0;
                return new kj1(new bwf(new ja1(callHistoryPageScreen, 4)), new s2i(callHistoryPageScreen, 0));
            case 2:
                v17 v17Var3 = CallHistoryPageScreen.u0;
                if (callHistoryPageScreen.y0() != bb1.c) {
                    return null;
                }
                x3b x3bVar = new x3b(callHistoryPageScreen.getContext());
                x3bVar.setVisibility(8);
                x3bVar.setId(byc.call_history_page_empty);
                x3bVar.setIcon(yud.h0);
                x3bVar.setTitle(new n5g(y2d.call_history_missed_calls_empty_state_title));
                return x3bVar;
            case 3:
                v17 v17Var4 = CallHistoryPageScreen.u0;
                return new ha1(new usd(6, callHistoryPageScreen), y4e.a.g().c());
            default:
                v17 v17Var5 = CallHistoryPageScreen.u0;
                return callHistoryPageScreen.getRouter();
        }
    }
}
