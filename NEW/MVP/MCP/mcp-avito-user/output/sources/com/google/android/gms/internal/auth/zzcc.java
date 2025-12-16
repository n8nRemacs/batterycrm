package com.google.android.gms.internal.auth;

import android.os.UserManager;
import j.B;
import j.InterfaceC42155k;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzcc {

    /* renamed from: a, reason: collision with root package name */
    @B
    public static UserManager f350035a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f350036b = !zzb();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, NullPointerException -> 0x0045, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:34:0x0050, B:35:0x0052, B:24:0x0031, B:26:0x0037, B:32:0x004c, B:30:0x0045), top: B:41:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(android.content.Context r7) {
        /*
            boolean r0 = zzb()
            r1 = 0
            if (r0 == 0) goto L58
            boolean r0 = com.google.android.gms.internal.auth.zzcc.f350036b
            if (r0 == 0) goto Lc
            goto L58
        Lc:
            java.lang.Class<com.google.android.gms.internal.auth.zzcc> r0 = com.google.android.gms.internal.auth.zzcc.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.auth.zzcc.f350036b     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            goto L58
        L15:
            r7 = move-exception
            goto L56
        L17:
            r2 = 1
            r3 = r2
        L19:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L43
            android.os.UserManager r4 = com.google.android.gms.internal.auth.zzcc.f350035a     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L2b
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = r7.getSystemService(r4)     // Catch: java.lang.Throwable -> L15
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L15
            com.google.android.gms.internal.auth.zzcc.f350035a = r4     // Catch: java.lang.Throwable -> L15
        L2b:
            android.os.UserManager r4 = com.google.android.gms.internal.auth.zzcc.f350035a     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L31
            r7 = r2
            goto L4e
        L31:
            boolean r6 = r4.isUserUnlocked()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            if (r6 != 0) goto L41
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            boolean r7 = r4.isUserRunning(r6)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            if (r7 != 0) goto L43
        L41:
            r7 = r2
            goto L4a
        L43:
            r7 = r1
            goto L4a
        L45:
            com.google.android.gms.internal.auth.zzcc.f350035a = r5     // Catch: java.lang.Throwable -> L15
            int r3 = r3 + 1
            goto L19
        L4a:
            if (r7 == 0) goto L4e
            com.google.android.gms.internal.auth.zzcc.f350035a = r5     // Catch: java.lang.Throwable -> L15
        L4e:
            if (r7 == 0) goto L52
            com.google.android.gms.internal.auth.zzcc.f350036b = r2     // Catch: java.lang.Throwable -> L15
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            if (r7 != 0) goto L58
            return r2
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r7
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcc.zza(android.content.Context):boolean");
    }

    @InterfaceC42155k
    public static boolean zzb() {
        return true;
    }
}
