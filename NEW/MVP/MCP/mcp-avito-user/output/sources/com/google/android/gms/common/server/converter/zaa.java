package com.google.android.gms.common.server.converter;

import XX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349551b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final StringToIntConverter f349552c;

    @SafeParcelable.b
    public zaa(@SafeParcelable.e int i12, @SafeParcelable.e StringToIntConverter stringToIntConverter) {
        this.f349551b = i12;
        this.f349552c = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349551b);
        TX0.a.i(parcel, 2, this.f349552c, i12, false);
        TX0.a.p(parcel, iO2);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f349551b = 1;
        this.f349552c = stringToIntConverter;
    }
}
