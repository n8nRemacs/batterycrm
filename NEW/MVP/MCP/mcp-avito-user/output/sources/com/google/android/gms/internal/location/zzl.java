package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean e4(Parcel parcel, int i12) {
        if (i12 == 1) {
            int i13 = parcel.readInt();
            String[] strArrCreateStringArray = parcel.createStringArray();
            zzc.zzb(parcel);
            zzb(i13, strArrCreateStringArray);
        } else if (i12 == 2) {
            int i14 = parcel.readInt();
            String[] strArrCreateStringArray2 = parcel.createStringArray();
            zzc.zzb(parcel);
            zzd(i14, strArrCreateStringArray2);
        } else {
            if (i12 != 3) {
                return false;
            }
            int i15 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR);
            zzc.zzb(parcel);
            zzc(i15, pendingIntent);
        }
        return true;
    }
}
