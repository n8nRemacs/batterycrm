package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.promo_mechanics.PromoMechanicsItem;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPromoMechanicsItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/z3;", "Lcom/avito/android/advert/item/blocks/items_factories/y3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.z3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28090z3 implements InterfaceC28084y3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f74089a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74090b;

    @Inject
    public C28090z3(@Y61.k com.avito.android.Z0 z02, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74089a = z02;
        this.f74090b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC28084y3
    public final PromoMechanicsItem a(AdvertDetails advertDetails) {
        if (advertDetails.getPromoMechanics() != null) {
            com.avito.android.Z0 z02 = this.f74089a;
            z02.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.Z0.f67595D[11];
            if (((Boolean) z02.f67611n.a().invoke()).booleanValue()) {
                return new PromoMechanicsItem(0L, null, this.f74090b.a(), advertDetails.getPromoMechanics(), 3, null);
            }
        }
        return null;
    }
}
