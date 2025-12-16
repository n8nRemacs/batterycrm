package defpackage;

import android.net.Uri;
import android.os.Bundle;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.android.join.JoinChatWidget;
import one.me.calls.share.CallSharePickerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.mediapicker.crop.AvatarEditScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class np1 implements mi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ np1(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                return new CallSharePickerScreen(this.b);
            case 1:
                return new ChatScreen(this.b);
            case 2:
                return new ChatScreen(this.b);
            case 3:
                return new ExternalCallbackWidget(l8j.k("params", this.b));
            case 4:
                return new FolderEditScreen(l8j.k("id", this.b));
            case 5:
                return new FolderEditScreen(l8j.k("id", this.b));
            case 6:
                return new InviteByQrBottomSheet(this.b);
            case 7:
                Bundle bundle = this.b;
                return new JoinChatWidget(l8j.i("id", bundle), l8j.k("link", bundle), bundle.getString("title"), l8j.f("channel", bundle));
            case 8:
                Bundle bundle2 = this.b;
                return new LinkInterceptorWidget((Uri) bundle2.getParcelable("link"), (w68) bundle2.getParcelable("link:result"));
            case 9:
                Bundle bundle3 = this.b;
                return new AvatarEditScreen(l8j.k("image_uri", bundle3), l8j.k("file_path", bundle3));
            case 10:
                return new ShareDataPickerScreen(this.b);
            case 11:
                return new ShareDataPickerScreen(this.b);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new StickersSearchScreen(this.b);
            default:
                return new StickersShowcaseScreen(this.b);
        }
    }
}
