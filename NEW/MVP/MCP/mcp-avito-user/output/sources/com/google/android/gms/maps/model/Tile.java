package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new E();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354471b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354472c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final byte[] f354473d;

    @SafeParcelable.b
    public Tile(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e byte[] bArr) {
        this.f354471b = i12;
        this.f354472c = i13;
        this.f354473d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354471b);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354472c);
        TX0.a.b(parcel, 4, this.f354473d, false);
        TX0.a.p(parcel, iO2);
    }
}
