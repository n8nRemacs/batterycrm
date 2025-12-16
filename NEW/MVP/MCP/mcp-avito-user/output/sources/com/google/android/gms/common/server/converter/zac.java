package com.google.android.gms.common.server.converter;

import TX0.a;
import XX0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349553b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349554c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349555d;

    @SafeParcelable.b
    public zac(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e int i13) {
        this.f349553b = i12;
        this.f349554c = str;
        this.f349555d = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f349553b);
        a.j(parcel, 2, this.f349554c, false);
        a.q(parcel, 3, 4);
        parcel.writeInt(this.f349555d);
        a.p(parcel, iO2);
    }

    public zac(String str, int i12) {
        this.f349553b = 1;
        this.f349554c = str;
        this.f349555d = i12;
    }
}
