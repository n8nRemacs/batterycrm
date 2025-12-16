package com.avito.android.webview;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.Y2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: WebViewPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/q;", "Landroid/webkit/WebChromeClient;", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public WebChromeClient.CustomViewCallback f329638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f329639b;

    /* compiled from: WebViewPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isGranted", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ PermissionRequest f329640l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PermissionRequest permissionRequest) {
            super(1);
            this.f329640l = permissionRequest;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            PermissionRequest permissionRequest = this.f329640l;
            if (zBooleanValue) {
                if (permissionRequest != null) {
                    permissionRequest.grant(new String[]{"android.webkit.resource.VIDEO_CAPTURE"});
                }
            } else if (permissionRequest != null) {
                permissionRequest.deny();
            }
            return G0.f406611a;
        }
    }

    public q(u uVar) {
        this.f329639b = uVar;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        h hVar;
        super.onHideCustomView();
        D d12 = this.f329639b.f329659o;
        if (d12 != null && (hVar = d12.f329516f) != null) {
            hVar.b();
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f329638a;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.f329638a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(@Y61.l PermissionRequest permissionRequest) {
        String[] resources;
        u uVar = this.f329639b;
        WebViewActivity webViewActivity = uVar.f329660p;
        if (webViewActivity == null) {
            webViewActivity = null;
        }
        boolean z12 = false;
        if (permissionRequest != null && (resources = permissionRequest.getResources()) != null && resources.length == 1 && L.f(permissionRequest.getResources()[0], "android.webkit.resource.VIDEO_CAPTURE")) {
            z12 = true;
        }
        Y2 y22 = uVar.f329652h;
        y22.getClass();
        kotlin.reflect.n<Object> nVar = Y2.f67590f[2];
        if (((Boolean) y22.f67593d.a().invoke()).booleanValue() && webViewActivity != null && z12) {
            webViewActivity.V(new a(permissionRequest));
        } else {
            super.onPermissionRequest(permissionRequest);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(@Y61.l WebView webView, int i12) {
        super.onProgressChanged(webView, i12);
        u uVar = this.f329639b;
        if (!uVar.f329647c.f133870e || uVar.f329663s || i12 <= 50) {
            return;
        }
        uVar.f329646b.toString();
        if (uVar.f329662r) {
            return;
        }
        uVar.f329662r = false;
        uVar.f329663s = true;
        D d12 = uVar.f329659o;
        if (d12 != null) {
            d12.f329517g.b();
        }
        uVar.f329651g.a(uVar.f329646b);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(@Y61.l View view, @Y61.l WebChromeClient.CustomViewCallback customViewCallback) {
        h hVar;
        ViewGroup viewGroupA;
        super.onShowCustomView(view, customViewCallback);
        this.f329638a = customViewCallback;
        D d12 = this.f329639b.f329659o;
        if (d12 == null || (hVar = d12.f329516f) == null || (viewGroupA = hVar.a()) == null) {
            return;
        }
        if (hVar.f329628d != null) {
            hVar.b();
        }
        hVar.f329630f = hVar.f329631g;
        hVar.f329628d = view;
        hVar.f329629e = viewGroupA.getSystemUiVisibility();
        viewGroupA.addView(hVar.f329628d, new FrameLayout.LayoutParams(-1, -1));
        Toolbar toolbar = hVar.f329626b;
        if (toolbar != null) {
            toolbar.setVisibility(8);
        }
        ViewGroup viewGroupA2 = hVar.a();
        if (viewGroupA2 == null) {
            return;
        }
        viewGroupA2.setSystemUiVisibility(4871);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(@Y61.l WebView webView, @Y61.k ValueCallback<Uri[]> valueCallback, @Y61.l WebChromeClient.FileChooserParams fileChooserParams) {
        WebViewActivity webViewActivity = this.f329639b.f329660p;
        if (webViewActivity == null) {
            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        webViewActivity.i0(valueCallback);
        return true;
    }
}
