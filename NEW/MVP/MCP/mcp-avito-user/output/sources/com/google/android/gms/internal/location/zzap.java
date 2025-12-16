package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36660o;
import com.google.android.gms.location.LocationCallback;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzap extends zzat {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LocationCallback f350450r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(i iVar, LocationCallback locationCallback) {
        super(iVar);
        this.f350450r = locationCallback;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* bridge */ /* synthetic */ void c(C36616a.b bVar) {
        ((zzda) bVar).zzB(C36660o.c(this.f350450r, "LocationCallback"), true, zzau.a(this));
    }
}
