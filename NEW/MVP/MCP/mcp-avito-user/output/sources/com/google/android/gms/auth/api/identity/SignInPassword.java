package com.google.android.gms.auth.api.identity;

import OX0.u;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public class SignInPassword extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<SignInPassword> CREATOR = new u();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348703b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348704c;

    @SafeParcelable.b
    public SignInPassword(@SafeParcelable.e @N String str, @SafeParcelable.e @N String str2) {
        C36729v.k(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        C36729v.g(strTrim, "Account identifier cannot be empty");
        this.f348703b = strTrim;
        C36729v.f(str2);
        this.f348704c = str2;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return C36727t.a(this.f348703b, signInPassword.f348703b) && C36727t.a(this.f348704c, signInPassword.f348704c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348703b, this.f348704c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f348703b, false);
        TX0.a.j(parcel, 2, this.f348704c, false);
        TX0.a.p(parcel, iO2);
    }
}
