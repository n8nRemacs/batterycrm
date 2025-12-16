package com.google.android.gms.auth.api.identity;

import OX0.h;
import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new h();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f348599b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348600c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348601d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348602e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Account f348603f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348604g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348605h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348606i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Bundle f348607j;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f348608a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public String f348609b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f348610c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f348611d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public Account f348612e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public String f348613f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public String f348614g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f348615h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public Bundle f348616i;
    }

    @SafeParcelable.b
    public AuthorizationRequest(@SafeParcelable.e ArrayList arrayList, @SafeParcelable.e @P String str, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13, @SafeParcelable.e @P Account account, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e boolean z14, @SafeParcelable.e @P Bundle bundle) {
        boolean z15 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z15 = true;
        }
        C36729v.a("requestedScopes cannot be null or empty", z15);
        this.f348599b = arrayList;
        this.f348600c = str;
        this.f348601d = z12;
        this.f348602e = z13;
        this.f348603f = account;
        this.f348604g = str2;
        this.f348605h = str3;
        this.f348606i = z14;
        this.f348607j = bundle;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        ArrayList arrayList = this.f348599b;
        if (arrayList.size() == authorizationRequest.f348599b.size() && arrayList.containsAll(authorizationRequest.f348599b)) {
            Bundle bundle = this.f348607j;
            Bundle bundle2 = authorizationRequest.f348607j;
            if (bundle == null) {
                if (bundle2 == null) {
                    bundle2 = null;
                }
                return false;
            }
            if (bundle == null || bundle2 != null) {
                if (bundle != null) {
                    if (bundle.size() != bundle2.size()) {
                        return false;
                    }
                    for (String str : bundle.keySet()) {
                        if (!C36727t.a(bundle.getString(str), bundle2.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f348601d == authorizationRequest.f348601d && this.f348606i == authorizationRequest.f348606i && this.f348602e == authorizationRequest.f348602e && C36727t.a(this.f348600c, authorizationRequest.f348600c) && C36727t.a(this.f348603f, authorizationRequest.f348603f) && C36727t.a(this.f348604g, authorizationRequest.f348604g) && C36727t.a(this.f348605h, authorizationRequest.f348605h)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348599b, this.f348600c, Boolean.valueOf(this.f348601d), Boolean.valueOf(this.f348606i), Boolean.valueOf(this.f348602e), this.f348603f, this.f348604g, this.f348605h, this.f348607j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f348599b, false);
        TX0.a.j(parcel, 2, this.f348600c, false);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f348601d ? 1 : 0);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f348602e ? 1 : 0);
        TX0.a.i(parcel, 5, this.f348603f, i12, false);
        TX0.a.j(parcel, 6, this.f348604g, false);
        TX0.a.j(parcel, 7, this.f348605h, false);
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(this.f348606i ? 1 : 0);
        TX0.a.a(parcel, 9, this.f348607j, false);
        TX0.a.p(parcel, iO2);
    }
}
