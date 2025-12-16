package com.avito.android.autoteka.items.waitingForPaymentResponseItem;

import Uf.InterfaceC15514a;
import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WaitingForPaymentResponsePresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/waitingForPaymentResponseItem/e;", "LTV0/d;", "Lcom/avito/android/autoteka/items/waitingForPaymentResponseItem/g;", "Lcom/avito/android/autoteka/items/waitingForPaymentResponseItem/WaitingForPaymentResponseItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements TV0.d<g, WaitingForPaymentResponseItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15514a, G0> f97060b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15514a, G0> lVar) {
        this.f97060b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        WaitingForPaymentResponseItem waitingForPaymentResponseItem = (WaitingForPaymentResponseItem) aVar;
        gVar.b(waitingForPaymentResponseItem.f97045c);
        gVar.l7(new d(this), waitingForPaymentResponseItem.f97046d);
        gVar.sD(new c(this));
    }
}
