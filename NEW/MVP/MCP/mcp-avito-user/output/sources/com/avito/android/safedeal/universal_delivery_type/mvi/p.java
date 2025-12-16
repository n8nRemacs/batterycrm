package com.avito.android.safedeal.universal_delivery_type.mvi;

import com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeParams;
import com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UniversalDeliveryTypeBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/p;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements com.avito.android.arch.mvi.b<UniversalDeliveryTypeInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UniversalDeliveryTypeParams f256715a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.universal_delivery_type.domain.a f256716b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f256717c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f256718d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.universal_delivery_type.beduin.a f256719e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Wi.b f256720f;

    @Inject
    public p(@Y61.k UniversalDeliveryTypeParams universalDeliveryTypeParams, @Y61.k com.avito.android.safedeal.universal_delivery_type.domain.a aVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.safedeal.universal_delivery_type.beduin.a aVar3, @Y61.k Wi.b bVar) {
        this.f256715a = universalDeliveryTypeParams;
        this.f256716b = aVar;
        this.f256717c = interfaceC40691b;
        this.f256718d = aVar2;
        this.f256719e = aVar3;
        this.f256720f = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<UniversalDeliveryTypeInternalAction> a() {
        com.avito.android.safedeal.universal_delivery_type.domain.a aVar = this.f256716b;
        InterfaceC43160i<UniversalDeliveryTypeInternalAction> interfaceC43160iA = aVar.a(aVar.f256618a);
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f256718d;
        return C43175k.N(interfaceC43160iA, C43175k.C(new j(2, null), new i(new h(kotlinx.coroutines.rx3.y.a(aVar2.d9())))), C43175k.G(new o(kotlinx.coroutines.rx3.y.a(this.f256719e.f256440c), null)), C43175k.C(new m(this, null), new l(new k(kotlinx.coroutines.rx3.y.a(aVar2.d9())))), C43175k.C(new g(this, null), new f(kotlinx.coroutines.rx3.y.a(aVar2.d9()))), C43175k.Y(kotlinx.coroutines.rx3.y.a(this.f256720f.f18020b), new n(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f256717c.onCleared();
        return G0.f406611a;
    }
}
