package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzel extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f350702f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f350703g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f350704h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bundle f350705i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f350706j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f350707k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ zzdf f350708l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzel(zzdf zzdfVar, Long l12, String str, String str2, Bundle bundle, boolean z12, boolean z13) {
        super(true);
        this.f350702f = l12;
        this.f350703g = str;
        this.f350704h = str2;
        this.f350705i = bundle;
        this.f350706j = z12;
        this.f350707k = z13;
        this.f350708l = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        Long l12 = this.f350702f;
        long jLongValue = l12 == null ? this.f350621b : l12.longValue();
        zzcu zzcuVar = this.f350708l.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.logEvent(this.f350703g, this.f350704h, this.f350705i, this.f350706j, this.f350707k, jLongValue);
    }
}
