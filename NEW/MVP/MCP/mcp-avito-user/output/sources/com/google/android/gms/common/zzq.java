package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new P();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349629b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @I41.h
    public final String f349630c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349631d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349632e;

    @SafeParcelable.b
    public zzq(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e String str, @SafeParcelable.e boolean z12) {
        this.f349629b = z12;
        this.f349630c = str;
        this.f349631d = W.a(i12) - 1;
        this.f349632e = D.a(i13) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349629b ? 1 : 0);
        TX0.a.j(parcel, 2, this.f349630c, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349631d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f349632e);
        TX0.a.p(parcel, iO2);
    }
}
