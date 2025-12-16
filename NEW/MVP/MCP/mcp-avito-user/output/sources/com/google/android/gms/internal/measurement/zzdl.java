package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdl extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f350643f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f350644g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f350645h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zzdf f350646i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdf zzdfVar, Activity activity, String str, String str2) {
        super(true);
        this.f350643f = activity;
        this.f350644g = str;
        this.f350645h = str2;
        this.f350646i = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350646i.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.setCurrentScreen(new f(this.f350643f), this.f350644g, this.f350645h, this.f350621b);
    }
}
