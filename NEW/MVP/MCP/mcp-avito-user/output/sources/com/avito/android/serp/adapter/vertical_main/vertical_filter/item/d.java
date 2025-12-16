package com.avito.android.serp.adapter.vertical_main.vertical_filter.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.serp.adapter.vertical_main.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VerticalFilterItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/d;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/item/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f273553b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.groupable_item.b f273554c;

    @Inject
    public d(@k p pVar, @k com.avito.android.lib.util.groupable_item.b bVar) {
        this.f273553b = pVar;
        this.f273554c = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem = (VerticalPromoBlockItem.VerticalFilterItem) aVar;
        this.f273554c.a(fVar, verticalFilterItem);
        this.f273553b.h(fVar, verticalFilterItem, i12);
        fVar.setTitle(verticalFilterItem.f272535g);
    }
}
