package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.InterfaceC36871e4;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class d extends AppMeasurement.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36871e4 f354505a;

    public d(InterfaceC36871e4 interfaceC36871e4) {
        super();
        this.f354505a = interfaceC36871e4;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void a(String str, String str2, Bundle bundle) {
        this.f354505a.a(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final List<Bundle> b(String str, String str2) {
        return this.f354505a.b(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void c(String str, String str2, Bundle bundle) {
        this.f354505a.c(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final Map<String, Object> d(String str, String str2, boolean z12) {
        return this.f354505a.d(str, str2, z12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final int zza(String str) {
        return this.f354505a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zzb(String str) {
        this.f354505a.zzb(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zzc(String str) {
        this.f354505a.zzc(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final String zzf() {
        return this.f354505a.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final String zzg() {
        return this.f354505a.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final String zzh() {
        return this.f354505a.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final String zzi() {
        return this.f354505a.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final long zza() {
        return this.f354505a.zza();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zza(Bundle bundle) {
        this.f354505a.zza(bundle);
    }
}
