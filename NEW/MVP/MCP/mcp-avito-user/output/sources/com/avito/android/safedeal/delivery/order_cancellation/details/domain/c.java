package com.avito.android.safedeal.delivery.order_cancellation.details.domain;

import JO.m;
import Y61.k;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.Option;
import com.avito.android.remote.model.ReasonRds;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ReasonDetailsItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/domain/c;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/domain/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.safedeal.delivery.order_cancellation.details.domain.b
    @k
    public final ArrayList a(@k ReasonRds reasonRds) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.avito.android.safedeal.delivery.order_cancellation.details.konveyor.title.a(String.valueOf(arrayList.size()), reasonRds.getTitle()));
        List<Option> options = reasonRds.getOptions();
        if (options != null) {
            List<Option> list = options;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (Option option : list) {
                arrayList2.add(new m(option.getId(), option.getTitle(), null, false, null, null, null, false, null, null, false, null, null, null, null, null, 65524, null));
            }
            arrayList.add(new ParameterElement.C.b(String.valueOf(arrayList.size()), "", null, null, null, null, null, null, arrayList2, ParameterElement.DisplayType.o.f117268a, null, false, false, false, null, null, false, false, null, null, null, false, false, false, null, null, null, null, null, 0, null, null, false, -8964, 1, null));
        }
        arrayList.add(new ParameterElement.p(String.valueOf(arrayList.size()), "", null, null, 1, 3, null, null, null, null, null, reasonRds.getPlaceholder(), null, null, null, false, null, null, null, false, null, null, null, null, false, false, false, null, null, 536868812, null));
        return arrayList;
    }
}
