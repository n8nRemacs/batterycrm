package com.avito.android.service_booking.mvi.navigation.mvi;

import Fs0.b;
import com.avito.android.arch.mvi.u;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: ServiceBookingNavigationReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking/mvi/navigation/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "LFs0/b;", "LFs0/d;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements u<Fs0.b, Fs0.d> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Fs0.d a(Fs0.b bVar, Fs0.d dVar) {
        Fs0.b bVar2 = bVar;
        Fs0.d dVar2 = dVar;
        boolean z12 = bVar2 instanceof b.d;
        Map<String, Map<String, Set<Object>>> map = dVar2.f6007a;
        if (!z12) {
            if (bVar2 instanceof b.a) {
                LinkedHashMap linkedHashMapE = com.avito.android.service_booking.mvi.domain.d.e(map);
                linkedHashMapE.computeIfAbsent(((b.a) bVar2).f5999a, new k(0, l.f274425l));
                return new Fs0.d(linkedHashMapE, null);
            }
            if (!(bVar2 instanceof b.C0306b)) {
                if (bVar2 instanceof b.c) {
                    return new Fs0.d(map, ((b.c) bVar2).f6002a);
                }
                throw new NoWhenBranchMatchedException();
            }
            LinkedHashMap linkedHashMapE2 = com.avito.android.service_booking.mvi.domain.d.e(map);
            b.C0306b c0306b = (b.C0306b) bVar2;
            int iL2 = C42745f0.L(linkedHashMapE2.keySet(), c0306b.f6000a) + 1;
            int size = linkedHashMapE2.keySet().size() - 1;
            if (iL2 <= size) {
                List listM0 = C42745f0.M0(linkedHashMapE2.keySet());
                if (iL2 <= size) {
                    while (true) {
                        linkedHashMapE2.remove(listM0.get(size));
                        if (size == iL2) {
                            break;
                        }
                        size--;
                    }
                }
            }
            return new Fs0.d(linkedHashMapE2, c0306b.f6001b);
        }
        LinkedHashMap linkedHashMapE3 = com.avito.android.service_booking.mvi.domain.d.e(map);
        b.d dVar3 = (b.d) bVar2;
        Map<String, Set<Object>> map2 = dVar3.f6004b;
        boolean zIsEmpty = map2.isEmpty();
        String str = dVar3.f6003a;
        if (!zIsEmpty) {
            linkedHashMapE3.remove(str);
        }
        for (Map.Entry<String, Set<Object>> entry : map2.entrySet()) {
            String key = entry.getKey();
            for (Object obj : entry.getValue()) {
                Object linkedHashMap = linkedHashMapE3.get(str);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMapE3.put(str, linkedHashMap);
                }
                Map map3 = (Map) linkedHashMap;
                Object linkedHashSet = map3.get(key);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    map3.put(key, linkedHashSet);
                }
                ((Set) linkedHashSet).add(obj);
            }
        }
        return new Fs0.d(linkedHashMapE3, dVar2.f6008b);
    }
}
