package com.iab.omid.library.corpmailru.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.corpmailru.adsession.AdSessionContext;
import com.iab.omid.library.corpmailru.adsession.VerificationScriptResource;
import com.iab.omid.library.corpmailru.b.e;
import com.iab.omid.library.corpmailru.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: a, reason: collision with root package name */
    private WebView f364016a;

    /* renamed from: b, reason: collision with root package name */
    private Long f364017b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f364018c;

    /* renamed from: d, reason: collision with root package name */
    private final String f364019d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f364018c = map;
        this.f364019d = str;
    }

    @Override // com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() { // from class: com.iab.omid.library.corpmailru.publisher.b.1

            /* renamed from: b, reason: collision with root package name */
            private final WebView f364021b;

            {
                this.f364021b = b.this.f364016a;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f364021b.destroy();
            }
        }, Math.max(4000 - (this.f364017b == null ? 4000L : TimeUnit.MILLISECONDS.convert(d.a() - this.f364017b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f364016a = null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.corpmailru.b.d.a().b());
        this.f364016a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f364016a);
        e.a().a(this.f364016a, this.f364019d);
        for (String str : this.f364018c.keySet()) {
            e.a().a(this.f364016a, this.f364018c.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f364017b = Long.valueOf(d.a());
    }

    @Override // com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher
    public void a() {
        super.a();
        j();
    }

    @Override // com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.corpmailru.adsession.a aVar, AdSessionContext adSessionContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            com.iab.omid.library.corpmailru.d.b.a(jSONObject, str, injectedResourcesMap.get(str));
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
