package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;
import java.util.ArrayList;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new p();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public LatLng f354386b = null;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public double f354387c = 0.0d;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public float f354388d = 10.0f;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public int f354389e = -16777216;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public int f354390f = 0;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public float f354391g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354392h = true;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354393i = false;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public ArrayList f354394j = null;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f354386b, i12, false);
        double d12 = this.f354387c;
        TX0.a.q(parcel, 3, 8);
        parcel.writeDouble(d12);
        float f12 = this.f354388d;
        TX0.a.q(parcel, 4, 4);
        parcel.writeFloat(f12);
        int i13 = this.f354389e;
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f354390f;
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(i14);
        float f13 = this.f354391g;
        TX0.a.q(parcel, 7, 4);
        parcel.writeFloat(f13);
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(this.f354392h ? 1 : 0);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(this.f354393i ? 1 : 0);
        TX0.a.n(parcel, 10, this.f354394j, false);
        TX0.a.p(parcel, iO2);
    }
}
