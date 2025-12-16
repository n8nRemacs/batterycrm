package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new C36800v();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354263b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354264c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354265d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354266e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354267f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354268g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354269h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354270i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354271j;

    @SafeParcelable.b
    @InterfaceC36733z
    public SleepClassifyEvent(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e int i16, @SafeParcelable.e int i17, @SafeParcelable.e int i18, @SafeParcelable.e boolean z12, @SafeParcelable.e int i19) {
        this.f354263b = i12;
        this.f354264c = i13;
        this.f354265d = i14;
        this.f354266e = i15;
        this.f354267f = i16;
        this.f354268g = i17;
        this.f354269h = i18;
        this.f354270i = z12;
        this.f354271j = i19;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.f354263b == sleepClassifyEvent.f354263b && this.f354264c == sleepClassifyEvent.f354264c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354263b), Integer.valueOf(this.f354264c)});
    }

    @j.N
    public final String toString() {
        return this.f354263b + " Conf:" + this.f354264c + " Motion:" + this.f354265d + " Light:" + this.f354266e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f354263b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354264c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354265d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f354266e);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f354267f);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f354268g);
        TX0.a.q(parcel, 7, 4);
        parcel.writeInt(this.f354269h);
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(this.f354270i ? 1 : 0);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(this.f354271j);
        TX0.a.p(parcel, iO2);
    }
}
