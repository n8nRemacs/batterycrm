package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.tasks.AbstractC37018a;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final /* synthetic */ class zzbh implements InterfaceC36673v {
    public final /* synthetic */ CurrentLocationRequest zza;
    public final /* synthetic */ AbstractC37018a zzb;

    public /* synthetic */ zzbh(CurrentLocationRequest currentLocationRequest, AbstractC37018a abstractC37018a) {
        this.zza = currentLocationRequest;
        this.zzb = abstractC37018a;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
    public final void accept(Object obj, Object obj2) {
        C36616a.g gVar = zzbp.f350458k;
        ((zzda) obj).zzs(this.zza, this.zzb, (C37028k) obj2);
    }
}
