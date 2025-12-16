package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class cgb extends WebViewClient {
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public cgb(s0i s0iVar) {
        this.a = 1;
        this.b = s0iVar;
        this.c = new bwf(new zfb(2));
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        Object ipdVar;
        InputStream inputStreamOpenRawResource;
        byte[] bArr;
        int i;
        switch (this.a) {
            case 1:
                if (webView != null) {
                    l8d l8dVar = (l8d) ((bwf) this.c).getValue();
                    Context context = webView.getContext();
                    int i2 = kgb.a;
                    ThreadLocal threadLocal = l8dVar.b;
                    ThreadLocal threadLocal2 = l8dVar.a;
                    byte[] bArr2 = (byte[]) threadLocal2.get();
                    if (bArr2 == null) {
                        bArr2 = new byte[65536];
                        threadLocal2.set(bArr2);
                    }
                    try {
                        inputStreamOpenRawResource = context.getResources().openRawResource(i2);
                        bArr = (byte[]) threadLocal.get();
                        if (bArr == null) {
                            bArr = new byte[4096];
                            threadLocal.set(bArr);
                        }
                        i = 0;
                    } catch (Throwable th) {
                        ipdVar = new ipd(th);
                    }
                    while (true) {
                        try {
                            int i3 = inputStreamOpenRawResource.read(bArr, 0, bArr.length);
                            if (i3 >= 0) {
                                int i4 = i + i3;
                                if (bArr2.length < i4) {
                                    byte[] bArr3 = new byte[bArr2.length * 2];
                                    System.arraycopy(bArr2, 0, bArr3, 0, i);
                                    threadLocal2.set(bArr3);
                                    bArr2 = bArr3;
                                }
                                if (i3 > 0) {
                                    System.arraycopy(bArr, 0, bArr2, i, i3);
                                    i = i4;
                                }
                            } else {
                                inputStreamOpenRawResource.close();
                                ipdVar = new String(bArr2, 0, i, lb2.a);
                                if (ipdVar instanceof ipd) {
                                    ipdVar = null;
                                }
                                String str2 = (String) ipdVar;
                                if (str2 != null) {
                                    webView.evaluateJavascript(str2, new ggb(0));
                                }
                            }
                        } finally {
                        }
                    }
                }
                super.onPageCommitVisible(webView, str);
                return;
            default:
                super.onPageCommitVisible(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.a) {
            case 1:
                ((s0i) this.b).j();
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.a) {
            case 1:
                ((s0i) this.b).q(str);
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 1:
                if (webResourceRequest.isForMainFrame()) {
                    ((s0i) this.b).k();
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.a) {
            case 1:
                s0i s0iVar = (s0i) this.b;
                if (!s0iVar.h()) {
                    s0iVar.k();
                    break;
                } else {
                    sslErrorHandler.proceed();
                    break;
                }
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.a) {
            case 0:
                xfh.r(((uvh) ((dgb) this.b).b).Z0, new juh(webResourceRequest.getUrl().toString()));
                ((fgb) this.c).destroy();
                return true;
            default:
                if (((s0i) this.b).l(webResourceRequest.getUrl())) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public cgb(dgb dgbVar, fgb fgbVar) {
        this.a = 0;
        this.b = dgbVar;
        this.c = fgbVar;
    }
}
