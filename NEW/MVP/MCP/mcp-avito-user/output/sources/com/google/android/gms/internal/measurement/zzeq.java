package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzeq extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f350721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf.zzd f350722g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzdf.zzd zzdVar, Activity activity) {
        super(true);
        this.f350721f = activity;
        this.f350722g = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = zzdf.this.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.onActivityStarted(new f(this.f350721f), this.f350622c);
    }
}
