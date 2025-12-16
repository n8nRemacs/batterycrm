package com.google.android.gms.internal.mlkit_vision_barcode;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzu();

    @SafeParcelable.c
    public zzl zza;

    @SafeParcelable.c
    public String zzb;

    @SafeParcelable.c
    public String zzc;

    @SafeParcelable.c
    public zzm[] zzd;

    @SafeParcelable.c
    public zzj[] zze;

    @SafeParcelable.c
    public String[] zzf;

    @SafeParcelable.c
    public zze[] zzg;

    public zzh() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.i(parcel, 2, this.zza, i12, false);
        a.j(parcel, 3, this.zzb, false);
        a.j(parcel, 4, this.zzc, false);
        a.m(parcel, 5, this.zzd, i12);
        a.m(parcel, 6, this.zze, i12);
        a.k(parcel, 7, this.zzf, false);
        a.m(parcel, 8, this.zzg, i12);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzh(@SafeParcelable.e zzl zzlVar, @SafeParcelable.e String str, @SafeParcelable.e String str2, @SafeParcelable.e zzm[] zzmVarArr, @SafeParcelable.e zzj[] zzjVarArr, @SafeParcelable.e String[] strArr, @SafeParcelable.e zze[] zzeVarArr) {
        this.zza = zzlVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzmVarArr;
        this.zze = zzjVarArr;
        this.zzf = strArr;
        this.zzg = zzeVarArr;
    }
}
