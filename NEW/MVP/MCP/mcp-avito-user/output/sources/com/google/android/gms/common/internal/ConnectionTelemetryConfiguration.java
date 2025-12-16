package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
@RX0.a
/* loaded from: classes6.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @j.N
    @RX0.a
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new D0();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final RootTelemetryConfiguration f349306b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349307c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f349308d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final int[] f349309e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349310f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final int[] f349311g;

    @SafeParcelable.b
    public ConnectionTelemetryConfiguration(@SafeParcelable.e @j.N RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e @j.P int[] iArr, @SafeParcelable.e int i12, @SafeParcelable.e @j.P int[] iArr2) {
        this.f349306b = rootTelemetryConfiguration;
        this.f349307c = z12;
        this.f349308d = z13;
        this.f349309e = iArr;
        this.f349310f = i12;
        this.f349311g = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f349306b, i12, false);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f349307c ? 1 : 0);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349308d ? 1 : 0);
        TX0.a.f(parcel, 4, this.f349309e, false);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f349310f);
        TX0.a.f(parcel, 6, this.f349311g, false);
        TX0.a.p(parcel, iO2);
    }
}
