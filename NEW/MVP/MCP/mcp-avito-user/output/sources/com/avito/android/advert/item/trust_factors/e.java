package com.avito.android.advert.item.trust_factors;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.DeliveryTrustFactors;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryTrustFactorsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/trust_factors/e;", "Lcom/avito/android/advert/item/trust_factors/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f80628b;

    @Inject
    public e(@k i iVar) {
        this.f80628b = iVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        DeliveryTrustFactorsItem deliveryTrustFactorsItem = (DeliveryTrustFactorsItem) aVar;
        DeliveryTrustFactors deliveryTrustFactors = deliveryTrustFactorsItem.f80621g;
        gVar.setTitle(deliveryTrustFactors.getTitle());
        gVar.TC(deliveryTrustFactors.getTrustFactors());
        gVar.Lk(deliveryTrustFactors.getFooterText());
        gVar.a(new d(this, deliveryTrustFactorsItem));
    }
}
