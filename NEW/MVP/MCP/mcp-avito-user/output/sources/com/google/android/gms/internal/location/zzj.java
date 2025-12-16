package com.google.android.gms.internal.location;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public abstract class zzj extends zzb implements zzk {
    public zzj() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean e4(Parcel parcel, int i12) {
        if (i12 == 1) {
            zzg zzgVar = (zzg) zzc.zza(parcel, zzg.CREATOR);
            zzc.zzb(parcel);
            zzd(zzgVar);
        } else {
            if (i12 != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
