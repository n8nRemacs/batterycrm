package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.internal.location.zzau;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.internal.location.zzbv;
import com.google.android.gms.internal.location.zzbz;
import com.google.android.gms.internal.location.zzcc;
import com.google.android.gms.internal.location.zzce;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public class LocationServices {

    @j.N
    @Deprecated
    public static final C36616a<C36616a.d.C10620d> API = zzbp.zzb;

    @j.N
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi = new zzau();

    @j.N
    @Deprecated
    public static final InterfaceC36784e GeofencingApi = new zzbv();

    @j.N
    @Deprecated
    public static final InterfaceC36794o SettingsApi = new zzcc();

    @j.N
    public static InterfaceC36781b getFusedLocationProviderClient(@j.N Activity activity) {
        return new zzbp(activity);
    }

    @j.N
    public static InterfaceC36785f getGeofencingClient(@j.N Activity activity) {
        return new zzbz(activity);
    }

    @j.N
    public static InterfaceC36795p getSettingsClient(@j.N Activity activity) {
        return new zzce(activity);
    }

    @j.N
    public static InterfaceC36781b getFusedLocationProviderClient(@j.N Context context) {
        return new zzbp(context);
    }

    @j.N
    public static InterfaceC36785f getGeofencingClient(@j.N Context context) {
        return new zzbz(context);
    }

    @j.N
    public static InterfaceC36795p getSettingsClient(@j.N Context context) {
        return new zzce(context);
    }
}
