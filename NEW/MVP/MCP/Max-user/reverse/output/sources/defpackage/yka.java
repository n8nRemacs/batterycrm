package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class yka {
    public final Context a;
    public final q7b b;
    public final lk4 c;
    public final e3b d;
    public final z7c e;
    public NotificationManager f;

    public yka(Context context, q7b q7bVar, lk4 lk4Var, e3b e3bVar, z7c z7cVar) {
        this.a = context;
        this.b = q7bVar;
        this.c = lk4Var;
        this.d = e3bVar;
        this.e = z7cVar;
    }

    public final xka a() {
        this.c.getClass();
        return new xka("ru.oneme.app.new.activeCalls", this.a.getString(c5d.tt_notif_category_active_calls), false, false, null, false, null, false, 2, false, false);
    }

    public final xka b() {
        this.c.getClass();
        return new xka("ru.oneme.app.new.incomingCalls.", this.a.getString(c5d.tt_notif_category_incoming_calls), false, this.e.c.g.getBoolean("app.notification.vibrate", true), null, true, null, true, -1000, false, true);
    }

    public final xka c() {
        z7c z7cVar = this.e;
        boolean z = !z7cVar.c.n("app.notification.chats.ringtone").equals("_NONE_");
        Uri uriI = i(false);
        this.c.getClass();
        String string = this.a.getString(c5d.tt_notif_category_chats);
        sxg sxgVar = z7cVar.c;
        return new xka("ru.oneme.app.chats", string, z, sxgVar.g.getBoolean("app.notification.chats.vibrate", true), uriI, sxgVar.g.getBoolean("app.notification.important.priority", true), null, false, -1000, true, false);
    }

    public final xka d() {
        z7c z7cVar = this.e;
        boolean z = !z7cVar.c.n("app.notification.ringtone").equals("_NONE_");
        Uri uriI = i(true);
        this.c.getClass();
        String string = this.a.getString(c5d.tt_notif_category_dialogs);
        sxg sxgVar = z7cVar.c;
        return new xka("ru.oneme.app.dialogs", string, z, sxgVar.g.getBoolean("app.notification.vibrate", true), uriI, sxgVar.g.getBoolean("app.notification.important.priority", true), null, false, -1000, true, false);
    }

    public final xka e() {
        this.b.getClass();
        this.c.getClass();
        return new xka("ru.oneme.app.inapp.2", this.a.getString(c5d.tt_notif_category_inapp), true, this.e.c.g.getBoolean("app.notification.in.app.vibrate", true), null, false, new long[]{0, 100}, false, -1000, true, false);
    }

    public final void f(xka xkaVar) {
        StringBuilder sb = new StringBuilder("createChannel: ");
        String str = xkaVar.a;
        sb.append(str);
        wqi.c("yka", sb.toString(), new Object[0]);
        int i = xkaVar.c ? xkaVar.f ? 4 : 3 : 2;
        if (xkaVar.h) {
            i = 5;
        }
        int i2 = xkaVar.i;
        if (i2 != -1000) {
            i = i2;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, xkaVar.b, i);
        Uri uri = xkaVar.e;
        if (uri != null) {
            this.c.getClass();
            notificationChannel.setSound(uri, new AudioAttributes.Builder().setContentType(4).setUsage(str.equals("ru.oneme.app.new.incomingCalls.") ? 6 : 5).build());
        } else {
            notificationChannel.setSound(null, null);
        }
        notificationChannel.enableVibration(xkaVar.d);
        long[] jArr = xkaVar.g;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(this.b.d());
        String strB = this.d.b(str);
        if (strB != null) {
            notificationChannel.setGroup(strB);
        }
        notificationChannel.setShowBadge(xkaVar.j);
        notificationChannel.setBypassDnd(xkaVar.k);
        j().createNotificationChannel(notificationChannel);
    }

    public final void g() {
        e3b e3bVar = this.d;
        List<NotificationChannelGroup> notificationChannelGroups = ((NotificationManager) e3bVar.e.getValue()).getNotificationChannelGroups();
        if (notificationChannelGroups != null) {
            xs xsVar = new xs(0);
            Iterator<T> it = notificationChannelGroups.iterator();
            while (it.hasNext()) {
                xsVar.add(((NotificationChannelGroup) it.next()).getId());
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.chats")) {
                e3bVar.a(fvd.G, "ru.oneme.app.notifications.group.chats");
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.other")) {
                e3bVar.a(fvd.H, "ru.oneme.app.notifications.group.other");
            }
            if (!xsVar.contains("ru.oneme.app.notifications.group.calls")) {
                e3bVar.a(fvd.F, "ru.oneme.app.notifications.group.calls");
            }
        }
        List<NotificationChannel> notificationChannels = j().getNotificationChannels();
        HashSet hashSet = new HashSet();
        Iterator<NotificationChannel> it2 = notificationChannels.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getId());
        }
        this.c.getClass();
        if (!hashSet.contains("ru.oneme.app.chats")) {
            f(c());
            hashSet.add("ru.oneme.app.chats");
        }
        if (!hashSet.contains("ru.oneme.app.dialogs")) {
            f(d());
            hashSet.add("ru.oneme.app.dialogs");
        }
        boolean zContains = hashSet.contains("ru.oneme.app.misc");
        Context context = this.a;
        if (!zContains) {
            f(new xka("ru.oneme.app.misc", context.getString(c5d.tt_notif_category_misc), !r3.c.n("app.notification.ringtone").equals("_NONE_"), this.e.c.g.getBoolean("app.notification.vibrate", true), i(true), false, null, false, -1000, false, false));
            hashSet.add("ru.oneme.app.misc");
        }
        if (!hashSet.contains("ru.oneme.app.inapp.2")) {
            f(e());
            hashSet.add("ru.oneme.app.inapp.2");
        }
        if (!hashSet.contains("ru.oneme.app.fileUpload")) {
            f(new xka("ru.oneme.app.fileUpload", context.getString(c5d.tt_notif_category_file_loading), false, false, null, false, null, false, -1000, false, false));
            hashSet.add("ru.oneme.app.fileUpload");
        }
        if (!hashSet.contains("ru.oneme.app.media")) {
            f(new xka("ru.oneme.app.media", context.getString(c5d.tt_notif_category_media), true, false, null, false, null, false, -1000, false, false));
            hashSet.add("ru.oneme.app.media");
        }
        if (hashSet.contains("ru.oneme.app.incomingCalls")) {
            try {
                j().deleteNotificationChannel("ru.oneme.app.incomingCalls");
            } catch (Throwable unused) {
            }
        }
        if (hashSet.contains("ru.oneme.app.activeCalls")) {
            try {
                j().deleteNotificationChannel("ru.oneme.app.activeCalls");
            } catch (Throwable unused2) {
            }
        }
        if (!hashSet.contains("ru.oneme.app.new.incomingCalls.")) {
            f(b());
            hashSet.add("ru.oneme.app.new.incomingCalls.");
        }
        if (!hashSet.contains("ru.oneme.app.new.activeCalls")) {
            f(a());
            hashSet.add("ru.oneme.app.new.activeCalls");
        }
        if (hashSet.contains("ru.oneme.app.liveLocation")) {
            return;
        }
        f(new xka("ru.oneme.app.liveLocation", context.getString(c5d.tt_notif_category_live_location), false, false, null, false, null, false, -1000, false, false));
        hashSet.add("ru.oneme.app.liveLocation");
    }

    public final NotificationChannel h(String str) {
        if (l8g.c(str)) {
            return null;
        }
        for (NotificationChannel notificationChannel : j().getNotificationChannels()) {
            if (str.equals(notificationChannel.getId())) {
                return notificationChannel;
            }
        }
        return null;
    }

    public final Uri i(boolean z) {
        z7c z7cVar = this.e;
        String strN = z ? z7cVar.c.n("app.notification.ringtone") : z7cVar.c.n("app.notification.chats.ringtone");
        if (!"DEFAULT".equals(strN)) {
            return Uri.parse(strN);
        }
        this.b.getClass();
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final NotificationManager j() {
        if (this.f == null) {
            this.f = (NotificationManager) this.a.getSystemService("notification");
        }
        return this.f;
    }

    public final boolean k() {
        this.c.getClass();
        NotificationChannel notificationChannelH = h("ru.oneme.app.new.activeCalls");
        xka xkaVarA = a();
        if (notificationChannelH == null) {
            f(xkaVarA);
            return true;
        }
        if (notificationChannelH.getSound() == null && !notificationChannelH.shouldVibrate() && notificationChannelH.getAudioAttributes() == null && notificationChannelH.getImportance() == 2) {
            return false;
        }
        j().deleteNotificationChannel("ru.oneme.app.new.activeCalls");
        f(xkaVarA);
        return true;
    }

    public final boolean l() {
        this.c.getClass();
        NotificationChannel notificationChannelH = h("ru.oneme.app.new.incomingCalls.");
        xka xkaVarB = b();
        if (notificationChannelH == null) {
            f(xkaVarB);
            return true;
        }
        if (notificationChannelH.getSound() == null && !notificationChannelH.shouldVibrate() && notificationChannelH.getAudioAttributes() == null && notificationChannelH.getImportance() >= 4 && notificationChannelH.canBypassDnd()) {
            return false;
        }
        j().deleteNotificationChannel("ru.oneme.app.new.incomingCalls.");
        f(xkaVarB);
        return true;
    }
}
