package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;
import j.P;
import j.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
/* loaded from: classes6.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements C36616a.d.f, ReflectedParcelable {

    @N
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: m, reason: collision with root package name */
    @N
    public static final GoogleSignInOptions f348733m;

    /* renamed from: n, reason: collision with root package name */
    @N
    @k0
    public static final Scope f348734n;

    /* renamed from: o, reason: collision with root package name */
    @N
    @k0
    public static final Scope f348735o;

    /* renamed from: p, reason: collision with root package name */
    @N
    @k0
    public static final Scope f348736p;

    /* renamed from: q, reason: collision with root package name */
    @N
    @k0
    public static final Scope f348737q;

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator f348738r;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f348739b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f348740c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final Account f348741d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348742e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348743f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f348744g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348745h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348746i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f348747j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    @P
    public final String f348748k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f348749l;

    static {
        Scope scope = new Scope(1, "profile");
        f348734n = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f348735o = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f348736p = scope3;
        f348737q = new Scope(1, "https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.f348750a.add(scope2);
        aVar.f348750a.add(scope);
        f348733m = aVar.a();
        a aVar2 = new a();
        HashSet hashSet = aVar2.f348750a;
        hashSet.add(scope3);
        hashSet.addAll(Arrays.asList(new Scope[0]));
        aVar2.a();
        CREATOR = new k();
        f348738r = new i();
    }

    @P
    public static GoogleSignInOptions h(@P String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            hashSet.add(new Scope(1, jSONArray.getString(i12)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap i(@P ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f348767c), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(@j.P java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f348745h
            java.util.ArrayList r1 = r8.f348740c
            r2 = 0
            if (r9 != 0) goto L8
            return r2
        L8:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r3 = r9.f348740c     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r4 = r9.f348745h     // Catch: java.lang.ClassCastException -> L7b
            android.accounts.Account r5 = r9.f348741d     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r6 = r8.f348747j     // Catch: java.lang.ClassCastException -> L7b
            boolean r6 = r6.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 == 0) goto L7b
            java.util.ArrayList r6 = r9.f348747j     // Catch: java.lang.ClassCastException -> L7b
            boolean r6 = r6.isEmpty()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != 0) goto L21
            goto L7b
        L21:
            int r6 = r1.size()     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r7.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            int r7 = r7.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != r7) goto L7b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.containsAll(r6)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L3c
            goto L7b
        L3c:
            android.accounts.Account r1 = r8.f348741d     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L43
            if (r5 != 0) goto L7b
            goto L49
        L43:
            boolean r1 = r1.equals(r5)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
        L49:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L56
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 == 0) goto L7b
            goto L5d
        L56:
            boolean r0 = r0.equals(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != 0) goto L5d
            goto L7b
        L5d:
            boolean r0 = r8.f348744g     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f348744g     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.f348742e     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f348742e     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.f348743f     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f348743f     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            java.lang.String r0 = r8.f348748k     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r9 = r9.f348748k     // Catch: java.lang.ClassCastException -> L7b
            boolean r9 = android.text.TextUtils.equals(r0, r9)     // Catch: java.lang.ClassCastException -> L7b
            if (r9 == 0) goto L7b
            r9 = 1
            return r9
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f348740c;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(((Scope) arrayList2.get(i12)).f348899c);
        }
        Collections.sort(arrayList);
        com.google.android.gms.auth.api.signin.internal.a aVar = new com.google.android.gms.auth.api.signin.internal.a();
        aVar.a(arrayList);
        aVar.a(this.f348741d);
        aVar.a(this.f348745h);
        aVar.f348777a = (((((aVar.f348777a * 31) + (this.f348744g ? 1 : 0)) * 31) + (this.f348742e ? 1 : 0)) * 31) + (this.f348743f ? 1 : 0);
        aVar.a(this.f348748k);
        return aVar.f348777a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f348739b);
        TX0.a.n(parcel, 2, new ArrayList(this.f348740c), false);
        TX0.a.i(parcel, 3, this.f348741d, i12, false);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f348742e ? 1 : 0);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f348743f ? 1 : 0);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(this.f348744g ? 1 : 0);
        TX0.a.j(parcel, 7, this.f348745h, false);
        TX0.a.j(parcel, 8, this.f348746i, false);
        TX0.a.n(parcel, 9, this.f348747j, false);
        TX0.a.j(parcel, 10, this.f348748k, false);
        TX0.a.p(parcel, iO2);
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f348750a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f348751b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f348752c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f348753d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public String f348754e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public final Account f348755f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public final String f348756g;

        /* renamed from: h, reason: collision with root package name */
        public final HashMap f348757h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public String f348758i;

        public a() {
            this.f348750a = new HashSet();
            this.f348757h = new HashMap();
        }

        @N
        public final GoogleSignInOptions a() {
            Scope scope = GoogleSignInOptions.f348737q;
            HashSet hashSet = this.f348750a;
            if (hashSet.contains(scope)) {
                Scope scope2 = GoogleSignInOptions.f348736p;
                if (hashSet.contains(scope2)) {
                    hashSet.remove(scope2);
                }
            }
            if (this.f348753d && (this.f348755f == null || !hashSet.isEmpty())) {
                this.f348750a.add(GoogleSignInOptions.f348735o);
            }
            return new GoogleSignInOptions(new ArrayList(hashSet), this.f348755f, this.f348753d, this.f348751b, this.f348752c, this.f348754e, this.f348756g, this.f348757h, this.f348758i);
        }

        public a(@N GoogleSignInOptions googleSignInOptions) {
            this.f348750a = new HashSet();
            this.f348757h = new HashMap();
            C36729v.j(googleSignInOptions);
            this.f348750a = new HashSet(googleSignInOptions.f348740c);
            this.f348751b = googleSignInOptions.f348743f;
            this.f348752c = googleSignInOptions.f348744g;
            this.f348753d = googleSignInOptions.f348742e;
            this.f348754e = googleSignInOptions.f348745h;
            this.f348755f = googleSignInOptions.f348741d;
            this.f348756g = googleSignInOptions.f348746i;
            this.f348757h = GoogleSignInOptions.i(googleSignInOptions.f348747j);
            this.f348758i = googleSignInOptions.f348748k;
        }
    }

    public GoogleSignInOptions(int i12, ArrayList arrayList, @P Account account, boolean z12, boolean z13, boolean z14, @P String str, @P String str2, Map map, @P String str3) {
        this.f348739b = i12;
        this.f348740c = arrayList;
        this.f348741d = account;
        this.f348742e = z12;
        this.f348743f = z13;
        this.f348744g = z14;
        this.f348745h = str;
        this.f348746i = str2;
        this.f348747j = new ArrayList(map.values());
        this.f348749l = map;
        this.f348748k = str3;
    }
}
