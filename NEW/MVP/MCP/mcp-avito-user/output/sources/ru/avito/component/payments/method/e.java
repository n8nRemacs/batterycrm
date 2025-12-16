package ru.avito.component.payments.method;

import Y61.k;
import Y61.l;
import hw.InterfaceC41177b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaymentMethodCard.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/payments/method/e;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface e {
    void AB(@k PaymentLabel paymentLabel);

    void Nv(@k PaymentLabel paymentLabel);

    void c(@k Y41.a<G0> aVar);

    void f(@k String str);

    void pc(@k String str);

    void setEnabled(boolean z12);

    void setErrorMessage(@l String str);

    void setTitle(@k String str);
}
