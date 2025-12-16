package com.google.android.gms.internal.maps;

import android.os.Parcel;

/* loaded from: classes6.dex */
public final class zzae extends zza implements zzac {
    @Override // com.google.android.gms.internal.maps.zzac
    public final void clearTileCache() {
        g4(e4(), 2);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean getFadeIn() {
        Parcel parcelF4 = f4(e4(), 11);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final String getId() {
        Parcel parcelF4 = f4(e4(), 3);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final float getTransparency() {
        Parcel parcelF4 = f4(e4(), 13);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final float getZIndex() {
        Parcel parcelF4 = f4(e4(), 5);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean isVisible() {
        Parcel parcelF4 = f4(e4(), 7);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void remove() {
        g4(e4(), 1);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setFadeIn(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 10);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setTransparency(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 12);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setVisible(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 6);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final void setZIndex(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 4);
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final boolean zza(zzac zzacVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, zzacVar);
        Parcel parcelF4 = f4(parcelE4, 8);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzac
    public final int zzj() {
        Parcel parcelF4 = f4(e4(), 9);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }
}
