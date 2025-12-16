package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C36915l();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final Bundle f355532b;

    @SafeParcelable.b
    public zzaj(@SafeParcelable.e Bundle bundle) {
        this.f355532b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.a(parcel, 1, this.f355532b, false);
        TX0.a.p(parcel, iO2);
    }
}
