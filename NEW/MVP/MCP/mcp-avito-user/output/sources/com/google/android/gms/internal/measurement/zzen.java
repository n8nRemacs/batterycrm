package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzen extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f350712g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f350713h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f350714i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ zzdf f350715j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzen(zzdf zzdfVar, String str, String str2, Object obj, boolean z12) {
        super(true);
        this.f350711f = str;
        this.f350712g = str2;
        this.f350713h = obj;
        this.f350714i = z12;
        this.f350715j = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350715j.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.setUserProperty(this.f350711f, this.f350712g, new f(this.f350713h), this.f350714i, this.f350621b);
    }
}
