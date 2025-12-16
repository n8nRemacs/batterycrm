package com.my.target;

import Ca1.ViewOnTouchListenerC13234a;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.GestureDetector;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import e11.C39912v;

/* renamed from: com.my.target.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37782e extends C39912v {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f364800g = 0;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public a f364801c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364802d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f364803e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public d f364804f;

    /* renamed from: com.my.target.e$a */
    public interface a {
        void a(@j.N WebView webView);

        void a(@j.N String str);

        void b(@j.N String str);

        @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
        void c();
    }

    /* renamed from: com.my.target.e$b */
    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.message();
            consoleMessage.lineNumber();
            return false;
        }
    }

    /* renamed from: com.my.target.e$c */
    public final class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            C37782e c37782e = C37782e.this;
            if (c37782e.f364802d) {
                return;
            }
            c37782e.f364802d = true;
            super.onPageFinished(webView, str);
            a aVar = c37782e.f364801c;
            if (aVar != null) {
                aVar.a(webView);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i12, String str, String str2) {
            super.onReceivedError(webView, i12, str, str2);
            a aVar = C37782e.this.f364801c;
            if (aVar == null) {
                return;
            }
            if (str == null) {
                str = "unknown JS error";
            }
            aVar.a(str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(AvailableCode.ERROR_NO_ACTIVITY)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            a aVar = C37782e.this.f364801c;
            if (aVar == null) {
                return true;
            }
            aVar.c();
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            C37782e c37782e = C37782e.this;
            if (!c37782e.f364803e || (url = webResourceRequest.getUrl()) == null) {
                return true;
            }
            String string = url.toString();
            a aVar = c37782e.f364801c;
            if (aVar != null) {
                aVar.b(string);
            }
            c37782e.f364803e = false;
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            String string = description != null ? description.toString() : null;
            webResourceError.getErrorCode();
            webResourceRequest.getUrl().toString();
            a aVar = C37782e.this.f364801c;
            if (aVar == null) {
                return;
            }
            if (string == null) {
                string = "Unknown JS error";
            }
            aVar.a(string);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C37782e c37782e = C37782e.this;
            if (c37782e.f364803e && str != null) {
                a aVar = c37782e.f364801c;
                if (aVar != null) {
                    aVar.b(str);
                }
                c37782e.f364803e = false;
            }
            return true;
        }
    }

    /* renamed from: com.my.target.e$d */
    public interface d {
        void a();
    }

    /* renamed from: com.my.target.e$e, reason: collision with other inner class name */
    public static final class C10788e extends GestureDetector {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C37782e f364806a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public com.my.target.ads.a f364807b;

        /* renamed from: com.my.target.e$e$a */
        public interface a {
        }

        public C10788e(@j.N Context context, @j.N C37782e c37782e) {
            super(context, new GestureDetector.SimpleOnGestureListener());
            this.f364806a = c37782e;
            setIsLongpressEnabled(false);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public C37782e(@j.N Context context) {
        super(context);
        b bVar = new b();
        c cVar = new c();
        C10788e c10788e = new C10788e(getContext(), this);
        c10788e.f364807b = new com.my.target.ads.a(this, 8);
        setOnTouchListener(new ViewOnTouchListenerC13234a(c10788e, 18));
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setSupportZoom(false);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        setWebChromeClient(bVar);
        setWebViewClient(cVar);
    }

    @Override // e11.C39912v, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        d dVar = this.f364804f;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setBannerWebViewListener(@j.P a aVar) {
        this.f364801c = aVar;
    }

    public void setData(@j.N String str) {
        this.f364802d = false;
        this.f364803e = false;
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        try {
            webView.loadDataWithBaseURL("https://ad.mail.ru/", str, "text/html", Constants.ENCODING, null);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void setForceMediaPlayback(boolean z12) {
        WebView webView = getWebView();
        if (webView == null) {
            return;
        }
        webView.getSettings().setMediaPlaybackRequiresUserGesture(!z12);
    }

    public void setOnLayoutListener(@j.P d dVar) {
        this.f364804f = dVar;
    }
}
