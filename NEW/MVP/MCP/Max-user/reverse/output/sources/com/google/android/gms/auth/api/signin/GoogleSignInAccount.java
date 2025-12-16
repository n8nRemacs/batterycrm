package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a9j;
import defpackage.l4;
import defpackage.obh;
import defpackage.s5j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends l4 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new obh(10);
    public final Uri X;
    public String Y;
    public final long Z;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String o;
    public final String s0;
    public final List t0;
    public final String u0;
    public final String v0;
    public final HashSet w0 = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.o = str4;
        this.X = uri;
        this.Y = str5;
        this.Z = j;
        this.s0 = str6;
        this.t0 = arrayList;
        this.u0 = str7;
        this.v0 = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        s5j.c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.Y = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
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
        if (!googleSignInAccount.s0.equals(this.s0)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.t0);
        hashSet.addAll(googleSignInAccount.w0);
        HashSet hashSet2 = new HashSet(this.t0);
        hashSet2.addAll(this.w0);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.s0.hashCode() + 527;
        HashSet hashSet = new HashSet(this.t0);
        hashSet.addAll(this.w0);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.g(parcel, 2, this.b);
        a9j.g(parcel, 3, this.c);
        a9j.g(parcel, 4, this.d);
        a9j.g(parcel, 5, this.o);
        a9j.f(parcel, 6, this.X, i);
        a9j.g(parcel, 7, this.Y);
        a9j.m(parcel, 8, 8);
        parcel.writeLong(this.Z);
        a9j.g(parcel, 9, this.s0);
        a9j.j(parcel, this.t0, 10);
        a9j.g(parcel, 11, this.u0);
        a9j.g(parcel, 12, this.v0);
        a9j.l(parcel, iK);
    }
}
