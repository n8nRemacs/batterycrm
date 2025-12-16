package Z51;

import Y41.l;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.jvm.internal.N;
import sberid.sdk.ui.utils.extensions.WebViewExtensionsKt;

/* loaded from: classes8.dex */
public final class f extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WebView f19901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f19902m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ WebViewClient f19903n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f19904o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f19905p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f19906q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a f19907r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I3 f19908s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WebView webView, ViewGroup.LayoutParams layoutParams, WebViewClient webViewClient, String str, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Y41.a aVar, I3 i32) {
        super(1);
        this.f19901l = webView;
        this.f19902m = layoutParams;
        this.f19903n = webViewClient;
        this.f19904o = str;
        this.f19905p = interfaceC22204y1;
        this.f19906q = interfaceC22204y12;
        this.f19907r = aVar;
        this.f19908s = i32;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        WebView webView = this.f19901l;
        webView.setLayoutParams(this.f19902m);
        webView.setWebViewClient(this.f19903n);
        WebViewExtensionsKt.setupWebview(webView, new d(this.f19905p, this.f19906q));
        webView.requestFocus();
        webView.loadUrl(this.f19904o);
        final e eVar = new e(this.f19907r, this.f19908s);
        webView.setOnKeyListener(new View.OnKeyListener() { // from class: sberid.sdk.ui.utils.extensions.q
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i12, KeyEvent keyEvent) {
                if (i12 != 4 || keyEvent == null || keyEvent.getAction() != 1) {
                    return false;
                }
                eVar.invoke();
                return true;
            }
        });
        return webView;
    }
}
