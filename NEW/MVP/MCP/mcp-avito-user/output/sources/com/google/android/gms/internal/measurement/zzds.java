package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzds extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f350657f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzdf zzdfVar, long j12) {
        super(true);
        this.f350657f = j12;
        this.f350658g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350658g.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.setSessionTimeoutDuration(this.f350657f);
    }
}
