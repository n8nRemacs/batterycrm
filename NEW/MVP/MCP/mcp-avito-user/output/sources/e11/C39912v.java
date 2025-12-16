package e11;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

/* renamed from: e11.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39912v extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final WebView f394853b;

    public C39912v(@j.N Context context) {
        super(context);
        try {
            WebView webView = new WebView(context);
            this.f394853b = webView;
            webView.clearCache(true);
            addView(webView);
        } catch (Throwable th2) {
            th2.getMessage();
            th2.printStackTrace();
        }
    }

    public final void a(int i12) {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        if (i12 > 0) {
            m2.f394687d.postDelayed(new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f(this, 20), i12);
        } else {
            try {
                webView.destroy();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }

    public final void b() {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        try {
            webView.onResume();
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @j.P
    public WebSettings getSettings() {
        try {
            WebView webView = this.f394853b;
            if (webView == null) {
                return null;
            }
            return webView.getSettings();
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    @j.P
    public String getUrl() {
        try {
            WebView webView = this.f394853b;
            if (webView == null) {
                return null;
            }
            return webView.getUrl();
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    @j.P
    public WebView getWebView() {
        return this.f394853b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        webView.layout(0, 0, i14 - i12, i15 - i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i12, int i13) {
        WebView webView = this.f394853b;
        if (webView == null) {
            setMeasuredDimension(0, 0);
        } else {
            webView.measure(i12, i13);
            setMeasuredDimension(webView.getMeasuredWidth(), webView.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z12) {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        webView.setHorizontalScrollBarEnabled(z12);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(@j.P View.OnTouchListener onTouchListener) {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        webView.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.View
    public void setScrollContainer(boolean z12) {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        webView.setScrollContainer(z12);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z12) {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        webView.setVerticalScrollBarEnabled(z12);
    }

    public void setWebChromeClient(@j.P WebChromeClient webChromeClient) {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebChromeClient(webChromeClient);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void setWebViewClient(@j.N WebViewClient webViewClient) {
        WebView webView = this.f394853b;
        if (webView == null) {
            return;
        }
        try {
            webView.setWebViewClient(webViewClient);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
