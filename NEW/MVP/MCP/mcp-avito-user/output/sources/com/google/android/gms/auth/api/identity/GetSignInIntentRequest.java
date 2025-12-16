package com.google.android.gms.auth.api.identity;

import OX0.n;
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
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new n();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348662b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348663c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348664d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348665e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348666f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final int f348667g;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f348668a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public String f348669b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public String f348670c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public String f348671d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f348672e;

        /* renamed from: f, reason: collision with root package name */
        public int f348673f;
    }

    @SafeParcelable.b
    public GetSignInIntentRequest(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e @P String str4, @SafeParcelable.e boolean z12) {
        C36729v.j(str);
        this.f348662b = str;
        this.f348663c = str2;
        this.f348664d = str3;
        this.f348665e = str4;
        this.f348666f = z12;
        this.f348667g = i12;
    }

    public final boolean equals(@P Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return C36727t.a(this.f348662b, getSignInIntentRequest.f348662b) && C36727t.a(this.f348665e, getSignInIntentRequest.f348665e) && C36727t.a(this.f348663c, getSignInIntentRequest.f348663c) && C36727t.a(Boolean.valueOf(this.f348666f), Boolean.valueOf(getSignInIntentRequest.f348666f)) && this.f348667g == getSignInIntentRequest.f348667g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f348662b, this.f348663c, this.f348665e, Boolean.valueOf(this.f348666f), Integer.valueOf(this.f348667g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.j(parcel, 1, this.f348662b, false);
        TX0.a.j(parcel, 2, this.f348663c, false);
        TX0.a.j(parcel, 3, this.f348664d, false);
        TX0.a.j(parcel, 4, this.f348665e, false);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f348666f ? 1 : 0);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f348667g);
        TX0.a.p(parcel, iO2);
    }
}
