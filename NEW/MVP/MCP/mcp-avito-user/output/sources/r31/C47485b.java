package r31;

import android.webkit.WebView;
import androidx.view.x;
import sberid.sdk.auth.view.activity.WebViewActivity;

/* renamed from: r31.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47485b extends x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f429568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ WebView f429569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47485b(WebViewActivity webViewActivity, WebView webView) {
        super(true);
        this.f429568d = webViewActivity;
        this.f429569e = webView;
    }

    @Override // androidx.view.x
    public final void c() {
        int i12 = WebViewActivity.f437756g;
        WebViewActivity webViewActivity = this.f429568d;
        WebView webView = this.f429569e;
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            webViewActivity.finish();
        }
    }
}
