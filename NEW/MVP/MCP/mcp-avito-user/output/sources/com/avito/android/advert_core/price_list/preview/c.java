package com.avito.android.advert_core.price_list.preview;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.remote.model.price_list.PriceList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertPriceListPreviewItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/preview/c;", "LTV0/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c extends TV0.e {

    /* compiled from: AdvertPriceListPreviewItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Bn(@k PriceList.Value value, boolean z12, @k p<? super String, ? super ImvServices, G0> pVar);

    void c1(@l String str);

    void dV();

    void f60(boolean z12, boolean z13);

    void hs(@k Y41.a<G0> aVar);

    void setTitle(@l String str);
}
