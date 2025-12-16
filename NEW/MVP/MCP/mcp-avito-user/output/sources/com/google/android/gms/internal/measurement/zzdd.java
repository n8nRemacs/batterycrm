package com.google.android.gms.internal.measurement;

import TX0.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzdg();

    @SafeParcelable.c
    public final long zza;

    @SafeParcelable.c
    public final long zzb;

    @SafeParcelable.c
    public final boolean zzc;

    @SafeParcelable.c
    @P
    public final String zzd;

    @SafeParcelable.c
    @P
    public final String zze;

    @SafeParcelable.c
    @P
    public final String zzf;

    @SafeParcelable.c
    @P
    public final Bundle zzg;

    @SafeParcelable.c
    @P
    public final String zzh;

    @SafeParcelable.b
    public zzdd(@SafeParcelable.e long j12, @SafeParcelable.e long j13, @SafeParcelable.e boolean z12, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e @P Bundle bundle, @SafeParcelable.e @P String str4) {
        this.zza = j12;
        this.zzb = j13;
        this.zzc = z12;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        long j12 = this.zza;
        a.q(parcel, 1, 8);
        parcel.writeLong(j12);
        long j13 = this.zzb;
        a.q(parcel, 2, 8);
        parcel.writeLong(j13);
        boolean z12 = this.zzc;
        a.q(parcel, 3, 4);
        parcel.writeInt(z12 ? 1 : 0);
        a.j(parcel, 4, this.zzd, false);
        a.j(parcel, 5, this.zze, false);
        a.j(parcel, 6, this.zzf, false);
        a.a(parcel, 7, this.zzg, false);
        a.j(parcel, 8, this.zzh, false);
        a.p(parcel, iO2);
    }
}
