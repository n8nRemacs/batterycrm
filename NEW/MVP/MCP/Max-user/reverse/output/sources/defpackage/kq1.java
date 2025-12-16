package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class kq1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq1 b;

    public /* synthetic */ kq1(mq1 mq1Var, int i) {
        this.a = i;
        this.b = mq1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        mq1 mq1Var = this.b;
        switch (i) {
            case 0:
                lq1 lq1Var = mq1Var.K0;
                if (lq1Var != null) {
                    zi1 zi1Var = mq1Var.P0;
                    CallScreen callScreen = ((ql1) lq1Var).a;
                    rha rhaVar = CallScreen.N0;
                    callScreen.H0().Z.f(zi1Var);
                    break;
                }
                break;
            default:
                lq1 lq1Var2 = mq1Var.K0;
                if (lq1Var2 != null) {
                    CallScreen callScreen2 = ((ql1) lq1Var2).a;
                    rha rhaVar2 = CallScreen.N0;
                    callScreen2.H0().Z.h();
                    break;
                }
                break;
        }
    }
}
