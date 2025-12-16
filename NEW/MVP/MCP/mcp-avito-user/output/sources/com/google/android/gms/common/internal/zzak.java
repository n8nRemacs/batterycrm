package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new s0();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349493b;

    @SafeParcelable.b
    public zzak(@SafeParcelable.e int i12) {
        this.f349493b = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349493b);
        TX0.a.p(parcel, iO2);
    }
}
