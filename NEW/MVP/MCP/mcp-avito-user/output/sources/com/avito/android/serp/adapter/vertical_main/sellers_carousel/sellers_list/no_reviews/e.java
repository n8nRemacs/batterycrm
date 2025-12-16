package com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.no_reviews;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.SellerItem;
import com.avito.android.util.C35949t5;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: SellerWithoutReviewsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/no_reviews/e;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/no_reviews/g;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/SellerItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<g, SellerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f273176b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f273177c;

    @Inject
    public e(@k com.avito.android.serp.analytics.widgets_tracker.g gVar, @k h31.e eVar) {
        this.f273176b = eVar;
        this.f273177c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        SellerItem sellerItem = (SellerItem) aVar;
        m mVar = new m(25, this, sellerItem);
        C35949t5.c(gVar.f273182d, com.avito.android.image_loader.b.b(sellerItem.f273163d), null, null, null, 14);
        gVar.f273181c.setText(sellerItem.f273164e);
        gVar.f273180b.setOnClickListener(mVar);
    }
}
