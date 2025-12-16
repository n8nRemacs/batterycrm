package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.O;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcw extends O {

    /* renamed from: a, reason: collision with root package name */
    public final zzcs f350483a;

    public zzcw(zzcs zzcsVar) {
        this.f350483a = zzcsVar;
    }

    @Override // com.google.android.gms.location.P
    public final void zzd(LocationAvailability locationAvailability) {
        this.f350483a.zza().b(new zzcu(locationAvailability));
    }

    @Override // com.google.android.gms.location.P
    public final void zze(LocationResult locationResult) {
        this.f350483a.zza().b(new zzct(locationResult));
    }

    @Override // com.google.android.gms.location.P
    public final void zzf() {
        this.f350483a.zza().b(new zzcv(this));
    }
}
