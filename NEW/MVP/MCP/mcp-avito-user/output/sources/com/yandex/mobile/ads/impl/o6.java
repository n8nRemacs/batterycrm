package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class o6 {

    /* renamed from: a, reason: collision with root package name */
    private hp1 f388445a;

    /* renamed from: b, reason: collision with root package name */
    private p2 f388446b;

    /* renamed from: c, reason: collision with root package name */
    private qc0 f388447c;

    /* renamed from: d, reason: collision with root package name */
    private int f388448d;

    /* renamed from: e, reason: collision with root package name */
    private long f388449e;

    public o6() {
        f();
        this.f388445a = new hp1(null);
    }

    public void a() {
    }

    public void b() {
        this.f388445a.clear();
    }

    public final p2 c() {
        return this.f388446b;
    }

    public final qc0 d() {
        return this.f388447c;
    }

    public final WebView e() {
        return this.f388445a.get();
    }

    public final void f() {
        this.f388449e = System.nanoTime();
        this.f388448d = 1;
    }

    public final void a(WebView webView) {
        this.f388445a = new hp1(webView);
    }

    public final void b(String str, long j12) {
        if (j12 < this.f388449e || this.f388448d == 3) {
            return;
        }
        this.f388448d = 3;
        wp1.a(e(), str);
    }

    public final void a(k6 k6Var) {
        wp1.a(e(), k6Var.d());
    }

    public final void a(p2 p2Var) {
        this.f388446b = p2Var;
    }

    public final void a(qc0 qc0Var) {
        this.f388447c = qc0Var;
    }

    public void a(to1 to1Var, l6 l6Var) {
        a(to1Var, l6Var, null);
    }

    public final void a(to1 to1Var, l6 l6Var, JSONObject jSONObject) throws JSONException {
        String strH = to1Var.h();
        JSONObject jSONObject2 = new JSONObject();
        gp1.a(jSONObject2, "environment", "app");
        gp1.a(jSONObject2, "adSessionType", l6Var.a());
        gp1.a(jSONObject2, "deviceInfo", wo1.a());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        gp1.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        gp1.a(jSONObject3, "partnerName", l6Var.f().b());
        gp1.a(jSONObject3, "partnerVersion", l6Var.f().c());
        gp1.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        gp1.a(jSONObject4, "libraryVersion", "1.3.26-Yandex");
        gp1.a(jSONObject4, "appId", qp1.a().b().getApplicationContext().getPackageName());
        gp1.a(jSONObject2, "app", jSONObject4);
        if (l6Var.b() != null) {
            gp1.a(jSONObject2, "contentUrl", l6Var.b());
        }
        if (l6Var.c() != null) {
            gp1.a(jSONObject2, "customReferenceData", l6Var.c());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (de1 de1Var : l6Var.g()) {
            gp1.a(jSONObject5, de1Var.b(), de1Var.c());
        }
        wp1.a(e(), strH, jSONObject2, jSONObject5, jSONObject);
    }

    public final void a(String str) {
        wp1.a(e(), str, (JSONObject) null);
    }

    public final void a(String str, long j12) {
        if (j12 >= this.f388449e) {
            this.f388448d = 2;
            wp1.a(e(), str);
        }
    }

    public final void a(boolean z12) {
        if (this.f388445a.get() != null) {
            wp1.b(e(), z12 ? "foregrounded" : "backgrounded");
        }
    }
}
