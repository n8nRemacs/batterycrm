package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class vmg implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoFAOnboardingScreen b;

    public /* synthetic */ vmg(TwoFAOnboardingScreen twoFAOnboardingScreen, int i) {
        this.a = i;
        this.b = twoFAOnboardingScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        TwoFAOnboardingScreen twoFAOnboardingScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = TwoFAOnboardingScreen.X;
                int iOrdinal = twoFAOnboardingScreen.z0().ordinal();
                if (iOrdinal == 0) {
                    return f1e.AUTH_2FA_START;
                }
                if (iOrdinal == 1) {
                    return f1e.AUTH_2FA_SUCCESS;
                }
                throw new NoWhenBranchMatchedException();
            default:
                yy7[] yy7VarArr2 = TwoFAOnboardingScreen.X;
                return new ang(twoFAOnboardingScreen.z0());
        }
    }
}
