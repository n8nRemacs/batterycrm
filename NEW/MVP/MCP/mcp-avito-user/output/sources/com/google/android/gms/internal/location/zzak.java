package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.location.LocationRequest;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzak extends zzat {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C36658n f350442r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LocationRequest f350443s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(i iVar, C36658n c36658n, LocationRequest locationRequest) {
        super(iVar);
        this.f350442r = c36658n;
        this.f350443s = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        ((zzda) bVar).zzv(new zzas(this.f350442r), this.f350443s, zzau.a(this));
    }
}
