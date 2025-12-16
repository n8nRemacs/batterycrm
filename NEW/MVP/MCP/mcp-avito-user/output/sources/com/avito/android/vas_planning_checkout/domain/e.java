package com.avito.android.vas_planning_checkout.domain;

import com.avito.android.vas_planning_checkout.item.checkout.PlanCheckoutItem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanCheckoutCalculator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_checkout/domain/e;", "Lcom/avito/android/vas_planning_checkout/domain/d;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.vas_planning_checkout.domain.d
    public final int a(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof PlanCheckoutItem) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((PlanCheckoutItem) next).f322918i) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Integer num = ((PlanCheckoutItem) it2.next()).f322919j;
            arrayList4.add(Integer.valueOf(num != null ? num.intValue() : 0));
        }
        return C42745f0.D0(arrayList4);
    }
}
