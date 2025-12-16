package com.avito.android.autoteka.items.payment;

import Y61.k;
import Y61.l;
import com.avito.android.autoteka.items.payment.PaymentItem;
import com.avito.android.remote.autoteka.model.DiscountWidget;
import com.avito.android.remote.autoteka.model.PriceWidget;
import com.avito.android.remote.autoteka.model.PromoCodeWidget;
import com.avito.android.remote.autoteka.model.TotalWidget;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaymentView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/payment/g;", "LTV0/e;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g extends TV0.e {

    /* compiled from: PaymentView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void YN(@k PriceWidget priceWidget);

    void Zt(boolean z12, @k List<DiscountWidget> list, @k PaymentItem.LoadingVariant loadingVariant);

    void b(@k String str);

    void hw(@k TotalWidget totalWidget, @k PaymentItem.LoadingVariant loadingVariant);

    void q(@l AttributedText attributedText);

    void yA(@k PaymentItem.PromoCodeState promoCodeState, @l PromoCodeWidget promoCodeWidget, @k PaymentItem.LoadingVariant loadingVariant, @k Y41.a<G0> aVar, @k Y41.l<? super String, G0> lVar);

    void z1(@l Image image);
}
