package com.google.android.gms.appset;

import NX0.d;
import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new d();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348526b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348527c;

    @SafeParcelable.b
    public zza(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2) {
        this.f348526b = str;
        this.f348527c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.j(parcel, 1, this.f348526b, false);
        a.j(parcel, 2, this.f348527c, false);
        a.p(parcel, iO2);
    }
}
