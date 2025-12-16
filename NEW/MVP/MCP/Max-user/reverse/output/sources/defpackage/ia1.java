package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class ia1 extends yb4 {
    public final String v0;
    public List w0;

    public ia1(CallHistoryScreen callHistoryScreen) {
        super((Widget) callHistoryScreen);
        this.v0 = ia1.class.getName();
        this.w0 = hd5.a;
    }

    @Override // defpackage.yb4
    public final void E(ytd ytdVar, int i) {
        CallHistoryPageScreen callHistoryPageScreen;
        if (ytdVar.n()) {
            return;
        }
        int iOrdinal = ((cb1) this.w0.get(i)).c.ordinal();
        if (iOrdinal == 0) {
            v17 v17Var = CallHistoryPageScreen.u0;
            bb1 bb1Var = bb1.b;
            v17Var.getClass();
            callHistoryPageScreen = new CallHistoryPageScreen(bb1Var);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            v17 v17Var2 = CallHistoryPageScreen.u0;
            bb1 bb1Var2 = bb1.c;
            v17Var2.getClass();
            callHistoryPageScreen = new CallHistoryPageScreen(bb1Var2);
        }
        CallHistoryPageScreen callHistoryPageScreen2 = callHistoryPageScreen;
        callHistoryPageScreen2.setRetainViewMode(b54.b);
        ytdVar.S(new bud(callHistoryPageScreen2, null, null, null, false, -1));
    }

    @Override // defpackage.yb4, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void y(dud dudVar) {
        dudVar.F0 = null;
        super.y(dudVar);
    }

    @Override // defpackage.phd
    public final int j() {
        return this.w0.size();
    }
}
