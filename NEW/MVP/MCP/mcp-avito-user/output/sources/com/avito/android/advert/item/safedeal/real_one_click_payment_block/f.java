package com.avito.android.advert.item.safedeal.real_one_click_payment_block;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert.item.safedeal.real_one_click_payment_block.PaymentBlockItemState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSafeDealPaymentBlockPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/f;", "Lcom/avito/android/advert/item/safedeal/real_one_click_payment_block/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28173a f78924b;

    @Inject
    public f(@k InterfaceC28173a interfaceC28173a) {
        this.f78924b = interfaceC28173a;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        PaymentBlockItemState paymentBlockItemState = ((AdvertDetailsSafeDealPaymentBlockItem) aVar).f78908g;
        if (paymentBlockItemState instanceof PaymentBlockItemState.ShowSkeleton) {
            hVar.s3();
            return;
        }
        if (paymentBlockItemState instanceof PaymentBlockItemState.HideBlock) {
            hVar.gY();
            return;
        }
        if (paymentBlockItemState instanceof PaymentBlockItemState.ShowPaymentBlock) {
            PaymentBlockItemState.ShowPaymentBlock showPaymentBlock = (PaymentBlockItemState.ShowPaymentBlock) paymentBlockItemState;
            hVar.nu(showPaymentBlock.f78910b, this.f78924b);
            Boolean bool = showPaymentBlock.f78911c;
            if (bool != null) {
                if (bool.equals(Boolean.TRUE)) {
                    hVar.EY();
                } else if (bool.equals(Boolean.FALSE)) {
                    hVar.jj();
                }
            }
        }
    }
}
