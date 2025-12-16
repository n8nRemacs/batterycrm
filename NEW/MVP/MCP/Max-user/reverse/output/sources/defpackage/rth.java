package defpackage;

import android.os.Build;
import android.os.Vibrator;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class rth implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ rth(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        WebAppRootScreen webAppRootScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = WebAppRootScreen.R0;
                bwf bwfVar = new bwf(new rth(webAppRootScreen, 2));
                hs hsVar = webAppRootScreen.x0;
                yy7[] yy7VarArr2 = WebAppRootScreen.R0;
                yy7 yy7Var = yy7VarArr2[1];
                long jLongValue = ((Number) hsVar.a(webAppRootScreen)).longValue();
                hs hsVar2 = webAppRootScreen.y0;
                yy7 yy7Var2 = yy7VarArr2[2];
                ukh ukhVar = (ukh) hsVar2.a(webAppRootScreen);
                hs hsVar3 = webAppRootScreen.w0;
                yy7 yy7Var3 = yy7VarArr2[0];
                Long l = (Long) hsVar3.a(webAppRootScreen);
                hs hsVar4 = webAppRootScreen.z0;
                yy7 yy7Var4 = yy7VarArr2[3];
                return new uvh(jLongValue, ukhVar, l, (String) hsVar4.a(webAppRootScreen), webAppRootScreen.Q0, bwfVar);
            case 1:
                yy7[] yy7VarArr3 = WebAppRootScreen.R0;
                return new x0i(webAppRootScreen.O0());
            default:
                yy7[] yy7VarArr4 = WebAppRootScreen.R0;
                return Build.VERSION.SDK_INT >= 31 ? pth.c(webAppRootScreen.getContext().getSystemService("vibrator_manager")).getDefaultVibrator() : (Vibrator) webAppRootScreen.getContext().getSystemService("vibrator");
        }
    }
}
