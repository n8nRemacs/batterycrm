package t2;

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
import r31.c;
import r31.d;
import r31.e;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C48463a extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f439025a;

    /* renamed from: b, reason: collision with root package name */
    public final c f439026b;

    /* renamed from: c, reason: collision with root package name */
    public final d f439027c;

    /* renamed from: d, reason: collision with root package name */
    public final e f439028d;

    public C48463a(X509TrustManager x509TrustManager, c cVar, d dVar, e eVar) {
        this.f439025a = x509TrustManager;
        this.f439026b = cVar;
        this.f439027c = dVar;
        this.f439028d = eVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (str == null || !URLUtil.isNetworkUrl(str)) {
            return;
        }
        super.onPageFinished(webView, str);
        boolean zQ2 = C43066x.q(str, "https://docs.google.com/gview?embedded=true&url=", false);
        c cVar = this.f439026b;
        if (!zQ2) {
            cVar.invoke(webView, Uri.parse(str).getHost(), Boolean.FALSE);
        } else {
            String queryParameter = Uri.parse(str).getQueryParameter(ContextActionHandler.Link.URL);
            cVar.invoke(webView, queryParameter != null ? Uri.parse(queryParameter).getHost() : null, Boolean.TRUE);
        }
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
                    this.f439028d.invoke(Uri.parse(sslError != null ? sslError.getUrl() : null));
                }
                e12.getMessage();
                return;
            }
        } else {
            certificate = null;
        }
        byte[] byteArray = SslCertificate.saveState(certificate).getByteArray("x509-certificate");
        X509Certificate[] x509CertificateArr = {byteArray != null ? (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray)) : null};
        X509TrustManager x509TrustManager = this.f439025a;
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
        boolean zQ2 = C43066x.q(string, ".pdf", false);
        e eVar = this.f439028d;
        if (zQ2 && !C43066x.q(string, "https://docs.google.com/gview?embedded=true&url=", false)) {
            eVar.invoke(webResourceRequest.getUrl());
            return true;
        }
        if (!URLUtil.isNetworkUrl(string)) {
            this.f439027c.invoke(webResourceRequest.getUrl());
            return true;
        }
        if (i.a(webResourceRequest.getUrl())) {
            return false;
        }
        eVar.invoke(webResourceRequest.getUrl());
        return true;
    }
}
