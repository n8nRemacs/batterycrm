package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.c5i;
import defpackage.cei;
import defpackage.e42;
import defpackage.m48;
import defpackage.owf;
import defpackage.pwf;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends m48 {
    public static final String X = cei.m("SystemFgService");
    public Handler b;
    public boolean c;
    public pwf d;
    public NotificationManager o;

    public final void a() {
        this.b = new Handler(Looper.getMainLooper());
        this.o = (NotificationManager) getApplicationContext().getSystemService("notification");
        pwf pwfVar = new pwf(getApplicationContext());
        this.d = pwfVar;
        if (pwfVar.s0 != null) {
            cei.g().e(pwf.t0, "A callback already exists.");
        } else {
            pwfVar.s0 = this;
        }
    }

    @Override // defpackage.m48, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.m48, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.c;
        String str = X;
        if (z) {
            cei.g().i(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.d.g();
            a();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        pwf pwfVar = this.d;
        pwfVar.getClass();
        String str2 = pwf.t0;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            cei.g().i(str2, "Started foreground service " + intent);
            pwfVar.b.c(new owf(pwfVar, 0, intent.getStringExtra("KEY_WORKSPEC_ID")));
            pwfVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            pwfVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            cei.g().i(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = pwfVar.s0;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.c = true;
            cei.g().c(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        cei.g().i(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        c5i c5iVar = pwfVar.a;
        UUID uuidFromString = UUID.fromString(stringExtra);
        c5iVar.getClass();
        c5iVar.d.c(new e42(c5iVar, uuidFromString));
        return 3;
    }
}
