package com.google.android.gms.appset;

import NX0.e;
import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348528b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348529c;

    @SafeParcelable.b
    public zzc(@SafeParcelable.e String str, @SafeParcelable.e int i12) {
        this.f348528b = str;
        this.f348529c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f348528b, false);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f348529c);
        a.p(parcel, iO2);
    }
}
