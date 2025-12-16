package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzan();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352310b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String[] f352311c;

    @SafeParcelable.b
    public zzao(@SafeParcelable.e int i12, @SafeParcelable.e String[] strArr) {
        this.f352310b = i12;
        this.f352311c = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352310b);
        a.k(parcel, 2, this.f352311c, false);
        a.p(parcel, iO2);
    }
}
