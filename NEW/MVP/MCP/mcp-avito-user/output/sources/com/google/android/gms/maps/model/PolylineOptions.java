package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new y();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f354446b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354447c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354448d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354449e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354450f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354451g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354452h;

    /* renamed from: i, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public final Cap f354453i;

    /* renamed from: j, reason: collision with root package name */
    @N
    @SafeParcelable.c
    public final Cap f354454j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354455k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final ArrayList f354456l;

    public PolylineOptions() {
        this.f354447c = 10.0f;
        this.f354448d = -16777216;
        this.f354449e = 0.0f;
        this.f354450f = true;
        this.f354451g = false;
        this.f354452h = false;
        this.f354453i = new ButtCap();
        this.f354454j = new ButtCap();
        this.f354455k = 0;
        this.f354456l = null;
        this.f354446b = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 2, this.f354446b, false);
        float f12 = this.f354447c;
        TX0.a.q(parcel, 3, 4);
        parcel.writeFloat(f12);
        int i13 = this.f354448d;
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(i13);
        float f13 = this.f354449e;
        TX0.a.q(parcel, 5, 4);
        parcel.writeFloat(f13);
        boolean z12 = this.f354450f;
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.f354451g;
        TX0.a.q(parcel, 7, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.f354452h;
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(z14 ? 1 : 0);
        TX0.a.i(parcel, 9, this.f354453i, i12, false);
        TX0.a.i(parcel, 10, this.f354454j, i12, false);
        TX0.a.q(parcel, 11, 4);
        parcel.writeInt(this.f354455k);
        TX0.a.n(parcel, 12, this.f354456l, false);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public PolylineOptions(@SafeParcelable.e ArrayList arrayList, @SafeParcelable.e float f12, @SafeParcelable.e int i12, @SafeParcelable.e float f13, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e boolean z14, @SafeParcelable.e @P Cap cap, @SafeParcelable.e @P Cap cap2, @SafeParcelable.e int i13, @SafeParcelable.e @P ArrayList arrayList2) {
        this.f354447c = 10.0f;
        this.f354448d = -16777216;
        this.f354449e = 0.0f;
        this.f354450f = true;
        this.f354451g = false;
        this.f354452h = false;
        this.f354453i = new ButtCap();
        this.f354454j = new ButtCap();
        this.f354455k = 0;
        this.f354456l = null;
        this.f354446b = arrayList;
        this.f354447c = f12;
        this.f354448d = i12;
        this.f354449e = f13;
        this.f354450f = z12;
        this.f354451g = z13;
        this.f354452h = z14;
        if (cap != null) {
            this.f354453i = cap;
        }
        if (cap2 != null) {
            this.f354454j = cap2;
        }
        this.f354455k = i13;
        this.f354456l = arrayList2;
    }
}
