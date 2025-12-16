package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.C20199a;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.InterfaceC36753g;
import java.util.Iterator;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37005y extends C1 {

    /* renamed from: b, reason: collision with root package name */
    public final C20199a f355482b;

    /* renamed from: c, reason: collision with root package name */
    public final C20199a f355483c;

    /* renamed from: d, reason: collision with root package name */
    public long f355484d;

    public C37005y(I2 i22) {
        super(i22);
        this.f355483c = new C20199a();
        this.f355482b = new C20199a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(C37005y c37005y, String str, long j12) {
        super.e();
        C36729v.f(str);
        C20199a c20199a = c37005y.f355483c;
        if (c20199a.isEmpty()) {
            c37005y.f355484d = j12;
        }
        Integer num = (Integer) c20199a.get(str);
        if (num != null) {
            c20199a.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c20199a.f25790d >= 100) {
            super.zzj().f354892i.b("Too many ads visible");
        } else {
            c20199a.put(str, 1);
            c37005y.f355482b.put(str, Long.valueOf(j12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(C37005y c37005y, String str, long j12) {
        super.e();
        C36729v.f(str);
        C20199a c20199a = c37005y.f355483c;
        Integer num = (Integer) c20199a.get(str);
        if (num == null) {
            super.zzj().f354889f.c("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C36941o4 c36941o4L = super.g().l(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            c20199a.put(str, Integer.valueOf(iIntValue));
            return;
        }
        c20199a.remove(str);
        C20199a c20199a2 = c37005y.f355482b;
        Long l12 = (Long) c20199a2.get(str);
        if (l12 == null) {
            super.zzj().f354889f.b("First ad unit exposure time was never set");
        } else {
            long jLongValue = j12 - l12.longValue();
            c20199a2.remove(str);
            c37005y.m(str, jLongValue, c36941o4L);
        }
        if (c20199a.isEmpty()) {
            long j13 = c37005y.f355484d;
            if (j13 == 0) {
                super.zzj().f354889f.b("First ad exposure time was never set");
            } else {
                c37005y.j(j12 - j13, c36941o4L);
                c37005y.f355484d = 0L;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ C36876f2 b() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3
    @Pure
    public final /* bridge */ /* synthetic */ N5 c() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.C1, com.google.android.gms.measurement.internal.C36891h3
    public final /* bridge */ /* synthetic */ void e() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.l0
    public final void i(long j12) {
        C36941o4 c36941o4L = super.g().l(false);
        C20199a c20199a = this.f355482b;
        for (String str : c20199a.keySet()) {
            m(str, j12 - ((Long) c20199a.get(str)).longValue(), c36941o4L);
        }
        if (!c20199a.isEmpty()) {
            j(j12 - this.f355484d, c36941o4L);
        }
        n(j12);
    }

    @j.l0
    public final void j(long j12, C36941o4 c36941o4) {
        if (c36941o4 == null) {
            super.zzj().f354897n.b("Not logging ad exposure. No active activity");
            return;
        }
        if (j12 < 1000) {
            S1 s1Zzj = super.zzj();
            s1Zzj.f354897n.c("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j12));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j12);
            N5.G(c36941o4, bundle, true);
            super.f().c0("am", "_xa", bundle);
        }
    }

    public final void k(long j12, String str) {
        if (str == null || str.length() == 0) {
            super.zzj().f354889f.b("Ad unit id must be a non-empty string");
        } else {
            super.zzl().n(new RunnableC36838a(this, str, j12));
        }
    }

    @j.l0
    public final void m(String str, long j12, C36941o4 c36941o4) {
        if (c36941o4 == null) {
            super.zzj().f354897n.b("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j12 < 1000) {
            S1 s1Zzj = super.zzj();
            s1Zzj.f354897n.c("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j12));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j12);
            N5.G(c36941o4, bundle, true);
            super.f().c0("am", "_xu", bundle);
        }
    }

    @j.l0
    public final void n(long j12) {
        C20199a c20199a = this.f355482b;
        Iterator it = c20199a.keySet().iterator();
        while (it.hasNext()) {
            c20199a.put((String) it.next(), Long.valueOf(j12));
        }
        if (c20199a.isEmpty()) {
            return;
        }
        this.f355484d = j12;
    }

    public final void o(long j12, String str) {
        if (str == null || str.length() == 0) {
            super.zzj().f354889f.b("Ad unit id must be a non-empty string");
        } else {
            super.zzl().n(new A0(this, str, j12));
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
