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
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();

    @SafeParcelable.c
    public int zza;

    @SafeParcelable.c
    public int zzb;

    @SafeParcelable.c
    public int zzc;

    @SafeParcelable.c
    public boolean zzd;

    @SafeParcelable.c
    public boolean zze;

    @SafeParcelable.c
    public float zzf;

    public zzh() {
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
        boolean z12 = this.zzd;
        a.q(parcel, 5, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.zze;
        a.q(parcel, 6, 4);
        parcel.writeInt(z13 ? 1 : 0);
        float f12 = this.zzf;
        a.q(parcel, 7, 4);
        parcel.writeFloat(f12);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzh(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e float f12) {
        this.zza = i12;
        this.zzb = i13;
        this.zzc = i14;
        this.zzd = z12;
        this.zze = z13;
        this.zzf = f12;
    }
}
