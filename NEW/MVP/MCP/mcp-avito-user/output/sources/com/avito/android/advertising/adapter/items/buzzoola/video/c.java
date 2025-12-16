package com.avito.android.advertising.adapter.items.buzzoola.video;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommercialVideoBigBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/video/c;", "LTV0/b;", "Lcom/avito/android/advertising/ui/buzzoola/k;", "Lcom/avito/android/advertising/adapter/items/buzzoola/video/CommercialVideoBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements TV0.b<com.avito.android.advertising.ui.buzzoola.k, CommercialVideoBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f87542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player_holder.a f87543b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f87544c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.a f87545d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.m> f87546e = new g.a<>(R.layout.buzzoola_video_ad, new a());

    /* compiled from: CommercialVideoBigBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advertising/ui/buzzoola/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advertising/ui/buzzoola/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.advertising.ui.buzzoola.m> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advertising.ui.buzzoola.m invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            c cVar = c.this;
            com.avito.android.advertising.ui.buzzoola.m mVar = new com.avito.android.advertising.ui.buzzoola.m(view2, cVar.f87545d.a() ? AdStyle.f88538c : AdStyle.f88537b, cVar.f87543b, cVar.f87544c.e());
            com.avito.android.advertising.a aVar = cVar.f87545d;
            int i12 = aVar.a() ? R.dimen.ad_borderless_grid_image_radius : R.dimen.ad_video_corner_radius;
            int i13 = aVar.a() ? R.dimen.ad_badges_mid_margin : R.dimen.ad_badges_margin;
            ViewGroup viewGroup2 = mVar.f88604f;
            if (viewGroup2 != null) {
                v.b(viewGroup2, i12);
            }
            ViewGroup viewGroup3 = mVar.f88605g;
            if (viewGroup3 != null) {
                v.b(viewGroup3, i12);
            }
            mVar.H60(R.dimen.ad_video_icon_corner_radius);
            View view3 = mVar.f88600b;
            if (viewGroup2 != null) {
                viewGroup2.setBackground(androidx.core.content.d.getDrawable(view3.getContext(), R.drawable.ad_video_grid_bg));
            }
            int dimensionPixelOffset = view3.getContext().getResources().getDimensionPixelOffset(i13);
            D6.c(mVar.f88616r, null, Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), null, 9);
            return mVar;
        }
    }

    @Inject
    public c(@Y61.k j jVar, @Y61.k com.avito.android.player_holder.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.advertising.a aVar2) {
        this.f87542a = jVar;
        this.f87543b = aVar;
        this.f87544c = interfaceC35745a5;
        this.f87545d = aVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87542a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advertising.ui.buzzoola.m> b() {
        return this.f87546e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof CommercialVideoBannerItem) && !((CommercialVideoBannerItem) aVar).getDisplayType().isInformative();
    }
}
