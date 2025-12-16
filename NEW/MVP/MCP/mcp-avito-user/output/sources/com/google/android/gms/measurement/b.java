package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.C36967s3;
import com.google.android.gms.measurement.internal.C37005y;
import com.google.android.gms.measurement.internal.I2;
import com.google.android.gms.measurement.internal.N5;
import j.N;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class b extends AppMeasurement.c {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f354503a;

    /* renamed from: b, reason: collision with root package name */
    public final C36967s3 f354504b;

    public b(@N I2 i22) {
        super();
        C36729v.j(i22);
        this.f354503a = i22;
        C36967s3 c36967s3 = i22.f354724p;
        I2.b(c36967s3);
        this.f354504b = c36967s3;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void a(String str, String str2, Bundle bundle) {
        C36967s3 c36967s3 = this.f354503a.f354724p;
        I2.b(c36967s3);
        c36967s3.D(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final List<Bundle> b(String str, String str2) {
        return this.f354504b.l(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void c(String str, String str2, Bundle bundle) {
        this.f354504b.b0(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final Map<String, Object> d(String str, String str2, boolean z12) {
        return this.f354504b.m(str, str2, z12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final int zza(String str) {
        C36729v.f(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zzb(String str) {
        I2 i22 = this.f354503a;
        C37005y c37005yI = i22.i();
        i22.f354722n.getClass();
        c37005yI.k(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zzc(String str) {
        I2 i22 = this.f354503a;
        C37005y c37005yI = i22.i();
        i22.f354722n.getClass();
        c37005yI.o(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final String zzf() {
        return this.f354504b.f355366g.get();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final String zzg() {
        return this.f354504b.N();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final String zzh() {
        return this.f354504b.O();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final String zzi() {
        return this.f354504b.f355366g.get();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zza(Bundle bundle) {
        this.f354504b.Z(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final long zza() {
        N5 n52 = this.f354503a.f354720l;
        I2.d(n52);
        return n52.r0();
    }
}
