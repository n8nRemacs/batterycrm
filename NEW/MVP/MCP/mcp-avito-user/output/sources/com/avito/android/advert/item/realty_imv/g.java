package com.avito.android.advert.item.realty_imv;

import Y61.k;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.remote.model.advert_details.realty.RealtyImvBody;
import com.avito.android.remote.model.advert_details.realty.RealtyImvHint;
import com.avito.android.remote.model.advert_details.realty.RealtyImvPriceRange;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: RealtyImvView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/realty_imv/g;", "LTV0/e;", "a", "c", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface g extends TV0.e {

    /* compiled from: RealtyImvView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/realty_imv/g$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: RealtyImvView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: RealtyImvView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/realty_imv/g$c;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        void t0(@k DetailsSheetLinkBody detailsSheetLinkBody);
    }

    void ZP(@k RealtyImvHint realtyImvHint);

    void df(@k d dVar);

    void fU(@k RealtyImvBody realtyImvBody);

    void jq(@k RealtyImvPriceRange realtyImvPriceRange);

    void nY(@InterfaceC42150f int i12, @k String str);
}
