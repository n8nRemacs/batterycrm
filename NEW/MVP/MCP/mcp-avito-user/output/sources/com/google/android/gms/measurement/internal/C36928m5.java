package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzoj;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36928m5 {

    /* renamed from: a, reason: collision with root package name */
    @j.k0
    public long f355268a;

    /* renamed from: b, reason: collision with root package name */
    @j.k0
    public long f355269b;

    /* renamed from: c, reason: collision with root package name */
    public final C36921l5 f355270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36879f5 f355271d;

    public C36928m5(C36879f5 c36879f5) {
        this.f355271d = c36879f5;
        this.f355270c = new C36921l5(this, c36879f5.f355183a);
        c36879f5.f355183a.f354722n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f355268a = jElapsedRealtime;
        this.f355269b = jElapsedRealtime;
    }

    @j.l0
    public final boolean a(long j12, boolean z12, boolean z13) {
        C36879f5 c36879f5 = this.f355271d;
        c36879f5.e();
        c36879f5.i();
        boolean zZza = zzoj.zza();
        I2 i22 = c36879f5.f355183a;
        if (!zZza || !i22.f354715g.o(null, E.f354630l0) || i22.e()) {
            C36876f2 c36876f2B = c36879f5.b();
            i22.f354722n.getClass();
            c36876f2B.f355139q.b(System.currentTimeMillis());
        }
        long j13 = j12 - this.f355268a;
        if (!z12 && j13 < 1000) {
            c36879f5.zzj().f354897n.c("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j13));
            return false;
        }
        if (!z13) {
            j13 = j12 - this.f355269b;
            this.f355269b = j12;
        }
        c36879f5.zzj().f354897n.c("Recording user engagement, ms", Long.valueOf(j13));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j13);
        N5.G(c36879f5.g().l(!i22.f354715g.t()), bundle, true);
        if (!z13) {
            c36879f5.f().c0("auto", "_e", bundle);
        }
        this.f355268a = j12;
        C36921l5 c36921l5 = this.f355270c;
        c36921l5.a();
        c36921l5.b(3600000L);
        return true;
    }
}
