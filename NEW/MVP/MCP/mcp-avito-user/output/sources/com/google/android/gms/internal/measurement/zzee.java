package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzee extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzdf.zzc f350687f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350688g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzdf zzdfVar, zzdf.zzc zzcVar) {
        super(true);
        this.f350687f = zzcVar;
        this.f350688g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350688g.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.setEventInterceptor(this.f350687f);
    }
}
