package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class sxg extends c4 {
    public static int[] n;
    public final nm0 h;
    public final nm0 i;
    public final nm0 j;
    public final nm0 k;
    public final tcf l;
    public final WeakHashMap m;

    public sxg(Context context, bx5 bx5Var) {
        super(context, "app.prefs", bx5Var);
        this.h = nm0.t(Float.valueOf(this.g.getFloat("app.extra.text.size.sp", 0.0f)));
        this.i = nm0.t(Integer.valueOf(this.g.getInt("app.extra.text.size.mode", 1)));
        this.j = nm0.t(Integer.valueOf(m()));
        this.k = nm0.t(Integer.valueOf(k()));
        this.l = ucf.a(Boolean.valueOf(this.g.getBoolean("app.pinLock.screenshotEnabled", true)));
        this.m = new WeakHashMap(1);
    }

    public final nqd j() {
        String string = this.g.getString("app.calls.incoming.ringtone", null);
        lqd lqdVar = lqd.a;
        if (string != null) {
            try {
                if (!vmf.F(string) && !vmf.U(string, "default_", true)) {
                    if (vmf.U(string, "custom_", true)) {
                        return new kqd((vmf.U(string, "custom_", false) ? string.subSequence("custom_".length(), string.length()) : string.subSequence(0, string.length())).toString());
                    }
                    if (vmf.U(string, "system_", true)) {
                        return new mqd((vmf.U(string, "system_", false) ? string.subSequence("system_".length(), string.length()) : string.subSequence(0, string.length())).toString());
                    }
                }
            } catch (Exception e) {
                wqi.p(jqd.class.getName(), "can't load ringtone path from settings, use default instead", e);
            }
        }
        return lqdVar;
    }

    public final int k() {
        return this.g.getInt("app.notification.chats.show", 0);
    }

    public final int[] l() {
        if (n == null) {
            Context context = this.d;
            n = new int[]{context.getResources().getColor(pvc.led_1), context.getResources().getColor(pvc.led_2), context.getResources().getColor(pvc.led_3), context.getResources().getColor(pvc.led_4), context.getResources().getColor(pvc.led_5), context.getResources().getColor(pvc.led_6), context.getResources().getColor(pvc.led_7)};
        }
        return n;
    }

    public final int m() {
        return this.g.getInt("app.notification.dialogs.show", 0);
    }

    public final String n(String str) {
        String string = this.g.getString(str, "DEFAULT");
        return (string.equals("DEFAULT") || string.equals("_NONE_") || !string.equals(Settings.System.DEFAULT_NOTIFICATION_URI.toString())) ? string : "DEFAULT";
    }

    public final b2h o() {
        String string = this.g.getString("app.media.video.compress", null);
        return string == null ? b2h.OPTIMAL : b2h.valueOf(string);
    }

    public final boolean p() {
        return this.g.getBoolean("app.privacy.content.level.access", false);
    }

    public final boolean q() {
        return this.g.getBoolean("app.privacy.safe_mode", false);
    }

    public final void r(int i) {
        g(i, "app.notification.chats.show");
        if (i != 1) {
            g(i, "app.notification.chats.show.last");
        }
        this.k.f(Integer.valueOf(i));
    }

    public final void s(boolean z) {
        f("app.pinLock.screenshotEnabled", z);
        this.l.m(null, Boolean.valueOf(z));
    }

    public final void t(qxg qxgVar) {
        wqi.c("sxg", "updateUserSettings, settings = %s", qxgVar);
        Long l = qxgVar.b;
        if (l != null) {
            h(l.longValue(), "app.notification.dontDisturbUntil");
        }
        Boolean bool = qxgVar.a;
        if (bool != null) {
            f("app.notification.show.new.users", bool.booleanValue());
        }
        String str = qxgVar.c;
        int i = 2;
        if (str != null) {
            int i2 = !str.equals("OFF") ? !str.equals("REPLY") ? 0 : 2 : 1;
            g(i2, "app.notification.dialogs.show");
            this.j.f(Integer.valueOf(i2));
        }
        String str2 = qxgVar.d;
        if (str2 != null) {
            if (str2.equals("OFF")) {
                i = 1;
            } else if (!str2.equals("REPLY")) {
                i = 0;
            }
            r(i);
        }
        String str3 = qxgVar.e;
        if (str3 != null) {
            i("app.notification.ringtone", str3);
        }
        String str4 = qxgVar.f;
        if (str4 != null) {
            i("app.notification.dialogs.ringtone", str4);
        }
        String str5 = qxgVar.g;
        if (str5 != null) {
            i("app.notification.chats.ringtone", str5);
        }
        Integer num = qxgVar.i;
        if (num != null) {
            g(w4j.a(num.intValue()), "app.notification.led.color");
        }
        if (qxgVar.h != null) {
            f("app.privacy.online.show", !r0.booleanValue());
        }
        Integer num2 = qxgVar.j;
        if (num2 != null) {
            g(w4j.a(num2.intValue()), "app.notification.dialogs.led.color");
        }
        Integer num3 = qxgVar.k;
        if (num3 != null) {
            g(w4j.a(num3.intValue()), "app.notification.chats.led.color");
        }
        Boolean bool2 = qxgVar.l;
        if (bool2 != null) {
            f("app.notification.vibrate", bool2.booleanValue());
        }
        Boolean bool3 = qxgVar.m;
        if (bool3 != null) {
            f("app.notification.dialogs.vibrate", bool3.booleanValue());
        }
        Boolean bool4 = qxgVar.n;
        if (bool4 != null) {
            f("app.notification.chats.vibrate", bool4.booleanValue());
        }
        int i3 = qxgVar.p;
        if (i3 != 0) {
            i("app.privacy.incoming.call", xrf.i(i3));
        }
        int i4 = qxgVar.o;
        if (i4 != 0) {
            i("app.privacy.chats.invite", xrf.i(i4));
        }
        pxg pxgVar = qxgVar.q;
        if (pxgVar != null) {
            i("app.privacy.inactive.ttl", pxgVar.a);
        }
        int i5 = qxgVar.r;
        if (i5 != 0) {
            i("app.group.chat.call.notification.status", xrf.h(i5));
        }
        int i6 = qxgVar.s;
        if (i6 != 0) {
            i("app.suggest.stickers.status", xrf.j(i6));
        }
        Boolean bool5 = qxgVar.t;
        if (bool5 != null) {
            f("audio.transcription.enabled", bool5.booleanValue());
        }
        Boolean bool6 = qxgVar.u;
        if (bool6 != null) {
            f("app.privacy.safe_mode", bool6.booleanValue());
        }
        Boolean bool7 = qxgVar.v;
        if (bool7 != null) {
            f("app.privacy.safe_mode_no_pin", bool7.booleanValue());
        }
        int i7 = qxgVar.w;
        if (i7 != 0) {
            i("app.privacy.search_by_phone", xrf.i(i7));
        }
        Boolean bool8 = qxgVar.x;
        if (bool8 != null) {
            f("app.privacy.unsafe.files", bool8.booleanValue());
        }
        Boolean bool9 = qxgVar.y;
        if (bool9 != null) {
            f("app.privacy.content.level.access", bool9.booleanValue());
        }
    }
}
