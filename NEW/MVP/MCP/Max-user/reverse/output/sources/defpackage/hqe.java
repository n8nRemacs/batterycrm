package defpackage;

import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class hqe implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsPrivacyScreen b;

    public /* synthetic */ hqe(SettingsPrivacyScreen settingsPrivacyScreen, int i) {
        this.a = i;
        this.b = settingsPrivacyScreen;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        SettingsPrivacyScreen settingsPrivacyScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = SettingsPrivacyScreen.Z;
                bqe bqeVar = bqe.a;
                return new ere(new wle(bqeVar.getAccessor().d(49), (lzf) ((bwf) bqeVar.a()).getValue()), new vhb(bqeVar.getAccessor().d(46), 13, new hqe(settingsPrivacyScreen, 1)), (lzf) ((bwf) bqeVar.a()).getValue(), bqeVar.getAccessor().d(60), bqeVar.getAccessor().d(46), bqeVar.getAccessor().d(48), bqeVar.getAccessor().d(79), bqeVar.getAccessor().d(74), (mo3) bqeVar.getAccessor().c(391));
            default:
                yy7[] yy7VarArr2 = SettingsPrivacyScreen.Z;
                return settingsPrivacyScreen.getContext();
        }
    }
}
