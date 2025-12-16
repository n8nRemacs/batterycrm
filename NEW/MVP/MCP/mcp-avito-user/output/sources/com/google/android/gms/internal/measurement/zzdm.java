package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdm extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350648g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdm(zzdf zzdfVar, String str) {
        super(true);
        this.f350647f = str;
        this.f350648g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350648g.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.setUserId(this.f350647f, this.f350621b);
    }
}
