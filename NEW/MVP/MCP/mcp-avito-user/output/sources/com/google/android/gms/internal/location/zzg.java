package com.google.android.gms.internal.location;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class zzg extends AbstractSafeParcelable implements r {

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final Status f350533b;
    public static final zzg zza = new zzg(Status.f348900f);
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    @SafeParcelable.b
    public zzg(@SafeParcelable.e Status status) {
        this.f350533b = status;
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f350533b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.i(parcel, 1, this.f350533b, i12, false);
        a.p(parcel, iO2);
    }
}
