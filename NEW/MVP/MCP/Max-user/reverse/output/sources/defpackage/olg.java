package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* loaded from: classes2.dex */
public final class olg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACreationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olg(Continuation continuation, TwoFACreationScreen twoFACreationScreen) {
        super(2, continuation);
        this.X = twoFACreationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        olg olgVar = (olg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        olgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        olg olgVar = new olg(continuation, this.X);
        olgVar.o = obj;
        return olgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        TwoFACreationScreen twoFACreationScreen = this.X;
        bbd bbdVar = twoFACreationScreen.u0;
        yy7[] yy7VarArr = TwoFACreationScreen.w0;
        if (twoFACreationScreen.z0() == ilg.b) {
            boolean z = str == null || str.length() == 0;
            bbd bbdVar2 = twoFACreationScreen.v0;
            yy7[] yy7VarArr2 = TwoFACreationScreen.w0;
            ((OneMeButton) bbdVar2.D(twoFACreationScreen, yy7VarArr2[4])).setVisibility(z ? 0 : 8);
            ((TextView) bbdVar.D(twoFACreationScreen, yy7VarArr2[3])).setVisibility(z ? 8 : 0);
            if (!z) {
                ((TextView) bbdVar.D(twoFACreationScreen, yy7VarArr2[3])).setText(twoFACreationScreen.getContext().getString(r4d.oneme_settings_twofa_creation_email_verify_resend_code_timer, str));
            }
        }
        return qqg.a;
    }
}
