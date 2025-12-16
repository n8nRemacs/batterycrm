package com.avito.android.autoteka.items.payment;

import Nf.InterfaceC14568a;
import Y41.l;
import Y61.k;
import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.remote.autoteka.model.DiscountWidget;
import com.avito.android.remote.autoteka.model.PriceDetails;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaymentPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/payment/e;", "LTV0/d;", "Lcom/avito/android/autoteka/items/payment/g;", "Lcom/avito/android/autoteka/items/payment/PaymentItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.d<g, PaymentItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC14568a, G0> f96861b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC14568a, G0> lVar) {
        this.f96861b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        PaymentItem paymentItem = (PaymentItem) aVar;
        gVar.b(paymentItem.f96837c);
        gVar.q(paymentItem.f96838d);
        PriceDetails priceDetails = paymentItem.f96845k;
        gVar.yA(paymentItem.f96844j, priceDetails.getPromoCodeWidget(), paymentItem.f96840f, new c(this), new d(this));
        gVar.z1(paymentItem.f96839e);
        gVar.YN(priceDetails.getPriceWidget());
        List<DiscountWidget> listD = priceDetails.d();
        PaymentItem.LoadingVariant loadingVariant = paymentItem.f96840f;
        gVar.Zt(true, listD, loadingVariant);
        gVar.Zt(false, priceDetails.c(), loadingVariant);
        gVar.hw(priceDetails.getTotalWidget(), loadingVariant);
    }
}
