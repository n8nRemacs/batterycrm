package com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.input;

import Y61.k;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InputItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/input/e;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/input/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.safedeal.delivery.order_cancellation.details.domain.a f256209b;

    @Inject
    public e(@k com.avito.android.safedeal.delivery.order_cancellation.details.domain.a aVar) {
        this.f256209b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ParameterElement.p pVar = (ParameterElement.p) aVar;
        gVar.m3(pVar.f117490o);
        gVar.g0(pVar.f117481f);
        gVar.tB(new d(pVar, this));
    }
}
