package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new h();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348720b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348721c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348722d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348723e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348724f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Uri f348725g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public String f348726h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public final long f348727i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final String f348728j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f348729k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348730l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348731m;

    /* renamed from: n, reason: collision with root package name */
    public final HashSet f348732n = new HashSet();

    static {
        com.google.android.gms.common.util.k kVar = com.google.android.gms.common.util.k.f349611a;
    }

    @SafeParcelable.b
    public GoogleSignInAccount(@SafeParcelable.e int i12, @SafeParcelable.e @P String str, @SafeParcelable.e @P String str2, @SafeParcelable.e @P String str3, @SafeParcelable.e @P String str4, @SafeParcelable.e @P Uri uri, @SafeParcelable.e @P String str5, @SafeParcelable.e long j12, @SafeParcelable.e String str6, @SafeParcelable.e ArrayList arrayList, @SafeParcelable.e @P String str7, @SafeParcelable.e @P String str8) {
        this.f348720b = i12;
        this.f348721c = str;
        this.f348722d = str2;
        this.f348723e = str3;
        this.f348724f = str4;
        this.f348725g = uri;
        this.f348726h = str5;
        this.f348727i = j12;
        this.f348728j = str6;
        this.f348729k = arrayList;
        this.f348730l = str7;
        this.f348731m = str8;
    }

    @P
    public static GoogleSignInAccount i(@P String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j12 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            hashSet.add(new Scope(1, jSONArray.getString(i12)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        C36729v.f(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j12, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f348726h = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f348728j.equals(this.f348728j) && googleSignInAccount.h().equals(h());
    }

    @N
    @RX0.a
    public final HashSet h() {
        HashSet hashSet = new HashSet(this.f348729k);
        hashSet.addAll(this.f348732n);
        return hashSet;
    }

    public final int hashCode() {
        return ((this.f348728j.hashCode() + 527) * 31) + h().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348720b);
        TX0.a.j(parcel, 2, this.f348721c, false);
        TX0.a.j(parcel, 3, this.f348722d, false);
        TX0.a.j(parcel, 4, this.f348723e, false);
        TX0.a.j(parcel, 5, this.f348724f, false);
        TX0.a.i(parcel, 6, this.f348725g, i12, false);
        TX0.a.j(parcel, 7, this.f348726h, false);
        TX0.a.q(parcel, 8, 8);
        parcel.writeLong(this.f348727i);
        TX0.a.j(parcel, 9, this.f348728j, false);
        TX0.a.n(parcel, 10, this.f348729k, false);
        TX0.a.j(parcel, 11, this.f348730l, false);
        TX0.a.j(parcel, 12, this.f348731m, false);
        TX0.a.p(parcel, iO2);
    }
}
