package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcv;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class V3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcv f354948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C36967s3 f354949c;

    public V3(C36967s3 c36967s3, zzcv zzcvVar) {
        this.f354948b = zzcvVar;
        this.f354949c = c36967s3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.s3 r0 = r8.f354949c
            com.google.android.gms.measurement.internal.f5 r1 = r0.h()
            boolean r2 = com.google.android.gms.internal.measurement.zzpo.zza()
            r3 = 0
            if (r2 == 0) goto L69
            com.google.android.gms.measurement.internal.I2 r2 = r1.f355183a
            com.google.android.gms.measurement.internal.g r4 = r2.f354715g
            com.google.android.gms.measurement.internal.J1<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.E.f354650v0
            boolean r4 = r4.o(r3, r5)
            if (r4 == 0) goto L69
            com.google.android.gms.measurement.internal.f2 r4 = r1.b()
            com.google.android.gms.measurement.internal.zzif r4 = r4.o()
            com.google.android.gms.measurement.internal.zzif$zza r5 = com.google.android.gms.measurement.internal.zzif.zza.ANALYTICS_STORAGE
            boolean r4 = r4.e(r5)
            if (r4 != 0) goto L36
            com.google.android.gms.measurement.internal.S1 r1 = r1.zzj()
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            com.google.android.gms.measurement.internal.U1 r1 = r1.f354894k
            r1.b(r2)
        L34:
            r1 = r3
            goto L75
        L36:
            com.google.android.gms.measurement.internal.f2 r4 = r1.b()
            com.google.android.gms.common.util.k r2 = r2.f354722n
            r2.getClass()
            long r5 = java.lang.System.currentTimeMillis()
            boolean r2 = r4.j(r5)
            if (r2 != 0) goto L34
            com.google.android.gms.measurement.internal.f2 r2 = r1.b()
            com.google.android.gms.measurement.internal.k2 r2 = r2.f355140r
            long r4 = r2.a()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L5a
            goto L34
        L5a:
            com.google.android.gms.measurement.internal.f2 r1 = r1.b()
            com.google.android.gms.measurement.internal.k2 r1 = r1.f355140r
            long r1 = r1.a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L75
        L69:
            com.google.android.gms.measurement.internal.S1 r1 = r1.zzj()
            java.lang.String r2 = "getSessionId has been disabled."
            com.google.android.gms.measurement.internal.U1 r1 = r1.f354894k
            r1.b(r2)
            goto L34
        L75:
            com.google.android.gms.measurement.internal.I2 r0 = r0.f355183a
            com.google.android.gms.internal.measurement.zzcv r2 = r8.f354948b
            if (r1 == 0) goto L88
            com.google.android.gms.measurement.internal.N5 r0 = r0.f354720l
            com.google.android.gms.measurement.internal.I2.d(r0)
            long r3 = r1.longValue()
            r0.A(r2, r3)
            return
        L88:
            r2.zza(r3)     // Catch: android.os.RemoteException -> L8c
            return
        L8c:
            r1 = move-exception
            com.google.android.gms.measurement.internal.S1 r0 = r0.f354717i
            com.google.android.gms.measurement.internal.I2.c(r0)
            java.lang.String r2 = "getSessionId failed with exception"
            com.google.android.gms.measurement.internal.U1 r0 = r0.f354889f
            r0.c(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.V3.run():void");
    }
}
