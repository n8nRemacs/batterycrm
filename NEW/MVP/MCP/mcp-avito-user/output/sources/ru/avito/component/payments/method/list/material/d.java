package ru.avito.component.payments.method.list.material;

import Y41.l;
import Y61.k;
import hw.InterfaceC41178c;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.payments.method.PaymentLabel;

/* compiled from: MaterialPaymentMethodItemPresenter.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lru/avito/component/payments/method/list/material/d;", "LTV0/d;", "Lru/avito/component/payments/method/list/material/e;", "LO81/b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d implements TV0.d<e, O81.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<O81.b, G0> f430407b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<Integer, G0> f430408c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super O81.b, G0> lVar, @k l<? super Integer, G0> lVar2) {
        this.f430407b = lVar;
        this.f430408c = lVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        O81.b bVar = (O81.b) aVar;
        eVar2.c(new c(this, bVar, i12));
        eVar2.setEnabled(bVar.f12032c);
        eVar2.setErrorMessage(bVar.f12030i);
        PaymentLabel paymentLabel = bVar.f12027f;
        eVar2.AB(paymentLabel);
        eVar2.setTitle(bVar.f12033d);
        eVar2.f(bVar.f12026e);
        eVar2.pc(bVar.f12029h);
        eVar2.setChecked(bVar.f12028g);
        eVar2.Nv(paymentLabel);
    }
}
