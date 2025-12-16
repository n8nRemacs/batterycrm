package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements com.google.android.gms.common.api.r {

    @j.N
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new r();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final Status f354255b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final LocationSettingsStates f354256c;

    @SafeParcelable.b
    public LocationSettingsResult(@SafeParcelable.e @j.N Status status, @SafeParcelable.e @j.P LocationSettingsStates locationSettingsStates) {
        this.f354255b = status;
        this.f354256c = locationSettingsStates;
    }

    @Override // com.google.android.gms.common.api.r
    @j.N
    public final Status getStatus() {
        return this.f354255b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f354255b, i12, false);
        TX0.a.i(parcel, 2, this.f354256c, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
