package com.avito.android.advert_details_items.imv_v4_cars;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.PriceDetails;
import com.avito.android.remote.model.Range;
import com.avito.android.util.O2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsV4ItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/imv_v4_cars/h;", "LTV0/d;", "Lcom/avito/android/advert_details_items/imv_v4_cars/j;", "Lcom/avito/android/advert_details_items/imv_v4_cars/ImvCarsV4Item;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements TV0.d<j, ImvCarsV4Item> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f84852b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f84853c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f84854d;

    @Inject
    public h(@Y61.k a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f84852b = aVar;
        this.f84853c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        ImvCarsV4Item imvCarsV4Item = (ImvCarsV4Item) aVar;
        ImvCarsData imvCarsData = imvCarsV4Item.f84835d;
        jVar.b(imvCarsData.f84829b);
        jVar.j(imvCarsData.f84831d);
        jVar.VY(imvCarsData.f84830c);
        PriceDetails priceDetails = imvCarsData.f84832e;
        DeepLink url = priceDetails != null ? priceDetails.getUrl() : null;
        if (url != null) {
            jVar.xn(priceDetails.getText(), this.f84854d ? null : new f(this, imvCarsV4Item), new g(imvCarsV4Item, this, url));
        } else {
            jVar.Dz();
        }
        List<Range> list = imvCarsV4Item.f84836e;
        if (list == null || !O2.a(list)) {
            jVar.iZ();
        } else {
            jVar.s10(list);
        }
    }
}
