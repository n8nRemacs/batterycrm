package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {

    @RX0.a
    public static final Parcelable.Creator<LatLng> CREATOR = new s();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final double f354407b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final double f354408c;

    @SafeParcelable.b
    public LatLng(@SafeParcelable.e double d12, @SafeParcelable.e double d13) {
        if (-180.0d > d13 || d13 >= 180.0d) {
            this.f354408c = ((((d13 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f354408c = d13;
        }
        this.f354407b = Math.max(-90.0d, Math.min(90.0d, d12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f354407b) == Double.doubleToLongBits(latLng.f354407b) && Double.doubleToLongBits(this.f354408c) == Double.doubleToLongBits(latLng.f354408c);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f354407b);
        int i12 = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f354408c);
        return (i12 * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("lat/lng: (");
        sb2.append(this.f354407b);
        sb2.append(",");
        sb2.append(this.f354408c);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 2, 8);
        parcel.writeDouble(this.f354407b);
        TX0.a.q(parcel, 3, 8);
        parcel.writeDouble(this.f354408c);
        TX0.a.p(parcel, iO2);
    }
}
