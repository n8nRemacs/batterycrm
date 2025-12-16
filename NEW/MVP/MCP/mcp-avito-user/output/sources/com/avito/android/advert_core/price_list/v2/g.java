package com.avito.android.advert_core.price_list.v2;

import Y61.k;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.remote.model.imv_services.ImvServicesLabel;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertPriceListV2Presenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/price_list/v2/g;", "Lcom/avito/android/advert_core/price_list/v2/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.price_list.dialog.f f84155b;

    @Inject
    public g(@k com.avito.android.advert_core.price_list.dialog.f fVar) {
        this.f84155b = fVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ImvServicesLabel label;
        ImvServicesLabel label2;
        c cVar = (c) eVar;
        AdvertPriceListV2Item advertPriceListV2Item = (AdvertPriceListV2Item) aVar;
        cVar.setTitle(advertPriceListV2Item.f84136c);
        cVar.f(advertPriceListV2Item.f84137d);
        cVar.p(advertPriceListV2Item.f84138e);
        cVar.QC(advertPriceListV2Item.f84139f);
        UniversalColor color = null;
        ImvServices imvServices = advertPriceListV2Item.f84140g;
        String text = (imvServices == null || (label2 = imvServices.getLabel()) == null) ? null : label2.getText();
        if (imvServices != null && (label = imvServices.getLabel()) != null) {
            color = label.getColor();
        }
        cVar.u70(color, text);
        cVar.IK(new f(this, advertPriceListV2Item));
    }
}
