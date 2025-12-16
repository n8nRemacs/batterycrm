package com.avito.android.social.apple;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AppleAuthView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/apple/l;", "Lcom/avito/android/social/apple/k;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "Landroid/view/View$OnClickListener;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements k, SwipeRefreshLayout.f, View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f284312b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WebView f284313c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f284314d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f284315e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f284316f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f284317g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f284318h;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k View view, @Y61.k m mVar) {
        this.f284312b = mVar;
        WebView webView = (WebView) view.findViewById(R.id.web_view);
        this.f284313c = webView;
        View viewFindViewById = view.findViewById(R.id.progress_view);
        this.f284314d = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.button_close);
        this.f284315e = viewFindViewById2;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.f284316f = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        viewFindViewById2.setOnClickListener(this);
        mVar.a(viewFindViewById);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        webView.setWebViewClient((WebViewClient) mVar);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void j0() {
        this.f284316f.setRefreshing(false);
        Y41.a<G0> aVar = this.f284317g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Y61.l View view) {
        Y41.a<G0> aVar = this.f284318h;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
