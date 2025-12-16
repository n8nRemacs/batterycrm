package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdu extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350662g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzdf zzdfVar, String str) {
        super(true);
        this.f350661f = str;
        this.f350662g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350662g.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.beginAdUnitExposure(this.f350661f, this.f350622c);
    }
}
