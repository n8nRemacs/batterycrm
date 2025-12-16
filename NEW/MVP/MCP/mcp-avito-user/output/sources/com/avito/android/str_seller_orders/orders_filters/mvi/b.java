package com.avito.android.str_seller_orders.orders_filters.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.str_seller_orders.orders_filters.mvi.entity.StrOrdersFiltersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qz0.InterfaceC47467a;

/* compiled from: StrOrdersFiltersActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lqz0/a;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "Lqz0/c;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC47467a, StrOrdersFiltersInternalAction, qz0.c> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrOrdersFiltersInternalAction> b(InterfaceC47467a interfaceC47467a, qz0.c cVar) {
        C43210w c43210w;
        InterfaceC47467a interfaceC47467a2 = interfaceC47467a;
        qz0.c cVar2 = cVar;
        if (interfaceC47467a2 instanceof InterfaceC47467a.e) {
            return new C43210w(new StrOrdersFiltersInternalAction.UpdateToggleSelected(((InterfaceC47467a.e) interfaceC47467a2).f429544a));
        }
        if (interfaceC47467a2 instanceof InterfaceC47467a.c) {
            c43210w = new C43210w(StrOrdersFiltersInternalAction.ClearSelectedToggles.f289191b);
        } else {
            if (interfaceC47467a2 instanceof InterfaceC47467a.C12348a) {
                return C43175k.G(new a(cVar2, null));
            }
            if (!(interfaceC47467a2 instanceof InterfaceC47467a.b ? true : interfaceC47467a2 instanceof InterfaceC47467a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(StrOrdersFiltersInternalAction.Close.f289192b);
        }
        return c43210w;
    }
}
