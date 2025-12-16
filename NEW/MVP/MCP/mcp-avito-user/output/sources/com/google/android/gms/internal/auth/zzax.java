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
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f350010b;

    @SafeParcelable.c
    public final String zzb;

    @SafeParcelable.b
    public zzax(@SafeParcelable.e String str, int i12) {
        this.f350010b = 1;
        C36729v.j(str);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f350010b);
        a.j(parcel, 2, this.zzb, false);
        a.p(parcel, iO2);
    }

    public zzax(String str) {
        this(str, 0);
    }
}
