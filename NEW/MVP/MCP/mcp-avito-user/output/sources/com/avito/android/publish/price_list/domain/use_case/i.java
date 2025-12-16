package com.avito.android.publish.price_list.domain.use_case;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SplGetSelectedItemsCountUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/domain/use_case/i;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i {
    @Inject
    public i() {
    }

    public static int a(@Y61.k List list) {
        Set<com.avito.android.publish.price_list.items.selected.a> set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.avito.android.publish.price_list.items.selected.d) {
                arrayList.add(obj);
            }
        }
        com.avito.android.publish.price_list.items.selected.d dVar = (com.avito.android.publish.price_list.items.selected.d) C42745f0.G(arrayList);
        if (dVar == null || (set = dVar.f238722e) == null) {
            return 0;
        }
        return set.size();
    }
}
