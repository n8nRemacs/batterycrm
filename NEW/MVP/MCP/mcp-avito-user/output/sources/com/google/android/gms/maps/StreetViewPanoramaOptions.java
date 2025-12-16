package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import dY0.C39669m;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new C36835x();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public StreetViewPanoramaCamera f354325b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public String f354326c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public LatLng f354327d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public Integer f354328e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354329f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354330g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354331h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354332i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354333j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public StreetViewSource f354334k;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.f354329f = bool;
        this.f354330g = bool;
        this.f354331h = bool;
        this.f354332i = bool;
        this.f354334k = StreetViewSource.f354469c;
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(this.f354326c, "PanoramaId");
        aVarB.a(this.f354327d, "Position");
        aVarB.a(this.f354328e, "Radius");
        aVarB.a(this.f354334k, "Source");
        aVarB.a(this.f354325b, "StreetViewPanoramaCamera");
        aVarB.a(this.f354329f, "UserNavigationEnabled");
        aVarB.a(this.f354330g, "ZoomGesturesEnabled");
        aVarB.a(this.f354331h, "PanningGesturesEnabled");
        aVarB.a(this.f354332i, "StreetNamesEnabled");
        aVarB.a(this.f354333j, "UseViewLifecycleInFragment");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f354325b, i12, false);
        TX0.a.j(parcel, 3, this.f354326c, false);
        TX0.a.i(parcel, 4, this.f354327d, i12, false);
        TX0.a.g(parcel, 5, this.f354328e);
        byte bA2 = C39669m.a(this.f354329f);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(bA2);
        byte bA3 = C39669m.a(this.f354330g);
        TX0.a.q(parcel, 7, 4);
        parcel.writeInt(bA3);
        byte bA4 = C39669m.a(this.f354331h);
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(bA4);
        byte bA5 = C39669m.a(this.f354332i);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(bA5);
        byte bA6 = C39669m.a(this.f354333j);
        TX0.a.q(parcel, 10, 4);
        parcel.writeInt(bA6);
        TX0.a.i(parcel, 11, this.f354334k, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
