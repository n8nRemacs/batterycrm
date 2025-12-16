package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.LocationSettingsRequest;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzca extends zzcb {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LocationSettingsRequest f350463r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(i iVar, LocationSettingsRequest locationSettingsRequest) {
        super(iVar);
        this.f350463r = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.C36634e.a
    public final /* synthetic */ void c(C36616a.b bVar) {
        zzda zzdaVar = (zzda) bVar;
        LocationSettingsRequest locationSettingsRequest = this.f350463r;
        C36729v.a("locationSettingsRequest can't be null", locationSettingsRequest != null);
        ((zzo) zzdaVar.getService()).zzh(locationSettingsRequest, new zzcr(this), null);
    }
}
