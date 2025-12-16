package e11;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: e11.m0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39887m0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f394683a;

    @j.l0
    public static boolean a(@j.N Context context) {
        String str = null;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, androidx.appcompat.app.r.q(context.getPackageName(), "_mytarget_debug"));
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return String.valueOf((Object) 1).equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(@j.N android.content.Context r6) {
        /*
            boolean r0 = e11.C39909u.f394851a
            if (r0 != 0) goto L75
            boolean r0 = e11.C39887m0.f394683a
            if (r0 == 0) goto L9
            goto L75
        L9:
            r0 = 1
            e11.C39887m0.f394683a = r0
            java.lang.String r1 = "bluetooth_name"
            java.lang.String r2 = "debug_phone"
            android.content.ContentResolver r3 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = android.provider.Settings.Secure.getString(r3, r1)     // Catch: java.lang.Throwable -> L20
            boolean r4 = r2.equals(r4)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L20
        L1e:
            r1 = r0
            goto L37
        L20:
            java.lang.String r1 = android.provider.Settings.System.getString(r3, r1)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            goto L1e
        L2b:
            java.lang.String r1 = "device_name"
            java.lang.String r1 = android.provider.Settings.Global.getString(r3, r1)     // Catch: java.lang.Throwable -> L36
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r1 = 0
        L37:
            if (r1 == 0) goto L3c
            e11.C39909u.f394851a = r0     // Catch: java.lang.Throwable -> L75
            return
        L3c:
            java.lang.String r1 = "com.my.target.debugMode"
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = r6.getPackageName()     // Catch: java.lang.Throwable -> L59
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r4, r5)     // Catch: java.lang.Throwable -> L59
            android.os.Bundle r3 = r3.metaData     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r2.cast(r1)     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r1 = move-exception
            r1.getMessage()     // Catch: java.lang.Throwable -> L75
            r1 = 0
        L5e:
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L75
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L75
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L6d
            e11.C39909u.f394851a = r0     // Catch: java.lang.Throwable -> L75
            return
        L6d:
            boolean r6 = a(r6)     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L75
            e11.C39909u.f394851a = r0     // Catch: java.lang.Throwable -> L75
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39887m0.b(android.content.Context):void");
    }
}
