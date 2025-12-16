package com.avito.android.advertising.adapter.items.buzzoola.premium;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPremiumSingleGridBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/o;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium/p;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium/BuzzoolaPremiumBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements TV0.b<com.avito.android.advertising.ui.buzzoola.premium.p, BuzzoolaPremiumBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f87441a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.premium.q> f87443c = new g.a<>(R.layout.buzzoola_premium, new a());

    /* compiled from: BuzzoolaPremiumSingleGridBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/premium/q;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/premium/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.premium.q> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.premium.q invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            ForegroundRelativeLayout foregroundRelativeLayout = (ForegroundRelativeLayout) view;
            com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
            o oVar = o.this;
            com.avito.android.advertising.ui.buzzoola.premium.q qVar = new com.avito.android.advertising.ui.buzzoola.premium.q(foregroundRelativeLayout, Float.MAX_VALUE, cVar, oVar.f87442b.a() ? AdStyle.f88540e : AdStyle.f88539d, null, null, 48, null);
            boolean zA2 = oVar.f87442b.a();
            com.avito.android.advertising.ui.buzzoola.premium.h hVar = qVar.f88664b;
            if (zA2) {
                hVar.f88645o = true;
                com.avito.android.advertising.ui.h.f88704a.getClass();
                com.avito.android.advertising.ui.h.j(hVar.f88638h, false);
                ForegroundRelativeLayout foregroundRelativeLayout2 = hVar.f88632b;
                Resources resources = foregroundRelativeLayout2.getResources();
                D6.c(hVar.f88636f, null, null, null, Integer.valueOf(resources.getDimensionPixelOffset(R.dimen.ad_card_image_bottom_margin)), 7);
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.ad_borderless_grid_content_vertical_margin);
                int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.ad_borderless_grid_content_horizontal_margin);
                D6.c(hVar.f88643m, Integer.valueOf(dimensionPixelOffset2), null, null, null, 14);
                D6.c(hVar.f88638h, Integer.valueOf(dimensionPixelOffset2), null, Integer.valueOf(dimensionPixelOffset2), null, 10);
                D6.c(hVar.f88639i, Integer.valueOf(dimensionPixelOffset2), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset2), null, 8);
                D6.c(hVar.f88644n, Integer.valueOf(dimensionPixelOffset2), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset2), null, 8);
                RatioForegroundFrameLayout ratioForegroundFrameLayout = hVar.f88636f;
                v.b(ratioForegroundFrameLayout, R.dimen.ad_borderless_grid_image_radius);
                hVar.f88637g.f132066a.getLayoutParams().height = -1;
                int dimensionPixelOffset3 = foregroundRelativeLayout2.getResources().getDimensionPixelOffset(R.dimen.serp_card_image_height);
                ViewGroup.LayoutParams layoutParams = ratioForegroundFrameLayout.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = dimensionPixelOffset3;
                }
                int dimensionPixelOffset4 = foregroundRelativeLayout2.getContext().getResources().getDimensionPixelOffset(R.dimen.ad_badges_mid_margin);
                D6.c(hVar.f88642l, null, Integer.valueOf(dimensionPixelOffset4), Integer.valueOf(dimensionPixelOffset4), null, 9);
            } else {
                hVar.f88645o = true;
                com.avito.android.advertising.ui.h.f88704a.getClass();
                com.avito.android.advertising.ui.h.j(hVar.f88638h, false);
                hVar.b();
                ForegroundRelativeLayout foregroundRelativeLayout3 = hVar.f88632b;
                RatioForegroundFrameLayout ratioForegroundFrameLayout2 = hVar.f88636f;
                com.avito.android.advertising.ui.h.i(false, foregroundRelativeLayout3, ratioForegroundFrameLayout2, null);
                hVar.f88637g.f132066a.getLayoutParams().height = -1;
                int dimensionPixelOffset5 = foregroundRelativeLayout3.getResources().getDimensionPixelOffset(R.dimen.serp_card_image_height);
                ViewGroup.LayoutParams layoutParams2 = ratioForegroundFrameLayout2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = dimensionPixelOffset5;
                }
            }
            RatioForegroundFrameLayout ratioForegroundFrameLayout3 = hVar.f88636f;
            ViewGroup.LayoutParams layoutParams3 = ratioForegroundFrameLayout3.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = -2;
            }
            ratioForegroundFrameLayout3.setRatio(1.0f);
            return qVar;
        }
    }

    @Inject
    public o(@Y61.k f fVar, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87441a = fVar;
        this.f87442b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87441a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.premium.q> b() {
        return this.f87443c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof BuzzoolaPremiumBannerItem) {
            BuzzoolaPremiumBannerItem buzzoolaPremiumBannerItem = (BuzzoolaPremiumBannerItem) aVar;
            if (!buzzoolaPremiumBannerItem.getDisplayType().isInformative() && buzzoolaPremiumBannerItem.getAdViewType() == AdViewType.f86909c) {
                return true;
            }
        }
        return false;
    }
}
