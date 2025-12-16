package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new zzbs();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352365b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352366c;

    @SafeParcelable.b
    public zzay(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2) {
        this.f352365b = str;
        this.f352366c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f352365b, false);
        a.j(parcel, 2, this.f352366c, false);
        a.p(parcel, iO2);
    }
}
