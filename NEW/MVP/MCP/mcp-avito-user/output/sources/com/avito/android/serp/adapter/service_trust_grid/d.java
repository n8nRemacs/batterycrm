package com.avito.android.serp.adapter.service_trust_grid;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertGridServiceTrustItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/service_trust_grid/d;", "Lcom/avito/android/serp/adapter/service_trust_grid/c;", "LTV0/f;", "Lcom/avito/android/serp/adapter/service_trust_grid/f;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c, TV0.f<f, AdvertItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.sale_advert_item.c f272221b;

    public d(@k com.avito.android.serp.adapter.sale_advert_item.c cVar) {
        this.f272221b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertItem advertItem = (AdvertItem) aVar;
        this.f272221b.g2(fVar, advertItem, i12, e.f272222a);
        AdvertSellerInfo advertSellerInfo = advertItem.f268435f0;
        fVar.nU(advertSellerInfo != null ? advertSellerInfo.getServicesType() : null);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        AdvertItem advertItem = (AdvertItem) aVar;
        this.f272221b.g2(fVar, advertItem, i12, list);
        AdvertSellerInfo advertSellerInfo = advertItem.f268435f0;
        fVar.nU(advertSellerInfo != null ? advertSellerInfo.getServicesType() : null);
    }
}
