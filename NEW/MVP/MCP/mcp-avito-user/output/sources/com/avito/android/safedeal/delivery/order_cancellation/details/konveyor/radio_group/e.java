package com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.radio_group;

import Y61.k;
import Y61.l;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadioGroupItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/radio_group/e;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/konveyor/radio_group/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.safedeal.delivery.order_cancellation.details.domain.a f256219b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f256220c;

    @Inject
    public e(@k com.avito.android.safedeal.delivery.order_cancellation.details.domain.a aVar, @l @com.avito.android.safedeal.delivery.order_cancellation.details.di.c Integer num) {
        this.f256219b = aVar;
        this.f256220c = num;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
        gVar.Sb(bVar.f117236E, bVar.f117212h, new d(bVar, this));
        Integer num = this.f256220c;
        if (num != null) {
            gVar.JL(num.intValue());
        }
    }
}
