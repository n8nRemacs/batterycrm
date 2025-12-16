package com.google.android.gms.internal.auth;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f350023b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public String f350024c;

    public zzbw() {
        this.f350023b = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f350023b);
        a.j(parcel, 2, this.f350024c, false);
        a.p(parcel, iO2);
    }

    public final zzbw zza(String str) {
        this.f350024c = str;
        return this;
    }

    @SafeParcelable.b
    public zzbw(@SafeParcelable.e int i12, @SafeParcelable.e String str) {
        this.f350023b = i12;
        this.f350024c = str;
    }
}
