package defpackage;

import android.graphics.Paint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.location.map.pick.PickLocationScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class zfb implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ zfb(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                return new LinearInterpolator();
            case 1:
                return new LinearInterpolator();
            case 2:
                l8d l8dVar = new l8d();
                l8dVar.a = new ThreadLocal();
                l8dVar.b = new ThreadLocal();
                return l8dVar;
            case 3:
                HandlerThread handlerThread = new HandlerThread("ov-playback-thread", -16);
                handlerThread.start();
                return handlerThread;
            case 4:
                return ((HandlerThread) vgb.Q.getValue()).getLooper();
            case 5:
                return new Handler(Looper.getMainLooper());
            case 6:
                yy7[] yy7VarArr = OtherNotificationsSettingsScreen.X;
                return new tjb();
            case 7:
                return new Paint(1);
            case 8:
                yy7[] yy7VarArr2 = PickChatMembers.x0;
                return f1e.CREATE_CHAT_MEMBERS_PICKER;
            case 9:
                yy7[] yy7VarArr3 = PickLocationScreen.v0;
                return new gwb();
            case 10:
                yy7[] yy7VarArr4 = PickSubscribersScreen.z0;
                return paf.a.a();
            case 11:
                return new c2f(false);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new c2f(true);
            case 13:
                yy7[] yy7VarArr5 = PickerChatsListWidget.A0;
                return Boolean.FALSE;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr6 = PickerChatsTabWidget.x0;
                k18 k18Var = x4e.w;
                y4e y4eVar = y4e.a;
                return new fyb(k18Var, (c5b) e03.a.getAccessor().c(561), y4eVar.j(), (g5b) y4eVar.getAccessor().c(421));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr7 = PickerContactsListWidget.y0;
                return new zh0(bi0.a.getAccessor().d(549), true, null, 46);
            case 16:
                int i2 = PinBarsWidget.u0;
                return new ozb(null, null, 1);
            case LangUtils.HASH_SEED /* 17 */:
                int i3 = j0c.M0;
                return qqgVar;
            case 18:
                int i4 = xz7.a;
                return Boolean.valueOf(xz7.b(xz7.c));
            case 19:
                return new x4h(e51.a.getAccessor().d(15));
            case 20:
                yy7[] yy7VarArr8 = PipScreen.o;
                return vye.a;
            case 21:
                return PmsKey.keys_delegate$lambda$1();
            case 22:
                int i5 = o6c.v0;
                return qqgVar;
            case 23:
                return qqgVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new fx0(fdc.a.c());
            case 25:
                fdc fdcVar = fdc.a;
                return new a9e(fdcVar.getAccessor().d(HttpStatus.SC_GONE), fdcVar.getAccessor().d(481), fdcVar.c(), fdcVar.getAccessor().d(47), fdcVar.f());
            case 26:
                return new pq3(v8b.z, new n5g(mvd.p), 3, 56);
            case 27:
                return new sza(v8b.L0, Integer.valueOf(x8b.q), (Integer) null, Integer.valueOf(yud.c), (Integer) null, 52);
            case 28:
                return new b44(v8b.v0, new n5g(x8b.Y1), Integer.valueOf(w9b.V), Integer.valueOf(yud.x), Integer.valueOf(w9b.Q));
            default:
                o98 o98VarD = ve3.d();
                o98VarD.add(new b44(v8b.g1, new n5g(x8b.C2), Integer.valueOf(yud.x1), (Integer) null, 20));
                o98VarD.add(new b44(v8b.f1, new n5g(x8b.B2), Integer.valueOf(yud.i2), (Integer) null, 20));
                o98VarD.add(new b44(v8b.h1, new n5g(x8b.D2), Integer.valueOf(yud.w1), (Integer) null, 20));
                o98VarD.add(new b44(v8b.e1, new n5g(x8b.A2), Integer.valueOf(yud.r), (Integer) null, 20));
                return ve3.a(o98VarD);
        }
    }
}
