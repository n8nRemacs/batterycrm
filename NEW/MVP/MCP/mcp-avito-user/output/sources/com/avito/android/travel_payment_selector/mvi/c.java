package com.avito.android.travel_payment_selector.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.travel_payment_selector.mvi.entity.PaymentSelectorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lF0.C43630c;
import lF0.InterfaceC43628a;

/* compiled from: PaymentSelectorActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_payment_selector/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LlF0/a;", "Lcom/avito/android/travel_payment_selector/mvi/entity/PaymentSelectorInternalAction;", "LlF0/c;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC43628a, PaymentSelectorInternalAction, C43630c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f302647a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Long f302648b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f302649c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f302650d;

    @Inject
    public c(@Y61.k String str, @com.avito.android.travel_payment_selector.di.b @Y61.l Long l12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.analytics.provider.a aVar) {
        this.f302647a = str;
        this.f302648b = l12;
        this.f302649c = interfaceC28373a;
        this.f302650d = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PaymentSelectorInternalAction> b(InterfaceC43628a interfaceC43628a, C43630c c43630c) {
        InterfaceC43628a interfaceC43628a2 = interfaceC43628a;
        C43630c c43630c2 = c43630c;
        if (interfaceC43628a2 instanceof InterfaceC43628a.e) {
            return new C43210w(new PaymentSelectorInternalAction.ChangePaymentType(((InterfaceC43628a.e) interfaceC43628a2).f413670a));
        }
        if (interfaceC43628a2 instanceof InterfaceC43628a.d) {
            return new C43137a0(new a(this, interfaceC43628a2, null), new C43210w(new PaymentSelectorInternalAction.ChangePaymentPlan(((InterfaceC43628a.d) interfaceC43628a2).f413669b)));
        }
        if (interfaceC43628a2 instanceof InterfaceC43628a.c) {
            return C43175k.G(new b(this, interfaceC43628a2, null));
        }
        if (interfaceC43628a2 instanceof InterfaceC43628a.C11779a) {
            return new C43210w(new PaymentSelectorInternalAction.OpenPaymentDeeplink(c43630c2.f413683h));
        }
        if (interfaceC43628a2 instanceof InterfaceC43628a.b) {
            return new C43210w(new PaymentSelectorInternalAction.ToggleDescription(((InterfaceC43628a.b) interfaceC43628a2).f413666a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
