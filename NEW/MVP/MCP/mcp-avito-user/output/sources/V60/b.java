package v60;

import Y61.k;
import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;
import w60.C49453d;
import w60.f;

/* compiled from: PaymentWebViewErrorHandlerDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv60/b;", "Lv60/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements InterfaceC49169a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f440462a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440463b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f440464c;

    public b(@k InterfaceC28373a interfaceC28373a, @k String str, @k String str2) {
        this.f440462a = interfaceC28373a;
        this.f440463b = str;
        this.f440464c = str2;
    }

    @Override // com.yatatsu.powerwebview.PowerWebView.c
    public final void a(@k WebView webView, @k WebResourceRequest webResourceRequest, @k WebResourceError webResourceError) {
        boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
        String str = this.f440464c;
        InterfaceC28373a interfaceC28373a = this.f440462a;
        if (zIsForMainFrame) {
            interfaceC28373a.c(new f(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webView.getSettings().getUserAgentString(), webResourceRequest.getUrl().toString(), this.f440463b, str, y6.e(C35835l0.i(webView.getContext()).heightPixels), y6.e(C35835l0.i(webView.getContext()).widthPixels)));
        }
        interfaceC28373a.c(new C49453d(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webView.getSettings().getUserAgentString(), webResourceRequest.getUrl().toString(), this.f440463b, str, y6.e(C35835l0.i(webView.getContext()).heightPixels), y6.e(C35835l0.i(webView.getContext()).widthPixels)));
    }

    @Override // com.yatatsu.powerwebview.g
    public final void c(@k WebView webView, @k SslError sslError) {
        int primaryError = sslError.getPrimaryError();
        String userAgentString = webView.getSettings().getUserAgentString();
        String url = sslError.getUrl();
        int iE2 = y6.e(C35835l0.i(webView.getContext()).heightPixels);
        int iE3 = y6.e(C35835l0.i(webView.getContext()).widthPixels);
        this.f440462a.c(new C49453d(primaryError, "SSL error", userAgentString, url, this.f440463b, this.f440464c, iE2, iE3));
    }
}
