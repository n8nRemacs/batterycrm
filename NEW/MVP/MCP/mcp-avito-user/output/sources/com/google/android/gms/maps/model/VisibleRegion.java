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
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new I();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354479b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354480c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354481d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354482e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLngBounds f354483f;

    @SafeParcelable.b
    public VisibleRegion(@SafeParcelable.e LatLng latLng, @SafeParcelable.e LatLng latLng2, @SafeParcelable.e LatLng latLng3, @SafeParcelable.e LatLng latLng4, @SafeParcelable.e LatLngBounds latLngBounds) {
        this.f354479b = latLng;
        this.f354480c = latLng2;
        this.f354481d = latLng3;
        this.f354482e = latLng4;
        this.f354483f = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f354479b.equals(visibleRegion.f354479b) && this.f354480c.equals(visibleRegion.f354480c) && this.f354481d.equals(visibleRegion.f354481d) && this.f354482e.equals(visibleRegion.f354482e) && this.f354483f.equals(visibleRegion.f354483f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f354479b, this.f354480c, this.f354481d, this.f354482e, this.f354483f});
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f354479b, "nearLeft");
        aVarB.a(this.f354480c, "nearRight");
        aVarB.a(this.f354481d, "farLeft");
        aVarB.a(this.f354482e, "farRight");
        aVarB.a(this.f354483f, "latLngBounds");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f354479b, i12, false);
        TX0.a.i(parcel, 3, this.f354480c, i12, false);
        TX0.a.i(parcel, 4, this.f354481d, i12, false);
        TX0.a.i(parcel, 5, this.f354482e, i12, false);
        TX0.a.i(parcel, 6, this.f354483f, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
