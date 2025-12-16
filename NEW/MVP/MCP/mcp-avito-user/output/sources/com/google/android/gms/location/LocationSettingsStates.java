package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C36797s();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354257b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354258c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354259d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354260e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354261f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354262g;

    @SafeParcelable.b
    public LocationSettingsStates(@SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e boolean z14, @SafeParcelable.e boolean z15, @SafeParcelable.e boolean z16, @SafeParcelable.e boolean z17) {
        this.f354257b = z12;
        this.f354258c = z13;
        this.f354259d = z14;
        this.f354260e = z15;
        this.f354261f = z16;
        this.f354262g = z17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f354257b ? 1 : 0);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354258c ? 1 : 0);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354259d ? 1 : 0);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f354260e ? 1 : 0);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f354261f ? 1 : 0);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f354262g ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
