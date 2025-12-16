package com.yatatsu.powerwebview;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.ConsoleMessage;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yatatsu.powerwebview.f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PowerWebView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001:\u0003:\t;B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104¨\u0006<"}, d2 = {"Lcom/yatatsu/powerwebview/PowerWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "b", "I", "getPowerWebViewState$annotations", "()V", "powerWebViewState", "Lcom/yatatsu/powerwebview/g;", "e", "Lcom/yatatsu/powerwebview/g;", "getSslErrorHandlerDelegate", "()Lcom/yatatsu/powerwebview/g;", "setSslErrorHandlerDelegate", "(Lcom/yatatsu/powerwebview/g;)V", "sslErrorHandlerDelegate", "Lcom/yatatsu/powerwebview/a;", "f", "Lcom/yatatsu/powerwebview/a;", "getHttpAuthHandlerDelegate", "()Lcom/yatatsu/powerwebview/a;", "setHttpAuthHandlerDelegate", "(Lcom/yatatsu/powerwebview/a;)V", "httpAuthHandlerDelegate", "Lcom/yatatsu/powerwebview/b;", "g", "Lcom/yatatsu/powerwebview/b;", "getHttpErrorHandlerDelegate", "()Lcom/yatatsu/powerwebview/b;", "setHttpErrorHandlerDelegate", "(Lcom/yatatsu/powerwebview/b;)V", "httpErrorHandlerDelegate", "Lcom/yatatsu/powerwebview/PowerWebView$c;", "h", "Lcom/yatatsu/powerwebview/PowerWebView$c;", "getWebResourceErrorHandlerDelegate", "()Lcom/yatatsu/powerwebview/PowerWebView$c;", "setWebResourceErrorHandlerDelegate", "(Lcom/yatatsu/powerwebview/PowerWebView$c;)V", "webResourceErrorHandlerDelegate", "", "i", "Z", "getFailOnSslError", "()Z", "setFailOnSslError", "(Z)V", "failOnSslError", "j", "getInterceptTouchEvent", "setInterceptTouchEvent", "interceptTouchEvent", "a", "c", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class PowerWebView extends WebView {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int powerWebViewState;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CopyOnWriteArrayList<com.yatatsu.powerwebview.c> f392925c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CopyOnWriteArrayList<d> f392926d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public g sslErrorHandlerDelegate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    public com.yatatsu.powerwebview.a httpAuthHandlerDelegate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    public com.yatatsu.powerwebview.b httpErrorHandlerDelegate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    public c webResourceErrorHandlerDelegate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean failOnSslError;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean interceptTouchEvent;

    /* compiled from: PowerWebView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yatatsu/powerwebview/PowerWebView$a;", "Landroid/webkit/WebChromeClient;", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(@k ConsoleMessage consoleMessage) {
            com.yatatsu.powerwebview.b httpErrorHandlerDelegate;
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && (httpErrorHandlerDelegate = PowerWebView.this.getHttpErrorHandlerDelegate()) != null) {
                httpErrorHandlerDelegate.b(consoleMessage.lineNumber() + ": " + consoleMessage.message());
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@k WebView webView, int i12) {
            super.onProgressChanged(webView, i12);
            PowerWebView powerWebView = PowerWebView.this;
            if (powerWebView.powerWebViewState == 1) {
                Iterator<com.yatatsu.powerwebview.c> it = powerWebView.f392925c.iterator();
                while (it.hasNext()) {
                    it.next().e(i12);
                }
            }
        }
    }

    /* compiled from: PowerWebView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yatatsu/powerwebview/PowerWebView$c;", "", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void a(@k WebView webView, @k WebResourceRequest webResourceRequest, @k WebResourceError webResourceError);
    }

    public PowerWebView(@k Context context) {
        super(context);
        this.f392925c = new CopyOnWriteArrayList<>();
        this.f392926d = new CopyOnWriteArrayList<>();
        b(context, null);
    }

    public final void a(@k d dVar) {
        this.f392926d.add(dVar);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        setWebViewClient(new b());
        setWebChromeClient(new a());
        int[] iArr = f.c.f392935a;
        TypedArray typedArrayObtainStyledAttributes = attributeSet != null ? context.obtainStyledAttributes(attributeSet, iArr) : context.obtainStyledAttributes(iArr);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        boolean z16 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        boolean z17 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        boolean z18 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        int i12 = typedArrayObtainStyledAttributes.getInt(7, -1);
        boolean z19 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        boolean z22 = typedArrayObtainStyledAttributes.getBoolean(9, false);
        boolean z23 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        boolean z24 = typedArrayObtainStyledAttributes.getBoolean(11, true);
        boolean z25 = typedArrayObtainStyledAttributes.getBoolean(12, false);
        boolean z26 = typedArrayObtainStyledAttributes.getBoolean(13, true);
        boolean z27 = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z28 = typedArrayObtainStyledAttributes.getBoolean(15, true);
        boolean z29 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        boolean z32 = typedArrayObtainStyledAttributes.getBoolean(18, true);
        boolean z33 = typedArrayObtainStyledAttributes.getBoolean(19, false);
        boolean z34 = typedArrayObtainStyledAttributes.getBoolean(20, true);
        boolean z35 = typedArrayObtainStyledAttributes.getBoolean(21, true);
        WebSettings settings = getSettings();
        settings.setAllowContentAccess(z12);
        settings.setAllowFileAccess(z13);
        settings.setBlockNetworkImage(z16);
        settings.setBlockNetworkLoads(z17);
        settings.setBuiltInZoomControls(z18);
        settings.setCacheMode(i12);
        settings.setDatabaseEnabled(z19);
        settings.setDisplayZoomControls(z22);
        settings.setDomStorageEnabled(z23);
        settings.setGeolocationEnabled(z24);
        settings.setJavaScriptCanOpenWindowsAutomatically(z25);
        settings.setJavaScriptEnabled(z26);
        settings.setLoadWithOverviewMode(z27);
        settings.setLoadsImagesAutomatically(z28);
        settings.setNeedInitialFocus(z29);
        settings.setSaveFormData(z32);
        settings.setSupportMultipleWindows(z33);
        settings.setSupportZoom(z34);
        settings.setUseWideViewPort(z35);
        settings.setAllowFileAccessFromFileURLs(z14);
        settings.setAllowUniversalAccessFromFileURLs(z15);
        typedArrayObtainStyledAttributes.recycle();
        removeJavascriptInterface("searchBoxJavaBridge_");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        stopLoading();
        setWebChromeClient(null);
        this.sslErrorHandlerDelegate = null;
        this.httpAuthHandlerDelegate = null;
        this.f392925c.clear();
        this.f392926d.clear();
        super.destroy();
    }

    public final boolean getFailOnSslError() {
        return this.failOnSslError;
    }

    @l
    public final com.yatatsu.powerwebview.a getHttpAuthHandlerDelegate() {
        return this.httpAuthHandlerDelegate;
    }

    @l
    public final com.yatatsu.powerwebview.b getHttpErrorHandlerDelegate() {
        return this.httpErrorHandlerDelegate;
    }

    public final boolean getInterceptTouchEvent() {
        return this.interceptTouchEvent;
    }

    @l
    public final g getSslErrorHandlerDelegate() {
        return this.sslErrorHandlerDelegate;
    }

    @l
    public final c getWebResourceErrorHandlerDelegate() {
        return this.webResourceErrorHandlerDelegate;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(@k String str, @k Map<String, String> map) {
        Uri uri = Uri.parse(str);
        Iterator<d> it = this.f392926d.iterator();
        while (it.hasNext()) {
            if (it.next().b(true, uri)) {
                return;
            }
        }
        super.loadUrl(str, map);
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(@l MotionEvent motionEvent) {
        if (this.interceptTouchEvent) {
            requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setFailOnSslError(boolean z12) {
        this.failOnSslError = z12;
    }

    public final void setHttpAuthHandlerDelegate(@l com.yatatsu.powerwebview.a aVar) {
        this.httpAuthHandlerDelegate = aVar;
    }

    public final void setHttpErrorHandlerDelegate(@l com.yatatsu.powerwebview.b bVar) {
        this.httpErrorHandlerDelegate = bVar;
    }

    public final void setInterceptTouchEvent(boolean z12) {
        this.interceptTouchEvent = z12;
    }

    public final void setSslErrorHandlerDelegate(@l g gVar) {
        this.sslErrorHandlerDelegate = gVar;
    }

    public final void setWebResourceErrorHandlerDelegate(@l c cVar) {
        this.webResourceErrorHandlerDelegate = cVar;
    }

    /* compiled from: PowerWebView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yatatsu/powerwebview/PowerWebView$b;", "Landroid/webkit/WebViewClient;", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@k WebView webView, @k String str) {
            super.onPageFinished(webView, str);
            PowerWebView powerWebView = PowerWebView.this;
            if (powerWebView.powerWebViewState == 1) {
                Iterator<com.yatatsu.powerwebview.c> it = powerWebView.f392925c.iterator();
                while (it.hasNext()) {
                    com.yatatsu.powerwebview.c next = it.next();
                    next.e(100);
                    next.m(str);
                }
            }
            powerWebView.powerWebViewState = 0;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@k WebView webView, @k String str, @l Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            PowerWebView powerWebView = PowerWebView.this;
            if (powerWebView.powerWebViewState == 0) {
                powerWebView.powerWebViewState = 1;
                Iterator<com.yatatsu.powerwebview.c> it = powerWebView.f392925c.iterator();
                while (it.hasNext()) {
                    it.next().f(bitmap, str);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@k WebView webView, int i12, @k String str, @k String str2) {
            super.onReceivedError(webView, i12, str, str2);
            PowerWebView powerWebView = PowerWebView.this;
            powerWebView.powerWebViewState = 2;
            Iterator<com.yatatsu.powerwebview.c> it = powerWebView.f392925c.iterator();
            while (it.hasNext()) {
                it.next().k(i12, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(@k WebView webView, @k HttpAuthHandler httpAuthHandler, @k String str, @k String str2) {
            PowerWebView powerWebView = PowerWebView.this;
            if (powerWebView.getHttpAuthHandlerDelegate() != null) {
                powerWebView.getHttpAuthHandlerDelegate().a();
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(@k WebView webView, @k WebResourceRequest webResourceRequest, @k WebResourceResponse webResourceResponse) {
            G0 g02;
            com.yatatsu.powerwebview.b httpErrorHandlerDelegate = PowerWebView.this.getHttpErrorHandlerDelegate();
            if (httpErrorHandlerDelegate != null) {
                httpErrorHandlerDelegate.a(webResourceResponse);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(@k WebView webView, @k SslErrorHandler sslErrorHandler, @k SslError sslError) {
            PowerWebView powerWebView = PowerWebView.this;
            if (powerWebView.getSslErrorHandlerDelegate() != null) {
                powerWebView.getSslErrorHandlerDelegate().c(webView, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
            if (powerWebView.getFailOnSslError()) {
                int primaryError = sslError.getPrimaryError();
                String url = sslError.getUrl();
                powerWebView.powerWebViewState = 2;
                Iterator<com.yatatsu.powerwebview.c> it = powerWebView.f392925c.iterator();
                while (it.hasNext()) {
                    it.next().k(primaryError, "SSL error", url);
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@k WebView webView, @k WebResourceRequest webResourceRequest) {
            String string = webResourceRequest.getUrl().toString();
            if (!TextUtils.isEmpty(string)) {
                Uri uri = Uri.parse(string);
                boolean zHasGesture = webResourceRequest.hasGesture();
                Iterator<d> it = PowerWebView.this.f392926d.iterator();
                while (it.hasNext()) {
                    if (it.next().b(zHasGesture, uri)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@k WebView webView, @k WebResourceRequest webResourceRequest, @k WebResourceError webResourceError) {
            c webResourceErrorHandlerDelegate = PowerWebView.this.getWebResourceErrorHandlerDelegate();
            if (webResourceErrorHandlerDelegate != null) {
                webResourceErrorHandlerDelegate.a(webView, webResourceRequest, webResourceError);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public PowerWebView(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f392925c = new CopyOnWriteArrayList<>();
        this.f392926d = new CopyOnWriteArrayList<>();
        b(context, attributeSet);
    }

    @Override // android.webkit.WebView
    public final void loadUrl(@k String str) {
        Uri uri = Uri.parse(str);
        Iterator<d> it = this.f392926d.iterator();
        while (it.hasNext()) {
            if (it.next().b(true, uri)) {
                return;
            }
        }
        super.loadUrl(str);
    }

    private static /* synthetic */ void getPowerWebViewState$annotations() {
    }
}
