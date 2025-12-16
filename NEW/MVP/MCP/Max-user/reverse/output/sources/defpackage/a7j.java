package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a7j {
    public static final StackTraceElement a(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static void c(Context context, lz9 lz9Var, boolean z) {
        ybj ybjVarE;
        int i;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences sharedPreferencesB = b(context);
            if (sharedPreferencesB.contains("proxy_retention") && sharedPreferencesB.getBoolean("proxy_retention", false) == z) {
                return;
            }
            fud fudVar = (fud) lz9Var.c;
            if (fudVar.c.h() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z);
                uaj uajVarE = uaj.e(fudVar.b);
                synchronized (uajVarE) {
                    i = uajVarE.b;
                    uajVarE.b = i + 1;
                }
                ybjVarE = uajVarE.f(new m6j(i, 4, bundle, 0));
            } else {
                ybjVarE = n5e.e(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            ybjVarE.d(new es(2), new zpc(0, context, z));
        }
    }
}
