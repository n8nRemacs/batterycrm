package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import bZ0.InterfaceC25600a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C36729v;
import j.N;
import j.P;
import j.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f348778c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC25600a
    @P
    public static b f348779d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f348780a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC25600a
    public final SharedPreferences f348781b;

    @k0
    public b(Context context) {
        this.f348781b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @N
    @RX0.a
    public static b a(@N Context context) {
        C36729v.j(context);
        ReentrantLock reentrantLock = f348778c;
        reentrantLock.lock();
        try {
            if (f348779d == null) {
                f348779d = new b(context.getApplicationContext());
            }
            b bVar = f348779d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String g(String str, String str2) {
        return androidx.appcompat.app.r.r(str, ":", str2);
    }

    @RX0.a
    @P
    public final GoogleSignInAccount b() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = e(g("googleSignInAccount", strE2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.i(strE);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RX0.a
    @P
    public final GoogleSignInOptions c() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = e(g("googleSignInOptions", strE2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.h(strE);
        } catch (JSONException unused) {
            return null;
        }
    }

    @RX0.a
    public final void d(@N GoogleSignInAccount googleSignInAccount, @N GoogleSignInOptions googleSignInOptions) throws JSONException {
        C36729v.j(googleSignInAccount);
        C36729v.j(googleSignInOptions);
        String str = googleSignInAccount.f348728j;
        f("defaultGoogleSignInAccount", str);
        String strG = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f348721c;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f348722d;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f348723e;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f348724f;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f348730l;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f348731m;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f348725g;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f348726h;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f348727i);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f348729k;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).f348899c.compareTo(((Scope) obj2).f348899c);
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f348899c);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(strG, jSONObject.toString());
            String strG2 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f348746i;
            String str10 = googleSignInOptions.f348745h;
            ArrayList arrayList2 = googleSignInOptions.f348740c;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f348738r);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f348899c);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f348741d;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f348742e);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f348744g);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f348743f);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(strG2, jSONObject2.toString());
            } catch (JSONException e12) {
                throw new RuntimeException(e12);
            }
        } catch (JSONException e13) {
            throw new RuntimeException(e13);
        }
    }

    @P
    public final String e(@N String str) {
        ReentrantLock reentrantLock = this.f348780a;
        reentrantLock.lock();
        try {
            return this.f348781b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(@N String str, @N String str2) {
        ReentrantLock reentrantLock = this.f348780a;
        reentrantLock.lock();
        try {
            this.f348781b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
