package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {

    @RX0.a
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new r();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354409b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354410c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public double f354411a = Double.POSITIVE_INFINITY;

        /* renamed from: b, reason: collision with root package name */
        public double f354412b = Double.NEGATIVE_INFINITY;

        /* renamed from: c, reason: collision with root package name */
        public double f354413c = Double.NaN;

        /* renamed from: d, reason: collision with root package name */
        public double f354414d = Double.NaN;

        public final LatLngBounds a() {
            C36729v.l("no included points", !Double.isNaN(this.f354413c));
            return new LatLngBounds(new LatLng(this.f354411a, this.f354413c), new LatLng(this.f354412b, this.f354414d));
        }

        public final void b(LatLng latLng) {
            this.f354411a = Math.min(this.f354411a, latLng.f354407b);
            this.f354412b = Math.max(this.f354412b, latLng.f354407b);
            boolean zIsNaN = Double.isNaN(this.f354413c);
            double d12 = latLng.f354408c;
            if (zIsNaN) {
                this.f354413c = d12;
            } else {
                double d13 = this.f354413c;
                double d14 = this.f354414d;
                if (d13 <= d14) {
                    if (d13 <= d12 && d12 <= d14) {
                        return;
                    }
                } else if (d13 <= d12 || d12 <= d14) {
                    return;
                }
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d13 - d12) + 360.0d) % 360.0d < ((d12 - d14) + 360.0d) % 360.0d) {
                    this.f354413c = d12;
                    return;
                }
            }
            this.f354414d = d12;
        }
    }

    @SafeParcelable.b
    public LatLngBounds(@SafeParcelable.e LatLng latLng, @SafeParcelable.e LatLng latLng2) {
        C36729v.k(latLng, "null southwest");
        C36729v.k(latLng2, "null northeast");
        double d12 = latLng2.f354407b;
        double d13 = latLng.f354407b;
        C36729v.c(d12 >= d13, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d13), Double.valueOf(d12));
        this.f354409b = latLng;
        this.f354410c = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f354409b.equals(latLngBounds.f354409b) && this.f354410c.equals(latLngBounds.f354410c);
    }

    public final LatLng h() {
        LatLng latLng = this.f354409b;
        double d12 = latLng.f354407b;
        LatLng latLng2 = this.f354410c;
        double d13 = (d12 + latLng2.f354407b) / 2.0d;
        double d14 = latLng2.f354408c;
        double d15 = latLng.f354408c;
        if (d15 > d14) {
            d14 += 360.0d;
        }
        return new LatLng(d13, (d14 + d15) / 2.0d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f354409b, this.f354410c});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f354409b, "southwest");
        aVarB.a(this.f354410c, "northeast");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f354409b, i12, false);
        TX0.a.i(parcel, 3, this.f354410c, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
