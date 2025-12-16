package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzej extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzdf.zzb f350698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350699g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzdf zzdfVar, zzdf.zzb zzbVar) {
        super(true);
        this.f350698f = zzbVar;
        this.f350699g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350699g.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.registerOnMeasurementEventListener(this.f350698f);
    }
}
