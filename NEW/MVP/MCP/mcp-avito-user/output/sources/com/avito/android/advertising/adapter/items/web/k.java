package com.avito.android.advertising.adapter.items.web;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import androidx.core.view.C22829k0;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: CommercialHtmlViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/adapter/items/web/k;", "Lcom/avito/android/advertising/adapter/items/web/j;", "Lcom/avito/android/serp/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends com.avito.android.serp.c implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f87686b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AdStyle f87687c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f87688d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final WebViewContainerLayout f87689e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public View f87690f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewStub f87691g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public View f87692h;

    public k(@Y61.k View view, @Y61.k AdStyle adStyle) {
        super(view);
        this.f87686b = view;
        this.f87687c = adStyle;
        this.f87688d = (ViewGroup) view.findViewById(R.id.content);
        this.f87689e = (WebViewContainerLayout) view.findViewById(R.id.media_view_container);
        this.f87691g = (ViewStub) view.findViewById(R.id.error_container_stub);
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    public final void C0() {
        this.f87689e.setVisibility(0);
        View view = this.f87692h;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f87690f;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    public final void CV(@Y61.l Float f12) {
        this.f87689e.setRatio(f12 != null ? f12.floatValue() : -1.0f);
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    public final void Q7(@Y61.k WebView webView) {
        this.f87689e.addView(webView);
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    @Y61.l
    public final WebView QA() {
        Object objN = C43033p.n(new C22829k0(this.f87689e));
        if (objN instanceof WebView) {
            return (WebView) objN;
        }
        return null;
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    public final void bz(@Y61.l Integer num) {
        WebViewContainerLayout webViewContainerLayout = this.f87689e;
        webViewContainerLayout.getLayoutParams().height = num != null ? num.intValue() : 0;
        webViewContainerLayout.requestLayout();
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    public final void c0() {
        this.f87689e.setVisibility(8);
        View view = this.f87692h;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.f87690f;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    public final void eT(@Y61.l Integer num) {
        this.f87689e.setMaxChildWidth(num != null ? num.intValue() : -1);
    }

    @Override // com.avito.android.advertising.ui.c
    @Y61.k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF87108c() {
        return this.f87687c;
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    @Y61.k
    /* renamed from: getView, reason: from getter */
    public final View getF87686b() {
        return this.f87686b;
    }

    @Override // com.avito.android.advertising.adapter.items.web.j
    public final void y3() {
        if (this.f87692h == null) {
            ViewStub viewStub = this.f87691g;
            if (viewStub.getLayoutResource() != 0) {
                this.f87692h = viewStub.inflate();
            }
        }
        this.f87689e.setVisibility(8);
        View view = this.f87692h;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f87690f;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
    }
}
