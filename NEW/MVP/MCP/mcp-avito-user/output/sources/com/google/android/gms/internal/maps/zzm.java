package com.google.android.gms.internal.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public final class zzm extends zza implements zzk {
    @Override // com.google.android.gms.internal.maps.zzk
    public final float getBearing() {
        Parcel parcelF4 = f4(e4(), 12);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final LatLngBounds getBounds() {
        Parcel parcelF4 = f4(e4(), 10);
        LatLngBounds latLngBounds = (LatLngBounds) zzc.zza(parcelF4, LatLngBounds.CREATOR);
        parcelF4.recycle();
        return latLngBounds;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getHeight() {
        Parcel parcelF4 = f4(e4(), 8);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final String getId() {
        Parcel parcelF4 = f4(e4(), 2);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final LatLng getPosition() {
        Parcel parcelF4 = f4(e4(), 4);
        LatLng latLng = (LatLng) zzc.zza(parcelF4, LatLng.CREATOR);
        parcelF4.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getTransparency() {
        Parcel parcelF4 = f4(e4(), 18);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getWidth() {
        Parcel parcelF4 = f4(e4(), 7);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final float getZIndex() {
        Parcel parcelF4 = f4(e4(), 14);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean isClickable() {
        Parcel parcelF4 = f4(e4(), 23);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean isVisible() {
        Parcel parcelF4 = f4(e4(), 16);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void remove() {
        g4(e4(), 1);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setBearing(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 11);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setClickable(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 22);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setDimensions(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 5);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setPosition(LatLng latLng) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, latLng);
        g4(parcelE4, 3);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setPositionFromBounds(LatLngBounds latLngBounds) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, latLngBounds);
        g4(parcelE4, 9);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setTransparency(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 17);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setVisible(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 15);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void setZIndex(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 13);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zza(float f12, float f13) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        parcelE4.writeFloat(f13);
        g4(parcelE4, 6);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final boolean zzb(zzk zzkVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, zzkVar);
        Parcel parcelF4 = f4(parcelE4, 19);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zze(d dVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, dVar);
        g4(parcelE4, 24);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final void zzf(d dVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, dVar);
        g4(parcelE4, 21);
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final int zzj() {
        Parcel parcelF4 = f4(e4(), 20);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final d zzk() {
        return P0.f(f4(e4(), 25));
    }
}
