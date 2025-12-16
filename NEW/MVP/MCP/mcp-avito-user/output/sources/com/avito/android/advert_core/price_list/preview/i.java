package com.avito.android.advert_core.price_list.preview;

import Y61.k;
import Y61.l;
import com.avito.android.advert.item.W0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.price_list.PriceList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertPriceListPreviewItemViewPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/preview/i;", "Lcom/avito/android/advert_core/price_list/preview/f;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f84132b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public W0 f84133c;

    @Inject
    public i(@k InterfaceC28373a interfaceC28373a) {
        this.f84132b = interfaceC28373a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        AdvertPriceListPreviewItem advertPriceListPreviewItem = (AdvertPriceListPreviewItem) aVar;
        cVar.setTitle(advertPriceListPreviewItem.f84112g);
        cVar.f60(advertPriceListPreviewItem.f84117l, advertPriceListPreviewItem.f84119n);
        cVar.dV();
        List<PriceList.Value> listE0 = advertPriceListPreviewItem.f84114i;
        if (listE0 != null) {
            boolean z12 = advertPriceListPreviewItem.f84118m;
            if (z12) {
                listE0 = C42745f0.E0(listE0, 2);
            }
            Iterator<T> it = listE0.iterator();
            while (it.hasNext()) {
                cVar.Bn((PriceList.Value) it.next(), z12, new g(2, this, i.class, "handleItemClick", "handleItemClick(Ljava/lang/String;Lcom/avito/android/remote/model/imv_services/ImvServices;)V", 0));
            }
        }
        cVar.c1(advertPriceListPreviewItem.f84113h);
        cVar.hs(new h(this, advertPriceListPreviewItem, advertPriceListPreviewItem));
    }

    @Override // com.avito.android.advert_core.price_list.preview.f
    public final void c0() {
        this.f84133c = null;
    }

    @Override // com.avito.android.advert_core.price_list.preview.f
    public final void z5(@k W0 w02) {
        this.f84133c = w02;
    }
}
