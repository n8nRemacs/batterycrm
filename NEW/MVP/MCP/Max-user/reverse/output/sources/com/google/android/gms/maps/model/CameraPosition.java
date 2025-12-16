package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a9j;
import defpackage.h79;
import defpackage.l4;
import defpackage.obh;
import defpackage.s5j;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CameraPosition extends l4 implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new obh(20);
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        s5j.h(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive: " + f2);
        }
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(this.a, "target");
        h79Var.t(Float.valueOf(this.b), "zoom");
        h79Var.t(Float.valueOf(this.c), "tilt");
        h79Var.t(Float.valueOf(this.d), "bearing");
        return h79Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.f(parcel, 2, this.a, i);
        a9j.m(parcel, 3, 4);
        parcel.writeFloat(this.b);
        a9j.m(parcel, 4, 4);
        parcel.writeFloat(this.c);
        a9j.m(parcel, 5, 4);
        parcel.writeFloat(this.d);
        a9j.l(parcel, iK);
    }
}
