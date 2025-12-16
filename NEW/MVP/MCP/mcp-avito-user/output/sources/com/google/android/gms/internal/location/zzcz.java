package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.location.S;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzcz extends S {

    /* renamed from: a, reason: collision with root package name */
    public final zzcs f350485a;

    public zzcz(zzcs zzcsVar) {
        this.f350485a = zzcsVar;
    }

    @Override // com.google.android.gms.location.T
    public final void zzd(Location location) {
        this.f350485a.zza().b(new zzcx());
    }

    @Override // com.google.android.gms.location.T
    public final void zze() {
        this.f350485a.zza().b(new zzcy(this));
    }
}
