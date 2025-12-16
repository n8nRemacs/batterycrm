package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;

/* loaded from: classes.dex */
public final class f89 {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile f89 d;
    public a89 a;

    public static f89 a(Context context) {
        f89 f89Var;
        synchronized (c) {
            try {
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    f89 f89Var2 = new f89();
                    a89 a89Var = new a89();
                    a89Var.a = applicationContext;
                    a89Var.b = applicationContext.getContentResolver();
                    f89Var2.a = a89Var;
                    d = f89Var2;
                }
                f89Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f89Var;
    }

    public final boolean b(b89 b89Var) {
        a89 a89Var = this.a;
        e89 e89Var = b89Var.a;
        Context context = a89Var.a;
        int i = e89Var.b;
        String str = e89Var.a;
        int i2 = e89Var.c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i, i2) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                if (a89Var.a(e89Var, "android.permission.STATUS_BAR_SERVICE") || a89Var.a(e89Var, "android.permission.MEDIA_CONTENT_CONTROL") || i2 == 1000) {
                    return true;
                }
                String string = Settings.Secure.getString(a89Var.b, "enabled_notification_listeners");
                if (string != null) {
                    for (String str2 : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str2);
                        if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (a89.c) {
                Log.d("MediaSessionManager", "Package " + str + " doesn't exist");
            }
        }
        return false;
    }
}
