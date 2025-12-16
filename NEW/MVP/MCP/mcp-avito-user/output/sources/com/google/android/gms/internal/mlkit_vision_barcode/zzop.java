package com.google.android.gms.internal.mlkit_vision_barcode;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzop extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzop> CREATOR = new zzoq();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352299b;

    @SafeParcelable.b
    public zzop(@SafeParcelable.e int i12) {
        this.f352299b = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352299b);
        a.p(parcel, iO2);
    }
}
