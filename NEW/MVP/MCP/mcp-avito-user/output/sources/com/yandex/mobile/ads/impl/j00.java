package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class j00 extends nr0 implements r00 {

    /* renamed from: k, reason: collision with root package name */
    @j.N
    protected final AdResponse f386734k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final vr0 f386735l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private HashMap f386736m;

    public class a {
        public a(Context context) {
            new WeakReference(context);
        }

        @JavascriptInterface
        public String getBannerInfo() {
            return "{\"isDelicate\": false}";
        }

        @JavascriptInterface
        public void onAdRender(int i12, String str) {
            j00.this.f386735l.a(i12, str);
        }
    }

    public j00(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var) {
        super(context);
        this.f386734k = adResponse;
        this.f386735l = new vr0(this, new h00(q21.b().a(context)));
        c(context);
    }

    public void b(int i12, String str) {
        if (TextUtils.isEmpty(str) || "undefined".equals(str)) {
            return;
        }
        HashMap map = new HashMap();
        this.f386736m = map;
        map.put("test-tag", str);
    }

    @Override // com.yandex.mobile.ads.impl.nr0, com.yandex.mobile.ads.impl.jf
    public String c() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.c());
        sb2.append(j() ? jl1.f386914a : "");
        return sb2.toString();
    }

    @SuppressLint({"AddJavascriptInterface"})
    public abstract void c(@j.N Context context);

    @Override // com.yandex.mobile.ads.impl.nr0, com.yandex.mobile.ads.impl.jf
    public final void e() {
        this.f386735l.a();
        super.e();
    }

    @j.N
    public final Map<String, String> i() {
        HashMap map = this.f386736m;
        return map != null ? map : Collections.emptyMap();
    }

    public final boolean j() {
        return "partner-code".equals(this.f386734k.j());
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Object objD = d();
        if (objD != null && (objD instanceof a)) {
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // com.yandex.mobile.ads.impl.nr0
    public void setHtmlWebViewListener(@j.N q00 q00Var) {
        super.setHtmlWebViewListener(q00Var);
        this.f386735l.a(q00Var);
    }

    @Override // com.yandex.mobile.ads.impl.nr0, com.yandex.mobile.ads.impl.o00
    public final void a() {
        if (j()) {
            this.f386735l.b();
        } else {
            super.a();
        }
    }

    public final void a(int i12, String str) {
        b(i12, str);
        super.a();
    }
}
