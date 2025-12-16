package com.avito.android.trx_promo_impl.di;

import com.avito.android.di.B;
import com.avito.android.paid_services.PaidServicesResultRepository;
import com.avito.android.trx_promo_impl.TrxPromoFragment;
import com.avito.android.trx_promo_impl.TrxPromoScreen;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import ux.InterfaceC49123a;

/* compiled from: TrxPromoComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/di/e;", "", "a", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface e {

    /* compiled from: TrxPromoComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/di/e$a;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        e a(@Y61.k l lVar, @Y61.k InterfaceC39417a interfaceC39417a, @h31.b @InterfaceC49123a @Y61.k TrxPromoScreen trxPromoScreen, @h31.b @InterfaceC49123a @Y61.k com.avito.android.analytics.screens.r rVar, @h31.b @InterfaceC49123a @Y61.k String str, @f @h31.b @Y61.k String str2, @h31.b @d boolean z12, @h31.b @Y61.k Y41.l lVar2, @h31.b @Y61.k Y41.l lVar3, @h31.b @Y61.k PaidServicesResultRepository paidServicesResultRepository);
    }

    void a(@Y61.k TrxPromoFragment trxPromoFragment);
}
