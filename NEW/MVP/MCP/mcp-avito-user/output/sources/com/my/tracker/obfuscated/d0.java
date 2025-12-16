package com.my.tracker.obfuscated;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f365573a;

    /* renamed from: b, reason: collision with root package name */
    private final String f365574b;

    /* renamed from: c, reason: collision with root package name */
    private final String f365575c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f365576d;

    /* renamed from: e, reason: collision with root package name */
    private final long f365577e;

    /* renamed from: f, reason: collision with root package name */
    private JSONObject f365578f;

    /* renamed from: g, reason: collision with root package name */
    private Long f365579g;

    public d0(JSONObject jSONObject, String str, String str2, boolean z12, long j12) {
        this.f365574b = str;
        this.f365573a = jSONObject;
        this.f365575c = str2;
        this.f365576d = z12;
        this.f365577e = j12;
    }

    public d0 a(long j12) {
        this.f365579g = Long.valueOf(j12);
        return this;
    }

    public Long b() {
        return this.f365579g;
    }

    public String c() {
        return this.f365575c;
    }

    public JSONObject d() {
        return this.f365573a;
    }

    public JSONObject e() {
        return this.f365578f;
    }

    public long f() {
        return this.f365577e;
    }

    public boolean g() {
        return this.f365576d;
    }

    public static d0 a(String str, String str2, long j12) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
                return a(jSONObject, str2, j12);
            }
            e2.a("RawPurchase: empty productId in data " + str);
            return null;
        } catch (Throwable th2) {
            e2.b("RawPurchase error: creating object failed", th2);
            return null;
        }
    }

    public d0 a(JSONObject jSONObject) {
        this.f365578f = jSONObject;
        return this;
    }

    public static d0 a(JSONObject jSONObject, String str, long j12) {
        return new d0(jSONObject, str, jSONObject.optString("productId"), jSONObject.has("autoRenewing"), j12);
    }

    public String a() {
        return this.f365574b;
    }
}
