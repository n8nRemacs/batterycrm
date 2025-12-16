package com.avito.android.service_booking_common.blueprints.date;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.I5;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import qt0.C47440d;

/* compiled from: SbDateItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/k;", "Lcom/avito/android/service_booking_common/blueprints/date/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends e {
    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Y((s) eVar, (C47440d) aVar);
    }

    public final void Y(@Y61.k s sVar, @Y61.k C47440d c47440d) {
        Object next;
        sVar.f276384o = new f(this);
        g gVar = new g(this, c47440d);
        Calendar calendarA = com.avito.android.service_booking_common.b.a();
        Map<C47440d.a, C47440d.c> map = c47440d.f429413d;
        Set<Map.Entry<C47440d.a, C47440d.c>> setEntrySet = map.entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(Long.valueOf(((C47440d.a) entry.getKey()).getF84833b()), ((C47440d.a) entry.getKey()).f429417d);
        }
        I5.a(sVar.f276375f, c47440d.f429412c, false);
        sVar.f276372c.c(new UV0.c(C42745f0.M0(map.keySet())));
        FX0.a aVar = new FX0.a(sVar, calendarA, linkedHashMap, gVar, 4);
        RecyclerView recyclerView = sVar.f276377h;
        recyclerView.post(aVar);
        C47440d.b bVar = c47440d.f429414e;
        if (bVar != null) {
            recyclerView.A0(bVar.f429420a);
        }
        recyclerView.o(new r(sVar, calendarA, linkedHashMap));
        Iterator<T> it2 = map.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((C47440d.a) next).f429418e) {
                    break;
                }
            }
        }
        C47440d.a aVar2 = (C47440d.a) next;
        C47440d.c c12339c = map.get(aVar2);
        if (c12339c == null) {
            c12339c = new C47440d.c.C12339c(C42784z0.f406748b);
        }
        sVar.E80(aVar2, c12339c);
        sVar.F80(gVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        Object next;
        s sVar = (s) eVar;
        C47440d c47440d = (C47440d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.service_booking_common.f) {
                obj = obj2;
            }
        }
        if (!(obj instanceof com.avito.android.service_booking_common.f)) {
            obj = null;
        }
        com.avito.android.service_booking_common.f fVar = (com.avito.android.service_booking_common.f) obj;
        if (fVar == null) {
            Y(sVar, c47440d);
            return;
        }
        sVar.f276384o = new h(this);
        if (fVar.f276563a != null) {
            Map<C47440d.a, C47440d.c> map = c47440d.f429413d;
            sVar.f276372c.c(new UV0.c(C42745f0.M0(map.keySet())));
            Iterator<T> it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((C47440d.a) next).f429418e) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C47440d.a aVar2 = (C47440d.a) next;
            C47440d.c c12339c = map.get(aVar2);
            if (c12339c == null) {
                c12339c = new C47440d.c.C12339c(C42784z0.f406748b);
            }
            sVar.E80(aVar2, c12339c);
            sVar.F80(new i(this, c47440d));
        }
        Integer num = fVar.f276564b;
        if (num != null) {
            int iIntValue = num.intValue();
            sVar.F80(null);
            sVar.f276377h.A0(iIntValue);
            sVar.F80(new j(this, c47440d));
        }
    }
}
