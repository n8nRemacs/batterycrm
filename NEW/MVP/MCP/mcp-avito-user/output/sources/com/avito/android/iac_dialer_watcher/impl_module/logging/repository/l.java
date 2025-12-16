package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import com.avito.android.iac_dialer_watcher.impl_module.db.A;
import com.avito.android.iac_dialer_watcher.impl_module.db.C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogRepository.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/iac_dialer_watcher/impl_module/db/C;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/db/A;", "dbMap", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "apply", "(Ljava/util/Map;)Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final l<T, R> f167923b = new l<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            C c12 = (C) entry.getKey();
            linkedHashMap.put(new w(c12.f167802a, c12.f167803b, c12.f167804c), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
        Iterator<T> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            List list = (List) entry2.getValue();
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (Iterator<T> it2 = list.iterator(); it2.hasNext(); it2 = it2) {
                A a12 = (A) it2.next();
                arrayList.add(new a(a12.f167790a, a12.f167791b, a12.f167792c, a12.f167793d, a12.f167794e, a12.f167795f, a12.f167796g, a12.f167797h));
                it = it;
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
