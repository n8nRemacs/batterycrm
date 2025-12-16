package com.avito.android.advertising.adapter.items.avito;

import Fb.C13552b;
import Fb.C13554d;
import Fb.InterfaceC13553c;
import TV0.g;
import Y41.p;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.advertising.ui.AdStyle;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoNetworkImageRichBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/h;", "LTV0/b;", "LFb/c;", "Lcom/avito/android/advertising/adapter/items/avito/AvitoNetworkImageBannerItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements TV0.b<InterfaceC13553c, AvitoNetworkImageBannerItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f87153a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<C13554d> f87154b = new g.a<>(R.layout.ad_avito, a.f87155l);

    /* compiled from: AvitoNetworkImageRichBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LFb/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LFb/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, C13554d> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f87155l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final C13554d invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            C13554d c13554d = new C13554d(view, AdStyle.f88542g);
            C13552b c13552b = c13554d.f4796b;
            c13552b.b();
            View view2 = c13552b.f4792b;
            Resources resources = view2.getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.rich_snippet_commercial_padding_top);
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.ad_rich_bottom_padding);
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.rich_snippet_padding_left) - view2.getResources().getDimensionPixelOffset(R.dimen.list_serp_card_padding);
            view2.setPadding(dimensionPixelOffset3, dimensionPixelOffset, dimensionPixelOffset3, dimensionPixelOffset2);
            return c13554d;
        }
    }

    @Inject
    public h(@k c cVar) {
        this.f87153a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f87153a;
    }

    @Override // TV0.b
    @k
    public final g.a<C13554d> b() {
        return this.f87154b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof AvitoNetworkImageBannerItem) && ((AvitoNetworkImageBannerItem) aVar).getDisplayType().isInformative();
    }
}
