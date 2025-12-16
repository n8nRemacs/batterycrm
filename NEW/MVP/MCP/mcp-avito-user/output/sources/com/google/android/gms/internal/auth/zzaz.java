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
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f350011b;

    @SafeParcelable.c
    public final String zzb;

    @SafeParcelable.c
    public final byte[] zzc;

    @SafeParcelable.b
    public zzaz(@SafeParcelable.e String str, @SafeParcelable.e byte[] bArr, int i12) {
        this.f350011b = 1;
        C36729v.j(str);
        this.zzb = str;
        C36729v.j(bArr);
        this.zzc = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f350011b);
        a.j(parcel, 2, this.zzb, false);
        a.b(parcel, 3, this.zzc, false);
        a.p(parcel, iO2);
    }

    public zzaz(String str, byte[] bArr) {
        this(str, bArr, 0);
    }
}
