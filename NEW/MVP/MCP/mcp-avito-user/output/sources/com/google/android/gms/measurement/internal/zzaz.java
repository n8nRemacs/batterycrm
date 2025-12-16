package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzaz extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzaz> CREATOR = new A();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final Bundle f355533b;

    @SafeParcelable.b
    public zzaz(@SafeParcelable.e Bundle bundle) {
        this.f355533b = bundle;
    }

    public final Double h() {
        return Double.valueOf(this.f355533b.getDouble("value"));
    }

    public final Bundle i() {
        return new Bundle(this.f355533b);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new B(this);
    }

    public final String j() {
        return this.f355533b.getString("currency");
    }

    public final String toString() {
        return this.f355533b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.a(parcel, 2, i(), false);
        TX0.a.p(parcel, iO2);
    }
}
