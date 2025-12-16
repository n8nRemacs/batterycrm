package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new w();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final LatLng f354432b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f354433c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f354434d;

    @SafeParcelable.b
    public PointOfInterest(@SafeParcelable.e LatLng latLng, @SafeParcelable.e String str, @SafeParcelable.e String str2) {
        this.f354432b = latLng;
        this.f354433c = str;
        this.f354434d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f354432b, i12, false);
        TX0.a.j(parcel, 3, this.f354433c, false);
        TX0.a.j(parcel, 4, this.f354434d, false);
        TX0.a.p(parcel, iO2);
    }
}
