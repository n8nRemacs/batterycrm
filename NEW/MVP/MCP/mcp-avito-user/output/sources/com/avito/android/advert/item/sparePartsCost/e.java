package com.avito.android.advert.item.sparePartsCost;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SparePartsCost;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SparePartsCostItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/sparePartsCost/e;", "LTV0/d;", "Lcom/avito/android/advert/item/sparePartsCost/g;", "Lcom/avito/android/advert/item/sparePartsCost/SparePartsCostItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<g, SparePartsCostItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f80387b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f80388c;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.advert_core.analytics.a aVar2) {
        this.f80387b = aVar;
        this.f80388c = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        SparePartsCostItem sparePartsCostItem = (SparePartsCostItem) aVar;
        SparePartsCost sparePartsCost = sparePartsCostItem.f80373g;
        gVar.setTitle(sparePartsCost.getTitle());
        gVar.j(sparePartsCost.getSubtitle());
        if (sparePartsCost.getFirstButton() == null) {
            gVar.MI(null, null);
        } else {
            SparePartsCost.SparePartsCostButton firstButton = sparePartsCost.getFirstButton();
            gVar.MI(firstButton.getText(), new c(this, firstButton, sparePartsCostItem));
        }
        if (sparePartsCost.getSecondButton() == null) {
            gVar.uv(null, null);
        } else {
            SparePartsCost.SparePartsCostButton secondButton = sparePartsCost.getSecondButton();
            gVar.uv(secondButton.getText(), new d(this, secondButton, sparePartsCostItem));
        }
    }
}
