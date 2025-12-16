package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class zb2 implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ zb2(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new jt4(fdc.a.getAccessor().d(79));
            case 1:
                yec yecVar = yec.a;
                return new t73(yecVar.getAccessor().d(42), yecVar.getAccessor().d(9));
            case 2:
                return (pfc) yec.a.getAccessor().c(HttpStatus.SC_NOT_IMPLEMENTED);
            case 3:
                return new yuf(0);
            case 4:
                return new yuf(0);
            case 5:
                return new ShapeDrawable();
            case 6:
                return new FitFontImageSpan(new m60(), a16.a, false, false, 12, null);
            case 7:
                return new FitFontImageSpan(new g9h(), a16.a, false, false, 12, null);
            case 8:
                return new pq3(v8b.z, new n5g(mvd.p), 3, 56);
            case 9:
                return new b44(v8b.g0, new n5g(x8b.t1), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            case 10:
                return new b44(v8b.c0, new n5g(x8b.B1), Integer.valueOf(yud.i1), (Integer) null, 20);
            case 11:
                return new yuf(0);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new yuf(0);
            case 13:
                yy7[] yy7VarArr = ChatMediaDownloadBottomSheet.I0;
                pue pueVar = pue.a;
                return new yk2(pueVar.getAccessor().d(138), pueVar.getAccessor().d(440), pueVar.getAccessor().d(79), pueVar.getAccessor().d(137), pueVar.getAccessor().d(399), (Context) pueVar.getAccessor().c(12), (lzf) pueVar.getAccessor().c(8), new sxd((d1e) pueVar.getAccessor().c(443), ((q2b) ((lzf) pueVar.getAccessor().c(8))).b(), (vob) pueVar.getAccessor().c(444)));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return fdc.a.g();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new bk2();
            case 16:
                yy7[] yy7VarArr2 = ChatMediaViewerScreen.Q0;
                return f1e.CHAT_MEDIA_VIEWER;
            case LangUtils.HASH_SEED /* 17 */:
                return new b44(v8b.w0, new n5g(x8b.Z1), Integer.valueOf(w9b.X), Integer.valueOf(yud.r), Integer.valueOf(w9b.R));
            case 18:
                return new b44(v8b.v0, new n5g(x8b.Y1), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            case 19:
                return new b44(v8b.u0, new n5g(x8b.X1), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            case 20:
                return new b44(v8b.t0, new n5g(x8b.W1), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            case 21:
                yy7[] yy7VarArr3 = ChatMembersScreen.t0;
                return f1e.CHAT_INFO_ALL_PARTICIPANTS;
            case 22:
                return new kt4(fdc.a.getAccessor().d(79));
            case 23:
                yy7[] yy7VarArr4 = ChatNotificationsSettingsScreen.X;
                return new it2();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new kt4(fdc.a.getAccessor().d(79));
            case 25:
                return fdc.a.getAccessor().d(150);
            case 26:
                return new idc();
            case 27:
                return new mcc();
            case 28:
                yy7[] yy7VarArr5 = ChatScreen.l1;
                return new ds9();
            default:
                yy7[] yy7VarArr6 = ChatScreen.l1;
                return new fp8();
        }
    }
}
