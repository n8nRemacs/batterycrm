package com.google.android.gms.internal.mlkit_vision_barcode;

import TX0.a;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    @SafeParcelable.c
    public int zza;

    @SafeParcelable.c
    public String zzb;

    @SafeParcelable.c
    public String zzc;

    @SafeParcelable.c
    public int zzd;

    @SafeParcelable.c
    public Point[] zze;

    @SafeParcelable.c
    public zzj zzf;

    @SafeParcelable.c
    public zzm zzg;

    @SafeParcelable.c
    public zzn zzh;

    @SafeParcelable.c
    public zzp zzi;

    @SafeParcelable.c
    public zzo zzj;

    @SafeParcelable.c
    public zzk zzk;

    @SafeParcelable.c
    public zzg zzl;

    @SafeParcelable.c
    public zzh zzm;

    @SafeParcelable.c
    public zzi zzn;

    @SafeParcelable.c
    public byte[] zzo;

    @SafeParcelable.c
    public boolean zzp;

    @SafeParcelable.c
    public double zzq;

    public zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        int i13 = this.zza;
        a.q(parcel, 2, 4);
        parcel.writeInt(i13);
        a.j(parcel, 3, this.zzb, false);
        a.j(parcel, 4, this.zzc, false);
        int i14 = this.zzd;
        a.q(parcel, 5, 4);
        parcel.writeInt(i14);
        a.m(parcel, 6, this.zze, i12);
        a.i(parcel, 7, this.zzf, i12, false);
        a.i(parcel, 8, this.zzg, i12, false);
        a.i(parcel, 9, this.zzh, i12, false);
        a.i(parcel, 10, this.zzi, i12, false);
        a.i(parcel, 11, this.zzj, i12, false);
        a.i(parcel, 12, this.zzk, i12, false);
        a.i(parcel, 13, this.zzl, i12, false);
        a.i(parcel, 14, this.zzm, i12, false);
        a.i(parcel, 15, this.zzn, i12, false);
        a.b(parcel, 16, this.zzo, false);
        boolean z12 = this.zzp;
        a.q(parcel, 17, 4);
        parcel.writeInt(z12 ? 1 : 0);
        double d12 = this.zzq;
        a.q(parcel, 18, 8);
        parcel.writeDouble(d12);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzq(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e String str2, @SafeParcelable.e int i13, @SafeParcelable.e Point[] pointArr, @SafeParcelable.e zzj zzjVar, @SafeParcelable.e zzm zzmVar, @SafeParcelable.e zzn zznVar, @SafeParcelable.e zzp zzpVar, @SafeParcelable.e zzo zzoVar, @SafeParcelable.e zzk zzkVar, @SafeParcelable.e zzg zzgVar, @SafeParcelable.e zzh zzhVar, @SafeParcelable.e zzi zziVar, @SafeParcelable.e byte[] bArr, @SafeParcelable.e boolean z12, @SafeParcelable.e double d12) {
        this.zza = i12;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i13;
        this.zze = pointArr;
        this.zzp = z12;
        this.zzq = d12;
        this.zzf = zzjVar;
        this.zzg = zzmVar;
        this.zzh = zznVar;
        this.zzi = zzpVar;
        this.zzj = zzoVar;
        this.zzk = zzkVar;
        this.zzl = zzgVar;
        this.zzm = zzhVar;
        this.zzn = zziVar;
    }
}
