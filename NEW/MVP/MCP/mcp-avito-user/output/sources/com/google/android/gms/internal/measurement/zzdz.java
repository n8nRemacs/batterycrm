package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdz extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f350672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f350673h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zzcs f350674i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zzdf f350675j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdz(zzdf zzdfVar, String str, String str2, boolean z12, zzcs zzcsVar) {
        super(true);
        this.f350671f = str;
        this.f350672g = str2;
        this.f350673h = z12;
        this.f350674i = zzcsVar;
        this.f350675j = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() {
        this.f350674i.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350675j.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.getUserProperties(this.f350671f, this.f350672g, this.f350673h, this.f350674i);
    }
}
