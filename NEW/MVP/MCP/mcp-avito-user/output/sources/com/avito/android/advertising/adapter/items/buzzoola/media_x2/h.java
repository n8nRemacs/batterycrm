package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import TV0.g;
import Y41.p;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaMediaX2RichBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/h;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/j;", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/BuzzoolaMediaX2BannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements TV0.b<j, BuzzoolaMediaX2BannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f87346a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BannerPageSource f87347b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f87348c = new g.a<>(R.layout.buzzoola_media_x2_ad, new a());

    /* compiled from: BuzzoolaMediaX2RichBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, k> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            k kVar = new k(view, AdStyle.f88542g, h.this.f87347b);
            View view2 = kVar.f87353b;
            int dimensionPixelOffset = view2.getResources().getDimensionPixelOffset(R.dimen.rich_snippet_commercial_padding_top);
            int dimensionPixelOffset2 = view2.getResources().getDimensionPixelOffset(R.dimen.ad_rich_bottom_padding);
            int dimensionPixelOffset3 = view2.getResources().getDimensionPixelOffset(R.dimen.rich_snippet_padding_left);
            D6.b(view2, Integer.valueOf(dimensionPixelOffset3), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset3), Integer.valueOf(dimensionPixelOffset2));
            return kVar;
        }
    }

    @Inject
    public h(@Y61.k c cVar, @Y61.k BannerPageSource bannerPageSource) {
        this.f87346a = cVar;
        this.f87347b = bannerPageSource;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87346a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f87348c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof BuzzoolaMediaX2BannerItem) && ((BuzzoolaMediaX2BannerItem) aVar).getDisplayType().isInformative();
    }
}
