package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C36764h();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final long f349854b;

    @SafeParcelable.b
    public zzab(@SafeParcelable.e long j12) {
        this.f349854b = Long.valueOf(j12).longValue();
    }

    public final boolean equals(@j.P Object obj) {
        return (obj instanceof zzab) && this.f349854b == ((zzab) obj).f349854b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f349854b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 8);
        parcel.writeLong(this.f349854b);
        TX0.a.p(parcel, iO2);
    }
}
