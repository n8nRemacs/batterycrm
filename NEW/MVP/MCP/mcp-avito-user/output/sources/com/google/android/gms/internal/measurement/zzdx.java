package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdx extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzcs f350667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf f350668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzdf zzdfVar, zzcs zzcsVar) {
        super(true);
        this.f350667f = zzcsVar;
        this.f350668g = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() {
        this.f350667f.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350668g.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.getCurrentScreenName(this.f350667f);
    }
}
