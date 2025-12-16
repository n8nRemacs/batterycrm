package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import one.me.calls.ui.ui.call.CallScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class bm1 implements tq1 {
    public final /* synthetic */ CallScreen a;

    public bm1(CallScreen callScreen) {
        this.a = callScreen;
    }

    @Override // defpackage.pp1
    public final void b() {
        CallScreen callScreen = this.a;
        Context context = callScreen.getContext();
        String strU = dqi.u(callScreen.H0().w().k);
        gge ggeVar = new gge(context);
        String string = context.getString(d3d.call_link_share_dialog_share_link_description, strU);
        Intent intent = (Intent) ggeVar.d;
        intent.putExtra("android.intent.extra.TEXT", (CharSequence) string);
        ggeVar.b = context.getString(d3d.call_link_share_dialog_share_link_dialog_intent_title);
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        ggeVar.k();
    }

    @Override // defpackage.pp1
    public final void c() {
        rha rhaVar = CallScreen.N0;
        CallScreen callScreen = this.a;
        xb3.a(callScreen.getContext(), dqi.u(callScreen.H0().w().k));
        if (xb3.b()) {
            String string = callScreen.getContext().getString(d3d.call_link_share_dialog_share_link_copy);
            ccb ccbVar = new ccb(callScreen);
            ccbVar.h(string);
            ccbVar.d(new ns1(4, null));
            ccbVar.c(new kcb(0, 0, 0, 3));
            ccbVar.i();
        }
    }

    @Override // defpackage.pp1
    public final void d() {
        rha rhaVar = CallScreen.N0;
        this.a.H0().u();
    }

    @Override // defpackage.pp1
    public final void h() {
        rha rhaVar = CallScreen.N0;
        wo1 wo1VarH0 = this.a.H0();
        xfh.r(wo1VarH0.L0, new ym1(dqi.u(wo1VarH0.w().k)));
    }

    @Override // defpackage.ts1
    public final void i(zi1 zi1Var) {
        rha rhaVar = CallScreen.N0;
        this.a.H0().A(zi1Var);
    }

    @Override // defpackage.ts1
    public final void k(zi1 zi1Var, Point point) {
        rha rhaVar = CallScreen.N0;
        this.a.H0().C(zi1Var, point);
    }

    @Override // defpackage.ts1
    public final void l() {
        rha rhaVar = CallScreen.N0;
        CallScreen callScreen = this.a;
        if (callScreen.H0().t(callScreen.F0().g)) {
            CallScreen.z0(callScreen);
        }
    }
}
