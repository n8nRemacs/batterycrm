package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamite.DynamiteModule;
import j.B;
import j.N;
import j.P;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import ru.cyberity.cbr.core.CBRMobileSDK$SDK$1$1;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C36688g f355592a = C36688g.f349289b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f355593b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @B
    public static Method f355594c;

    /* renamed from: d, reason: collision with root package name */
    @B
    public static Method f355595d;

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* renamed from: com.google.android.gms.security.a$a, reason: collision with other inner class name */
    public interface InterfaceC10635a {
        void onProviderInstallFailed(int i12, @P Intent intent);

        void onProviderInstalled();
    }

    public static void a(@N Context context) {
        Context context2;
        Context contextCreatePackageContext;
        f355592a.getClass();
        C36688g.d(context);
        synchronized (f355593b) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.c(context, DynamiteModule.f349664e, "com.google.android.gms.providerinstaller.dynamite").f349675a;
            } catch (DynamiteModule.LoadingException e12) {
                "Failed to load providerinstaller module: ".concat(String.valueOf(e12.getMessage()));
                context2 = null;
            }
            if (context2 != null) {
                c(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext != null) {
                try {
                    if (f355595d == null) {
                        Class cls = Long.TYPE;
                        f355595d = contextCreatePackageContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                    }
                    f355595d.invoke(null, context, Long.valueOf(jElapsedRealtime), Long.valueOf(jElapsedRealtime2));
                } catch (Exception e13) {
                    "Failed to report request stats: ".concat(String.valueOf(e13.getMessage()));
                }
            }
            if (contextCreatePackageContext == null) {
                throw new GooglePlayServicesNotAvailableException(8);
            }
            c(contextCreatePackageContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
        }
    }

    public static void b(@N Context context, @N CBRMobileSDK$SDK$1$1 cBRMobileSDK$SDK$1$1) {
        C36729v.e("Must be called on the UI thread");
        new b(context, cBRMobileSDK$SDK$1$1).execute(new Void[0]);
    }

    @B
    public static void c(Context context, String str) throws IllegalAccessException, GooglePlayServicesNotAvailableException, IllegalArgumentException, InvocationTargetException {
        try {
            if (f355594c == null) {
                f355594c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f355594c.invoke(null, context);
        } catch (Exception e12) {
            Throwable cause = e12.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                "Failed to install provider: ".concat(String.valueOf(cause == null ? e12.getMessage() : cause.getMessage()));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
