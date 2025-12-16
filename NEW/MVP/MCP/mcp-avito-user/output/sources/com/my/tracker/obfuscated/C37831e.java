package com.my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37831e {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f365587a;

    /* renamed from: b, reason: collision with root package name */
    private final String f365588b;

    /* renamed from: c, reason: collision with root package name */
    private final String f365589c;

    /* renamed from: d, reason: collision with root package name */
    private final String f365590d;

    /* renamed from: e, reason: collision with root package name */
    private final int f365591e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f365592f;

    /* renamed from: g, reason: collision with root package name */
    private final long f365593g;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f365594h;

    /* renamed from: i, reason: collision with root package name */
    private Long f365595i;

    public C37831e(JSONObject jSONObject, String str, String str2, String str3, int i12, boolean z12, long j12) {
        this.f365588b = str;
        this.f365587a = jSONObject;
        this.f365589c = str2;
        this.f365590d = str3;
        this.f365591e = i12;
        this.f365592f = z12;
        this.f365593g = j12;
    }

    public C37831e a(long j12) {
        this.f365595i = Long.valueOf(j12);
        return this;
    }

    public Long b() {
        return this.f365595i;
    }

    public String c() {
        return this.f365590d;
    }

    public JSONObject d() {
        return this.f365594h;
    }

    public JSONObject e() {
        return this.f365587a;
    }

    public String f() {
        return this.f365589c;
    }

    public int g() {
        return this.f365591e;
    }

    public long h() {
        return this.f365593g;
    }

    public static C37831e a(String str, String str2, String str3, int i12, long j12) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("productId");
            if (!TextUtils.isEmpty(strOptString)) {
                return new C37831e(jSONObject, str2, str3, strOptString, i12, jSONObject.has("priceType") && jSONObject.getInt("priceType") == 2, j12);
            }
            e2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th2) {
            e2.b("RawPurchase error: creating object failed", th2);
            return null;
        }
    }

    public C37831e a(JSONObject jSONObject) {
        this.f365594h = jSONObject;
        return this;
    }

    public String a() {
        return this.f365588b;
    }
}
