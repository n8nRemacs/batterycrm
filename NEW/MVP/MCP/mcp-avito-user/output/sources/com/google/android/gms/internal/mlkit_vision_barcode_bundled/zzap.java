package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new zzbe();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352312b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352313c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352314d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352315e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352316f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f352317g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f352318h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f352319i;

    @SafeParcelable.b
    public zzap(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e int i16, @SafeParcelable.e int i17, @SafeParcelable.e boolean z12, @SafeParcelable.e @P String str) {
        this.f352312b = i12;
        this.f352313c = i13;
        this.f352314d = i14;
        this.f352315e = i15;
        this.f352316f = i16;
        this.f352317g = i17;
        this.f352318h = z12;
        this.f352319i = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f352312b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f352313c);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f352314d);
        a.q(parcel, 4, 4);
        parcel.writeInt(this.f352315e);
        a.q(parcel, 5, 4);
        parcel.writeInt(this.f352316f);
        a.q(parcel, 6, 4);
        parcel.writeInt(this.f352317g);
        a.q(parcel, 7, 4);
        parcel.writeInt(this.f352318h ? 1 : 0);
        a.j(parcel, 8, this.f352319i, false);
        a.p(parcel, iO2);
    }
}
