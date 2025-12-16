package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzcp;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36879f5 extends AbstractC36847b1 {

    /* renamed from: c, reason: collision with root package name */
    public zzcp f355156c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f355157d;

    /* renamed from: e, reason: collision with root package name */
    public final C36942o5 f355158e;

    /* renamed from: f, reason: collision with root package name */
    public final C36928m5 f355159f;

    /* renamed from: g, reason: collision with root package name */
    public final C36886g5 f355160g;

    public C36879f5(I2 i22) {
        super(i22);
        this.f355157d = true;
        this.f355158e = new C36942o5(this);
        this.f355159f = new C36928m5(this);
        this.f355160g = new C36886g5(this);
    }

    public static void l(C36879f5 c36879f5, long j12) {
        super.e();
        c36879f5.o();
        S1 s1Zzj = super.zzj();
        s1Zzj.f354897n.c("Activity paused, time", Long.valueOf(j12));
        C36886g5 c36886g5 = c36879f5.f355160g;
        C36879f5 c36879f52 = c36886g5.f355175b;
        c36879f52.f355183a.f354722n.getClass();
        RunnableC36914k5 runnableC36914k5 = new RunnableC36914k5(c36886g5, System.currentTimeMillis(), j12);
        c36886g5.f355174a = runnableC36914k5;
        c36879f52.f355156c.postDelayed(runnableC36914k5, 2000L);
        if (c36879f5.f355183a.f354715g.t()) {
            c36879f5.f355159f.f355270c.a();
        }
    }

    public static void p(C36879f5 c36879f5, long j12) {
        super.e();
        c36879f5.o();
        S1 s1Zzj = super.zzj();
        s1Zzj.f354897n.c("Activity resumed, time", Long.valueOf(j12));
        I2 i22 = c36879f5.f355183a;
        boolean zO2 = i22.f354715g.o(null, E.f354575H0);
        C36880g c36880g = i22.f354715g;
        C36928m5 c36928m5 = c36879f5.f355159f;
        if (zO2) {
            if (c36880g.t() || c36879f5.f355157d) {
                c36928m5.f355271d.e();
                c36928m5.f355270c.a();
                c36928m5.f355268a = j12;
                c36928m5.f355269b = j12;
            }
        } else if (c36880g.t() || super.b().f355142t.b()) {
            c36928m5.f355271d.e();
            c36928m5.f355270c.a();
            c36928m5.f355268a = j12;
            c36928m5.f355269b = j12;
        }
        C36886g5 c36886g5 = c36879f5.f355160g;
        C36879f5 c36879f52 = c36886g5.f355175b;
        super.e();
        RunnableC36914k5 runnableC36914k5 = c36886g5.f355174a;
        if (runnableC36914k5 != null) {
            c36879f52.f355156c.removeCallbacks(runnableC36914k5);
        }
        super.b().f355142t.a(false);
        c36879f52.m(false);
        C36942o5 c36942o5 = c36879f5.f355158e;
        super.e();
        C36879f5 c36879f53 = c36942o5.f355298a;
        if (c36879f53.f355183a.e()) {
            c36879f53.f355183a.f354722n.getClass();
            c36942o5.b(System.currentTimeMillis());
        }
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36847b1
    public final boolean k() {
        return false;
    }

    @j.l0
    public final void m(boolean z12) {
        super.e();
        this.f355157d = z12;
    }

    @j.l0
    public final boolean n() {
        super.e();
        return this.f355157d;
    }

    @j.l0
    public final void o() {
        super.e();
        if (this.f355156c == null) {
            this.f355156c = new zzcp(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
