package com.avito.android.advert.item.autoteka.common;

import Y61.l;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAutotekaTeaserItemCommon.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/autoteka/common/AdvertDetailsAutotekaTeaserItemCommon;", "ItemResponse", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AdvertDetailsAutotekaTeaserItemCommon<ItemResponse> extends BlockItem, Q, l1 {

    /* compiled from: AdvertDetailsAutotekaTeaserItemCommon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    ItemResponse getData();

    @l
    String getSearchContext();
}
