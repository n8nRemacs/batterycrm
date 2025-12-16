package com.google.android.gms.internal.auth;

import TX0.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f350012b;

    @SafeParcelable.c
    public final String zzb;

    @SafeParcelable.c
    public final PendingIntent zzc;

    @SafeParcelable.b
    public zzbb(int i12, @SafeParcelable.e PendingIntent pendingIntent, @SafeParcelable.e String str) {
        this.f350012b = 1;
        C36729v.j(str);
        this.zzb = str;
        C36729v.j(pendingIntent);
        this.zzc = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f350012b);
        a.j(parcel, 2, this.zzb, false);
        a.i(parcel, 3, this.zzc, i12, false);
        a.p(parcel, iO2);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(0, pendingIntent, str);
    }
}
