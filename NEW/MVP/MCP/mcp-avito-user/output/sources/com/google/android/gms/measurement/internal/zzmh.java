package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzmh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmh> CREATOR = new C36962r5();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f355551b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final long f355552c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f355553d;

    @SafeParcelable.b
    public zzmh(@SafeParcelable.e String str, @SafeParcelable.e long j12, @SafeParcelable.e int i12) {
        this.f355551b = str;
        this.f355552c = j12;
        this.f355553d = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f355551b, false);
        TX0.a.q(parcel, 2, 8);
        parcel.writeLong(this.f355552c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f355553d);
        TX0.a.p(parcel, iO2);
    }
}
