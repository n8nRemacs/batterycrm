package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new D();

    /* renamed from: c, reason: collision with root package name */
    public static final StreetViewSource f354469c = new StreetViewSource(0);

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354470b;

    static {
        new StreetViewSource(1);
    }

    @SafeParcelable.b
    public StreetViewSource(@SafeParcelable.e int i12) {
        this.f354470b = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.f354470b == ((StreetViewSource) obj).f354470b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354470b)});
    }

    public final String toString() {
        int i12 = this.f354470b;
        return "StreetViewSource:".concat(i12 != 0 ? i12 != 1 ? androidx.camera.camera2.internal.G.e(i12, "UNKNOWN(", ")") : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354470b);
        TX0.a.p(parcel, iO2);
    }
}
