package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a9j;
import defpackage.l4;
import defpackage.wci;

/* loaded from: classes.dex */
public class SignInAccount extends l4 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new wci(21);
    public String a;
    public GoogleSignInAccount b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.g(parcel, 4, this.a);
        a9j.f(parcel, 7, this.b, i);
        a9j.g(parcel, 8, this.c);
        a9j.l(parcel, iK);
    }
}
