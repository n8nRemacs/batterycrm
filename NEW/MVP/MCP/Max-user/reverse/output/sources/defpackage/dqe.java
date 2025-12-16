package defpackage;

import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class dqe implements mi4, en6 {
    public static final dqe b = new dqe(0);
    public static final dqe c = new dqe(1);
    public static final dqe d = new dqe(2);
    public static final dqe o = new dqe(3);
    public final /* synthetic */ int a;

    public /* synthetic */ dqe(int i) {
        this.a = i;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                return new SettingsPrivacyScreen();
            case 1:
                return new SettingsBlacklistScreen();
            case 2:
                return new SafeModeOnboardingScreen();
            default:
                return new SetupPinCodeScreen();
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof mi4) && (obj instanceof en6)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof mi4) && (obj instanceof en6)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof mi4) && (obj instanceof en6)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof mi4) && (obj instanceof en6)) {
                    break;
                }
                break;
        }
        return getFunctionDelegate().equals(((en6) obj).getFunctionDelegate());
    }

    @Override // defpackage.en6
    public final xm6 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new hn6(0, SettingsPrivacyScreen.class, "<init>", "<init>()V", 0);
            case 1:
                return new hn6(0, SettingsBlacklistScreen.class, "<init>", "<init>()V", 0);
            case 2:
                return new hn6(0, SafeModeOnboardingScreen.class, "<init>", "<init>()V", 0);
            default:
                return new hn6(0, SetupPinCodeScreen.class, "<init>", "<init>()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
