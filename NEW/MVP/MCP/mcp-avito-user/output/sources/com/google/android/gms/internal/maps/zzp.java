package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzp extends zza implements zzn {
    @Override // com.google.android.gms.internal.maps.zzn
    public final int getActiveLevelIndex() {
        Parcel parcelF4 = f4(e4(), 1);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int getDefaultLevelIndex() {
        Parcel parcelF4 = f4(e4(), 2);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final List<IBinder> getLevels() {
        Parcel parcelF4 = f4(e4(), 3);
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcelF4.createBinderArrayList();
        parcelF4.recycle();
        return arrayListCreateBinderArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean isUnderground() {
        Parcel parcelF4 = f4(e4(), 4);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzb(zzn zznVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, zznVar);
        Parcel parcelF4 = f4(parcelE4, 5);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzj() {
        Parcel parcelF4 = f4(e4(), 6);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }
}
