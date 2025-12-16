package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdj extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350635f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f350636g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzcs f350637h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zzdf f350638i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdf zzdfVar, String str, String str2, zzcs zzcsVar) {
        super(true);
        this.f350635f = str;
        this.f350636g = str2;
        this.f350637h = zzcsVar;
        this.f350638i = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() {
        this.f350637h.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350638i.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.getConditionalUserProperties(this.f350635f, this.f350636g, this.f350637h);
    }
}
