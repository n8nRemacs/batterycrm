package com.avito.android.util;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: Lists.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class O2 {
    public static final <T> boolean a(@Y61.l List<? extends T> list) {
        List<? extends T> list2 = list;
        return !(list2 == null || list2.isEmpty());
    }

    @Y61.k
    public static final ArrayList b(@Y61.l List list, @Y61.l List list2) {
        if (list == null) {
            list = C42784z0.f406748b;
        }
        if (list2 == null) {
            list2 = C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }
}
