package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new e();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348536b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348537c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @Deprecated
    public final String f348538d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final Account f348539e;

    public AccountChangeEventsRequest() {
        this.f348536b = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348536b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f348537c);
        TX0.a.j(parcel, 3, this.f348538d, false);
        TX0.a.i(parcel, 4, this.f348539e, i12, false);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public AccountChangeEventsRequest(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e String str, @SafeParcelable.e Account account) {
        this.f348536b = i12;
        this.f348537c = i13;
        this.f348538d = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f348539e = account;
        } else {
            this.f348539e = new Account(str, "com.google");
        }
    }
}
