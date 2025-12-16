package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
@Deprecated
/* loaded from: classes6.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final PasswordRequestOptions f348623b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final GoogleIdTokenRequestOptions f348624c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348625d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348626e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348627f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final PasskeysRequestOptions f348628g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public final PasskeyJsonRequestOptions f348629h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348630i;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    @SafeParcelable.a
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @N
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        @SafeParcelable.c
        public final boolean f348631b;

        /* renamed from: c, reason: collision with root package name */
        @SafeParcelable.c
        @P
        public final String f348632c;

        /* renamed from: d, reason: collision with root package name */
        @SafeParcelable.c
        @P
        public final String f348633d;

        /* renamed from: e, reason: collision with root package name */
        @SafeParcelable.c
        public final boolean f348634e;

        /* renamed from: f, reason: collision with root package name */
        @SafeParcelable.c
        @P
        public final String f348635f;

        /* renamed from: g, reason: collision with root package name */
        @SafeParcelable.c
        @P
        public final ArrayList f348636g;

        /* renamed from: h, reason: collision with root package name */
        @SafeParcelable.c
        public final boolean f348637h;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f348638a = false;

            /* renamed from: b, reason: collision with root package name */
            public boolean f348639b = true;
        }

        @SafeParcelable.b
        public GoogleIdTokenRequestOptions(@SafeParcelable.e boolean z12, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e boolean z13, @SafeParcelable.e @P String str3, @SafeParcelable.e @P ArrayList arrayList, @SafeParcelable.e boolean z14) {
            boolean z15 = true;
            if (z13 && z14) {
                z15 = false;
            }
            C36729v.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z15);
            this.f348631b = z12;
            if (z12) {
                C36729v.k(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f348632c = str;
            this.f348633d = str2;
            this.f348634e = z13;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.f348636g = arrayList2;
            this.f348635f = str3;
            this.f348637h = z14;
        }

        public final boolean equals(@P Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f348631b == googleIdTokenRequestOptions.f348631b && C36727t.a(this.f348632c, googleIdTokenRequestOptions.f348632c) && C36727t.a(this.f348633d, googleIdTokenRequestOptions.f348633d) && this.f348634e == googleIdTokenRequestOptions.f348634e && C36727t.a(this.f348635f, googleIdTokenRequestOptions.f348635f) && C36727t.a(this.f348636g, googleIdTokenRequestOptions.f348636g) && this.f348637h == googleIdTokenRequestOptions.f348637h;
        }

        public final int hashCode() {
            Boolean boolValueOf = Boolean.valueOf(this.f348631b);
            Boolean boolValueOf2 = Boolean.valueOf(this.f348634e);
            Boolean boolValueOf3 = Boolean.valueOf(this.f348637h);
            return Arrays.hashCode(new Object[]{boolValueOf, this.f348632c, this.f348633d, boolValueOf2, this.f348635f, this.f348636g, boolValueOf3});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            int iO2 = TX0.a.o(parcel, 20293);
            TX0.a.q(parcel, 1, 4);
            parcel.writeInt(this.f348631b ? 1 : 0);
            TX0.a.j(parcel, 2, this.f348632c, false);
            TX0.a.j(parcel, 3, this.f348633d, false);
            TX0.a.q(parcel, 4, 4);
            parcel.writeInt(this.f348634e ? 1 : 0);
            TX0.a.j(parcel, 5, this.f348635f, false);
            TX0.a.l(this.f348636g, parcel, 6);
            TX0.a.q(parcel, 7, 4);
            parcel.writeInt(this.f348637h ? 1 : 0);
            TX0.a.p(parcel, iO2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    @SafeParcelable.a
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @N
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();

        /* renamed from: b, reason: collision with root package name */
        @SafeParcelable.c
        public final boolean f348640b;

        /* renamed from: c, reason: collision with root package name */
        @SafeParcelable.c
        public final String f348641c;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f348642a = false;

            /* renamed from: b, reason: collision with root package name */
            public String f348643b;
        }

        @SafeParcelable.b
        public PasskeyJsonRequestOptions(@SafeParcelable.e boolean z12, @SafeParcelable.e String str) {
            if (z12) {
                C36729v.j(str);
            }
            this.f348640b = z12;
            this.f348641c = str;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f348640b == passkeyJsonRequestOptions.f348640b && C36727t.a(this.f348641c, passkeyJsonRequestOptions.f348641c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f348640b), this.f348641c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            int iO2 = TX0.a.o(parcel, 20293);
            TX0.a.q(parcel, 1, 4);
            parcel.writeInt(this.f348640b ? 1 : 0);
            TX0.a.j(parcel, 2, this.f348641c, false);
            TX0.a.p(parcel, iO2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    @SafeParcelable.a
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @N
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();

        /* renamed from: b, reason: collision with root package name */
        @SafeParcelable.c
        public final boolean f348644b;

        /* renamed from: c, reason: collision with root package name */
        @SafeParcelable.c
        public final byte[] f348645c;

        /* renamed from: d, reason: collision with root package name */
        @SafeParcelable.c
        public final String f348646d;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f348647a = false;

            /* renamed from: b, reason: collision with root package name */
            public byte[] f348648b;

            /* renamed from: c, reason: collision with root package name */
            public String f348649c;
        }

        @SafeParcelable.b
        public PasskeysRequestOptions(@SafeParcelable.e boolean z12, @SafeParcelable.e byte[] bArr, @SafeParcelable.e String str) {
            if (z12) {
                C36729v.j(bArr);
                C36729v.j(str);
            }
            this.f348644b = z12;
            this.f348645c = bArr;
            this.f348646d = str;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f348644b == passkeysRequestOptions.f348644b && Arrays.equals(this.f348645c, passkeysRequestOptions.f348645c) && Objects.equals(this.f348646d, passkeysRequestOptions.f348646d);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f348645c) + (Objects.hash(Boolean.valueOf(this.f348644b), this.f348646d) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            int iO2 = TX0.a.o(parcel, 20293);
            TX0.a.q(parcel, 1, 4);
            parcel.writeInt(this.f348644b ? 1 : 0);
            TX0.a.b(parcel, 2, this.f348645c, false);
            TX0.a.j(parcel, 3, this.f348646d, false);
            TX0.a.p(parcel, iO2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    @SafeParcelable.a
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @N
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* renamed from: b, reason: collision with root package name */
        @SafeParcelable.c
        public final boolean f348650b;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f348651a = false;
        }

        @SafeParcelable.b
        public PasswordRequestOptions(@SafeParcelable.e boolean z12) {
            this.f348650b = z12;
        }

        public final boolean equals(@P Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f348650b == ((PasswordRequestOptions) obj).f348650b;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f348650b)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            int iO2 = TX0.a.o(parcel, 20293);
            TX0.a.q(parcel, 1, 4);
            parcel.writeInt(this.f348650b ? 1 : 0);
            TX0.a.p(parcel, iO2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public PasswordRequestOptions f348652a;

        /* renamed from: b, reason: collision with root package name */
        public GoogleIdTokenRequestOptions f348653b;

        /* renamed from: c, reason: collision with root package name */
        public PasskeysRequestOptions f348654c;

        /* renamed from: d, reason: collision with root package name */
        public PasskeyJsonRequestOptions f348655d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public String f348656e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f348657f;

        /* renamed from: g, reason: collision with root package name */
        public int f348658g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f348659h;

        public a() {
            Parcelable.Creator<PasswordRequestOptions> creator = PasswordRequestOptions.CREATOR;
            PasswordRequestOptions.a aVar = new PasswordRequestOptions.a();
            aVar.f348651a = false;
            this.f348652a = new PasswordRequestOptions(aVar.f348651a);
            Parcelable.Creator<GoogleIdTokenRequestOptions> creator2 = GoogleIdTokenRequestOptions.CREATOR;
            GoogleIdTokenRequestOptions.a aVar2 = new GoogleIdTokenRequestOptions.a();
            aVar2.f348638a = false;
            this.f348653b = new GoogleIdTokenRequestOptions(aVar2.f348638a, null, null, aVar2.f348639b, null, null, false);
            Parcelable.Creator<PasskeysRequestOptions> creator3 = PasskeysRequestOptions.CREATOR;
            PasskeysRequestOptions.a aVar3 = new PasskeysRequestOptions.a();
            aVar3.f348647a = false;
            this.f348654c = new PasskeysRequestOptions(aVar3.f348647a, aVar3.f348648b, aVar3.f348649c);
            Parcelable.Creator<PasskeyJsonRequestOptions> creator4 = PasskeyJsonRequestOptions.CREATOR;
            PasskeyJsonRequestOptions.a aVar4 = new PasskeyJsonRequestOptions.a();
            aVar4.f348642a = false;
            this.f348655d = new PasskeyJsonRequestOptions(aVar4.f348642a, aVar4.f348643b);
        }
    }

    @SafeParcelable.b
    public BeginSignInRequest(@SafeParcelable.e PasswordRequestOptions passwordRequestOptions, @SafeParcelable.e GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @SafeParcelable.e @P String str, @SafeParcelable.e boolean z12, @SafeParcelable.e int i12, @SafeParcelable.e @P PasskeysRequestOptions passkeysRequestOptions, @SafeParcelable.e @P PasskeyJsonRequestOptions passkeyJsonRequestOptions, @SafeParcelable.e boolean z13) {
        C36729v.j(passwordRequestOptions);
        this.f348623b = passwordRequestOptions;
        C36729v.j(googleIdTokenRequestOptions);
        this.f348624c = googleIdTokenRequestOptions;
        this.f348625d = str;
        this.f348626e = z12;
        this.f348627f = i12;
        if (passkeysRequestOptions == null) {
            Parcelable.Creator<PasskeysRequestOptions> creator = PasskeysRequestOptions.CREATOR;
            PasskeysRequestOptions.a aVar = new PasskeysRequestOptions.a();
            aVar.f348647a = false;
            passkeysRequestOptions = new PasskeysRequestOptions(aVar.f348647a, aVar.f348648b, aVar.f348649c);
        }
        this.f348628g = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            Parcelable.Creator<PasskeyJsonRequestOptions> creator2 = PasskeyJsonRequestOptions.CREATOR;
            PasskeyJsonRequestOptions.a aVar2 = new PasskeyJsonRequestOptions.a();
            aVar2.f348642a = false;
            passkeyJsonRequestOptions = new PasskeyJsonRequestOptions(aVar2.f348642a, aVar2.f348643b);
        }
        this.f348629h = passkeyJsonRequestOptions;
        this.f348630i = z13;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return C36727t.a(this.f348623b, beginSignInRequest.f348623b) && C36727t.a(this.f348624c, beginSignInRequest.f348624c) && C36727t.a(this.f348628g, beginSignInRequest.f348628g) && C36727t.a(this.f348629h, beginSignInRequest.f348629h) && C36727t.a(this.f348625d, beginSignInRequest.f348625d) && this.f348626e == beginSignInRequest.f348626e && this.f348627f == beginSignInRequest.f348627f && this.f348630i == beginSignInRequest.f348630i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348623b, this.f348624c, this.f348628g, this.f348629h, this.f348625d, Boolean.valueOf(this.f348626e), Integer.valueOf(this.f348627f), Boolean.valueOf(this.f348630i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.i(parcel, 1, this.f348623b, i12, false);
        TX0.a.i(parcel, 2, this.f348624c, i12, false);
        TX0.a.j(parcel, 3, this.f348625d, false);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f348626e ? 1 : 0);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f348627f);
        TX0.a.i(parcel, 6, this.f348628g, i12, false);
        TX0.a.i(parcel, 7, this.f348629h, i12, false);
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(this.f348630i ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
