package com.google.android.gms.internal.mlkit_vision_barcode;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new zzow();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final double f352266b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final double f352267c;

    @SafeParcelable.b
    public zzoh(@SafeParcelable.e double d12, @SafeParcelable.e double d13) {
        this.f352266b = d12;
        this.f352267c = d13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 8);
        parcel.writeDouble(this.f352266b);
        a.q(parcel, 2, 8);
        parcel.writeDouble(this.f352267c);
        a.p(parcel, iO2);
    }

    public final double zza() {
        return this.f352266b;
    }

    public final double zzb() {
        return this.f352267c;
    }
}
