package com.google.android.gms.signin.internal;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;
import j.P;
import jY0.i;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f355608b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final ConnectionResult f355609c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final zav f355610d;

    @SafeParcelable.b
    public zak(@SafeParcelable.e int i12, @SafeParcelable.e ConnectionResult connectionResult, @SafeParcelable.e @P zav zavVar) {
        this.f355608b = i12;
        this.f355609c = connectionResult;
        this.f355610d = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f355608b);
        a.i(parcel, 2, this.f355609c, i12, false);
        a.i(parcel, 3, this.f355610d, i12, false);
        a.p(parcel, iO2);
    }
}
