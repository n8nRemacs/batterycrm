package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzeb extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f350678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzcs f350679g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzdf f350680h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzdf zzdfVar, Bundle bundle, zzcs zzcsVar) {
        super(true);
        this.f350678f = bundle;
        this.f350679g = zzcsVar;
        this.f350680h = zzdfVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void a() {
        this.f350679g.zza((Bundle) null);
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        zzcu zzcuVar = this.f350680h.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.performAction(this.f350678f, this.f350679g, this.f350621b);
    }
}
