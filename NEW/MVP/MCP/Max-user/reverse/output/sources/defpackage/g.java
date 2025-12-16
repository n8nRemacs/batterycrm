package defpackage;

import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.android.logout.LogoutScreen;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.DevMenuScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.folders.list.FoldersListScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.login.LoginScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.showroom.ShowroomScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements mi4 {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                return new AboutAppSettingsScreen();
            case 1:
                return new ForceUpdateScreen();
            case 2:
                return new AppearanceSettingsMultiThemeScreen();
            case 3:
                return new CallOpponentsListWidget();
            case 4:
                return new CallAdminSettingsScreen();
            case 5:
                return new CallDebugMenuScreen();
            case 6:
                return new AdminWaitingRoomScreen();
            case 7:
                return new CallHistoryScreen();
            case 8:
                return new ChatsListSearchScreen();
            case 9:
                return new p14();
            case 10:
                return new ContactListWidget(hz3.a);
            case 11:
                return new DevMenuScreen();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new LogsViewerScreen();
            case 13:
                return new ServerHostBottomSheet();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ServerPortBottomSheet();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ShowroomScreen();
            case 16:
                return new ThreadsStateViewerScreen();
            case LangUtils.HASH_SEED /* 17 */:
                return new FoldersListScreen();
            case 18:
                return new FakeInAppReviewBottomSheet();
            case 19:
                return new InviteByPhoneScreen();
            case 20:
                return new InviteFriendsToMaxBottomSheet();
            case 21:
                return new LoginScreen();
            case 22:
                return new LogoutScreen();
            case 23:
                return new MessagesSettingsScreen();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new NotificationsSettingsScreen();
            case 25:
                return new ChatNotificationsSettingsScreen();
            case 26:
                return new DialogNotificationsSettingsScreen();
            case 27:
                return new OtherNotificationsSettingsScreen();
            case 28:
                return new SettingMediaScreen();
            default:
                return new SettingRingtoneScreen();
        }
    }
}
