package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<SignInAccount> CREATOR = new n();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @Deprecated
    public final String f348759b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final GoogleSignInAccount f348760c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @Deprecated
    public final String f348761d;

    @SafeParcelable.b
    public SignInAccount(@SafeParcelable.e String str, @SafeParcelable.e GoogleSignInAccount googleSignInAccount, @SafeParcelable.e String str2) {
        this.f348760c = googleSignInAccount;
        C36729v.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f348759b = str;
        C36729v.g(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f348761d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 4, this.f348759b, false);
        TX0.a.i(parcel, 7, this.f348760c, i12, false);
        TX0.a.j(parcel, 8, this.f348761d, false);
        TX0.a.p(parcel, iO2);
    }
}
