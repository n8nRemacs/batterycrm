package com.google.android.gms.auth.api.identity;

import OX0.s;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import j.N;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public final class SignInCredential extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<SignInCredential> CREATOR = new s();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348694b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348695c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348696d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348697e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Uri f348698f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348699g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348700h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348701i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final PublicKeyCredential f348702j;

    @SafeParcelable.b
    public SignInCredential(@SafeParcelable.e String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e @P String str4, @SafeParcelable.e @P Uri uri, @SafeParcelable.e @P String str5, @SafeParcelable.e @P String str6, @SafeParcelable.e @P String str7, @SafeParcelable.e @P PublicKeyCredential publicKeyCredential) {
        C36729v.j(str);
        this.f348694b = str;
        this.f348695c = str2;
        this.f348696d = str3;
        this.f348697e = str4;
        this.f348698f = uri;
        this.f348699g = str5;
        this.f348700h = str6;
        this.f348701i = str7;
        this.f348702j = publicKeyCredential;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return C36727t.a(this.f348694b, signInCredential.f348694b) && C36727t.a(this.f348695c, signInCredential.f348695c) && C36727t.a(this.f348696d, signInCredential.f348696d) && C36727t.a(this.f348697e, signInCredential.f348697e) && C36727t.a(this.f348698f, signInCredential.f348698f) && C36727t.a(this.f348699g, signInCredential.f348699g) && C36727t.a(this.f348700h, signInCredential.f348700h) && C36727t.a(this.f348701i, signInCredential.f348701i) && C36727t.a(this.f348702j, signInCredential.f348702j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348694b, this.f348695c, this.f348696d, this.f348697e, this.f348698f, this.f348699g, this.f348700h, this.f348701i, this.f348702j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f348694b, false);
        TX0.a.j(parcel, 2, this.f348695c, false);
        TX0.a.j(parcel, 3, this.f348696d, false);
        TX0.a.j(parcel, 4, this.f348697e, false);
        TX0.a.i(parcel, 5, this.f348698f, i12, false);
        TX0.a.j(parcel, 6, this.f348699g, false);
        TX0.a.j(parcel, 7, this.f348700h, false);
        TX0.a.j(parcel, 8, this.f348701i, false);
        TX0.a.i(parcel, 9, this.f348702j, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
