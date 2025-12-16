package com.avito.android.serp.adapter.vertical_main.sellers_carousel.with_reviews;

import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.SellersCarouselWidgetItem;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellersCarouselWithReviewsWidgetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/with_reviews/c;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/with_reviews/e;", "Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/SellersCarouselWidgetItem;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements TV0.d<e, SellersCarouselWidgetItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        SellersCarouselWidgetItem sellersCarouselWidgetItem = (SellersCarouselWidgetItem) aVar;
        j.c(eVar2.f273208d, sellersCarouselWidgetItem.f273151c, null);
        ArrayList arrayList = eVar2.f273209e;
        arrayList.clear();
        arrayList.addAll(sellersCarouselWidgetItem.f273152d);
        eVar2.f273206b.c(eVar2.f273210f);
        eVar2.f273207c.notifyDataSetChanged();
    }
}
