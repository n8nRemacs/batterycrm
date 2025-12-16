package com.avito.android.advert.item.realty_imv;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.advert_details.realty.RealtyImv;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RealtyImvPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/realty_imv/e;", "Lcom/avito/android/advert/item/realty_imv/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f78329b;

    @Inject
    public e(@k com.avito.android.advert_core.analytics.a aVar) {
        this.f78329b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        RealtyImvItem realtyImvItem = (RealtyImvItem) aVar;
        gVar.df(new d(this, realtyImvItem));
        RealtyImv realtyImv = realtyImvItem.f78319h;
        gVar.nY(realtyImvItem.f78320i ? R.attr.textH2 : R.attr.textHeadingLarge, realtyImv.getTitle());
        gVar.ZP(realtyImv.getHint());
        gVar.jq(realtyImv.getPriceRange());
        gVar.fU(realtyImv.getBody());
        this.f78329b.d4(realtyImvItem.f78318g);
    }
}
