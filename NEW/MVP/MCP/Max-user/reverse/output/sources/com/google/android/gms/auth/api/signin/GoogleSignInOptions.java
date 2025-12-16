package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a9j;
import defpackage.el;
import defpackage.l4;
import defpackage.nw6;
import defpackage.obh;
import defpackage.vs6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends l4 implements el, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions u0;
    public static final Scope v0;
    public static final Scope w0;
    public static final Scope x0;
    public static final vs6 y0;
    public final boolean X;
    public final String Y;
    public final String Z;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean d;
    public final boolean o;
    public final ArrayList s0;
    public final String t0;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        v0 = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        w0 = scope3;
        x0 = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(x0)) {
            Scope scope4 = w0;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        u0 = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(x0)) {
            Scope scope5 = w0;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new obh(13);
        y0 = new vs6(28);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.o = z2;
        this.X = z3;
        this.Y = str;
        this.Z = str2;
        this.s0 = new ArrayList(map.values());
        this.t0 = str3;
    }

    public static GoogleSignInOptions b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                nw6 nw6Var = (nw6) it.next();
                map.put(Integer.valueOf(nw6Var.b), nw6Var);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.Y;
        ArrayList arrayList = this.b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.b;
            String str2 = googleSignInOptions.Y;
            Account account = googleSignInOptions.c;
            if (this.s0.isEmpty() && googleSignInOptions.s0.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.c;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.X == googleSignInOptions.X && this.d == googleSignInOptions.d && this.o == googleSignInOptions.o) {
                    return TextUtils.equals(this.t0, googleSignInOptions.t0);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.Y;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.X ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31;
        String str2 = this.t0;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        a9j.m(parcel, 1, 4);
        parcel.writeInt(this.a);
        a9j.j(parcel, new ArrayList(this.b), 2);
        a9j.f(parcel, 3, this.c, i);
        a9j.m(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        a9j.m(parcel, 5, 4);
        parcel.writeInt(this.o ? 1 : 0);
        a9j.m(parcel, 6, 4);
        parcel.writeInt(this.X ? 1 : 0);
        a9j.g(parcel, 7, this.Y);
        a9j.g(parcel, 8, this.Z);
        a9j.j(parcel, this.s0, 9);
        a9j.g(parcel, 10, this.t0);
        a9j.l(parcel, iK);
    }
}
