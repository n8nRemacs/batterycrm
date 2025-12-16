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
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzs();

    @SafeParcelable.c
    public int zza;

    @SafeParcelable.c
    public int zzb;

    @SafeParcelable.c
    public int zzc;

    @SafeParcelable.c
    public int zzd;

    @SafeParcelable.c
    public int zze;

    @SafeParcelable.c
    public int zzf;

    @SafeParcelable.c
    public boolean zzg;

    @SafeParcelable.c
    public String zzh;

    public zzf() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        int i13 = this.zza;
        a.q(parcel, 2, 4);
        parcel.writeInt(i13);
        int i14 = this.zzb;
        a.q(parcel, 3, 4);
        parcel.writeInt(i14);
        int i15 = this.zzc;
        a.q(parcel, 4, 4);
        parcel.writeInt(i15);
        int i16 = this.zzd;
        a.q(parcel, 5, 4);
        parcel.writeInt(i16);
        int i17 = this.zze;
        a.q(parcel, 6, 4);
        parcel.writeInt(i17);
        int i18 = this.zzf;
        a.q(parcel, 7, 4);
        parcel.writeInt(i18);
        boolean z12 = this.zzg;
        a.q(parcel, 8, 4);
        parcel.writeInt(z12 ? 1 : 0);
        a.j(parcel, 9, this.zzh, false);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzf(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e int i16, @SafeParcelable.e int i17, @SafeParcelable.e boolean z12, @SafeParcelable.e String str) {
        this.zza = i12;
        this.zzb = i13;
        this.zzc = i14;
        this.zzd = i15;
        this.zze = i16;
        this.zzf = i17;
        this.zzg = z12;
        this.zzh = str;
    }
}
