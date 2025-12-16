package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC36699e;
import com.google.android.gms.common.internal.C36731x;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class K0 implements InterfaceC37022e {

    /* renamed from: b, reason: collision with root package name */
    public final C36646i f349023b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349024c;

    /* renamed from: d, reason: collision with root package name */
    public final C36628c f349025d;

    /* renamed from: e, reason: collision with root package name */
    public final long f349026e;

    /* renamed from: f, reason: collision with root package name */
    public final long f349027f;

    @j.k0
    public K0(C36646i c36646i, int i12, C36628c c36628c, long j12, long j13) {
        this.f349023b = c36646i;
        this.f349024c = i12;
        this.f349025d = c36628c;
        this.f349026e = j12;
        this.f349027f = j13;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[RETURN] */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration a(com.google.android.gms.common.api.internal.C36676w0 r4, com.google.android.gms.common.internal.AbstractC36699e r5, int r6) {
        /*
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r5 = r5.getTelemetryConfiguration()
            r0 = 0
            if (r5 == 0) goto L32
            boolean r1 = r5.f349307c
            if (r1 == 0) goto L32
            r1 = 0
            int[] r2 = r5.f349309e
            if (r2 != 0) goto L20
            int[] r2 = r5.f349311g
            if (r2 != 0) goto L15
            goto L27
        L15:
            int r3 = r2.length
            if (r1 >= r3) goto L27
            r3 = r2[r1]
            if (r3 != r6) goto L1d
            goto L32
        L1d:
            int r1 = r1 + 1
            goto L15
        L20:
            int r3 = r2.length
            if (r1 >= r3) goto L32
            r3 = r2[r1]
            if (r3 != r6) goto L2f
        L27:
            int r4 = r4.f349243y
            int r6 = r5.f349310f
            if (r4 >= r6) goto L2e
            return r5
        L2e:
            return r0
        L2f:
            int r1 = r1 + 1
            goto L20
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.K0.a(com.google.android.gms.common.api.internal.w0, com.google.android.gms.common.internal.e, int):com.google.android.gms.common.internal.ConnectionTelemetryConfiguration");
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    @j.l0
    public final void onComplete(@j.N Task task) {
        C36676w0 c36676w0;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iElapsedRealtime;
        long j12;
        long j13;
        C36646i c36646i = this.f349023b;
        if (c36646i.c()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = C36731x.a().f349476a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.f349370c) && (c36676w0 = (C36676w0) c36646i.f349130k.get(this.f349025d)) != null) {
                Object obj = c36676w0.f349233b;
                if (obj instanceof AbstractC36699e) {
                    AbstractC36699e abstractC36699e = (AbstractC36699e) obj;
                    long j14 = this.f349026e;
                    boolean z12 = j14 > 0;
                    int gCoreServiceId = abstractC36699e.getGCoreServiceId();
                    if (rootTelemetryConfiguration != null) {
                        z12 &= rootTelemetryConfiguration.f349371d;
                        boolean zHasConnectionInfo = abstractC36699e.hasConnectionInfo();
                        i12 = rootTelemetryConfiguration.f349372e;
                        int i18 = rootTelemetryConfiguration.f349369b;
                        if (!zHasConnectionInfo || abstractC36699e.isConnecting()) {
                            i14 = rootTelemetryConfiguration.f349373f;
                            i13 = i18;
                        } else {
                            ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(c36676w0, abstractC36699e, this.f349024c);
                            if (connectionTelemetryConfigurationA == null) {
                                return;
                            }
                            boolean z13 = connectionTelemetryConfigurationA.f349308d && j14 > 0;
                            i14 = connectionTelemetryConfigurationA.f349310f;
                            i13 = i18;
                            z12 = z13;
                        }
                    } else {
                        i12 = 5000;
                        i13 = 0;
                        i14 = 100;
                    }
                    int i19 = i12;
                    if (task.r()) {
                        i16 = 0;
                        i17 = 0;
                    } else if (task.p()) {
                        i16 = -1;
                        i17 = 100;
                    } else {
                        Exception excM = task.m();
                        if (excM instanceof ApiException) {
                            Status status = ((ApiException) excM).f348894b;
                            i15 = status.f348905b;
                            ConnectionResult connectionResult = status.f348908e;
                            if (connectionResult != null) {
                                i16 = connectionResult.f348860c;
                            }
                            i17 = i15;
                        } else {
                            i15 = UpdateStatusCode.DialogButton.CONFIRM;
                        }
                        i16 = -1;
                        i17 = i15;
                    }
                    if (z12) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f349027f);
                        j12 = j14;
                        j13 = jCurrentTimeMillis;
                    } else {
                        iElapsedRealtime = -1;
                        j12 = 0;
                        j13 = 0;
                    }
                    L0 l02 = new L0(new MethodInvocation(this.f349024c, i17, i16, j12, j13, null, null, gCoreServiceId, iElapsedRealtime), i13, i19, i14);
                    zau zauVar = c36646i.f349134o;
                    zauVar.sendMessage(zauVar.obtainMessage(18, l02));
                }
            }
        }
    }
}
