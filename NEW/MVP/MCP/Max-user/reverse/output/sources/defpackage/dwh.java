package defpackage;

import java.lang.annotation.Annotation;
import one.me.login.welcome.WelcomeScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class dwh implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ dwh(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yy7[] yy7VarArr = WebAppSettingsScreen.Z;
                return f1e.SETTINGS_PRIVACY_MINIAPP;
            case 1:
                return qg9.a("one.me.webapp.domain.jsbridge.delegates.share.WebAppShareStatus", ayh.values(), new String[]{"shared", "cancelled"}, new Annotation[][]{null, null});
            case 2:
                yy7[] yy7VarArr2 = WebAppsSettingScreen.o;
                return f1e.SETTINGS_PRIVACY_MINIAPPS;
            case 3:
                yy7[] yy7VarArr3 = WebAppsSettingScreen.o;
                return new h0i(((w4e) ((pb3) kph.a.getAccessor().c(46))).s());
            case 4:
                yy7[] yy7VarArr4 = WelcomeScreen.Z;
                return f1e.AUTH_SIGN_METHOD;
            case 5:
                yy7[] yy7VarArr5 = WelcomeScreen.Z;
                return (eza) hh8.a.getAccessor().c(81);
            default:
                return new aai();
        }
    }
}
