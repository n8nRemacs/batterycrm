package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpn;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC36914k5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f355247b;

    /* renamed from: c, reason: collision with root package name */
    public final long f355248c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36886g5 f355249d;

    public RunnableC36914k5(C36886g5 c36886g5, long j12, long j13) {
        this.f355249d = c36886g5;
        this.f355247b = j12;
        this.f355248c = j13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f355249d.f355175b.zzl().n(new Runnable() { // from class: com.google.android.gms.measurement.internal.j5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC36914k5 runnableC36914k5 = this.f355220b;
                C36886g5 c36886g5 = runnableC36914k5.f355249d;
                c36886g5.f355175b.e();
                C36879f5 c36879f5 = c36886g5.f355175b;
                c36879f5.zzj().f354896m.b("Application going to the background");
                c36879f5.b().f355142t.a(true);
                c36879f5.m(true);
                I2 i22 = c36879f5.f355183a;
                if (!i22.f354715g.t()) {
                    long j12 = runnableC36914k5.f355248c;
                    C36928m5 c36928m5 = c36879f5.f355159f;
                    c36928m5.f355270c.a();
                    c36928m5.a(j12, false, false);
                }
                boolean zZza = zzpn.zza();
                long j13 = runnableC36914k5.f355247b;
                if (!zZza || !i22.f354715g.o(null, E.f354563B0)) {
                    c36879f5.f().E("auto", "_ab", new Bundle(), j13);
                    return;
                }
                S1 s1Zzj = c36879f5.zzj();
                s1Zzj.f354895l.c("Application backgrounded at: timestamp_millis", Long.valueOf(j13));
            }
        });
    }
}
