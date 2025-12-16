package com.avito.android.advertising.adapter.items.web;

import TV0.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.buzzoola.CommercialHtmlBannerItem;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.lib.util.v;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44740d;

/* compiled from: CommercialHtmlBigBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/web/a;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/web/j;", "Lcom/avito/android/advertising/adapter/items/buzzoola/CommercialHtmlBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<j, CommercialHtmlBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f87648a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44740d f87649b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87650c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f87651d = new g.a<>(R.layout.ad_avito_network_web, new C2604a());

    /* compiled from: CommercialHtmlBigBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/adapter/items/web/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/adapter/items/web/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.web.a$a, reason: collision with other inner class name */
    public static final class C2604a extends N implements Y41.p<ViewGroup, View, k> {
        public C2604a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            k kVar = new k(view2, aVar.f87650c.a() ? AdStyle.f88538c : AdStyle.f88537b);
            boolean zA2 = aVar.f87649b.a();
            int i12 = aVar.f87650c.a() ? R.dimen.ad_borderless_grid_image_radius : R.dimen.ad_html_corner_radius;
            WebViewContainerLayout webViewContainerLayout = kVar.f87689e;
            v.b(webViewContainerLayout, i12);
            if (!zA2) {
                ViewGroup.LayoutParams layoutParams = webViewContainerLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    int i13 = l.f87693a;
                    marginLayoutParams.setMargins(i13, i13, i13, i13);
                }
            }
            View viewInflate = LayoutInflater.from(kVar.f87686b.getContext()).inflate(!zA2 ? R.layout.not_load_ad_stub_big_grid : R.layout.rds_not_load_ad_stub, (ViewGroup) null, false);
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            kVar.f87690f = viewInflate;
            kVar.f87688d.addView(viewInflate);
            if (!zA2) {
                kVar.f87691g.setLayoutResource(R.layout.empty_ad_stub);
            }
            return kVar;
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k InterfaceC44740d interfaceC44740d, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87648a = cVar;
        this.f87649b = interfaceC44740d;
        this.f87650c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87648a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f87651d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof CommercialHtmlBannerItem) && (this.f87649b.a() || !((CommercialHtmlBannerItem) aVar).getDisplayType().isInformative());
    }
}
