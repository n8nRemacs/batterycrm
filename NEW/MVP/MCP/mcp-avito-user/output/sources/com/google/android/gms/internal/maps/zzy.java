package com.google.android.gms.internal.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.P0;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzy extends zza implements zzw {
    @Override // com.google.android.gms.internal.maps.zzw
    public final int getFillColor() {
        Parcel parcelF4 = f4(e4(), 12);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final List getHoles() {
        Parcel parcelF4 = f4(e4(), 6);
        ArrayList arrayListZzb = zzc.zzb(parcelF4);
        parcelF4.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final String getId() {
        Parcel parcelF4 = f4(e4(), 2);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final List<LatLng> getPoints() {
        Parcel parcelF4 = f4(e4(), 4);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(LatLng.CREATOR);
        parcelF4.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final int getStrokeColor() {
        Parcel parcelF4 = f4(e4(), 10);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final int getStrokeJointType() {
        Parcel parcelF4 = f4(e4(), 24);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final List<PatternItem> getStrokePattern() {
        Parcel parcelF4 = f4(e4(), 26);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(PatternItem.CREATOR);
        parcelF4.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final float getStrokeWidth() {
        Parcel parcelF4 = f4(e4(), 8);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final float getZIndex() {
        Parcel parcelF4 = f4(e4(), 14);
        float f12 = parcelF4.readFloat();
        parcelF4.recycle();
        return f12;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final boolean isClickable() {
        Parcel parcelF4 = f4(e4(), 22);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final boolean isGeodesic() {
        Parcel parcelF4 = f4(e4(), 18);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final boolean isVisible() {
        Parcel parcelF4 = f4(e4(), 16);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void remove() {
        g4(e4(), 1);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setClickable(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 21);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setFillColor(int i12) {
        Parcel parcelE4 = e4();
        parcelE4.writeInt(i12);
        g4(parcelE4, 11);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setGeodesic(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 17);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setHoles(List list) {
        Parcel parcelE4 = e4();
        parcelE4.writeList(list);
        g4(parcelE4, 5);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setPoints(List<LatLng> list) {
        Parcel parcelE4 = e4();
        parcelE4.writeTypedList(list);
        g4(parcelE4, 3);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setStrokeColor(int i12) {
        Parcel parcelE4 = e4();
        parcelE4.writeInt(i12);
        g4(parcelE4, 9);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setStrokeJointType(int i12) {
        Parcel parcelE4 = e4();
        parcelE4.writeInt(i12);
        g4(parcelE4, 23);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setStrokePattern(List<PatternItem> list) {
        Parcel parcelE4 = e4();
        parcelE4.writeTypedList(list);
        g4(parcelE4, 25);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setStrokeWidth(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 7);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setVisible(boolean z12) {
        Parcel parcelE4 = e4();
        zzc.writeBoolean(parcelE4, z12);
        g4(parcelE4, 15);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void setZIndex(float f12) {
        Parcel parcelE4 = e4();
        parcelE4.writeFloat(f12);
        g4(parcelE4, 13);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final boolean zzb(zzw zzwVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, zzwVar);
        Parcel parcelF4 = f4(parcelE4, 19);
        boolean zZza = zzc.zza(parcelF4);
        parcelF4.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final void zze(d dVar) {
        Parcel parcelE4 = e4();
        zzc.zza(parcelE4, dVar);
        g4(parcelE4, 27);
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final int zzj() {
        Parcel parcelF4 = f4(e4(), 20);
        int i12 = parcelF4.readInt();
        parcelF4.recycle();
        return i12;
    }

    @Override // com.google.android.gms.internal.maps.zzw
    public final d zzk() {
        return P0.f(f4(e4(), 28));
    }
}
