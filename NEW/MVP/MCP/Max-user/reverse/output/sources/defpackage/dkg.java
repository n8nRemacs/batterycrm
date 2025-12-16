package defpackage;

import android.view.View;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* loaded from: classes2.dex */
public final class dkg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoFACheckPassScreen b;

    public /* synthetic */ dkg(TwoFACheckPassScreen twoFACheckPassScreen, int i) {
        this.a = i;
        this.b = twoFACheckPassScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                TwoFACheckPassScreen twoFACheckPassScreen = this.b;
                yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
                xkg xkgVarY0 = twoFACheckPassScreen.y0();
                TwoFACheckPassScreen twoFACheckPassScreen2 = this.b;
                imb inputTexts = ((pog) twoFACheckPassScreen2.X.D(twoFACheckPassScreen2, TwoFACheckPassScreen.t0[0])).getInputTexts();
                xkgVarY0.getClass();
                CharSequence charSequence = (CharSequence) inputTexts.a;
                CharSequence charSequenceC0 = charSequence != null ? vmf.c0(charSequence) : null;
                x9f x9fVar = xkgVarY0.C0;
                if (x9fVar == null || !x9fVar.isActive()) {
                    xkgVarY0.C0 = xfh.o(xkgVarY0, ((q2b) ((lzf) xkgVarY0.s0.getValue())).b(), new mkg(charSequenceC0, xkgVarY0, null), 2);
                    break;
                }
                break;
            default:
                TwoFACheckPassScreen twoFACheckPassScreen3 = this.b;
                yy7[] yy7VarArr2 = TwoFACheckPassScreen.t0;
                xkg xkgVarY02 = twoFACheckPassScreen3.y0();
                xkgVarY02.D0.O(xkgVarY02, xkg.G0[0], svi.d(xkgVarY02.a, ((q2b) ((lzf) xkgVarY02.s0.getValue())).b(), i84.b, new ukg(xkgVarY02, null)));
                break;
        }
    }
}
