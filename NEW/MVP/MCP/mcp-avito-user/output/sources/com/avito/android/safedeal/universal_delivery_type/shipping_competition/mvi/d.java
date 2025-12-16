package com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi;

import Vn0.InterfaceC15696b;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: UniversalDeliveryTypeShippingCompetitionBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LVn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.b<InterfaceC15696b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain.a f256839a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f256840b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.a f256841c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.universal_delivery_type.beduin.a f256842d;

    @Inject
    public d(@Y61.k com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain.a aVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.safedeal.universal_delivery_type.shipping_competition.a aVar2, @Y61.k com.avito.android.safedeal.universal_delivery_type.beduin.a aVar3) {
        this.f256839a = aVar;
        this.f256840b = interfaceC40691b;
        this.f256841c = aVar2;
        this.f256842d = aVar3;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC15696b> a() {
        return C43175k.N(this.f256839a.a(), C43175k.G(new a(y.a(this.f256840b.q()), null)), new b(y.a(this.f256841c.f256768a.getF103348p())), C43175k.G(new c(y.a(this.f256842d.f256440c), null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
