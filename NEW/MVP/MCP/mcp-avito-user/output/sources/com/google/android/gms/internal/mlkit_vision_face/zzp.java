package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();

    @SafeParcelable.c
    public int zza;

    @SafeParcelable.c
    public int zzb;

    @SafeParcelable.c
    public int zzc;

    @SafeParcelable.c
    public long zzd;

    @SafeParcelable.c
    public int zze;

    public zzp() {
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
        long j12 = this.zzd;
        a.q(parcel, 5, 8);
        parcel.writeLong(j12);
        int i16 = this.zze;
        a.q(parcel, 6, 4);
        parcel.writeInt(i16);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzp(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e long j12, @SafeParcelable.e int i15) {
        this.zza = i12;
        this.zzb = i13;
        this.zzc = i14;
        this.zzd = j12;
        this.zze = i15;
    }
}
