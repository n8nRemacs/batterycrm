package com.geetest.captcha.views;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.geetest.captcha.d0;
import com.geetest.captcha.e0;
import com.geetest.captcha.h0;
import com.geetest.captcha.v;
import com.geetest.captcha.w;
import com.geetest.captcha.y;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.u0;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003+,-B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB-\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/geetest/captcha/views/GTC4WebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;)V", "Lkotlin/G0;", "onDetachedFromWindow", "()V", "onResume", "newWidth", "newHeight", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "Lcom/geetest/captcha/observer/WebViewObservable;", "observable", "Lcom/geetest/captcha/model/DataBean;", "dataBean", "", "loadUrl", "init", "(Lcom/geetest/captcha/observer/WebViewObservable;Lcom/geetest/captcha/model/DataBean;Ljava/lang/String;)V", ContextActionHandler.Link.URL, "parseUrl", "(Ljava/lang/String;)V", "setWebViewObservable", "(Lcom/geetest/captcha/observer/WebViewObservable;)V", "Lcom/geetest/captcha/views/GTC4WebView$MyWebViewClient;", "myWebViewClient", "Lcom/geetest/captcha/views/GTC4WebView$MyWebViewClient;", "", "resumeTimers", "Z", "Companion", "MyWebChromeClient", "MyWebViewClient", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class GTC4WebView extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public b f342795a;

    public static final class a extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(@k WebView webView, int i12) {
            super.onProgressChanged(webView, i12);
            h0.f342732d.a("GTC4WebView", "onProgressChanged: " + i12);
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(@k WebView webView, @k String str) {
            super.onReceivedTitle(webView, str);
            h0.f342732d.a("onReceivedTitle: ".concat(str));
        }
    }

    public GTC4WebView(@l Context context) {
        super(context);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void a(@k y yVar, @k v vVar, @k String str) {
        WebSettings settings = getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setBlockNetworkImage(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setCacheMode(2);
        settings.setSupportZoom(true);
        settings.setTextZoom(100);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setGeolocationEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        setOverScrollMode(2);
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setWebChromeClient(new a());
        b bVar = new b(str, yVar);
        this.f342795a = bVar;
        setWebViewClient(bVar);
        setBackgroundColor(vVar.f342793j);
        if (vVar.f342786c) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        super.onResume();
        resumeTimers();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        h0.f342732d.c("GTC4WebView.onDetachedFromWindow");
        super.onDetachedFromWindow();
        removeJavascriptInterface("JSInterface");
        removeAllViews();
        removeAllViewsInLayout();
        loadUrl("");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        super.onResume();
        resumeTimers();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onSizeChanged(int newWidth, int newHeight, int oldWidth, int oldHeight) {
        super.onSizeChanged(newWidth, newHeight, oldWidth, oldHeight);
        h0 h0Var = h0.f342732d;
        StringBuilder sbY = r.y(newWidth, newHeight, "newWidth: ", ", newHeight: ", ", oldWidth: ");
        sbY.append(oldWidth);
        sbY.append(", oldHeight: ");
        sbY.append(oldHeight);
        h0Var.a("GTC4WebView", sbY.toString());
    }

    public final void setWebViewObservable(@k y yVar) {
        b bVar = this.f342795a;
        if (bVar != null) {
            bVar.f342796a = yVar;
        }
    }

    public static final class b extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public y f342796a;

        public b(@k String str, @k y yVar) {
            this.f342796a = yVar;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(@k WebView webView, @k String str) {
            super.onLoadResource(webView, str);
            h0.f342732d.c("onLoadResource: ".concat(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@k WebView webView, @k String str) {
            super.onPageFinished(webView, str);
            h0.f342732d.c("onPageFinished: ".concat(str));
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@l WebView webView, @l String str, @l Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            h0.f342732d.c("onPageStarted: " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@k WebView webView, @k WebResourceRequest webResourceRequest, @k WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            h0.f342732d.c("WebViewClient.onReceivedError: URL: " + webResourceRequest.getUrl() + ", Method: " + webResourceRequest.getMethod() + ", ErrorCode: " + webResourceError.getErrorCode() + ", Description: " + webResourceError.getDescription());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(@k WebView webView, @k WebResourceRequest webResourceRequest, @k WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            h0.f342732d.c("WebViewClient.onReceivedHttpError: URL: " + webResourceRequest.getUrl() + ", Code: " + webResourceResponse.getStatusCode() + ", Message: " + webResourceResponse.getReasonPhrase());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@k WebView webView, @k SslErrorHandler sslErrorHandler, @k SslError sslError) throws JSONException {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            h0.f342732d.c("WebViewClient.onReceivedSslError: URL: " + sslError.getUrl() + ", ErrorCode: " + sslError.getPrimaryError() + ", Description: " + sslError);
            u0 u0Var = u0.f406856a;
            String str = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(sslError.getPrimaryError()))}, 1));
            y yVar = this.f342796a;
            String str2 = d0.WEB_VIEW_SSL.getType() + str;
            String str3 = e0.f342710b;
            w.a aVar = w.f342797d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ContextActionHandler.Link.URL, sslError.getUrl());
            jSONObject.put("description", sslError.toString());
            G0 g02 = G0.f406611a;
            yVar.a(str2, str3, jSONObject);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@l WebView webView, @l WebResourceRequest webResourceRequest) {
            Context context;
            h0 h0Var = h0.f342732d;
            StringBuilder sb2 = new StringBuilder("shouldOverrideUrlLoading(high): ");
            sb2.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            h0Var.c(sb2.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null)));
                if (webView == null || (context = webView.getContext()) == null) {
                    return true;
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e12) {
                e12.printStackTrace();
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@k WebView webView, int i12, @k String str, @k String str2) {
            super.onReceivedError(webView, i12, str, str2);
        }
    }
}
