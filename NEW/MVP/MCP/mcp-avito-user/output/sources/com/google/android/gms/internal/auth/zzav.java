package com.google.android.gms.internal.auth;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f350009b;

    @SafeParcelable.c
    public final String zzb;

    @SafeParcelable.c
    public final int zzc;

    @SafeParcelable.b
    public zzav(@SafeParcelable.e String str, @SafeParcelable.e int i12, int i13) {
        this.f350009b = 1;
        C36729v.j(str);
        this.zzb = str;
        this.zzc = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f350009b);
        a.j(parcel, 2, this.zzb, false);
        int i13 = this.zzc;
        a.q(parcel, 3, 4);
        parcel.writeInt(i13);
        a.p(parcel, iO2);
    }

    public zzav(String str, int i12) {
        this(str, i12, 0);
    }
}
