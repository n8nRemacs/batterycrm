package com.avito.android.advertising;

import com.avito.android.favorites.adapter.FavoriteListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommercialItem.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/CommercialItem;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "LQH/a;", "_avito_advertising_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CommercialItem extends com.avito.conveyor_item.a, FavoriteListItem, QH.a {

    /* compiled from: CommercialItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static boolean a(@Y61.k CommercialItem commercialItem, @Y61.k Object obj) {
            CommercialItem commercialItem2 = obj instanceof CommercialItem ? (CommercialItem) obj : null;
            if (commercialItem2 == null) {
                return false;
            }
            return (commercialItem.getClass() == obj.getClass() && L.f(commercialItem.getF86439b(), commercialItem2.getF86439b())) && !((commercialItem instanceof i) && (obj instanceof i) && ((i) commercialItem).getIsHidden() != ((i) obj).getIsHidden());
        }
    }

    boolean isContentEqualWith(@Y61.k Object obj);
}
