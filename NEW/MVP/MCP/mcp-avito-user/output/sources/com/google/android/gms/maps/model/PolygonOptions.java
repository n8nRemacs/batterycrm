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
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new x();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f354435b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f354436c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public float f354437d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public int f354438e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public int f354439f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public float f354440g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354441h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354442i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354443j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354444k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final ArrayList f354445l;

    public PolygonOptions() {
        this.f354437d = 10.0f;
        this.f354438e = -16777216;
        this.f354439f = 0;
        this.f354440g = 0.0f;
        this.f354441h = true;
        this.f354442i = false;
        this.f354443j = false;
        this.f354444k = 0;
        this.f354445l = null;
        this.f354435b = new ArrayList();
        this.f354436c = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 2, this.f354435b, false);
        ArrayList arrayList = this.f354436c;
        if (arrayList != null) {
            int iO3 = TX0.a.o(parcel, 3);
            parcel.writeList(arrayList);
            TX0.a.p(parcel, iO3);
        }
        float f12 = this.f354437d;
        TX0.a.q(parcel, 4, 4);
        parcel.writeFloat(f12);
        int i13 = this.f354438e;
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f354439f;
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(i14);
        float f13 = this.f354440g;
        TX0.a.q(parcel, 7, 4);
        parcel.writeFloat(f13);
        boolean z12 = this.f354441h;
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(z12 ? 1 : 0);
        boolean z13 = this.f354442i;
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        TX0.a.q(parcel, 10, 4);
        parcel.writeInt(this.f354443j ? 1 : 0);
        TX0.a.q(parcel, 11, 4);
        parcel.writeInt(this.f354444k);
        TX0.a.n(parcel, 12, this.f354445l, false);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public PolygonOptions(@SafeParcelable.e ArrayList arrayList, @SafeParcelable.e ArrayList arrayList2, @SafeParcelable.e float f12, @SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e float f13, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e boolean z14, @SafeParcelable.e int i14, @SafeParcelable.e @P ArrayList arrayList3) {
        this.f354435b = arrayList;
        this.f354436c = arrayList2;
        this.f354437d = f12;
        this.f354438e = i12;
        this.f354439f = i13;
        this.f354440g = f13;
        this.f354441h = z12;
        this.f354442i = z13;
        this.f354443j = z14;
        this.f354444k = i14;
        this.f354445l = arrayList3;
    }
}
