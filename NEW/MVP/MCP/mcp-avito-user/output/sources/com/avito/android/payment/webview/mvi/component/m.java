package com.avito.android.payment.webview.mvi.component;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import w60.C49454e;
import x60.b;
import x60.c;

/* compiled from: WebPaymentMviOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/webview/mvi/component/m;", "Lcom/avito/android/arch/mvi/t;", "Lx60/b;", "Lx60/c;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements t<x60.b, x60.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f214910b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f214911c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.payment.webview.mvi.a f214912d;

    @Inject
    public m(@Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.payment.webview.mvi.a aVar) {
        this.f214910b = e12;
        this.f214911c = interfaceC28373a;
        this.f214912d = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final x60.c b(x60.b bVar) {
        x60.b bVar2 = bVar;
        if (bVar2 instanceof b.d) {
            return c.e.f442239a;
        }
        boolean z12 = bVar2 instanceof b.C12846b;
        InterfaceC28373a interfaceC28373a = this.f214911c;
        com.avito.android.payment.webview.mvi.a aVar = this.f214912d;
        E e12 = this.f214910b;
        if (z12) {
            String strA = e12.a();
            interfaceC28373a.c(new C49454e(aVar.f214853d, aVar.f214854e, strA == null ? "" : strA, aVar.f214850a, aVar.f214852c, aVar.f214851b));
            return c.b.f442236a;
        }
        if (bVar2.equals(b.e.f442232a)) {
            String strA2 = e12.a();
            interfaceC28373a.c(new w60.h(aVar.f214853d, aVar.f214854e, strA2 == null ? "" : strA2, aVar.f214850a, aVar.f214852c));
            return c.C12847c.f442237a;
        }
        if (bVar2 instanceof b.f) {
            return c.C12847c.f442237a;
        }
        if (bVar2 instanceof b.a) {
            return new c.a(((b.a) bVar2).f442228a);
        }
        if (bVar2 instanceof b.c) {
            return c.d.f442238a;
        }
        return null;
    }
}
