package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new t();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f354415b;

    @SafeParcelable.b
    public MapStyleOptions(@SafeParcelable.e String str) {
        this.f354415b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f354415b, false);
        TX0.a.p(parcel, iO2);
    }
}
