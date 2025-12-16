package com.huawei.secure.android.common.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes7.dex */
public class d extends WebView {

    /* renamed from: b, reason: collision with root package name */
    public String f363742b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f363743c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f363744d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f363745e;

    /* renamed from: f, reason: collision with root package name */
    public WebViewLoadCallBack f363746f;

    public static class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i12) {
            throw null;
        }
    }

    public static class c implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i12) {
            throw null;
        }
    }

    public String getDefaultErrorPage() {
        return this.f363742b;
    }

    public WebViewLoadCallBack getWebViewLoadCallBack() {
        return this.f363746f;
    }

    @TargetApi(9)
    @Deprecated
    public String[] getWhitelist() {
        String[] strArr = this.f363743c;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public String[] getWhitelistNotMathcSubDomain() {
        String[] strArr = this.f363744d;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public String[] getWhitelistWithPath() {
        String[] strArr = this.f363745e;
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.webkit.WebView
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!URLUtil.isHttpUrl(str)) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else if (!TextUtils.isEmpty(this.f363742b)) {
            super.loadDataWithBaseURL(this.f363742b, str2, str3, str4, str5);
        } else if (getWebViewLoadCallBack() != null) {
            getWebViewLoadCallBack().a();
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str) {
        if (!URLUtil.isHttpUrl(str)) {
            super.loadUrl(str);
        } else if (!TextUtils.isEmpty(this.f363742b)) {
            super.loadUrl(this.f363742b);
        } else if (getWebViewLoadCallBack() != null) {
            getWebViewLoadCallBack().a();
        }
    }

    @Override // android.webkit.WebView
    public final void postUrl(String str, byte[] bArr) {
        if (!URLUtil.isHttpUrl(str)) {
            super.postUrl(str, bArr);
        } else if (!TextUtils.isEmpty(this.f363742b)) {
            super.postUrl(this.f363742b, bArr);
        } else if (getWebViewLoadCallBack() != null) {
            getWebViewLoadCallBack().a();
        }
    }

    public void setDefaultErrorPage(String str) {
        this.f363742b = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new C10757d(webViewClient, true, null));
    }

    public void setWebViewLoadCallBack(WebViewLoadCallBack webViewLoadCallBack) {
        this.f363746f = webViewLoadCallBack;
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.f363743c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.f363744d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        this.f363745e = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    /* renamed from: com.huawei.secure.android.common.webview.d$d, reason: collision with other inner class name */
    public final class C10757d extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final WebViewClient f363747a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f363748b;

        public C10757d(WebViewClient webViewClient, boolean z12, a aVar) {
            this.f363747a = webViewClient;
            this.f363748b = z12;
        }

        @Override // android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z12) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z12);
            } else {
                super.doUpdateVisitedHistory(webView, str, z12);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:126:0x01b6 A[LOOP:3: B:87:0x0114->B:126:0x01b6, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0027 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0027 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00b7 A[LOOP:1: B:23:0x0046->B:51:0x00b7, LOOP_END] */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPageStarted(android.webkit.WebView r12, java.lang.String r13, android.graphics.Bitmap r14) {
            /*
                Method dump skipped, instructions count: 567
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.webview.d.C10757d.onPageStarted(android.webkit.WebView, java.lang.String, android.graphics.Bitmap):void");
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i12, String str, String str2) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i12, str, str2);
            } else {
                super.onReceivedError(webView, i12, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(12)
        public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = this.f363747a;
            return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i12, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i12, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i12, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onScaleChanged(WebView webView, float f12, float f13) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f12, f13);
            } else {
                super.onScaleChanged(webView, f12, f13);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f363747a;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.f363747a;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.f363747a;
            return webViewClient != null ? webViewClient.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f363747a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String str, Map<String, String> map) {
        if (URLUtil.isHttpUrl(str)) {
            if (!TextUtils.isEmpty(this.f363742b)) {
                super.loadUrl(this.f363742b, map);
                return;
            } else {
                if (getWebViewLoadCallBack() != null) {
                    getWebViewLoadCallBack().a();
                    return;
                }
                return;
            }
        }
        super.loadUrl(str, map);
    }
}
