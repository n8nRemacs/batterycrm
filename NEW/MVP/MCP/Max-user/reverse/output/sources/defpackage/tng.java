package defpackage;

import android.view.View;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;

/* loaded from: classes2.dex */
public final class tng implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoFAStartRestoreScreen b;

    public /* synthetic */ tng(TwoFAStartRestoreScreen twoFAStartRestoreScreen, int i) {
        this.a = i;
        this.b = twoFAStartRestoreScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        TwoFAStartRestoreScreen twoFAStartRestoreScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = TwoFAStartRestoreScreen.s0;
                xfh.r(twoFAStartRestoreScreen.y0().x0, k5j.b());
                break;
            default:
                yy7[] yy7VarArr2 = TwoFAStartRestoreScreen.s0;
                eog eogVarY0 = twoFAStartRestoreScreen.y0();
                eogVarY0.A0.O(eogVarY0, eog.D0[0], svi.d(eogVarY0.a, ((q2b) ((lzf) eogVarY0.Z.getValue())).b(), i84.b, new bog(eogVarY0, null)));
                break;
        }
    }
}
