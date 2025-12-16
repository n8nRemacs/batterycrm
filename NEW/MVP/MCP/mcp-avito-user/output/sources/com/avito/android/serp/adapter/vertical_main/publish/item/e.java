package com.avito.android.serp.adapter.vertical_main.publish.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.q;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerticalPublishItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/publish/item/e;", "Lcom/avito/android/serp/adapter/vertical_main/publish/item/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q f273127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.groupable_item.b f273128c;

    @Inject
    public e(@k q qVar, @k com.avito.android.lib.util.groupable_item.b bVar) {
        this.f273127b = qVar;
        this.f273128c = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f fVar = (com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f) eVar;
        VerticalPromoBlockItem.VerticalPublishItem verticalPublishItem = (VerticalPromoBlockItem.VerticalPublishItem) aVar;
        fVar.yM(verticalPublishItem.f272554k, R.layout.main_vertical_search_filter_content);
        this.f273128c.a(fVar, verticalPublishItem);
        this.f273127b.l(fVar, verticalPublishItem, i12);
        fVar.setTitle(verticalPublishItem.f272550g);
    }
}
