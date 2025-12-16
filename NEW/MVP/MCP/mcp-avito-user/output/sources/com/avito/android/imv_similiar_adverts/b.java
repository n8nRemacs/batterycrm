package com.avito.android.imv_similiar_adverts;

import com.avito.android.imv_similiar_adverts.item.header.ImvHeaderItem;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;
import uk0.C49071a;

/* compiled from: ImvHeaderElementConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/b;", "Lcom/avito/android/imv_similiar_adverts/a;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {
    @Override // com.avito.android.imv_similiar_adverts.a
    @Y61.k
    public final ImvHeaderItem a(@Y61.k C49071a c49071a) {
        return new ImvHeaderItem("imv_similar_adverts_header_item", c49071a.getTitle(), c49071a.getDescription(), SerpViewType.f268585e, 6);
    }
}
