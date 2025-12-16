package com.google.android.gms.internal.maps;

import android.os.Parcel;

/* loaded from: classes6.dex */
public final class zzs extends zza implements zzq {
    @Override // com.google.android.gms.internal.maps.zzq
    public final void activate() {
        g4(e4(), 3);
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final String getName() {
        Parcel parcelF4 = f4(e4(), 1);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final String getShortName() {
        Parcel parcelF4 = f4(e4(), 2);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final boolean zzb(zzq zzqVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, zzqVar);
        Parcel parcelF4 = f4(parcelE4, 4);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzq
    public final int zzj() {
        Parcel parcelF4 = f4(e4(), 5);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }
}
