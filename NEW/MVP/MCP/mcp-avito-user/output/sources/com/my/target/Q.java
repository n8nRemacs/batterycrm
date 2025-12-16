package com.my.target;

import android.annotation.TargetApi;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import e11.C39912v;

/* loaded from: classes7.dex */
public final class Q extends C39912v {

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public a f364520c;

    public interface a {
    }

    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            consoleMessage.message();
            consoleMessage.lineNumber();
            return false;
        }
    }

    public final class c extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            throw null;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i12, String str, String str2) {
            super.onReceivedError(webView, i12, str, str2);
            throw null;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES)
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            throw null;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            CharSequence description = webResourceError.getDescription();
            if (description != null) {
                description.toString();
            }
            webResourceError.getErrorCode();
            webResourceRequest.getUrl().toString();
            throw null;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            throw null;
        }
    }

    public long getAndResetInteractionEnd() {
        return 0L;
    }

    public void setListener(@j.P a aVar) {
        this.f364520c = aVar;
    }
}
