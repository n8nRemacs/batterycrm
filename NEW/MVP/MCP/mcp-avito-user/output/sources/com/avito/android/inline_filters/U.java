package com.avito.android.inline_filters;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: InlinesOrderConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/U;", "Lcom/avito/android/inline_filters/T;", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class U implements T {
    @Inject
    public U() {
    }

    @Override // com.avito.android.inline_filters.T
    @Y61.k
    public final Map<String, String> a(@Y61.l List<String> list) {
        if (list == null) {
            return P0.c();
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new kotlin.Q(androidx.appcompat.app.r.p("parameters[inlinesOrder][", i12, ']'), (String) obj));
            i12 = i13;
        }
        return P0.p(arrayList);
    }
}
