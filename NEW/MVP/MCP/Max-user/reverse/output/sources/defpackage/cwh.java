package defpackage;

import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class cwh implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppSettingsScreen b;

    public /* synthetic */ cwh(WebAppSettingsScreen webAppSettingsScreen, int i) {
        this.a = i;
        this.b = webAppSettingsScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        WebAppSettingsScreen webAppSettingsScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = WebAppSettingsScreen.Z;
                owh owhVarY0 = webAppSettingsScreen.y0();
                svi.e(owhVarY0.a, ((q2b) ((lzf) owhVarY0.Z.getValue())).b(), null, new mwh(owhVarY0, null), 2);
                break;
            default:
                yy7[] yy7VarArr2 = WebAppSettingsScreen.Z;
                webAppSettingsScreen.getRouter().C();
                break;
        }
        return qqgVar;
    }
}
