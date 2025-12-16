package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class cp1 extends o6 {

    /* renamed from: f, reason: collision with root package name */
    private WebView f384378f;

    /* renamed from: g, reason: collision with root package name */
    private Long f384379g = null;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, de1> f384380h;

    /* renamed from: i, reason: collision with root package name */
    private final String f384381i;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final WebView f384382b;

        public a(cp1 cp1Var) {
            this.f384382b = cp1Var.f384378f;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f384382b.destroy();
        }
    }

    public cp1(String str, Map map) {
        this.f384380h = map;
        this.f384381i = str;
    }

    @Override // com.yandex.mobile.ads.impl.o6
    public final void b() {
        super.b();
        new Handler().postDelayed(new a(this), Math.max(4000 - (this.f384379g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f384379g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f384378f = null;
    }

    @Override // com.yandex.mobile.ads.impl.o6
    public final void a(to1 to1Var, l6 l6Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, de1> mapD = l6Var.d();
        for (String str : mapD.keySet()) {
            gp1.a(jSONObject, str, mapD.get(str));
        }
        a(to1Var, l6Var, jSONObject);
    }

    @Override // com.yandex.mobile.ads.impl.o6
    public final void a() {
        WebView webView = new WebView(qp1.a().b());
        this.f384378f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f384378f);
        WebView webView2 = this.f384378f;
        String str = this.f384381i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String str2 : this.f384380h.keySet()) {
            String externalForm = this.f384380h.get(str2).a().toExternalForm();
            WebView webView3 = this.f384378f;
            if (externalForm != null && !TextUtils.isEmpty(str2)) {
                String strReplace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str2);
                if (webView3 != null && !TextUtils.isEmpty(strReplace)) {
                    webView3.loadUrl("javascript: " + strReplace);
                }
            }
        }
        this.f384379g = Long.valueOf(System.nanoTime());
    }
}
