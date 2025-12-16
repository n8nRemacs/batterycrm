package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();

    @SafeParcelable.h
    public final int zza;

    @SafeParcelable.c
    public final float zzb;

    @SafeParcelable.c
    public final float zzc;

    @SafeParcelable.c
    public final int zzd;

    @SafeParcelable.b
    public zzn(@SafeParcelable.e int i12, @SafeParcelable.e float f12, @SafeParcelable.e float f13, @SafeParcelable.e int i13) {
        this.zza = i12;
        this.zzb = f12;
        this.zzc = f13;
        this.zzd = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        int i13 = this.zza;
        a.q(parcel, 1, 4);
        parcel.writeInt(i13);
        float f12 = this.zzb;
        a.q(parcel, 2, 4);
        parcel.writeFloat(f12);
        float f13 = this.zzc;
        a.q(parcel, 3, 4);
        parcel.writeFloat(f13);
        int i14 = this.zzd;
        a.q(parcel, 4, 4);
        parcel.writeInt(i14);
        a.p(parcel, iO2);
    }
}
