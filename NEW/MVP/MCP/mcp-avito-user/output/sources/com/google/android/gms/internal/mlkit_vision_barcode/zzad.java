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
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();

    @SafeParcelable.c
    public int zza;

    @SafeParcelable.c
    public boolean zzb;

    public zzad() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        int i13 = this.zza;
        a.q(parcel, 2, 4);
        parcel.writeInt(i13);
        boolean z12 = this.zzb;
        a.q(parcel, 3, 4);
        parcel.writeInt(z12 ? 1 : 0);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzad(@SafeParcelable.e int i12, @SafeParcelable.e boolean z12) {
        this.zza = i12;
        this.zzb = z12;
    }
}
