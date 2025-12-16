package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzc;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public abstract class O extends com.google.android.gms.internal.location.zzb implements P {
    public O() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static P zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof P ? (P) iInterfaceQueryLocalInterface : new N(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean e4(Parcel parcel, int i12) {
        if (i12 == 1) {
            LocationResult locationResult = (LocationResult) zzc.zza(parcel, LocationResult.CREATOR);
            zzc.zzb(parcel);
            zze(locationResult);
        } else if (i12 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(parcel, LocationAvailability.CREATOR);
            zzc.zzb(parcel);
            zzd(locationAvailability);
        } else {
            if (i12 != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }
}
