package com.avito.android.advert_collection.adapter.order;

import Y61.l;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: OrderPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection/adapter/order/e;", "Lcom/avito/android/advert_collection/adapter/order/c;", "<init>", "()V", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f81301b;

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        gVar.VJ((OrderItem) aVar);
        gVar.a(new d(this));
    }

    @Override // com.avito.android.advert_collection.adapter.order.c
    public final void setListener(@l Y41.a<G0> aVar) {
        this.f81301b = aVar;
    }
}
