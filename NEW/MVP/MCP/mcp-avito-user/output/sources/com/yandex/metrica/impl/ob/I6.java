package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;

/* loaded from: classes7.dex */
public final class I6 {
    @X41.n
    @Y61.k
    public static final H6 a(@Y61.l Throwable th2, @Y61.l C39212w6 c39212w6, @Y61.l List<StackTraceElement> list, @Y61.l String str, @Y61.l Boolean bool) {
        ArrayList arrayList = null;
        F6 f6A = th2 != null ? G6.a(th2) : null;
        if (list != null) {
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new D6((StackTraceElement) it.next()));
            }
        }
        return new H6(f6A, c39212w6, arrayList, null, null, null, str, bool);
    }

    @X41.n
    @Y61.k
    public static final H6 a(@Y61.l String str, @Y61.l String str2, @Y61.l List<? extends StackTraceItem> list, @Y61.l String str3, @Y61.l String str4, @Y61.l Map<String, String> map, @Y61.l String str5, @Y61.l Boolean bool) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (StackTraceItem stackTraceItem : list) {
                arrayList.add(new D6(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new H6(new F6(str, str2, arrayList, null, null), null, null, str3, str4, map, str5, bool);
    }
}
