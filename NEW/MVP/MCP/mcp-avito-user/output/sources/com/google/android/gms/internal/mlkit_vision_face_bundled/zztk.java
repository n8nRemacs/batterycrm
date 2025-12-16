package com.google.android.gms.internal.mlkit_vision_face_bundled;

import TX0.a;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zztk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztk> CREATOR = new zztl();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354008b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final Rect f354009c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354010d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354011e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354012f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354013g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354014h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354015i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final float f354016j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final List f354017k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    public final List f354018l;

    @SafeParcelable.b
    public zztk(@SafeParcelable.e int i12, @SafeParcelable.e Rect rect, @SafeParcelable.e float f12, @SafeParcelable.e float f13, @SafeParcelable.e float f14, @SafeParcelable.e float f15, @SafeParcelable.e float f16, @SafeParcelable.e float f17, @SafeParcelable.e float f18, @SafeParcelable.e List list, @SafeParcelable.e List list2) {
        this.f354008b = i12;
        this.f354009c = rect;
        this.f354010d = f12;
        this.f354011e = f13;
        this.f354012f = f14;
        this.f354013g = f15;
        this.f354014h = f16;
        this.f354015i = f17;
        this.f354016j = f18;
        this.f354017k = list;
        this.f354018l = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f354008b);
        a.i(parcel, 2, this.f354009c, i12, false);
        a.q(parcel, 3, 4);
        parcel.writeFloat(this.f354010d);
        a.q(parcel, 4, 4);
        parcel.writeFloat(this.f354011e);
        a.q(parcel, 5, 4);
        parcel.writeFloat(this.f354012f);
        a.q(parcel, 6, 4);
        parcel.writeFloat(this.f354013g);
        a.q(parcel, 7, 4);
        parcel.writeFloat(this.f354014h);
        a.q(parcel, 8, 4);
        parcel.writeFloat(this.f354015i);
        a.q(parcel, 9, 4);
        parcel.writeFloat(this.f354016j);
        a.n(parcel, 10, this.f354017k, false);
        a.n(parcel, 11, this.f354018l, false);
        a.p(parcel, iO2);
    }
}
