package defpackage;

import android.app.Activity;
import android.content.Intent;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* loaded from: classes.dex */
public final class o27 implements vn4 {
    public final k18 a;
    public final k18 b;
    public final CallIncomingScreen c;

    public o27(k18 k18Var, k18 k18Var2, CallIncomingScreen callIncomingScreen) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = callIncomingScreen;
    }

    @Override // defpackage.vn4
    public final void onDestroy(j48 j48Var) {
        j48Var.p().f(this);
    }

    @Override // defpackage.vn4
    public final void onPause(j48 j48Var) {
        Activity activity;
        if (((qsb) this.a.getValue()).b() && (activity = this.c.getActivity()) != null) {
            ((zo1) this.b.getValue()).getClass();
            zo1.d(activity);
        }
    }

    @Override // defpackage.vn4
    public final void onResume(j48 j48Var) {
        Activity activity;
        if (((qsb) this.a.getValue()).b() && (activity = this.c.getActivity()) != null) {
            ((zo1) this.b.getValue()).getClass();
            activity.startService(new Intent(activity, (Class<?>) CallServiceImpl.class).putExtra("ACTION", 6));
        }
    }
}
