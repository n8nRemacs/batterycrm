package com.avito.android.safedeal.delivery.order_cancellation.konveyor;

import Y61.k;
import com.avito.android.safedeal.delivery.order_cancellation.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReasonItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/konveyor/e;", "LTV0/d;", "Lcom/avito/android/safedeal/delivery/order_cancellation/konveyor/g;", "Lcom/avito/android/safedeal/delivery/order_cancellation/konveyor/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<g, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f256370b;

    @Inject
    public e(@k p pVar) {
        this.f256370b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.g0(aVar2.f256363c);
        gVar.c(new d(this, aVar2));
    }
}
