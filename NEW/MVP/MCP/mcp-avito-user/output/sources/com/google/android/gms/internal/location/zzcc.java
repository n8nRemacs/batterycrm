package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.location.InterfaceC36794o;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzcc implements InterfaceC36794o {
    public final m<LocationSettingsResult> checkLocationSettings(i iVar, LocationSettingsRequest locationSettingsRequest) {
        return iVar.f(new zzca(iVar, locationSettingsRequest));
    }
}
