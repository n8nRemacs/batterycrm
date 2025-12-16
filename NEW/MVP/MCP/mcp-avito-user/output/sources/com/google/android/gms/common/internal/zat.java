package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C36698d0();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349480b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final Account f349481c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f349482d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final GoogleSignInAccount f349483e;

    @SafeParcelable.b
    public zat(@SafeParcelable.e int i12, @SafeParcelable.e Account account, @SafeParcelable.e int i13, @SafeParcelable.e @j.P GoogleSignInAccount googleSignInAccount) {
        this.f349480b = i12;
        this.f349481c = account;
        this.f349482d = i13;
        this.f349483e = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349480b);
        TX0.a.i(parcel, 2, this.f349481c, i12, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f349482d);
        TX0.a.i(parcel, 4, this.f349483e, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
