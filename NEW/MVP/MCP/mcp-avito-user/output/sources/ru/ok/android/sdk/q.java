package ru.ok.android.sdk;

import android.app.Activity;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: OkWebViewClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/android/sdk/q;", "Landroid/webkit/WebViewClient;", "odnoklassniki-android-sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes9.dex */
public class q extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public boolean f436702a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f436703b;

    public q(@Y61.k Activity activity) {
        this.f436703b = activity;
    }

    @Y61.k
    public final String a(int i12) {
        Activity activity = this.f436703b;
        return i12 != -11 ? i12 != -8 ? i12 != -6 ? i12 != -2 ? activity.getString(R.string.error_unknown) : activity.getString(R.string.error_host_lookup) : activity.getString(R.string.error_connect) : activity.getString(R.string.error_timeout) : activity.getString(R.string.error_failed_ssl_handshake);
    }

    @Y61.k
    public final String b(@Y61.k SslError sslError) {
        int primaryError = sslError.getPrimaryError();
        Activity activity = this.f436703b;
        return primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? activity.getString(R.string.error_unknown) : activity.getString(R.string.error_ssl_date_invalid) : activity.getString(R.string.error_ssl_untrusted) : activity.getString(R.string.error_ssl_id_mismatch) : activity.getString(R.string.error_ssl_expired) : activity.getString(R.string.error_ssl_not_yet_valid);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@Y61.k WebView webView, @Y61.k String str) {
        super.onPageFinished(webView, str);
        webView.setVisibility(this.f436702a ? 0 : 4);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@Y61.k WebView webView, int i12, @Y61.k String str, @Y61.k String str2) {
        this.f436702a = false;
        super.onReceivedError(webView, i12, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(@Y61.k WebView webView, @Y61.k SslErrorHandler sslErrorHandler, @Y61.k SslError sslError) {
        this.f436702a = false;
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Y61.k WebView webView, @Y61.k String str) {
        this.f436702a = true;
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
