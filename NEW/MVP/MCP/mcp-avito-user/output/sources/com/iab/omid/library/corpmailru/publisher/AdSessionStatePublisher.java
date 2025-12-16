package com.iab.omid.library.corpmailru.publisher;

import android.support.annotation.NonNull;
import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.AdEvents;
import com.iab.omid.library.corpmailru.adsession.AdSessionConfiguration;
import com.iab.omid.library.corpmailru.adsession.AdSessionContext;
import com.iab.omid.library.corpmailru.adsession.ErrorType;
import com.iab.omid.library.corpmailru.adsession.VerificationScriptResource;
import com.iab.omid.library.corpmailru.adsession.media.MediaEvents;
import com.iab.omid.library.corpmailru.b.e;
import com.iab.omid.library.corpmailru.d.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private com.iab.omid.library.corpmailru.e.b f364007a;

    /* renamed from: b, reason: collision with root package name */
    private AdEvents f364008b;

    /* renamed from: c, reason: collision with root package name */
    private MediaEvents f364009c;

    /* renamed from: d, reason: collision with root package name */
    private a f364010d;

    /* renamed from: e, reason: collision with root package name */
    private long f364011e;

    public enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        i();
        this.f364007a = new com.iab.omid.library.corpmailru.e.b(null);
    }

    public void a() {
    }

    public void b() {
        this.f364007a.clear();
    }

    public AdEvents c() {
        return this.f364008b;
    }

    public MediaEvents d() {
        return this.f364009c;
    }

    public boolean e() {
        return this.f364007a.get() != null;
    }

    public void f() {
        e.a().a(getWebView());
    }

    public void g() {
        e.a().b(getWebView());
    }

    public WebView getWebView() {
        return this.f364007a.get();
    }

    public void h() {
        e.a().c(getWebView());
    }

    public void i() {
        this.f364011e = d.a();
        this.f364010d = a.AD_STATE_IDLE;
    }

    public void a(float f12) {
        e.a().a(getWebView(), f12);
    }

    public void b(String str, long j12) {
        if (j12 >= this.f364011e) {
            a aVar = this.f364010d;
            a aVar2 = a.AD_STATE_NOTVISIBLE;
            if (aVar != aVar2) {
                this.f364010d = aVar2;
                e.a().b(getWebView(), str);
            }
        }
    }

    public void a(WebView webView) {
        this.f364007a = new com.iab.omid.library.corpmailru.e.b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f364008b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        e.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        e.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.corpmailru.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        a(aVar, adSessionContext, null);
    }

    public void a(com.iab.omid.library.corpmailru.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) throws JSONException {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.corpmailru.d.b.a(jSONObject2, "environment", "app");
        com.iab.omid.library.corpmailru.d.b.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.corpmailru.d.b.a(jSONObject2, "deviceInfo", com.iab.omid.library.corpmailru.d.a.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.corpmailru.d.b.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.corpmailru.d.b.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        com.iab.omid.library.corpmailru.d.b.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        com.iab.omid.library.corpmailru.d.b.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        com.iab.omid.library.corpmailru.d.b.a(jSONObject4, "libraryVersion", "1.3.20-Corpmailru");
        com.iab.omid.library.corpmailru.d.b.a(jSONObject4, "appId", com.iab.omid.library.corpmailru.b.d.a().b().getApplicationContext().getPackageName());
        com.iab.omid.library.corpmailru.d.b.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.corpmailru.d.b.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.corpmailru.d.b.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.corpmailru.d.b.a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        e.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f364009c = mediaEvents;
    }

    public void a(String str) {
        e.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j12) {
        if (j12 >= this.f364011e) {
            this.f364010d = a.AD_STATE_VISIBLE;
            e.a().b(getWebView(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        e.a().a(getWebView(), str, jSONObject);
    }

    public void a(@NonNull JSONObject jSONObject) {
        e.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z12) {
        if (e()) {
            e.a().c(getWebView(), z12 ? "foregrounded" : "backgrounded");
        }
    }
}
