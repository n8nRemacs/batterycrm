package com.avito.android.lib.beduin_v2.component.webview.impl;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.beduin_v2.component.webview.impl.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: WebViewWrapper.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/beduin_v2/component/webview/impl/e;", "Landroid/widget/FrameLayout;", "LLV/b;", "Lcom/avito/android/lib/beduin_v2/component/webview/impl/b;", "newState", "Lkotlin/G0;", "setState", "(Lcom/avito/android/lib/beduin_v2/component/webview/impl/b;)V", "_design-modules_beduin-v2_renderer_component_webview"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes14.dex */
public final class e extends FrameLayout implements LV.b<b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WebView f175984b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f175985c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f175986d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f175987e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public b f175988f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.l<? super Uri, Boolean> f175989g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f175990h;

    /* compiled from: WebViewWrapper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            e.this.f175986d.setVisibility(8);
            return G0.f406611a;
        }
    }

    public e(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setClickable(true);
        view.setFocusable(true);
        view.setVisibility(8);
        this.f175990h = view;
        LayoutInflater.from(context).inflate(R.layout.webview_layout, (ViewGroup) this, true);
        addView(view);
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.f175984b = webView;
        this.f175985c = findViewById(R.id.loading_container);
        this.f175986d = (TextView) findViewById(R.id.loading_text);
        this.f175987e = (TextView) findViewById(R.id.error_text);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        webView.setWebViewClient(new c(this));
        webView.addJavascriptInterface(new com.avito.android.lib.beduin_v2.component.webview.impl.a(new d(this)), "appInterface");
    }

    public final void a(b.C5210b c5210b) {
        if (c5210b != null) {
            this.f175986d.setVisibility(0);
            G0 g02 = G0.f406611a;
        } else {
            new a();
        }
        this.f175985c.setVisibility(0);
        this.f175987e.setVisibility(8);
        this.f175984b.setVisibility(8);
    }

    @Override // LV.b
    public void setState(@k b newState) {
        String str;
        b bVar = this.f175988f;
        if (new com.avito.android.lib.util.c(newState, bVar).f181333c) {
            return;
        }
        this.f175988f = newState;
        String str2 = bVar != null ? bVar.f175967a : null;
        String str3 = newState.f175967a;
        com.avito.android.lib.util.c cVar = new com.avito.android.lib.util.c(str3, str2);
        b.C5210b c5210b = newState.f175970d;
        if (!cVar.f181333c && str3 != null) {
            this.f175984b.loadUrl(str3);
            a(c5210b);
        }
        Boolean bool = bVar != null ? bVar.f175968b : null;
        Boolean bool2 = newState.f175968b;
        if (!new com.avito.android.lib.util.c(bool2, bool).f181333c) {
            this.f175990h.setVisibility(!L.f(bool2, Boolean.FALSE) ? 8 : 0);
        }
        if (!new com.avito.android.lib.util.c(c5210b, bVar != null ? bVar.f175970d : null).f181333c) {
            this.f175986d.setText(c5210b != null ? c5210b.f175980a : null);
        }
        b.a aVar = bVar != null ? bVar.f175969c : null;
        b.a aVar2 = newState.f175969c;
        if (new com.avito.android.lib.util.c(aVar2, aVar).f181333c) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar2 != null ? aVar2.f175978a : null);
        if (aVar2 != null && (str = aVar2.f175979b) != null) {
            sb2.append("\n");
            sb2.append(str);
        }
        this.f175987e.setText(sb2.toString());
    }
}
