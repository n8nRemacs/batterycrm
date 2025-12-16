package com.google.android.gms.internal.measurement;

import com.google.common.base.H;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzgt {

    /* renamed from: a, reason: collision with root package name */
    public static volatile H<Boolean> f350807a = H.a();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f350808b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(1:20)(8:21|(1:23)(1:24)|25|(0)|34|35|36|37)|29|42|30|31|(1:33)|34|35|36|37) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r6 = r6.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r6 = r0.equals(r6)
            r0 = 0
            if (r6 != 0) goto Le
            return r0
        Le:
            com.google.common.base.H<java.lang.Boolean> r6 = com.google.android.gms.internal.measurement.zzgt.f350807a
            boolean r6 = r6.c()
            if (r6 == 0) goto L23
            com.google.common.base.H<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzgt.f350807a
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L23:
            java.lang.Object r6 = com.google.android.gms.internal.measurement.zzgt.f350808b
            monitor-enter(r6)
            com.google.common.base.H<java.lang.Boolean> r1 = com.google.android.gms.internal.measurement.zzgt.f350807a     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3e
            com.google.common.base.H<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzgt.f350807a     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3c
            return r5
        L3c:
            r5 = move-exception
            goto L94
        L3e:
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L4b
            goto L6b
        L4b:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3c
            r4 = 29
            if (r3 >= r4) goto L59
            r3 = r0
            goto L5b
        L59:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L5b:
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L7c
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L7c
        L6b:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r1, r0)     // Catch: java.lang.Throwable -> L3c android.content.pm.PackageManager.NameNotFoundException -> L7c
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L3c
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L7c
            r0 = 1
        L7c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3c
            com.google.common.base.H r5 = com.google.common.base.H.d(r5)     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.measurement.zzgt.f350807a = r5     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3c
            com.google.common.base.H<java.lang.Boolean> r5 = com.google.android.gms.internal.measurement.zzgt.f350807a
            java.lang.Object r5 = r5.b()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L94:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgt.zza(android.content.Context, android.net.Uri):boolean");
    }
}
