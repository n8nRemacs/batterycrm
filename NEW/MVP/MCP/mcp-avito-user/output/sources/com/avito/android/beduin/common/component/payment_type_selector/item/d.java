package com.avito.android.beduin.common.component.payment_type_selector.item;

import Y41.l;
import Y61.k;
import com.avito.android.beduin.common.component.payment_type_selector.PaymentMethodElement;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaymentMethodItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/item/d;", "LTV0/d;", "Lcom/avito/android/beduin/common/component/payment_type_selector/item/e;", "Lcom/avito/android/beduin/common/component/payment_type_selector/item/PaymentMethodItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<e, PaymentMethodItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f101826b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super Integer, G0> lVar) {
        this.f101826b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        PaymentMethodElement paymentMethodElement = ((PaymentMethodItem) aVar).f101820c;
        eVar2.x80(paymentMethodElement.getBase64Icon());
        eVar2.b(paymentMethodElement.getTitle());
        eVar2.a(new c(this, i12));
        eVar2.B10(paymentMethodElement.isChosen());
        eVar2.lK(paymentMethodElement.getCustomWidth());
        eVar2.CH(paymentMethodElement.getBadge());
    }
}
