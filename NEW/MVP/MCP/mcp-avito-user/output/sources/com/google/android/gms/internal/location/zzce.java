package com.google.android.gms.internal.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.C36789j;
import com.google.android.gms.location.InterfaceC36795p;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import j.N;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzce extends h implements InterfaceC36795p {
    public static final /* synthetic */ int zza = 0;

    public zzce(@N Activity activity) {
        super(activity, (C36616a<C36616a.d.C10620d>) zzbp.zzb, C36616a.d.f348913j2, h.a.f348930c);
    }

    public final Task<C36789j> checkLocationSettings(final LocationSettingsRequest locationSettingsRequest) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzcd
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                LocationSettingsRequest locationSettingsRequest2 = locationSettingsRequest;
                zzda zzdaVar = (zzda) obj;
                C37028k c37028k = (C37028k) obj2;
                C36729v.a("locationSettingsRequest can't be null", locationSettingsRequest2 != null);
                ((zzo) zzdaVar.getService()).zzh(locationSettingsRequest2, new zzcq(c37028k), null);
            }
        };
        aVarA.f348955d = 2426;
        return doRead(aVarA.a());
    }

    public zzce(@N Context context) {
        super(context, (C36616a<C36616a.d.C10620d>) zzbp.zzb, C36616a.d.f348913j2, h.a.f348930c);
    }
}
