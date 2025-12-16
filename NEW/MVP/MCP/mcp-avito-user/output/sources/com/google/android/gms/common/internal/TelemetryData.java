package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@RX0.a
/* loaded from: classes6.dex */
public class TelemetryData extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<TelemetryData> CREATOR = new H();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349375b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @I41.h
    public List f349376c;

    @SafeParcelable.b
    public TelemetryData(@SafeParcelable.e int i12, @SafeParcelable.e @I41.h List list) {
        this.f349375b = i12;
        this.f349376c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349375b);
        TX0.a.n(parcel, 2, this.f349376c, false);
        TX0.a.p(parcel, iO2);
    }
}
