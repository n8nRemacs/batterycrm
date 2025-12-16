package com.avito.android.advertising.adapter.items.web;

import TV0.g;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.buzzoola.CommercialHtmlBannerItem;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.C44743g;

/* compiled from: CommercialHtmlRichBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/web/h;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/web/j;", "Lcom/avito/android/advertising/adapter/items/buzzoola/CommercialHtmlBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements TV0.b<j, CommercialHtmlBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f87682a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f87683b = new g.a<>(R.layout.ad_avito_network_web, a.f87684l);

    /* compiled from: CommercialHtmlRichBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/adapter/items/web/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/adapter/items/web/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f87684l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            k kVar = new k(view, AdStyle.f88542g);
            v.b(kVar.f87689e, R.dimen.ad_html_corner_radius);
            View viewInflate = LayoutInflater.from(kVar.f87686b.getContext()).inflate(R.layout.rds_not_load_ad_stub, (ViewGroup) null, false);
            viewInflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            C44743g.a(viewInflate);
            viewInflate.setPadding(0, 0, 0, 0);
            new Eb.c(viewInflate, AdStyle.f88537b, null, 4, null).C80();
            kVar.f87690f = viewInflate;
            ViewGroup viewGroup2 = kVar.f87688d;
            viewGroup2.addView(viewInflate);
            kVar.f87691g.setLayoutResource(R.layout.empty_ad_stub_rich);
            int dimensionPixelOffset = viewGroup2.getResources().getDimensionPixelOffset(R.dimen.rich_snippet_commercial_padding_top);
            int dimensionPixelOffset2 = viewGroup2.getResources().getDimensionPixelOffset(R.dimen.rich_snippet_padding_left);
            D6.b(viewGroup2, Integer.valueOf(dimensionPixelOffset2), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset2), Integer.valueOf(viewGroup2.getResources().getDimensionPixelOffset(R.dimen.ad_rich_bottom_padding)));
            return kVar;
        }
    }

    @Inject
    public h(@Y61.k c cVar) {
        this.f87682a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87682a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f87683b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof CommercialHtmlBannerItem) && ((CommercialHtmlBannerItem) aVar).getDisplayType().isInformative();
    }
}
