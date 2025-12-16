package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C36702f0();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349489b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349490c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349491d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    @Deprecated
    public final Scope[] f349492e;

    @SafeParcelable.b
    public zax(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e @j.P Scope[] scopeArr) {
        this.f349489b = i12;
        this.f349490c = i13;
        this.f349491d = i14;
        this.f349492e = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349489b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349490c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349491d);
        TX0.a.m(parcel, 4, this.f349492e, i12);
        TX0.a.p(parcel, iO2);
    }
}
