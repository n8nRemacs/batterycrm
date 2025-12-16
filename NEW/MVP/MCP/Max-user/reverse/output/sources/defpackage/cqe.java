package defpackage;

import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class cqe implements mi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ cqe(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                return new ConfirmPinCodeScreen(this.b);
            case 1:
                return new TwoFAOnboardingScreen(this.b);
            default:
                return new TwoFACheckPassScreen("SETTINGS", null, new up7(null, this.b, null, null, null, 29), 2, null);
        }
    }
}
