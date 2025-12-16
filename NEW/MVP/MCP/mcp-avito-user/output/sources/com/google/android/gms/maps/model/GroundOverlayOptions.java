package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new q();

    /* renamed from: b, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public C36817a f354395b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public LatLng f354396c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public float f354397d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public float f354398e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public LatLngBounds f354399f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public float f354400g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public float f354401h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354402i = true;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public float f354403j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public float f354404k = 0.5f;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    public float f354405l = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354406m = false;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.e(parcel, 2, this.f354395b.f354484a.asBinder());
        TX0.a.i(parcel, 3, this.f354396c, i12, false);
        TX0.a.q(parcel, 4, 4);
        parcel.writeFloat(this.f354397d);
        TX0.a.q(parcel, 5, 4);
        parcel.writeFloat(this.f354398e);
        TX0.a.i(parcel, 6, this.f354399f, i12, false);
        TX0.a.q(parcel, 7, 4);
        parcel.writeFloat(this.f354400g);
        TX0.a.q(parcel, 8, 4);
        parcel.writeFloat(this.f354401h);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(this.f354402i ? 1 : 0);
        TX0.a.q(parcel, 10, 4);
        parcel.writeFloat(this.f354403j);
        TX0.a.q(parcel, 11, 4);
        parcel.writeFloat(this.f354404k);
        TX0.a.q(parcel, 12, 4);
        parcel.writeFloat(this.f354405l);
        TX0.a.q(parcel, 13, 4);
        parcel.writeInt(this.f354406m ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
