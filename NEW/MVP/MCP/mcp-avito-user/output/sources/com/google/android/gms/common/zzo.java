package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.d;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new O();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349623b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349624c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349625d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final Context f349626e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349627f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349628g;

    @SafeParcelable.b
    public zzo(@SafeParcelable.e String str, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e IBinder iBinder, @SafeParcelable.e boolean z14, @SafeParcelable.e boolean z15) {
        this.f349623b = str;
        this.f349624c = z12;
        this.f349625d = z13;
        this.f349626e = (Context) com.google.android.gms.dynamic.f.g4(d.a.f4(iBinder));
        this.f349627f = z14;
        this.f349628g = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f349623b, false);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349624c ? 1 : 0);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349625d ? 1 : 0);
        TX0.a.e(parcel, 4, new com.google.android.gms.dynamic.f(this.f349626e));
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f349627f ? 1 : 0);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f349628g ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
