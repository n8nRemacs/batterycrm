package com.avito.android.safedeal.delivery.order_cancellation.details.mvi;

import Y61.l;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.entity.ReasonDetailsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReasonDetailsBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.b<ReasonDetailsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.delivery.order_cancellation.details.domain.b f256239a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ReasonRds f256240b;

    @Inject
    public c(@Y61.k com.avito.android.safedeal.delivery.order_cancellation.details.domain.b bVar, @Y61.k ReasonRds reasonRds) {
        this.f256239a = bVar;
        this.f256240b = reasonRds;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ReasonDetailsInternalAction> a() {
        return new C43210w(new ReasonDetailsInternalAction.ItemsConverted(this.f256239a.a(this.f256240b)));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
