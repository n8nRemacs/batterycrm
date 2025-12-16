package com.google.android.gms.auth.api.identity;

import OX0.i;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348617b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348618c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348619d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f348620e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final GoogleSignInAccount f348621f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final PendingIntent f348622g;

    @SafeParcelable.b
    public AuthorizationResult(@SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e @N ArrayList arrayList, @SafeParcelable.e @P GoogleSignInAccount googleSignInAccount, @SafeParcelable.e @P PendingIntent pendingIntent) {
        this.f348617b = str;
        this.f348618c = str2;
        this.f348619d = str3;
        C36729v.j(arrayList);
        this.f348620e = arrayList;
        this.f348622g = pendingIntent;
        this.f348621f = googleSignInAccount;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        return C36727t.a(this.f348617b, authorizationResult.f348617b) && C36727t.a(this.f348618c, authorizationResult.f348618c) && C36727t.a(this.f348619d, authorizationResult.f348619d) && C36727t.a(this.f348620e, authorizationResult.f348620e) && C36727t.a(this.f348622g, authorizationResult.f348622g) && C36727t.a(this.f348621f, authorizationResult.f348621f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348617b, this.f348618c, this.f348619d, this.f348620e, this.f348622g, this.f348621f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f348617b, false);
        TX0.a.j(parcel, 2, this.f348618c, false);
        TX0.a.j(parcel, 3, this.f348619d, false);
        TX0.a.l(this.f348620e, parcel, 4);
        TX0.a.i(parcel, 5, this.f348621f, i12, false);
        TX0.a.i(parcel, 6, this.f348622g, i12, false);
        TX0.a.p(parcel, iO2);
    }
}
