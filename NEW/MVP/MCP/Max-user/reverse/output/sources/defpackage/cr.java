package defpackage;

import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class cr implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen b;

    public /* synthetic */ cr(AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, int i) {
        this.a = i;
        this.b = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = AppearanceSettingsMultiThemeScreen.Z;
                xfh.r(appearanceSettingsMultiThemeScreen.y0().E0, jc3.b);
                return qqg.a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                b0i b0iVar = appearanceSettingsMultiThemeScreen.Y;
                return Boolean.valueOf(b0iVar.j() <= 0 ? false : ((f7g) ((t98) b0iVar.C(iIntValue))).a);
        }
    }
}
