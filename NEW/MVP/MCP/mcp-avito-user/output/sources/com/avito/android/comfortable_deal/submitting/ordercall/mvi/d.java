package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import Yo.t;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallInternalAction;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallState;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import jq.InterfaceC42413a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OrderCallActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Ljq/a;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallState;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC42413a, OrderCallInternalAction, OrderCallState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.comfortable_deal.domain.e f123059a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f123060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final t f123061c;

    @Inject
    public d(@Y61.k com.avito.android.comfortable_deal.domain.e eVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k t tVar) {
        this.f123059a = eVar;
        this.f123060b = aVar;
        this.f123061c = tVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<OrderCallInternalAction> b(InterfaceC42413a interfaceC42413a, OrderCallState orderCallState) {
        InterfaceC42413a interfaceC42413a2 = interfaceC42413a;
        OrderCallState orderCallState2 = orderCallState;
        if (interfaceC42413a2.equals(InterfaceC42413a.C11582a.f405819a)) {
            return new C43210w(OrderCallInternalAction.NavigateBack.f123066b);
        }
        if (interfaceC42413a2 instanceof InterfaceC42413a.c) {
            return C43175k.G(new a(interfaceC42413a2, null));
        }
        if (interfaceC42413a2 instanceof InterfaceC42413a.d) {
            String str = orderCallState2.f123075d;
            return new C43137a0(new c(2, null), new b(this.f123059a.a(str, "podacha"), this, str));
        }
        if (!(interfaceC42413a2 instanceof InterfaceC42413a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        b.a.a(this.f123060b, ((InterfaceC42413a.b) interfaceC42413a2).f405820a, null, null, 6);
        return C43175k.w();
    }
}
