package com.avito.android.safedeal.delivery.order_cancellation;

import com.avito.android.remote.model.ReasonRds;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RdsOrderCancellationItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/h;", "Lcom/avito/android/safedeal/delivery/order_cancellation/g;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {
    @Inject
    public h() {
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.g
    @Y61.k
    public final ArrayList a(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ReasonRds reasonRds = (ReasonRds) it.next();
            arrayList2.add(new com.avito.android.safedeal.delivery.order_cancellation.konveyor.a(reasonRds.getId(), reasonRds.getTitle()));
        }
        return arrayList2;
    }
}
