package com.avito.android.order.feature.mvi;

import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OrderBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/order/feature/mvi/s;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements com.avito.android.arch.mvi.b<OrderInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.order.feature.domain.a f209692a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f209693b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.order.feature.a f209694c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Wi.b f209695d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final W40.b f209696e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f209697f;

    @Inject
    public s(@Y61.k com.avito.android.order.feature.domain.a aVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.order.feature.a aVar2, @Y61.k Wi.b bVar, @Y61.k W40.b bVar2, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3) {
        this.f209692a = aVar;
        this.f209693b = interfaceC40691b;
        this.f209694c = aVar2;
        this.f209695d = bVar;
        this.f209696e = bVar2;
        this.f209697f = aVar3;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<OrderInternalAction> a() {
        return C43175k.N(this.f209692a.a(), new n(kotlinx.coroutines.rx3.y.a(this.f209694c.f209508a.getF103348p())), C43175k.G(new m(kotlinx.coroutines.rx3.y.a(this.f209693b.q()), null)), C43175k.C(new r(this, null), kotlinx.coroutines.rx3.y.a(this.f209695d.f18020b)), C43175k.G(new q(this, null)), C43175k.C(new p(this, null), new o(kotlinx.coroutines.rx3.y.a(this.f209697f.d9()))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f209693b.onCleared();
        return G0.f406611a;
    }
}
