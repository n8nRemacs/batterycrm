package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import ru.ok.tamtam.android.services.NotificationTamService;

/* loaded from: classes.dex */
public final class x7b {
    public final Context a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public bna h;
    public NotificationManager i;
    public final String j;
    public final String k;

    public x7b(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = context;
        this.d = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.e = k18Var4;
        this.f = k18Var6;
        this.g = k18Var5;
        c();
        this.j = "https";
        this.k = "max.ru";
    }

    public final void a(int i) {
        ((q7b) this.d.getValue()).getClass();
        b(i, "CHAT_NOTIF");
    }

    public final void b(int i, String str) {
        Locale locale = Locale.ENGLISH;
        wqi.c("x7b", "cancel: notificationId = " + i + ", notificationTag = " + str, new Object[0]);
        i(true).b.cancel(str, i);
    }

    public final void c() {
        try {
            ((yka) this.e.getValue()).g();
        } catch (Throwable th) {
            ((y3b) ((yi5) this.f.getValue())).a(new IllegalStateException("fail to create missing channels", th));
        }
    }

    public final List d(String str) {
        try {
            if (this.i == null) {
                this.i = (NotificationManager) this.a.getSystemService("notification");
                c();
            }
            List listAsList = Arrays.asList(this.i.getActiveNotifications());
            if (l8g.c(str)) {
                return listAsList;
            }
            if (listAsList != null && listAsList.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAsList) {
                try {
                    if (str.equals(((StatusBarNotification) obj).getTag())) {
                        arrayList.add(obj);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public final w30 e(ps2 ps2Var, int i, int i2) {
        long j = ps2Var.a;
        String str = ps2Var.b;
        long j2 = ps2Var.c;
        long j3 = ps2Var.l;
        int i3 = NotificationTamService.v0;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.DIRECT_REPLY");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", j2);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", str);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", j3);
        PendingIntent service = PendingIntent.getService(context, i, intent, v4j.d(intent, v4j.a(134217728)));
        HashSet hashSet = new HashSet();
        pkd pkdVar = new pkd("ru.ok.tamtam.extra.TEXT_REPLY", context.getString(c5d.tt_reply), null, true, 0, new Bundle(), hashSet);
        w30 w30Var = new w30(i2, context.getString(c5d.tt_reply), service);
        w30Var.d = new ArrayList();
        ((ArrayList) w30Var.d).add(pkdVar);
        w30Var.c = 1;
        w30Var.b = false;
        return w30Var;
    }

    public final Intent f(boolean z) {
        ul8.c.getClass();
        Intent intentJ = j(ul8.M0(null, z));
        if (z) {
            intentJ.putExtra("push_action", "push_action_open_chats");
        }
        return intentJ;
    }

    public final w30 g(ps2 ps2Var, int i) {
        int i2 = ivd.d;
        long j = ps2Var.a;
        String str = ps2Var.b;
        long j2 = ps2Var.c;
        long j3 = ps2Var.m;
        long j4 = ps2Var.l;
        int i3 = NotificationTamService.v0;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.MARK_AS_READ");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", j2);
        intent.putExtra("ru.ok.tamtam.extra.MARK", j3);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", j);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", str);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", j4);
        w30 w30Var = new w30(i2, context.getString(c5d.tt_mark_as_read), PendingIntent.getService(context, i, intent, v4j.d(intent, v4j.a(201326592))));
        w30Var.c = 2;
        w30Var.b = false;
        return w30Var;
    }

    public final nla h(String str, boolean z, boolean z2) {
        boolean z3;
        String strN;
        Uri uri;
        c();
        nla nlaVar = new nla(this.a, str);
        k18 k18Var = this.d;
        ((q7b) k18Var.getValue()).getClass();
        nlaVar.F.icon = nxc.ic_notification;
        nlaVar.x = ((q7b) k18Var.getValue()).d();
        nlaVar.f(16, true);
        nlaVar.e = nla.c(((q7b) k18Var.getValue()).a.getString(u2d.oneme_app_name));
        nlaVar.z = str;
        sxg sxgVar = ((z7c) this.b.getValue()).c;
        k18 k18Var2 = this.c;
        if (((tih) k18Var2.getValue()).d()) {
            z3 = sxgVar.g.getBoolean("app.notification.in.app.vibrate", true);
            strN = sxgVar.g.getBoolean("app.notification.in.app.sound", true) ? sxgVar.n("app.notification.ringtone") : null;
        } else {
            z3 = sxgVar.g.getBoolean("app.notification.vibrate", true);
            strN = sxgVar.n("app.notification.ringtone");
        }
        int i = 0;
        boolean z4 = sxgVar.g.getBoolean("app.notification.important.priority", true) && !((tih) k18Var2.getValue()).d();
        int i2 = sxgVar.g.getInt("app.notification.led.color", sxgVar.l()[3]);
        if (z) {
            if (z3) {
                i = 2;
            } else {
                nlaVar.F.vibrate = new long[0];
            }
            if (strN == null || "_NONE_".equals(strN)) {
                nlaVar.h(null);
            } else {
                if ("DEFAULT".equals(strN)) {
                    ((q7b) k18Var.getValue()).getClass();
                    uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                } else {
                    uri = Uri.parse(strN);
                }
                nlaVar.h(uri);
            }
            nlaVar.e(i);
        }
        if (i2 != 0) {
            Notification notification = nlaVar.F;
            notification.ledARGB = i2;
            notification.ledOnMS = 1000;
            notification.ledOffMS = 1000;
            notification.flags = (notification.flags & (-2)) | 1;
        }
        if (z4) {
            nlaVar.k = 2;
        }
        nlaVar.u = z2;
        return nlaVar;
    }

    public final bna i(boolean z) {
        if (this.h == null) {
            this.h = new bna(this.a);
        }
        if (z) {
            c();
        }
        return this.h;
    }

    public final Intent j(ei4 ei4Var) {
        ul8.c.getClass();
        return ul8.P0(ei4Var, this.a, this.j, this.k);
    }

    public final void k(nla nlaVar, Intent intent, Intent intent2, int i, String str) {
        Context context = this.a;
        nlaVar.g = v4j.b(context, i, intent);
        if (intent2 != null) {
            nlaVar.F.deleteIntent = PendingIntent.getService(context, i, intent2, v4j.d(intent2, v4j.a(134217728)));
        }
        Notification notificationA = nlaVar.a();
        ((q7b) this.d.getValue()).e();
        i(true).a(str, i, notificationA);
        wqi.m("x7b", "notify: tag = %s, id = %d, %s", str, Integer.valueOf(i), notificationA);
    }
}
