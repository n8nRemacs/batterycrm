package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import java.util.Arrays;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new z();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354457b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354458c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354459d;

    public static final class a {
    }

    @SafeParcelable.b
    public StreetViewPanoramaCamera(@SafeParcelable.e float f12, @SafeParcelable.e float f13, @SafeParcelable.e float f14) {
        boolean z12 = -90.0f <= f13 && f13 <= 90.0f;
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb2.append(f13);
        C36729v.a(sb2.toString(), z12);
        this.f354457b = ((double) f12) <= 0.0d ? 0.0f : f12;
        this.f354458c = 0.0f + f13;
        this.f354459d = (((double) f14) <= 0.0d ? (f14 % 360.0f) + 360.0f : f14) % 360.0f;
        StreetViewPanoramaOrientation.a aVar = new StreetViewPanoramaOrientation.a();
        aVar.f354468b = f13;
        aVar.f354467a = f14;
        new StreetViewPanoramaOrientation(aVar.f354468b, aVar.f354467a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.f354457b) == Float.floatToIntBits(streetViewPanoramaCamera.f354457b) && Float.floatToIntBits(this.f354458c) == Float.floatToIntBits(streetViewPanoramaCamera.f354458c) && Float.floatToIntBits(this.f354459d) == Float.floatToIntBits(streetViewPanoramaCamera.f354459d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f354457b), Float.valueOf(this.f354458c), Float.valueOf(this.f354459d)});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(Float.valueOf(this.f354457b), "zoom");
        aVarB.a(Float.valueOf(this.f354458c), "tilt");
        aVarB.a(Float.valueOf(this.f354459d), "bearing");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 2, 4);
        parcel.writeFloat(this.f354457b);
        TX0.a.q(parcel, 3, 4);
        parcel.writeFloat(this.f354458c);
        TX0.a.q(parcel, 4, 4);
        parcel.writeFloat(this.f354459d);
        TX0.a.p(parcel, iO2);
    }
}
