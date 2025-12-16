package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@RX0.a
/* loaded from: classes6.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new X();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349355b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349356c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349357d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final long f349358e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final long f349359f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349360g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f349361h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349362i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349363j;

    @SafeParcelable.b
    public MethodInvocation(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e long j12, @SafeParcelable.e long j13, @SafeParcelable.e @j.P String str, @SafeParcelable.e @j.P String str2, @SafeParcelable.e int i15, @SafeParcelable.e int i16) {
        this.f349355b = i12;
        this.f349356c = i13;
        this.f349357d = i14;
        this.f349358e = j12;
        this.f349359f = j13;
        this.f349360g = str;
        this.f349361h = str2;
        this.f349362i = i15;
        this.f349363j = i16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349355b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349356c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349357d);
        TX0.a.q(parcel, 4, 8);
        parcel.writeLong(this.f349358e);
        TX0.a.q(parcel, 5, 8);
        parcel.writeLong(this.f349359f);
        TX0.a.j(parcel, 6, this.f349360g, false);
        TX0.a.j(parcel, 7, this.f349361h, false);
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(this.f349362i);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(this.f349363j);
        TX0.a.p(parcel, iO2);
    }
}
