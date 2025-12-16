package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzdk extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f350639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f350640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f350641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zzdf f350642i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzdf zzdfVar, String str, String str2, Bundle bundle) {
        super(true);
        this.f350639f = str;
        this.f350640g = str2;
        this.f350641h = bundle;
        this.f350642i = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350642i.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.clearConditionalUserProperty(this.f350639f, this.f350640g, this.f350641h);
    }
}
