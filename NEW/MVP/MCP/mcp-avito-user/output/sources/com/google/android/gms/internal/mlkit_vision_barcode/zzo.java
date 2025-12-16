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
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzab();

    @SafeParcelable.c
    public String zza;

    @SafeParcelable.c
    public String zzb;

    public zzo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 2, this.zza, false);
        a.j(parcel, 3, this.zzb, false);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zzo(@SafeParcelable.e String str, @SafeParcelable.e String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
