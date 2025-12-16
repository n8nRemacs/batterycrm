package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new x();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348769b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final GoogleSignInOptions f348770c;

    @SafeParcelable.b
    public SignInConfiguration(@SafeParcelable.e @N String str, @SafeParcelable.e @N GoogleSignInOptions googleSignInOptions) {
        C36729v.f(str);
        this.f348769b = str;
        this.f348770c = googleSignInOptions;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f348769b.equals(signInConfiguration.f348769b)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f348770c;
            GoogleSignInOptions googleSignInOptions2 = this.f348770c;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a aVar = new a();
        aVar.a(this.f348769b);
        aVar.a(this.f348770c);
        return aVar.f348777a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 2, this.f348769b, false);
        TX0.a.i(parcel, 5, this.f348770c, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
