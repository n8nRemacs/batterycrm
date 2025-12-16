package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.UserManager;
import j.B;
import j.InterfaceC42155k;
import j.P;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public class zzge {

    /* renamed from: a, reason: collision with root package name */
    @B
    @P
    public static UserManager f350786a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f350787b = !zza();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r1 = false;
     */
    @android.annotation.TargetApi(com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
    @j.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r7) {
        /*
            boolean r0 = com.google.android.gms.internal.measurement.zzge.f350787b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<com.google.android.gms.internal.measurement.zzge> r0 = com.google.android.gms.internal.measurement.zzge.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.zzge.f350787b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L4b
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L40
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.zzge.f350786a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.zzge.f350786a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.zzge.f350786a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2a
            goto L45
        L2a:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r6 != 0) goto L41
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r7 != 0) goto L40
            goto L41
        L3b:
            com.google.android.gms.internal.measurement.zzge.f350786a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L40:
            r1 = r5
        L41:
            if (r1 == 0) goto L45
            com.google.android.gms.internal.measurement.zzge.f350786a = r4     // Catch: java.lang.Throwable -> Lf
        L45:
            if (r1 == 0) goto L49
            com.google.android.gms.internal.measurement.zzge.f350787b = r1     // Catch: java.lang.Throwable -> Lf
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzge.a(android.content.Context):boolean");
    }

    @InterfaceC42155k
    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return !zza() || a(context);
    }

    public static boolean zza(Context context) {
        return zza() && !a(context);
    }
}
