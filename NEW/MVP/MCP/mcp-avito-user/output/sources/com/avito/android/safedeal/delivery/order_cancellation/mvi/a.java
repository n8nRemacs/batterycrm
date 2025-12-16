package com.avito.android.safedeal.delivery.order_cancellation.mvi;

import Hn0.InterfaceC14013a;
import Hn0.c;
import com.avito.android.arch.mvi.a;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.mvi.entity.RdsOrderCancellationReasonsInternalAction;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RdsOrderCancellationReasonsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LHn0/a;", "Lcom/avito/android/safedeal/delivery/order_cancellation/mvi/entity/RdsOrderCancellationReasonsInternalAction;", "LHn0/c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14013a, RdsOrderCancellationReasonsInternalAction, Hn0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal.delivery.order_cancellation.domain.a f256374a;

    @Inject
    public a(@Y61.k com.avito.android.safedeal.delivery.order_cancellation.domain.a aVar) {
        this.f256374a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<RdsOrderCancellationReasonsInternalAction> b(InterfaceC14013a interfaceC14013a, Hn0.c cVar) {
        InterfaceC43160i<RdsOrderCancellationReasonsInternalAction> c43207v;
        Object next;
        InterfaceC14013a interfaceC14013a2 = interfaceC14013a;
        Hn0.c cVar2 = cVar;
        if (interfaceC14013a2 instanceof InterfaceC14013a.b) {
            return this.f256374a.a();
        }
        if (!(interfaceC14013a2 instanceof InterfaceC14013a.C0436a)) {
            throw new NoWhenBranchMatchedException();
        }
        c.a aVar = cVar2.f7703b;
        if (aVar instanceof c.a.C0438a) {
            InterfaceC14013a.C0436a c0436a = (InterfaceC14013a.C0436a) interfaceC14013a2;
            c.a.C0438a c0438a = (c.a.C0438a) aVar;
            Iterator it = c0438a.f7704a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(c0436a.f7697a.f256362b, ((ReasonRds) next).getId())) {
                    break;
                }
            }
            c43207v = new C43210w(new RdsOrderCancellationReasonsInternalAction.ReasonClick((ReasonRds) next, c0438a.f7706c));
        } else {
            c43207v = new C43207v(new RdsOrderCancellationReasonsInternalAction[0]);
        }
        return c43207v;
    }
}
