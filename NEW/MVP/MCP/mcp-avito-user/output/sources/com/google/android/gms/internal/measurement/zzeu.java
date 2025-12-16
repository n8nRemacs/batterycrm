package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzeu extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f350729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzcs f350730g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzdf.zzd f350731h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeu(zzdf.zzd zzdVar, Activity activity, zzcs zzcsVar) {
        super(true);
        this.f350729f = activity;
        this.f350730g = zzcsVar;
        this.f350731h = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = zzdf.this.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.onActivitySaveInstanceState(new f(this.f350729f), this.f350730g, this.f350622c);
    }
}
