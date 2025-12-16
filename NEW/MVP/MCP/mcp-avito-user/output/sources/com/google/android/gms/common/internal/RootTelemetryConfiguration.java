package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
@RX0.a
/* loaded from: classes6.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @j.N
    @RX0.a
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C36725r0();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349369b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349370c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349371d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349372e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349373f;

    @SafeParcelable.b
    public RootTelemetryConfiguration(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13) {
        this.f349369b = i12;
        this.f349370c = z12;
        this.f349371d = z13;
        this.f349372e = i13;
        this.f349373f = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349369b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349370c ? 1 : 0);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349371d ? 1 : 0);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f349372e);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f349373f);
        TX0.a.p(parcel, iO2);
    }
}
