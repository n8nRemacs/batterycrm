package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C0();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public Bundle f349494b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public Feature[] f349495c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public int f349496d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public ConnectionTelemetryConfiguration f349497e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.a(parcel, 1, this.f349494b, false);
        TX0.a.m(parcel, 2, this.f349495c, i12);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349496d);
        TX0.a.i(parcel, 4, this.f349497e, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
