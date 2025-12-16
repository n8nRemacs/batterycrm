package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Locale;
import one.me.webview.FaqWebViewWidget;

/* loaded from: classes2.dex */
public final class sq5 extends WebViewClient {
    public final /* synthetic */ FaqWebViewWidget a;

    public sq5(FaqWebViewWidget faqWebViewWidget) {
        this.a = faqWebViewWidget;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String fileExtensionFromUrl;
        FaqWebViewWidget faqWebViewWidget = this.a;
        k18 k18Var = faqWebViewWidget.d;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            String scheme = url.getScheme();
            if (scheme != null && vmf.s(scheme, "mailto", false)) {
                v17 v17Var = FaqWebViewWidget.Z;
                faqWebViewWidget.c.O(faqWebViewWidget, FaqWebViewWidget.s0[1], svi.e(faqWebViewWidget.getViewLifecycleScope(), null, i84.b, new uq5(faqWebViewWidget, null), 1));
                return true;
            }
            String scheme2 = url.getScheme();
            if (scheme2 != null) {
                ((j98) k18Var.getValue()).getClass();
                if (vmf.s(scheme2, "max", false)) {
                    FaqWebViewWidget.y0(faqWebViewWidget, url);
                    return true;
                }
            }
            v17 v17Var2 = FaqWebViewWidget.Z;
            ((j98) k18Var.getValue()).getClass();
            String[] strArr = {"https"};
            v17Var2.getClass();
            String scheme3 = url.getScheme();
            if (scheme3 != null && dnf.r(scheme3, strArr[0], false) && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(url.toString())) != null) {
                if (vmf.F(fileExtensionFromUrl)) {
                    fileExtensionFromUrl = null;
                }
                if (fileExtensionFromUrl != null) {
                    Locale locale = Locale.ROOT;
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase(locale));
                    if (mimeTypeFromExtension != null) {
                        String str = vmf.F(mimeTypeFromExtension) ? null : mimeTypeFromExtension;
                        if (str != null) {
                            String lowerCase = str.toLowerCase(locale);
                            if (!FaqWebViewWidget.t0.contains(lowerCase) && ((lowerCase.length() == 0 || !dnf.r(lowerCase, "image/", true) || vmf.s(lowerCase, "djvu", true)) && (lowerCase.length() == 0 || !dnf.r(lowerCase, "video/", true)))) {
                                FaqWebViewWidget.y0(faqWebViewWidget, url);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
