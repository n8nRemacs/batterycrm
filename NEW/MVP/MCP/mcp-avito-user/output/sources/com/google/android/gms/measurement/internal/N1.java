package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class N1 extends zzbu implements L1 {
    public N1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final void B1(zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzoVar);
        g4(parcelE4, 4);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final void J(long j12, String str, String str2, String str3) {
        Parcel parcelE4 = e4();
        parcelE4.writeLong(j12);
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        parcelE4.writeString(str3);
        g4(parcelE4, 10);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final List<zzae> S1(String str, String str2, zzo zzoVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, zzoVar);
        Parcel parcelF4 = f4(parcelE4, 16);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(zzae.CREATOR);
        parcelF4.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final void U1(zzbe zzbeVar, zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzbeVar);
        zzbw.zza(parcelE4, zzoVar);
        g4(parcelE4, 1);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final List<zznb> W3(String str, String str2, boolean z12, zzo zzoVar) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(str);
        parcelE4.writeString(str2);
        zzbw.zza(parcelE4, z12);
        zzbw.zza(parcelE4, zzoVar);
        Parcel parcelF4 = f4(parcelE4, 14);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(zznb.CREATOR);
        parcelF4.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final void Y0(zznb zznbVar, zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zznbVar);
        zzbw.zza(parcelE4, zzoVar);
        g4(parcelE4, 2);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final byte[] Y1(zzbe zzbeVar, String str) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzbeVar);
        parcelE4.writeString(str);
        Parcel parcelF4 = f4(parcelE4, 9);
        byte[] bArrCreateByteArray = parcelF4.createByteArray();
        parcelF4.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final List<zzae> c2(String str, String str2, String str3) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(null);
        parcelE4.writeString(str2);
        parcelE4.writeString(str3);
        Parcel parcelF4 = f4(parcelE4, 17);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(zzae.CREATOR);
        parcelF4.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final zzaj g1(zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzoVar);
        Parcel parcelF4 = f4(parcelE4, 21);
        zzaj zzajVar = (zzaj) zzbw.zza(parcelF4, zzaj.CREATOR);
        parcelF4.recycle();
        return zzajVar;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final List m(Bundle bundle, zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzoVar);
        zzbw.zza(parcelE4, bundle);
        Parcel parcelF4 = f4(parcelE4, 24);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(zzmh.CREATOR);
        parcelF4.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final void q1(zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzoVar);
        g4(parcelE4, 18);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final void s1(zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzoVar);
        g4(parcelE4, 20);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final void t1(zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzoVar);
        g4(parcelE4, 6);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final void w2(zzae zzaeVar, zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzaeVar);
        zzbw.zza(parcelE4, zzoVar);
        g4(parcelE4, 12);
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final List<zznb> x(String str, String str2, String str3, boolean z12) {
        Parcel parcelE4 = e4();
        parcelE4.writeString(null);
        parcelE4.writeString(str2);
        parcelE4.writeString(str3);
        zzbw.zza(parcelE4, z12);
        Parcel parcelF4 = f4(parcelE4, 15);
        ArrayList arrayListCreateTypedArrayList = parcelF4.createTypedArrayList(zznb.CREATOR);
        parcelF4.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    public final String x1(zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, zzoVar);
        Parcel parcelF4 = f4(parcelE4, 11);
        String string = parcelF4.readString();
        parcelF4.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.L1
    /* renamed from: m */
    public final void mo108m(Bundle bundle, zzo zzoVar) {
        Parcel parcelE4 = e4();
        zzbw.zza(parcelE4, bundle);
        zzbw.zza(parcelE4, zzoVar);
        g4(parcelE4, 19);
    }
}
