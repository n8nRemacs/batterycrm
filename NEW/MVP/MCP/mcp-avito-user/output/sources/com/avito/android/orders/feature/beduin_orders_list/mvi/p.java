package com.avito.android.orders.feature.beduin_orders_list.mvi;

import com.avito.android.Z0;
import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43221z1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import lj.InterfaceC43779a;

/* compiled from: BeduinOrdersBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/mvi/p;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements com.avito.android.arch.mvi.b<BeduinOrdersInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.orders.feature.beduin_orders_list.f f210136a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f210137b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Wi.b f210138c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.orders.feature.beduin_orders_list.data.a f210139d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f210140e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final z f210141f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final W40.b f210142g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C f210143h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Z0 f210144i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f210145j;

    @Inject
    public p(@Y61.k com.avito.android.orders.feature.beduin_orders_list.f fVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k Wi.b bVar, @Y61.k com.avito.android.orders.feature.beduin_orders_list.data.a aVar, @Y61.k com.avito.android.remote.error.f fVar2, @Y61.k z zVar, @Y61.k W40.b bVar2, @Y61.k C c12, @Y61.k Z0 z02, @Y61.k com.avito.android.clientEventBus.a aVar2) {
        this.f210136a = fVar;
        this.f210137b = interfaceC40691b;
        this.f210138c = bVar;
        this.f210139d = aVar;
        this.f210140e = fVar2;
        this.f210141f = zVar;
        this.f210142g = bVar2;
        this.f210143h = c12;
        this.f210144i = z02;
        this.f210145j = aVar2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<BeduinOrdersInternalAction> a() {
        InterfaceC43160i interfaceC43160iW;
        z zVar = this.f210141f;
        zVar.getClass();
        InterfaceC43160i interfaceC43160iG = C43175k.G(new y(zVar, null));
        com.avito.android.orders.feature.beduin_orders_list.f fVar = this.f210136a;
        InterfaceC43779a interfaceC43779a = fVar.f210059a;
        C43137a0 c43137a0 = new C43137a0(new g(2, null), kotlinx.coroutines.rx3.y.a(interfaceC43779a.getF103348p()));
        InterfaceC43779a interfaceC43779a2 = fVar.f210060b;
        InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(interfaceC43779a2.getF103348p());
        InterfaceC43779a interfaceC43779a3 = fVar.f210061c;
        C43221z1 c43221z1K = C43175k.k(c43137a0, interfaceC43160iA, new C43137a0(new h(2, null), kotlinx.coroutines.rx3.y.a(interfaceC43779a3.getF103348p())), new i(interfaceC43779a, interfaceC43779a2, interfaceC43779a3, null));
        f fVar2 = new f(kotlinx.coroutines.rx3.y.a(this.f210137b.q()));
        C0 c0B = C43175k.B(new o(this, null), kotlinx.coroutines.rx3.y.a(this.f210138c.f18020b));
        InterfaceC43160i interfaceC43160iG2 = C43175k.G(new n(this, null));
        Z0 z02 = this.f210144i;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[1];
        if (((Boolean) z02.f67601d.a().invoke()).booleanValue()) {
            com.avito.android.clientEventBus.a aVar = this.f210145j;
            interfaceC43160iW = C43175k.Y(kotlinx.coroutines.rx3.y.a(aVar.a().y0(new m(aVar))), new j(this, null));
        } else {
            interfaceC43160iW = C43175k.w();
        }
        return C43175k.N(interfaceC43160iG, c43221z1K, fVar2, c0B, interfaceC43160iG2, interfaceC43160iW);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f210137b.onCleared();
        return G0.f406611a;
    }
}
