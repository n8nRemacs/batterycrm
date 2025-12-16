package com.my.target;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.my.target.B;
import com.my.tracker.ads.AdFormat;
import e11.C39849D;
import e11.C39903s;
import org.json.JSONObject;

/* renamed from: com.my.target.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37780d {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f364779a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final c f364780b = new c(null);

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public b f364781c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public B f364782d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f364783e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f364784f;

    /* renamed from: com.my.target.d$b */
    public interface b {
        void a(boolean z12);

        boolean a(float f12, float f13);

        boolean a(int i12, int i13, int i14, int i15, int i16, boolean z12);

        boolean a(@j.P Uri uri);

        boolean a(@j.N String str);

        void b(@j.N Uri uri);

        void c();

        void c(@j.N JsResult jsResult);

        void d();

        void d(@j.N C37780d c37780d, @j.N WebView webView);

        void e(@j.N ConsoleMessage consoleMessage);

        boolean f();

        void g();

        boolean g(boolean z12, C39903s c39903s);
    }

    /* renamed from: com.my.target.d$c */
    public class c extends WebViewClient {
        public c(a aVar) {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            C37780d c37780d = C37780d.this;
            if (c37780d.f364783e) {
                return;
            }
            c37780d.f364783e = true;
            b bVar = c37780d.f364781c;
            if (bVar != null) {
                bVar.d(c37780d, c37780d.f364782d.getWebView());
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C37780d.this.b(webResourceRequest.getUrl());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C37780d.this.b(Uri.parse(str));
            return true;
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: com.my.target.d$d, reason: collision with other inner class name */
    public static class C10787d {
    }

    /* renamed from: com.my.target.d$e */
    public class e extends WebChromeClient {
        public e(a aVar) {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.message();
            consoleMessage.lineNumber();
            b bVar = C37780d.this.f364781c;
            if (bVar == null) {
                return super.onConsoleMessage(consoleMessage);
            }
            bVar.e(consoleMessage);
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            b bVar = C37780d.this.f364781c;
            if (bVar == null) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
            bVar.c(jsResult);
            return true;
        }
    }

    /* renamed from: com.my.target.d$f */
    public class f implements B.a {
        public f(a aVar) {
        }

        @Override // com.my.target.B.a
        public final void a(boolean z12) {
            b bVar = C37780d.this.f364781c;
            if (bVar != null) {
                bVar.a(z12);
            }
        }

        @Override // com.my.target.B.a
        public final void c() {
            b bVar = C37780d.this.f364781c;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    public C37780d(@j.N String str) {
        this.f364779a = str;
    }

    @j.N
    public static String a(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    @j.N
    public static String i(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    @j.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@j.N android.net.Uri r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getScheme()
            java.lang.String r1 = r6.getHost()
            java.lang.String r2 = "mytarget"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L19
            java.lang.String r0 = "onloadmraidjs"
            r0.equals(r1)
            r6.toString()
            return
        L19:
            java.lang.String r2 = "mraid"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L93
            java.lang.String r0 = ","
            boolean r2 = r1.contains(r0)
            if (r2 == 0) goto L36
            int r0 = r1.indexOf(r0)
            r2 = 0
            java.lang.String r0 = r1.substring(r2, r0)
            java.lang.String r1 = r0.trim()
        L36:
            r6.toString()
            java.lang.String r6 = r6.toString()
            e11.m r0 = new e11.m
            java.lang.String r2 = r5.f364779a
            r0.<init>(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mraidbridge.nativeComplete("
            r1.<init>(r2)
            java.lang.String r2 = r0.f394682b
            java.lang.String r3 = org.json.JSONObject.quote(r2)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r5.f(r1)
            java.lang.String r1 = "{"
            int r1 = r6.indexOf(r1)
            java.lang.String r3 = "}"
            int r3 = r6.lastIndexOf(r3)
            int r3 = r3 + 1
            if (r1 < 0) goto L86
            if (r3 <= 0) goto L86
            if (r1 >= r3) goto L86
            int r4 = r6.length()     // Catch: java.lang.Throwable -> L84
            if (r3 > r4) goto L86
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L84
            java.lang.String r6 = r6.substring(r1, r3)     // Catch: java.lang.Throwable -> L84
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L84
            goto L87
        L84:
            r6 = move-exception
            goto L8b
        L86:
            r4 = 0
        L87:
            r5.d(r0, r4)     // Catch: java.lang.Throwable -> L84
            goto L92
        L8b:
            java.lang.String r6 = r6.getMessage()
            r5.g(r2, r6)
        L92:
            return
        L93:
            java.net.URI r0 = new java.net.URI     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> Lac
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lac
            com.my.target.B r0 = r5.f364782d
            if (r0 == 0) goto Lab
            boolean r0 = r0.f364330e
            if (r0 == 0) goto Lab
            com.my.target.d$b r0 = r5.f364781c
            if (r0 == 0) goto Lab
            r0.b(r6)
        Lab:
            return
        Lac:
            r6.toString()
            java.lang.String r6 = ""
            java.lang.String r0 = "Mraid command sent an invalid URL"
            r5.g(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.C37780d.b(android.net.Uri):void");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void c(@j.N B b12) {
        this.f364782d = b12;
        WebSettings settings = b12.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            if (AdFormat.INTERSTITIAL.equals(this.f364779a)) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        }
        this.f364782d.setScrollContainer(false);
        this.f364782d.setVerticalScrollBarEnabled(false);
        this.f364782d.setHorizontalScrollBarEnabled(false);
        this.f364782d.setWebViewClient(this.f364780b);
        this.f364782d.setWebChromeClient(new e(null));
        this.f364782d.setVisibilityChangedListener(new f(null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @j.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@j.N e11.C39886m r19, @j.P org.json.JSONObject r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.C37780d.d(e11.m, org.json.JSONObject):void");
    }

    public final void e(@j.N C39849D c39849d) {
        StringBuilder sb2 = new StringBuilder("mraidbridge.setScreenSize(");
        sb2.append(i(c39849d.f394297b));
        sb2.append(");window.mraidbridge.setMaxSize(");
        sb2.append(i(c39849d.f394303h));
        sb2.append(");window.mraidbridge.setCurrentPosition(");
        Rect rect = c39849d.f394299d;
        sb2.append(a(rect));
        sb2.append(");window.mraidbridge.setDefaultPosition(");
        sb2.append(a(c39849d.f394301f));
        sb2.append(")");
        f(sb2.toString());
        f("mraidbridge.fireSizeChangeEvent(" + i(rect) + ")");
    }

    public final void f(@j.N String str) {
        if (this.f364782d == null) {
            return;
        }
        String str2 = "javascript:window." + str + ";";
        hashCode();
        WebView webView = this.f364782d.f394853b;
        if (webView == null) {
            return;
        }
        try {
            webView.loadUrl(str2);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public final void g(@j.N String str, @j.N String str2) {
        f("mraidbridge.fireErrorEvent(" + JSONObject.quote(str2) + ", " + JSONObject.quote(str) + ")");
    }

    public final void h(boolean z12) {
        if (z12 != this.f364784f) {
            f("mraidbridge.setIsViewable(" + z12 + ")");
        }
        this.f364784f = z12;
    }

    public final void j(String str) {
        f("mraidbridge.setState(" + JSONObject.quote(str) + ")");
    }

    public final void k(@j.N String str) {
        B b12 = this.f364782d;
        if (b12 == null) {
            return;
        }
        this.f364783e = false;
        WebView webView = b12.f394853b;
        if (webView == null) {
            return;
        }
        try {
            webView.loadDataWithBaseURL("https://ad.mail.ru/", str, "text/html", Constants.ENCODING, null);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
