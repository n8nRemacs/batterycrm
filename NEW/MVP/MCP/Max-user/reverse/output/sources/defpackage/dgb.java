package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class dgb extends WebChromeClient {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public dgb(uvh uvhVar) {
        this.b = uvhVar;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        switch (this.a) {
            case 1:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
                bitmapCreateBitmap.eraseColor(0);
                return bitmapCreateBitmap;
            default:
                return super.getDefaultVideoPoster();
        }
    }

    @Override // android.webkit.WebChromeClient
    public View getVideoLoadingProgressView() {
        switch (this.a) {
            case 1:
                m9b m9bVar = new m9b(((fgb) this.b).getContext());
                m9bVar.setId(d1b.x);
                m9bVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                m9bVar.setAppearance(z8b.a);
                m9bVar.setSize(g9b.a);
                m9bVar.setBackgroundColor(-16777216);
                return m9bVar;
            default:
                return super.getVideoLoadingProgressView();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        switch (this.a) {
            case 0:
                fgb fgbVar = new fgb(webView.getContext(), 14);
                fgbVar.setWebViewClient(new cgb(this, fgbVar));
                ((WebView.WebViewTransport) (message != null ? message.obj : null)).setWebView(fgbVar);
                message.sendToTarget();
                return true;
            default:
                return super.onCreateWindow(webView, z, z2, message);
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        switch (this.a) {
            case 0:
                fgb fgbVar = webView instanceof fgb ? (fgb) webView : null;
                if (fgbVar == null) {
                    return false;
                }
                ValueCallback<Uri[]> filePathCallback = fgbVar.getFilePathCallback();
                if (filePathCallback != null) {
                    filePathCallback.onReceiveValue(null);
                }
                fgbVar.setFilePathCallback(valueCallback);
                xfh.r(((uvh) this.b).Z0, new ruh(fileChooserParams));
                return true;
            default:
                return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
    }

    public dgb(fgb fgbVar) {
        this.b = fgbVar;
    }
}
