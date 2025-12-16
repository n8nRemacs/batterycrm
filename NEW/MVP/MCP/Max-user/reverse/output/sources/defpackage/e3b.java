package defpackage;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class e3b {
    public final Context a;
    public final xs b;
    public final xs c;
    public final xs d;
    public final bwf e;

    public e3b(Context context, lk4 lk4Var) {
        this.a = context;
        lk4Var.getClass();
        this.b = zri.a("ru.oneme.app.dialogs", "ru.oneme.app.chats", "ru.oneme.app.inapp.2");
        this.c = zri.a("ru.oneme.app.new.incomingCalls.", "ru.oneme.app.new.activeCalls");
        this.d = zri.a("ru.oneme.app.misc", "ru.oneme.app.fileUpload", "ru.oneme.app.media");
        this.e = new bwf(new fr7(25, this));
    }

    public final void a(int i, String str) {
        ((NotificationManager) this.e.getValue()).createNotificationChannelGroup(new NotificationChannelGroup(str, this.a.getString(i)));
    }

    public final String b(String str) {
        if (this.b.contains(str)) {
            return "ru.oneme.app.notifications.group.chats";
        }
        if (this.d.contains(str)) {
            return "ru.oneme.app.notifications.group.other";
        }
        if (this.c.contains(str)) {
            return "ru.oneme.app.notifications.group.calls";
        }
        return null;
    }
}
