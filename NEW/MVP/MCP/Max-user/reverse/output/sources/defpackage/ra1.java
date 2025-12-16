package defpackage;

import one.me.android.root.RootController;
import one.me.calllist.ui.CallHistoryScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ra1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallHistoryScreen b;

    public /* synthetic */ ra1(CallHistoryScreen callHistoryScreen, int i) {
        this.a = i;
        this.b = callHistoryScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        Object value;
        int i = this.a;
        boolean z = false;
        CallHistoryScreen callHistoryScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = CallHistoryScreen.D0;
                tcf tcfVar = callHistoryScreen.A0().o;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, new xa1()));
                ((yfb) callHistoryScreen.s0.D(callHistoryScreen, CallHistoryScreen.D0[1])).a();
                return qqg.a;
            case 1:
                zw1 zw1Var = new zw1(x4e.n, callHistoryScreen.a, x4e.f);
                kj1 kj1Var = (kj1) callHistoryScreen.d.getValue();
                y4e.a.getAccessor().getClass();
                return new za1(callHistoryScreen.b, zw1Var, kj1Var);
            case 2:
                yy7[] yy7VarArr2 = CallHistoryScreen.D0;
                return new kj1(new bwf(new ra1(callHistoryScreen, 4)), new s2i(callHistoryScreen, 0));
            case 3:
                return new ox1(((mj1) callHistoryScreen.X.getValue()).a, (esb) lx1.a.getAccessor().c(121), new s2i(callHistoryScreen, 1), new ra1(callHistoryScreen, 5), callHistoryScreen.lifecycleOwner);
            case 4:
                yy7[] yy7VarArr3 = CallHistoryScreen.D0;
                return callHistoryScreen.getRouter();
            default:
                yy7[] yy7VarArr4 = CallHistoryScreen.D0;
                c54 parentController = callHistoryScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                if (ytdVarE0 != null && ytdVarE0.n()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
