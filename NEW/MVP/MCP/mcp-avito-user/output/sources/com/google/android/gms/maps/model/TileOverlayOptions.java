package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzaf;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new H();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public zzaf f354474b;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public float f354476d;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354475c = true;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public boolean f354477e = true;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public float f354478f = 0.0f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.e(parcel, 2, this.f354474b.asBinder());
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354475c ? 1 : 0);
        TX0.a.q(parcel, 4, 4);
        parcel.writeFloat(this.f354476d);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f354477e ? 1 : 0);
        TX0.a.q(parcel, 6, 4);
        parcel.writeFloat(this.f354478f);
        TX0.a.p(parcel, iO2);
    }
}
