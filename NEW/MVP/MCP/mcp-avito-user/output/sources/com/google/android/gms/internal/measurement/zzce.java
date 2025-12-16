package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import j.P;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
@TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
/* loaded from: classes6.dex */
public final class zzce {

    /* renamed from: b, reason: collision with root package name */
    @P
    public static final Method f350603b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public static final Method f350604c;

    /* renamed from: a, reason: collision with root package name */
    public final JobScheduler f350605a;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            Log.isLoggable("JobSchedulerCompat", 6);
            declaredMethod = null;
        }
        f350603b = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            Log.isLoggable("JobSchedulerCompat", 6);
        }
        f350604c = declaredMethod2;
    }

    public zzce(JobScheduler jobScheduler) {
        this.f350605a = jobScheduler;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r0.getClass()
            java.lang.reflect.Method r1 = com.google.android.gms.internal.measurement.zzce.f350603b
            if (r1 == 0) goto L58
            java.lang.String r2 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r2)
            if (r5 == 0) goto L18
            goto L58
        L18:
            com.google.android.gms.internal.measurement.zzce r5 = new com.google.android.gms.internal.measurement.zzce
            r5.<init>(r0)
            r0 = 0
            java.lang.reflect.Method r2 = com.google.android.gms.internal.measurement.zzce.f350604c
            if (r2 == 0) goto L33
            java.lang.Class<android.os.UserHandle> r3 = android.os.UserHandle.class
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L33
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L33:
            r2 = r0
            goto L3c
        L35:
            java.lang.String r2 = "JobSchedulerCompat"
            r3 = 6
            android.util.Log.isLoggable(r2, r3)
            goto L33
        L3c:
            android.app.job.JobScheduler r5 = r5.f350605a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7, r2, r8}     // Catch: java.lang.Throwable -> L53
            java.lang.Object r7 = r1.invoke(r5, r7)     // Catch: java.lang.Throwable -> L53
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L57
            int r0 = r7.intValue()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            int r0 = r5.schedule(r6)
        L57:
            return r0
        L58:
            int r5 = r0.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzce.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
