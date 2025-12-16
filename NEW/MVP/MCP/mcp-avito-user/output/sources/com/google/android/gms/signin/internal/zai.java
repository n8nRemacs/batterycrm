package com.google.android.gms.signin.internal;

import TX0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;
import jY0.h;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new h();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f355606b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final zat f355607c;

    @SafeParcelable.b
    public zai(@SafeParcelable.e int i12, @SafeParcelable.e zat zatVar) {
        this.f355606b = i12;
        this.f355607c = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f355606b);
        a.i(parcel, 2, this.f355607c, i12, false);
        a.p(parcel, iO2);
    }
}
