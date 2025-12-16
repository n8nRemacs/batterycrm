package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzeh extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f350693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeh(zzdf zzdfVar, boolean z12) {
        super(true);
        this.f350693f = z12;
        this.f350694g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350694g.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.setDataCollectionEnabled(this.f350693f);
    }
}
