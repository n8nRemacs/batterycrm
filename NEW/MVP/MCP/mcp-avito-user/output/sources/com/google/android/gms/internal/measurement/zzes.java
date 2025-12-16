package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzes extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f350725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzdf.zzd f350726g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzes(zzdf.zzd zzdVar, Activity activity) {
        super(true);
        this.f350725f = activity;
        this.f350726g = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = zzdf.this.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.onActivityPaused(new f(this.f350725f), this.f350622c);
    }
}
