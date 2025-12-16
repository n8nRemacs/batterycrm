package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import one.me.android.calls.CallNotifierBroadcastReceiver;

/* loaded from: classes.dex */
public final class id1 {
    public final k18 a;
    public final k18 b;

    public id1(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public static void a(Intent intent, n41 n41Var, boolean z) {
        intent.setAction("action-open-incoming");
        CharSequence charSequence = n41Var.c;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        intent.putExtra("incoming_param_name", string);
        String str = n41Var.d;
        intent.putExtra("incoming_param_avatar", str != null ? Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0) : null);
        Long l = n41Var.a;
        intent.putExtra("incoming_param_chat_id", l != null ? l.longValue() : 0L);
        intent.putExtra("incoming_param_is_video", z);
        intent.setFlags(268435456);
    }

    public final Application b() {
        return (Application) this.a.getValue();
    }

    public final PendingIntent c() {
        if (((gu5) ((rt5) this.b.getValue())).q()) {
            Intent intent = new Intent();
            intent.setAction("action-microphone-state");
            intent.setPackage(b().getPackageName());
            return PendingIntent.getBroadcast(b().getApplicationContext(), 0, intent, 201326592);
        }
        Application applicationB = b();
        Intent intent2 = new Intent(applicationB, (Class<?>) CallNotifierBroadcastReceiver.class);
        intent2.setAction("action-microphone-state");
        intent2.setPackage(b().getPackageName());
        return PendingIntent.getBroadcast(applicationB, 0, intent2, 201326592);
    }
}
