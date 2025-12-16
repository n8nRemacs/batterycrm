package defpackage;

import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.startconversation.chat.PickChatMembers;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import one.me.webview.FaqWebViewWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class xre implements mi4 {
    public final /* synthetic */ int a;

    public /* synthetic */ xre(int i) {
        this.a = i;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                return new SettingsStorageScreen();
            case 1:
                return new StartConversationScreen();
            case 2:
                return new PickChatMembers();
            case 3:
                return new ChatTitleIconScreen(null, raf.c);
            case 4:
                return new StickersSettingsScreen();
            case 5:
                return new StickersScreen(ghf.b, 0L, 2, null);
            case 6:
                return new StickersScreen(ghf.c, 0L, 2, null);
            case 7:
                return new ProfileDeletionInfoScreen();
            case 8:
                return new WebAppsSettingScreen();
            default:
                return new FaqWebViewWidget();
        }
    }
}
