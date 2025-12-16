package com.avito.android.advert_core.offers.items;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.remote.model.ContextButton;
import kotlin.Metadata;

/* compiled from: OfferItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/offers/items/OfferItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface OfferItem extends com.avito.conveyor_item.a, Parcelable {

    /* compiled from: OfferItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    ContextButton getContextButton();

    @l
    String getDescription();

    @k
    String getTitle();
}
