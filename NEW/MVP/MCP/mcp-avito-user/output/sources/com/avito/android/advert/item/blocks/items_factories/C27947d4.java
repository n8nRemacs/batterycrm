package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.safedeal.real_one_click_payment_block.AdvertDetailsSafeDealPaymentBlockItem;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.PaymentBlockItemState;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.safedeal.SafeDeal;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSafeDealPaymentBlockItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/d4;", "Lcom/avito/android/advert/item/blocks/items_factories/c4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.d4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27947d4 implements InterfaceC27940c4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.Z0 f73937a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73938b;

    @Inject
    public C27947d4(@Y61.k com.avito.android.Z0 z02, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73937a = z02;
        this.f73938b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27940c4
    @Y61.l
    public final AdvertDetailsSafeDealPaymentBlockItem a(@Y61.k AdvertDetails advertDetails) {
        com.avito.android.Z0 z02 = this.f73937a;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.Z0.f67595D[6];
        if (!((Boolean) z02.f67606i.a().invoke()).booleanValue()) {
            return null;
        }
        SafeDeal safeDeal = advertDetails.getSafeDeal();
        if (safeDeal != null ? kotlin.jvm.internal.L.f(safeDeal.getShouldShowRealOneClickSlider(), Boolean.TRUE) : false) {
            return new AdvertDetailsSafeDealPaymentBlockItem(0L, null, this.f73938b.a(), null, null, PaymentBlockItemState.ShowSkeleton.f78912b, 27, null);
        }
        return null;
    }
}
