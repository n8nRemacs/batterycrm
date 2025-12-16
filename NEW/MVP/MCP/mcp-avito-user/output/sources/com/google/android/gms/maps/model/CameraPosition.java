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
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new n();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354375b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354376c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354377d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354378e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public LatLng f354379a;

        /* renamed from: b, reason: collision with root package name */
        public float f354380b;

        /* renamed from: c, reason: collision with root package name */
        public float f354381c;

        /* renamed from: d, reason: collision with root package name */
        public float f354382d;
    }

    @SafeParcelable.b
    public CameraPosition(@SafeParcelable.e LatLng latLng, @SafeParcelable.e float f12, @SafeParcelable.e float f13, @SafeParcelable.e float f14) {
        C36729v.k(latLng, "null camera target");
        C36729v.c(0.0f <= f13 && f13 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f13));
        this.f354375b = latLng;
        this.f354376c = f12;
        this.f354377d = f13 + 0.0f;
        this.f354378e = (((double) f14) <= 0.0d ? (f14 % 360.0f) + 360.0f : f14) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f354375b.equals(cameraPosition.f354375b) && Float.floatToIntBits(this.f354376c) == Float.floatToIntBits(cameraPosition.f354376c) && Float.floatToIntBits(this.f354377d) == Float.floatToIntBits(cameraPosition.f354377d) && Float.floatToIntBits(this.f354378e) == Float.floatToIntBits(cameraPosition.f354378e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f354375b, Float.valueOf(this.f354376c), Float.valueOf(this.f354377d), Float.valueOf(this.f354378e)});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f354375b, "target");
        aVarB.a(Float.valueOf(this.f354376c), "zoom");
        aVarB.a(Float.valueOf(this.f354377d), "tilt");
        aVarB.a(Float.valueOf(this.f354378e), "bearing");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f354375b, i12, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeFloat(this.f354376c);
        TX0.a.q(parcel, 4, 4);
        parcel.writeFloat(this.f354377d);
        TX0.a.q(parcel, 5, 4);
        parcel.writeFloat(this.f354378e);
        TX0.a.p(parcel, iO2);
    }
}
