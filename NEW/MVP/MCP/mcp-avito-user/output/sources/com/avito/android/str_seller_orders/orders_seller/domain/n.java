package com.avito.android.str_seller_orders.orders_seller.domain;

import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import sz0.AbstractC48441b;

/* compiled from: StrSellerOrdersExtractFiltersMap.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/domain/n;", "Lcom/avito/android/str_seller_orders/orders_seller/domain/m;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements m {
    @Inject
    public n() {
    }

    @Override // com.avito.android.str_seller_orders.orders_seller.domain.m
    @Y61.k
    public final LinkedHashMap a(@Y61.l List list) {
        LinkedHashMap linkedHashMapC;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC48441b abstractC48441b : list) {
            if (abstractC48441b instanceof AbstractC48441b.a) {
                AbstractC48441b.a aVar = (AbstractC48441b.a) abstractC48441b;
                linkedHashMapC = C35755b0.c(Collections.singletonMap(aVar.f438971c, String.valueOf(aVar.f438973e)));
            } else if (abstractC48441b instanceof AbstractC48441b.C12655b) {
                AbstractC48441b.C12655b c12655b = (AbstractC48441b.C12655b) abstractC48441b;
                List<String> list2 = c12655b.f438978g;
                if (list2 != null) {
                    List<String> list3 = list2;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                    int i12 = 0;
                    for (Object obj : list3) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        String str = c12655b.f438974c + '[' + i12 + ']';
                        String string = C43066x.A0((String) obj).toString();
                        if (string == null || C43066x.K(string)) {
                            string = null;
                        }
                        arrayList2.add(new Q(str, string));
                        i12 = i13;
                    }
                    linkedHashMapC = C35755b0.c(P0.p(arrayList2));
                } else {
                    linkedHashMapC = null;
                }
            } else {
                if (!(abstractC48441b instanceof AbstractC48441b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC48441b.c cVar = (AbstractC48441b.c) abstractC48441b;
                linkedHashMapC = C35755b0.c(Collections.singletonMap(cVar.f438979c, cVar.f438983g));
            }
            if (linkedHashMapC != null) {
                arrayList.add(linkedHashMapC);
            }
        }
        return C35755b0.d(arrayList);
    }
}
