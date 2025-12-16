package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.InterfaceC36871e4;
import j.P;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* loaded from: classes13.dex */
final class f implements InterfaceC36871e4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzdf f360724a;

    public f(zzdf zzdfVar) {
        this.f360724a = zzdfVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void a(String str, @P String str2, @P Bundle bundle) {
        this.f360724a.zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final List<Bundle> b(@P String str, @P String str2) {
        return this.f360724a.zza(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void c(String str, String str2, Bundle bundle) {
        this.f360724a.zzb(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final Map<String, Object> d(@P String str, @P String str2, boolean z12) {
        return this.f360724a.zza(str, str2, z12);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final int zza(String str) {
        return this.f360724a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zzb(String str) {
        this.f360724a.zzb(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zzc(String str) {
        this.f360724a.zzc(str);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    @P
    public final String zzf() {
        return this.f360724a.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    @P
    public final String zzg() {
        return this.f360724a.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    @P
    public final String zzh() {
        return this.f360724a.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    @P
    public final String zzi() {
        return this.f360724a.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final long zza() {
        return this.f360724a.zza();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36871e4
    public final void zza(Bundle bundle) {
        this.f360724a.zza(bundle);
    }
}
