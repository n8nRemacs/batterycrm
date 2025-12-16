package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzec extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f350682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzdf f350683h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzdf zzdfVar, String str, Object obj) {
        super(false);
        this.f350681f = str;
        this.f350682g = obj;
        this.f350683h = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350683h.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.logHealthData(5, this.f350681f, new f(this.f350682g), new f(null), new f(null));
    }
}
