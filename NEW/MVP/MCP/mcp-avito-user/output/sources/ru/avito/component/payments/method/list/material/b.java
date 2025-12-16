package ru.avito.component.payments.method.list.material;

import Y61.k;
import Y61.l;
import android.view.View;
import hw.InterfaceC41178c;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.payments.method.PaymentLabel;

/* compiled from: CheckablePaymentMethodViewHolderImpl.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/component/payments/method/list/material/b;", "Lru/avito/component/payments/method/list/material/e;", "Lcom/avito/konveyor/adapter/b;", "Lru/avito/component/payments/method/a;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b extends com.avito.konveyor.adapter.b implements e, ru.avito.component.payments.method.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f430402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ru.avito.component.payments.method.c f430403c;

    public b(@k View view) {
        super(view);
        this.f430402b = view;
        this.f430403c = new ru.avito.component.payments.method.c(view);
    }

    @Override // ru.avito.component.payments.method.e
    public final void AB(@k PaymentLabel paymentLabel) {
        this.f430403c.AB(paymentLabel);
    }

    @Override // ru.avito.component.payments.method.e
    public final void Nv(@k PaymentLabel paymentLabel) {
        this.f430403c.Nv(paymentLabel);
    }

    @Override // ru.avito.component.payments.method.e
    public final void c(@k Y41.a<G0> aVar) {
        this.f430403c.c(aVar);
    }

    @Override // ru.avito.component.payments.method.e
    public final void f(@k String str) {
        this.f430403c.f(str);
    }

    @Override // ru.avito.component.payments.method.e
    public final void pc(@k String str) {
        this.f430403c.pc(str);
    }

    @Override // ru.avito.component.payments.method.a
    public final void setChecked(boolean z12) {
        this.f430403c.setChecked(z12);
    }

    @Override // ru.avito.component.payments.method.e
    public final void setEnabled(boolean z12) {
        this.f430403c.setEnabled(z12);
    }

    @Override // ru.avito.component.payments.method.e
    public final void setErrorMessage(@l String str) {
        this.f430403c.setErrorMessage(str);
    }

    @Override // ru.avito.component.payments.method.e
    public final void setTitle(@k String str) {
        this.f430403c.setTitle(str);
    }
}
