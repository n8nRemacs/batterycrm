package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new A();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f354460b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354461c;

    @SafeParcelable.b
    public StreetViewPanoramaLink(@SafeParcelable.e String str, @SafeParcelable.e float f12) {
        this.f354460b = str;
        this.f354461c = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.f354460b.equals(streetViewPanoramaLink.f354460b) && Float.floatToIntBits(this.f354461c) == Float.floatToIntBits(streetViewPanoramaLink.f354461c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f354460b, Float.valueOf(this.f354461c)});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f354460b, "panoId");
        aVarB.a(Float.valueOf(this.f354461c), "bearing");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f354460b, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeFloat(this.f354461c);
        TX0.a.p(parcel, iO2);
    }
}
