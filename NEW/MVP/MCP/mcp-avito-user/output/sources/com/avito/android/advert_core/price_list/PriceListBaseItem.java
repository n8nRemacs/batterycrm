package com.avito.android.advert_core.price_list;

import Y61.k;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PriceListBaseItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003\u0082\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_core/price_list/PriceListBaseItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/advert_core/price_list/AdvertPriceListSectionItem;", "Lcom/avito/android/advert_core/price_list/PriceListGroupTitleItem;", "Lcom/avito/android/advert_core/price_list/PriceListHeaderItem;", "Lcom/avito/android/advert_core/price_list/PriceListItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class PriceListBaseItem implements BlockItem, Q, l1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SerpViewType f84016b;

    public PriceListBaseItem(SerpDisplayType serpDisplayType, SerpViewType serpViewType, C42822w c42822w) {
        this.f84016b = serpViewType;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF78903b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78907f() {
        return this.f84016b;
    }

    public /* synthetic */ PriceListBaseItem(SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i12 & 2) != 0 ? SerpViewType.f268585e : serpViewType, null);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
    }
}
