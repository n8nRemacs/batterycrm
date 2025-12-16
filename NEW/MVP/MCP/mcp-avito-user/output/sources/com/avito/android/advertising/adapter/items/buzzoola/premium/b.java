package com.avito.android.advertising.adapter.items.buzzoola.premium;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.buzzoola.premium.i;
import com.avito.android.lib.util.layout.ForegroundRelativeLayout;
import com.avito.android.lib.util.layout.RatioForegroundFrameLayout;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPremiumBigBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/b;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium/p;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium/BuzzoolaPremiumBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<com.avito.android.advertising.ui.buzzoola.premium.p, BuzzoolaPremiumBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f87385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87386b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.premium.q> f87387c = new g.a<>(R.layout.buzzoola_premium, new a());

    /* compiled from: BuzzoolaPremiumBigBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/premium/q;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/premium/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.premium.q> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.premium.q invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            ForegroundRelativeLayout foregroundRelativeLayout = (ForegroundRelativeLayout) view;
            com.jakewharton.rxrelay3.c cVar = new com.jakewharton.rxrelay3.c();
            b bVar = b.this;
            com.avito.android.advertising.ui.buzzoola.premium.q qVar = new com.avito.android.advertising.ui.buzzoola.premium.q(foregroundRelativeLayout, Float.MAX_VALUE, cVar, bVar.f87386b.a() ? AdStyle.f88538c : AdStyle.f88537b, null, null, 48, null);
            boolean zA2 = bVar.f87386b.a();
            com.avito.android.advertising.ui.buzzoola.premium.h hVar = qVar.f88664b;
            if (zA2) {
                i.a.a(qVar, 1);
                int dimensionPixelOffset = hVar.f88632b.getContext().getResources().getDimensionPixelOffset(R.dimen.ad_badges_mid_margin);
                D6.c(hVar.f88642l, null, Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), null, 9);
            } else {
                hVar.getClass();
                com.avito.android.advertising.ui.h.f88704a.getClass();
                com.avito.android.advertising.ui.h.j(hVar.f88638h, false);
                hVar.b();
                ForegroundRelativeLayout foregroundRelativeLayout2 = hVar.f88632b;
                RatioForegroundFrameLayout ratioForegroundFrameLayout = hVar.f88636f;
                com.avito.android.advertising.ui.h.i(false, foregroundRelativeLayout2, ratioForegroundFrameLayout, null);
                hVar.f88637g.f132066a.getLayoutParams().height = -1;
                ratioForegroundFrameLayout.setRatio(1.5f);
            }
            return qVar;
        }
    }

    @Inject
    public b(@Y61.k f fVar, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87385a = fVar;
        this.f87386b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87385a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.premium.q> b() {
        return this.f87387c;
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
            if (!buzzoolaPremiumBannerItem.getDisplayType().isInformative() && buzzoolaPremiumBannerItem.getAdViewType() == AdViewType.f86910d) {
                return true;
            }
        }
        return false;
    }
}
