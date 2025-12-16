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
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzbt();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352367b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352368c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352369d;

    @SafeParcelable.b
    public zzaz(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e int i12) {
        this.f352367b = str;
        this.f352368c = str2;
        this.f352369d = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f352367b, false);
        a.j(parcel, 2, this.f352368c, false);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f352369d);
        a.p(parcel, iO2);
    }
}
