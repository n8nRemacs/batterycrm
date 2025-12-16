package com.google.android.gms.internal.maps;

import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;

/* loaded from: classes6.dex */
public final class zzah extends zza implements zzaf {
    @Override // com.google.android.gms.internal.maps.zzaf
    public final Tile getTile(int i12, int i13, int i14) {
        Parcel parcelE4 = e4();
        parcelE4.writeInt(i12);
        parcelE4.writeInt(i13);
        parcelE4.writeInt(i14);
        Parcel parcelF4 = f4(parcelE4, 1);
        Tile tile = (Tile) zzc.zza(parcelF4, Tile.CREATOR);
        parcelF4.recycle();
        return tile;
    }
}
