package com.google.android.gms.internal.mlkit_vision_face;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new zzor();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353451b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353452c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353453d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f353454e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final long f353455f;

    @SafeParcelable.b
    public zzoq(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e int i15, @SafeParcelable.e long j12) {
        this.f353451b = i12;
        this.f353452c = i13;
        this.f353453d = i14;
        this.f353454e = i15;
        this.f353455f = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f353451b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f353452c);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f353453d);
        a.q(parcel, 4, 4);
        parcel.writeInt(this.f353454e);
        a.q(parcel, 5, 8);
        parcel.writeLong(this.f353455f);
        a.p(parcel, iO2);
    }
}
