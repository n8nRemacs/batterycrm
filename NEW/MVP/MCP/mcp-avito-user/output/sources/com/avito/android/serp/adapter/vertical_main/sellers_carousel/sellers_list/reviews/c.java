package com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.reviews;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.SellerItem;
import com.avito.android.serp.analytics.widgets_tracker.g;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: SellerWithReviewsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/reviews/c;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/reviews/e;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/sellers_list/SellerItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements TV0.d<e, SellerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f273187b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f273188c;

    @Inject
    public c(@k g gVar, @k h31.e eVar) {
        this.f273187b = eVar;
        this.f273188c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String str;
        e eVar2 = (e) eVar;
        SellerItem sellerItem = (SellerItem) aVar;
        m mVar = new m(26, this, sellerItem);
        C35949t5.c(eVar2.f273195f, com.avito.android.image_loader.b.b(sellerItem.f273163d), null, null, null, 14);
        eVar2.f273192c.setText(sellerItem.f273164e);
        String str2 = sellerItem.f273166g;
        if (str2 == null || (str = sellerItem.f273165f) == null) {
            D6.w(eVar2.f273196g);
        } else {
            eVar2.f273193d.setText(str);
            eVar2.f273194e.setText(str2);
        }
        eVar2.f273191b.setOnClickListener(mVar);
    }
}
