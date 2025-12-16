package com.avito.android.str_seller_orders.orders_seller.domain;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sz0.AbstractC48441b;
import sz0.AbstractC48444e;

/* compiled from: StrSellerOrdersFiltersUpdateUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/q;", "Lcom/avito/android/str_seller_orders/orders_seller/domain/p;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements p {
    @Inject
    public q() {
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.domain.p
    @Y61.k
    public final ArrayList a(@Y61.k AbstractC48444e abstractC48444e, @Y61.l List list) {
        ArrayList arrayList;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        String f438989a = abstractC48444e.getF438989a();
        if (abstractC48444e instanceof AbstractC48444e.a) {
            List<AbstractC48441b> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (AbstractC48441b aVar : list2) {
                if (L.f(aVar.getF438969a(), f438989a) && (aVar instanceof AbstractC48441b.a)) {
                    AbstractC48441b.a aVar2 = (AbstractC48441b.a) aVar;
                    Boolean bool = ((AbstractC48444e.a) abstractC48444e).f438991c;
                    aVar = new AbstractC48441b.a(aVar2.f438971c, aVar2.f438972d, bool != null ? bool.booleanValue() : false);
                }
                arrayList.add(aVar);
            }
        } else if (abstractC48444e instanceof AbstractC48444e.b) {
            List<AbstractC48441b> list3 = list;
            arrayList = new ArrayList(C42745f0.q(list3, 10));
            for (AbstractC48441b c12655b : list3) {
                if (L.f(c12655b.getF438969a(), f438989a) && (c12655b instanceof AbstractC48441b.C12655b)) {
                    AbstractC48441b.C12655b c12655b2 = (AbstractC48441b.C12655b) c12655b;
                    c12655b = new AbstractC48441b.C12655b(c12655b2.f438974c, c12655b2.f438975d, c12655b2.f438976e, c12655b2.f438977f, ((AbstractC48444e.b) abstractC48444e).f438993c);
                }
                arrayList.add(c12655b);
            }
        } else {
            if (!(abstractC48444e instanceof AbstractC48444e.c)) {
                throw new NoWhenBranchMatchedException();
            }
            List<AbstractC48441b> list4 = list;
            arrayList = new ArrayList(C42745f0.q(list4, 10));
            for (AbstractC48441b cVar : list4) {
                if (L.f(cVar.getF438969a(), f438989a) && (cVar instanceof AbstractC48441b.c)) {
                    AbstractC48441b.c cVar2 = (AbstractC48441b.c) cVar;
                    cVar = new AbstractC48441b.c(cVar2.f438979c, cVar2.f438980d, cVar2.f438981e, cVar2.f438982f, ((AbstractC48444e.c) abstractC48444e).f438995c);
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
