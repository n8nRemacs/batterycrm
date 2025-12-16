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
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzx();

    @SafeParcelable.c
    public double zza;

    @SafeParcelable.c
    public double zzb;

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        double d12 = this.zza;
        a.q(parcel, 2, 8);
        parcel.writeDouble(d12);
        double d13 = this.zzb;
        a.q(parcel, 3, 8);
        parcel.writeDouble(d13);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzk(@SafeParcelable.e double d12, @SafeParcelable.e double d13) {
        this.zza = d12;
        this.zzb = d13;
    }
}
