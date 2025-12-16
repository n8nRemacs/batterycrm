package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();

    @SafeParcelable.h
    public final int zza;

    @SafeParcelable.c
    public final int zzb;

    @SafeParcelable.c
    public final float zzc;

    @SafeParcelable.c
    public final float zzd;

    @SafeParcelable.c
    public final float zze;

    @SafeParcelable.c
    public final float zzf;

    @SafeParcelable.c
    public final float zzg;

    @SafeParcelable.c
    public final float zzh;

    @SafeParcelable.c
    public final float zzi;

    @SafeParcelable.c
    public final zzn[] zzj;

    @SafeParcelable.c
    public final float zzk;

    @SafeParcelable.c
    public final float zzl;

    @SafeParcelable.c
    public final float zzm;

    @SafeParcelable.c
    public final zzd[] zzn;

    @SafeParcelable.c
    public final float zzo;

    @SafeParcelable.b
    public zzf(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e float f12, @SafeParcelable.e float f13, @SafeParcelable.e float f14, @SafeParcelable.e float f15, @SafeParcelable.e float f16, @SafeParcelable.e float f17, @SafeParcelable.e float f18, @SafeParcelable.e zzn[] zznVarArr, @SafeParcelable.e float f19, @SafeParcelable.e float f22, @SafeParcelable.e float f23, @SafeParcelable.e zzd[] zzdVarArr, @SafeParcelable.e float f24) {
        this.zza = i12;
        this.zzb = i13;
        this.zzc = f12;
        this.zzd = f13;
        this.zze = f14;
        this.zzf = f15;
        this.zzg = f16;
        this.zzh = f17;
        this.zzi = f18;
        this.zzj = zznVarArr;
        this.zzk = f19;
        this.zzl = f22;
        this.zzm = f23;
        this.zzn = zzdVarArr;
        this.zzo = f24;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        int i13 = this.zza;
        a.q(parcel, 1, 4);
        parcel.writeInt(i13);
        int i14 = this.zzb;
        a.q(parcel, 2, 4);
        parcel.writeInt(i14);
        float f12 = this.zzc;
        a.q(parcel, 3, 4);
        parcel.writeFloat(f12);
        float f13 = this.zzd;
        a.q(parcel, 4, 4);
        parcel.writeFloat(f13);
        float f14 = this.zze;
        a.q(parcel, 5, 4);
        parcel.writeFloat(f14);
        float f15 = this.zzf;
        a.q(parcel, 6, 4);
        parcel.writeFloat(f15);
        float f16 = this.zzg;
        a.q(parcel, 7, 4);
        parcel.writeFloat(f16);
        float f17 = this.zzh;
        a.q(parcel, 8, 4);
        parcel.writeFloat(f17);
        a.m(parcel, 9, this.zzj, i12);
        float f18 = this.zzk;
        a.q(parcel, 10, 4);
        parcel.writeFloat(f18);
        float f19 = this.zzl;
        a.q(parcel, 11, 4);
        parcel.writeFloat(f19);
        float f22 = this.zzm;
        a.q(parcel, 12, 4);
        parcel.writeFloat(f22);
        a.m(parcel, 13, this.zzn, i12);
        float f23 = this.zzi;
        a.q(parcel, 14, 4);
        parcel.writeFloat(f23);
        float f24 = this.zzo;
        a.q(parcel, 15, 4);
        parcel.writeFloat(f24);
        a.p(parcel, iO2);
    }
}
