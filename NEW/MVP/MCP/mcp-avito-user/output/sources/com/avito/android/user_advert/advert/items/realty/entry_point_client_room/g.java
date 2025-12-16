package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EntryPointToAccountOwnerItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/g;", "LTV0/e;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface g extends TV0.e {

    /* compiled from: EntryPointToAccountOwnerItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void dj(@Y61.k ArrayList arrayList, @Y61.k Y41.l lVar, @Y61.k Y41.a aVar);

    void n1(@Y61.k List<MyAdvertDetails.Advantage> list);

    void sP(@Y61.k MyAdvertDetails.MainButtonAction mainButtonAction, @Y61.k Y41.l<? super DeepLink, G0> lVar);

    void setTitle(@Y61.k String str);
}
