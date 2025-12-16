package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();

    @SafeParcelable.c
    public final PointF[] zza;

    @SafeParcelable.c
    public final int zzb;

    @SafeParcelable.b
    public zzd(@SafeParcelable.e PointF[] pointFArr, @SafeParcelable.e int i12) {
        this.zza = pointFArr;
        this.zzb = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.m(parcel, 2, this.zza, i12);
        int i13 = this.zzb;
        a.q(parcel, 3, 4);
        parcel.writeInt(i13);
        a.p(parcel, iO2);
    }
}
