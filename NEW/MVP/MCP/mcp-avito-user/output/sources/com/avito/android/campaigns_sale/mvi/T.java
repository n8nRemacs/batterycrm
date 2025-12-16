package com.avito.android.campaigns_sale.mvi;

import gm.C40705b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_campaigns-sale_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class T {
    @Y61.k
    public static final List<Long> a(@Y61.k List<C40705b> list, @Y61.k Set<Long> set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Collection collection = ((C40705b) it.next()).f396777f;
            if (collection == null) {
                collection = C42784z0.f406748b;
            }
            linkedHashSet.addAll(collection);
        }
        return C42745f0.M0(b1.f(set, linkedHashSet));
    }
}
