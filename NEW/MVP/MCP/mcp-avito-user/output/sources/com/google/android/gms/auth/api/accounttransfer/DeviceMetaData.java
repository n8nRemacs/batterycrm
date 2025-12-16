package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class DeviceMetaData extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<DeviceMetaData> CREATOR = new y();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348552b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348553c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final long f348554d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348555e;

    @SafeParcelable.b
    public DeviceMetaData(@SafeParcelable.e long j12, @SafeParcelable.e int i12, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13) {
        this.f348552b = i12;
        this.f348553c = z12;
        this.f348554d = j12;
        this.f348555e = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348552b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f348553c ? 1 : 0);
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(this.f348554d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f348555e ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
