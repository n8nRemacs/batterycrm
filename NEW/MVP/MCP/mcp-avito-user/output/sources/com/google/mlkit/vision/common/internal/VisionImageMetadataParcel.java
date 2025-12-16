package com.google.mlkit.vision.common.internal;

import SZ0.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
@SafeParcelable.a
@RX0.a
/* loaded from: classes6.dex */
public class VisionImageMetadataParcel extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new m();

    /* renamed from: b, reason: collision with root package name */
    @RX0.a
    @SafeParcelable.c
    public final int f362451b;

    /* renamed from: c, reason: collision with root package name */
    @RX0.a
    @SafeParcelable.c
    public final int f362452c;

    /* renamed from: d, reason: collision with root package name */
    @RX0.a
    @SafeParcelable.c
    public final long f362453d;

    /* renamed from: e, reason: collision with root package name */
    @RX0.a
    @SafeParcelable.c
    public final int f362454e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f362455f;

    @SafeParcelable.b
    public VisionImageMetadataParcel(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e long j12, @SafeParcelable.e int i15) {
        this.f362451b = i12;
        this.f362452c = i13;
        this.f362455f = i14;
        this.f362453d = j12;
        this.f362454e = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f362451b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f362452c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f362455f);
        TX0.a.q(parcel, 4, 8);
        parcel.writeLong(this.f362453d);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f362454e);
        TX0.a.p(parcel, iO2);
    }
}
