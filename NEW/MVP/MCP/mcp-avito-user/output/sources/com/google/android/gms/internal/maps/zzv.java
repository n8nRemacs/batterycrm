package com.google.android.gms.internal.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
public final class zzv extends zza implements zzt {
    @Override // com.google.android.gms.internal.maps.zzt
    public final float getAlpha() {
        Parcel parcelF4 = f4(e4(), 26);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final String getId() {
        Parcel parcelF4 = f4(e4(), 2);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final LatLng getPosition() {
        Parcel parcelF4 = f4(e4(), 4);
        LatLng latLng = (LatLng) zzc.zza(parcelF4, LatLng.CREATOR);
        parcelF4.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final float getRotation() {
        Parcel parcelF4 = f4(e4(), 23);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final String getSnippet() {
        Parcel parcelF4 = f4(e4(), 8);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final String getTitle() {
        Parcel parcelF4 = f4(e4(), 6);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final float getZIndex() {
        Parcel parcelF4 = f4(e4(), 28);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void hideInfoWindow() {
        g4(e4(), 12);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean isDraggable() {
        Parcel parcelF4 = f4(e4(), 10);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean isFlat() {
        Parcel parcelF4 = f4(e4(), 21);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean isInfoWindowShown() {
        Parcel parcelF4 = f4(e4(), 13);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean isVisible() {
        Parcel parcelF4 = f4(e4(), 15);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void remove() {
        g4(e4(), 1);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setAlpha(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 25);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setAnchor(float f12, float f13) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        parcelE4.writeFloat(f13);
        g4(parcelE4, 19);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setDraggable(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 9);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setFlat(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 20);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setInfoWindowAnchor(float f12, float f13) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        parcelE4.writeFloat(f13);
        g4(parcelE4, 24);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setPosition(LatLng latLng) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, latLng);
        g4(parcelE4, 3);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setRotation(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 22);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setSnippet(String str) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        g4(parcelE4, 7);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setTitle(String str) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        g4(parcelE4, 5);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setVisible(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 14);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void setZIndex(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 27);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void showInfoWindow() {
        g4(e4(), 11);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void zze(d dVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, dVar);
        g4(parcelE4, 29);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final void zzg(d dVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, dVar);
        g4(parcelE4, 18);
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final boolean zzj(zzt zztVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, zztVar);
        Parcel parcelF4 = f4(parcelE4, 16);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final d zzk() {
        return P0.f(f4(e4(), 30));
    }

    @Override // com.google.android.gms.internal.maps.zzt
    public final int zzj() {
        Parcel parcelF4 = f4(e4(), 17);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }
}
