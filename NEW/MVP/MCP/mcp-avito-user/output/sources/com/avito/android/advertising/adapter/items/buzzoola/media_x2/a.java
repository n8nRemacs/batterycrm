package com.avito.android.advertising.adapter.items.buzzoola.media_x2;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.ui.AdStyle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaMediaX2BigBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/a;", "LTV0/b;", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/j;", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/BuzzoolaMediaX2BannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<j, BuzzoolaMediaX2BannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f87318a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BannerPageSource f87319b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87320c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f87321d = new g.a<>(R.layout.buzzoola_media_x2_ad, new C2602a());

    /* compiled from: BuzzoolaMediaX2BigBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.adapter.items.buzzoola.media_x2.a$a, reason: collision with other inner class name */
    public static final class C2602a extends N implements p<ViewGroup, View, k> {
        public C2602a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            AdStyle adStyle = AdStyle.f88545j;
            a aVar = a.this;
            k kVar = new k(view, adStyle, aVar.f87319b);
            BannerPageSource bannerPageSource = BannerPageSource.f87779e;
            BannerPageSource bannerPageSource2 = aVar.f87319b;
            if (bannerPageSource2 != bannerPageSource && !aVar.f87320c.b()) {
                com.avito.android.advertising.ui.h.f88704a.getClass();
                com.avito.android.advertising.ui.h.a(kVar.f87353b, bannerPageSource2);
            }
            return kVar;
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k BannerPageSource bannerPageSource, @Y61.k com.avito.android.advertising.a aVar) {
        this.f87318a = cVar;
        this.f87319b = bannerPageSource;
        this.f87320c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87318a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f87321d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof BuzzoolaMediaX2BannerItem) && !((BuzzoolaMediaX2BannerItem) aVar).getDisplayType().isInformative();
    }
}
