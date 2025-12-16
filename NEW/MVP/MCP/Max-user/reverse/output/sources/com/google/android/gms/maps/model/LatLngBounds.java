package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a9j;
import defpackage.h79;
import defpackage.l4;
import defpackage.s5j;
import defpackage.wci;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LatLngBounds extends l4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new wci(27);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        s5j.h(latLng, "southwest must not be null.");
        s5j.h(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        if (d >= d2) {
            this.a = latLng;
            this.b = latLng2;
            return;
        }
        throw new IllegalArgumentException("southern latitude exceeds northern latitude (" + d2 + " > " + d + ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(this.a, "southwest");
        h79Var.t(this.b, "northeast");
        return h79Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 2, this.a, i);
        a9j.f(parcel, 3, this.b, i);
        a9j.l(parcel, iK);
    }
}
