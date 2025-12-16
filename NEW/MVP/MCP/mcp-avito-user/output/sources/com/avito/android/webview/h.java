package com.avito.android.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: WebViewCustomViewHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/webview/h;", "", "_avito_webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final WebView f329625a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Toolbar f329626b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f329627c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public View f329628d;

    /* renamed from: e, reason: collision with root package name */
    public int f329629e;

    /* renamed from: f, reason: collision with root package name */
    public int f329630f;

    /* renamed from: g, reason: collision with root package name */
    public int f329631g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Runnable f329632h;

    public h(@Y61.k WebView webView, @Y61.l Toolbar toolbar, boolean z12) {
        this.f329625a = webView;
        this.f329626b = toolbar;
        this.f329627c = z12;
    }

    public final ViewGroup a() {
        Window window;
        Context context = this.f329625a.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView instanceof ViewGroup) {
            return (ViewGroup) decorView;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, com.avito.android.webview.g, java.lang.Runnable] */
    public final void b() {
        Toolbar toolbar;
        ViewGroup viewGroupA = a();
        if (viewGroupA == null) {
            return;
        }
        viewGroupA.removeView(this.f329628d);
        this.f329628d = null;
        if (!this.f329627c && (toolbar = this.f329626b) != null) {
            toolbar.setVisibility(0);
        }
        viewGroupA.setSystemUiVisibility(this.f329629e);
        Runnable runnable = this.f329632h;
        WebView webView = this.f329625a;
        if (runnable != null) {
            webView.removeCallbacks(runnable);
            this.f329632h = null;
        }
        l0.h hVar = new l0.h();
        ?? gVar = new g(this, hVar, 0);
        hVar.f406842b = gVar;
        this.f329632h = gVar;
        webView.postDelayed(gVar, 500L);
    }
}
