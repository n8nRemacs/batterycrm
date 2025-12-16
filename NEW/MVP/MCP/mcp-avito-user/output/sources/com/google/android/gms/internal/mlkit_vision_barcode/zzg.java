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
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzt();

    @SafeParcelable.c
    public String zza;

    @SafeParcelable.c
    public String zzb;

    @SafeParcelable.c
    public String zzc;

    @SafeParcelable.c
    public String zzd;

    @SafeParcelable.c
    public String zze;

    @SafeParcelable.c
    public zzf zzf;

    @SafeParcelable.c
    public zzf zzg;

    public zzg() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 2, this.zza, false);
        a.j(parcel, 3, this.zzb, false);
        a.j(parcel, 4, this.zzc, false);
        a.j(parcel, 5, this.zzd, false);
        a.j(parcel, 6, this.zze, false);
        a.i(parcel, 7, this.zzf, i12, false);
        a.i(parcel, 8, this.zzg, i12, false);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzg(@SafeParcelable.e String str, @SafeParcelable.e String str2, @SafeParcelable.e String str3, @SafeParcelable.e String str4, @SafeParcelable.e String str5, @SafeParcelable.e zzf zzfVar, @SafeParcelable.e zzf zzfVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzfVar;
        this.zzg = zzfVar2;
    }
}
