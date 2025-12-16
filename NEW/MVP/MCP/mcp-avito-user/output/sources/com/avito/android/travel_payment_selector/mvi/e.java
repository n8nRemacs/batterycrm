package com.avito.android.travel_payment_selector.mvi;

import com.avito.android.travel_payment_selector.mvi.entity.PaymentSelectorInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PaymentSelectorBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements com.avito.android.arch.mvi.b<PaymentSelectorInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f302655a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_payment_selector.mvi.interactor.d f302656b;

    @Inject
    public e(@Y61.k String str, @Y61.k com.avito.android.travel_payment_selector.mvi.interactor.d dVar) {
        this.f302655a = str;
        this.f302656b = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PaymentSelectorInternalAction> a() {
        return this.f302656b.b(this.f302655a);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
