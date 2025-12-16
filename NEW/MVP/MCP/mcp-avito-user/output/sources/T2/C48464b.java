package t2;

import Y41.l;
import Y41.p;
import Y41.q;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import d31.i;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.text.C43066x;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48464b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f439029a;

    /* renamed from: b, reason: collision with root package name */
    public final p f439030b;

    /* renamed from: c, reason: collision with root package name */
    public final q f439031c;

    /* renamed from: d, reason: collision with root package name */
    public final l f439032d;

    /* renamed from: e, reason: collision with root package name */
    public final l f439033e;

    public C48464b(X509TrustManager x509TrustManager, p pVar, q qVar, l lVar, l lVar2) {
        this.f439029a = x509TrustManager;
        this.f439030b = pVar;
        this.f439031c = qVar;
        this.f439032d = lVar;
        this.f439033e = lVar2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (str == null || !URLUtil.isNetworkUrl(str)) {
            return;
        }
        super.onPageFinished(webView, str);
        boolean zQ2 = C43066x.q(str, "https://docs.google.com/gview?embedded=true&url=", false);
        q qVar = this.f439031c;
        if (!zQ2) {
            qVar.invoke(webView, Uri.parse(str).getHost(), Boolean.FALSE);
        } else {
            String queryParameter = Uri.parse(str).getQueryParameter(ContextActionHandler.Link.URL);
            qVar.invoke(webView, queryParameter != null ? Uri.parse(queryParameter).getHost() : null, Boolean.TRUE);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f439030b.invoke(str != null ? Uri.parse(str).getHost() : null, webView != null ? Boolean.valueOf(webView.canGoBack()) : null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) throws CertificateException {
        SslCertificate certificate;
        if (sslError != null) {
            try {
                certificate = sslError.getCertificate();
            } catch (Exception e12) {
                if (sslErrorHandler != null) {
                    sslErrorHandler.cancel();
                }
                if (i.a(Uri.parse(sslError != null ? sslError.getUrl() : null))) {
                    this.f439033e.invoke(Uri.parse(sslError != null ? sslError.getUrl() : null));
                }
                e12.getMessage();
                return;
            }
        } else {
            certificate = null;
        }
        byte[] byteArray = SslCertificate.saveState(certificate).getByteArray("x509-certificate");
        X509Certificate[] x509CertificateArr = {byteArray != null ? (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray)) : null};
        X509TrustManager x509TrustManager = this.f439029a;
        if (x509TrustManager != null) {
            x509TrustManager.checkServerTrusted(x509CertificateArr, "ECDH_RSA");
        }
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        if (C43066x.q(string, ".pdf", false) && !C43066x.q(string, "https://docs.google.com/gview?embedded=true&url=", false)) {
            this.f439033e.invoke(webResourceRequest.getUrl());
            return true;
        }
        if (URLUtil.isNetworkUrl(string)) {
            return false;
        }
        this.f439032d.invoke(webResourceRequest.getUrl());
        return true;
    }
}
