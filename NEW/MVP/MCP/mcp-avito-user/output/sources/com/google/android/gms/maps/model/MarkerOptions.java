package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new u();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public LatLng f354416b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public String f354417c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public String f354418d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public C36817a f354419e;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354422h;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.c
    public float f354429o;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public float f354420f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public float f354421g = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354423i = true;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354424j = false;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public float f354425k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    public float f354426l = 0.5f;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    public float f354427m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    public float f354428n = 1.0f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 2, this.f354416b, i12, false);
        TX0.a.j(parcel, 3, this.f354417c, false);
        TX0.a.j(parcel, 4, this.f354418d, false);
        C36817a c36817a = this.f354419e;
        TX0.a.e(parcel, 5, c36817a == null ? null : c36817a.f354484a.asBinder());
        float f12 = this.f354420f;
        TX0.a.q(parcel, 6, 4);
        parcel.writeFloat(f12);
        float f13 = this.f354421g;
        TX0.a.q(parcel, 7, 4);
        parcel.writeFloat(f13);
        boolean z12 = this.f354422h;
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.f354423i;
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.f354424j;
        TX0.a.q(parcel, 10, 4);
        parcel.writeInt(z14 ? 1 : 0);
        float f14 = this.f354425k;
        TX0.a.q(parcel, 11, 4);
        parcel.writeFloat(f14);
        float f15 = this.f354426l;
        TX0.a.q(parcel, 12, 4);
        parcel.writeFloat(f15);
        float f16 = this.f354427m;
        TX0.a.q(parcel, 13, 4);
        parcel.writeFloat(f16);
        float f17 = this.f354428n;
        TX0.a.q(parcel, 14, 4);
        parcel.writeFloat(f17);
        TX0.a.q(parcel, 15, 4);
        parcel.writeFloat(this.f354429o);
        TX0.a.p(parcel, iO2);
    }
}
