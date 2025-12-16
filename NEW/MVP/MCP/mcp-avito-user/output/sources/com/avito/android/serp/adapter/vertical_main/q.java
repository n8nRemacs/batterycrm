package com.avito.android.serp.adapter.vertical_main;

import com.avito.android.bxcontent.Y0;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.publish.PublishAction;
import com.avito.android.serp.adapter.vertical_main.publish.VerticalPublishState;
import kotlin.Metadata;

/* compiled from: PromoBlockFilterPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/q;", "Lcom/avito/android/serp/adapter/vertical_main/b;", "Lcom/avito/android/serp/adapter/vertical_main/publish/PublishAction;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface q extends b<PublishAction> {
    void a();

    void b(@Y61.k Y0 y02);

    @Y61.l
    VerticalPublishState d0();

    void l(@Y61.k com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f fVar, @Y61.k VerticalPromoBlockItem.VerticalPublishItem verticalPublishItem, int i12);

    void q1();
}
