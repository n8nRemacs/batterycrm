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
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new B();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final StreetViewPanoramaLink[] f354462b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354463c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f354464d;

    @SafeParcelable.b
    public StreetViewPanoramaLocation(@SafeParcelable.e StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @SafeParcelable.e LatLng latLng, @SafeParcelable.e String str) {
        this.f354462b = streetViewPanoramaLinkArr;
        this.f354463c = latLng;
        this.f354464d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f354464d.equals(streetViewPanoramaLocation.f354464d) && this.f354463c.equals(streetViewPanoramaLocation.f354463c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f354463c, this.f354464d});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f354464d, "panoId");
        aVarB.a(this.f354463c.toString(), "position");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.m(parcel, 2, this.f354462b, i12);
        TX0.a.i(parcel, 3, this.f354463c, i12, false);
        TX0.a.j(parcel, 4, this.f354464d, false);
        TX0.a.p(parcel, iO2);
    }
}
