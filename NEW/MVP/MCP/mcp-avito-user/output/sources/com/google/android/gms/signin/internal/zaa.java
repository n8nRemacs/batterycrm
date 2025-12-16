package com.google.android.gms.signin.internal;

import TX0.a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.P;
import jY0.C42327b;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zaa extends AbstractSafeParcelable implements r {
    public static final Parcelable.Creator<zaa> CREATOR = new C42327b();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f355601b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f355602c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Intent f355603d;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.r
    public final Status getStatus() {
        return this.f355602c == 0 ? Status.f348900f : Status.f348904j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = a.o(parcel, 20293);
        a.q(parcel, 1, 4);
        parcel.writeInt(this.f355601b);
        a.q(parcel, 2, 4);
        parcel.writeInt(this.f355602c);
        a.i(parcel, 3, this.f355603d, i12, false);
        a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public zaa(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e @P Intent intent) {
        this.f355601b = i12;
        this.f355602c = i13;
        this.f355603d = intent;
    }
}
