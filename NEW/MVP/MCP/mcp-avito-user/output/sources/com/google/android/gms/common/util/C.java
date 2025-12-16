package com.google.android.gms.common.util;

import aY0.C19842b;
import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C36690i;
import com.google.android.gms.common.C36734j;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public final class C {
    @RX0.a
    public static boolean a(int i12, @N Context context) throws PackageManager.NameNotFoundException {
        if (b(context, i12, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C36734j c36734jA = C36734j.a(context);
                c36734jA.getClass();
                if (packageInfo == null) {
                    return false;
                }
                return C36734j.d(packageInfo, false) || (C36734j.d(packageInfo, true) && C36690i.a(c36734jA.f349499a));
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("UidVerifier", 3);
            }
        }
        return false;
    }

    @RX0.a
    @TargetApi(19)
    public static boolean b(@N Context context, int i12, @N String str) {
        C19842b c19842bA = aY0.c.a(context);
        c19842bA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) c19842bA.f20921a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i12, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
