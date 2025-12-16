package defpackage;

import android.view.ViewGroup;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;

/* loaded from: classes2.dex */
public final class ymg extends dtf implements sm6 {
    public final /* synthetic */ TwoFAOnboardingScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymg(Continuation continuation, TwoFAOnboardingScreen twoFAOnboardingScreen) {
        super(2, continuation);
        this.X = twoFAOnboardingScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ymg ymgVar = (ymg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ymgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ymg ymgVar = new ymg(continuation, this.X);
        ymgVar.o = obj;
        return ymgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nmg nmgVar = (nmg) this.o;
        yy7[] yy7VarArr = TwoFAOnboardingScreen.X;
        boolean z = nmgVar instanceof lmg;
        TwoFAOnboardingScreen twoFAOnboardingScreen = this.X;
        if (z) {
            ccb ccbVar = new ccb(twoFAOnboardingScreen);
            lmg lmgVar = (lmg) nmgVar;
            ccbVar.e(new qcb(lmgVar.b));
            ccbVar.g(lmgVar.a);
            ViewGroup.LayoutParams layoutParams = twoFAOnboardingScreen.y0().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            ccbVar.c(new kcb(0, 0, twoFAOnboardingScreen.y0().getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), 3));
            ccbVar.i();
            twoFAOnboardingScreen.y0().setProgressEnabled(false);
        } else if (nmgVar instanceof mmg) {
            twoFAOnboardingScreen.y0().setProgressEnabled(((mmg) nmgVar).a);
        }
        return qqg.a;
    }
}
