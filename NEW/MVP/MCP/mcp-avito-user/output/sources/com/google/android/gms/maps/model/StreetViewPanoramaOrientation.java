package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new C();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354465b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354466c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public float f354467a;

        /* renamed from: b, reason: collision with root package name */
        public float f354468b;
    }

    @SafeParcelable.b
    public StreetViewPanoramaOrientation(@SafeParcelable.e float f12, @SafeParcelable.e float f13) {
        boolean z12 = -90.0f <= f12 && f12 <= 90.0f;
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb2.append(f12);
        C36729v.a(sb2.toString(), z12);
        this.f354465b = f12 + 0.0f;
        this.f354466c = (((double) f13) <= 0.0d ? (f13 % 360.0f) + 360.0f : f13) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.f354465b) == Float.floatToIntBits(streetViewPanoramaOrientation.f354465b) && Float.floatToIntBits(this.f354466c) == Float.floatToIntBits(streetViewPanoramaOrientation.f354466c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f354465b), Float.valueOf(this.f354466c)});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(Float.valueOf(this.f354465b), "tilt");
        aVarB.a(Float.valueOf(this.f354466c), "bearing");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 2, 4);
        parcel.writeFloat(this.f354465b);
        TX0.a.q(parcel, 3, 4);
        parcel.writeFloat(this.f354466c);
        TX0.a.p(parcel, iO2);
    }
}
