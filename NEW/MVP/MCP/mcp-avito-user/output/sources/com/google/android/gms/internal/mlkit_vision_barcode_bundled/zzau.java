package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzbj();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final double f352352b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final double f352353c;

    @SafeParcelable.b
    public zzau(@SafeParcelable.e double d12, @SafeParcelable.e double d13) {
        this.f352352b = d12;
        this.f352353c = d13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 8);
        parcel.writeDouble(this.f352352b);
        a.q(parcel, 2, 8);
        parcel.writeDouble(this.f352353c);
        a.p(parcel, iO2);
    }
}
