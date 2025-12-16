package com.avito.android.service_booking_common;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qt0.C47439c;
import qt0.C47440d;

/* compiled from: ServiceBookingItemPayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/l;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements com.avito.android.recycler.data_aware.a {
    @Inject
    public l() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF269930b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF269930b()) : null)) {
            return null;
        }
        if ((aVar instanceof C47439c) && (aVar2 instanceof C47439c)) {
            C47439c c47439c = (C47439c) aVar2;
            Boolean boolValueOf = Boolean.valueOf(c47439c.f429403e);
            C47439c c47439c2 = (C47439c) aVar;
            if (c47439c2.f429403e == c47439c.f429403e) {
                boolValueOf = null;
            }
            List<C47439c.a> list = c47439c.f429404f;
            List<C47439c.a> list2 = c47439c2.f429404f;
            LinkedHashSet linkedHashSetO0 = C42745f0.O0(list);
            linkedHashSetO0.removeAll(C42745f0.s(list2));
            C47439c.a aVar3 = (C47439c.a) C42745f0.F(linkedHashSetO0);
            d dVar = new d(boolValueOf, aVar3);
            if (boolValueOf == null && aVar3 == null) {
                return null;
            }
            return dVar;
        }
        if (!(aVar instanceof C47440d) || !(aVar2 instanceof C47440d)) {
            if (!(aVar instanceof com.avito.android.service_booking_common.blueprints.contact.c) || !(aVar2 instanceof com.avito.android.service_booking_common.blueprints.contact.c)) {
                return null;
            }
            com.avito.android.service_booking_common.blueprints.contact.c cVar = (com.avito.android.service_booking_common.blueprints.contact.c) aVar2;
            return new e(cVar.f276295j, cVar.f276293h, Boolean.valueOf(cVar.f276294i));
        }
        C47440d c47440d = (C47440d) aVar2;
        Map<C47440d.a, C47440d.c> map = c47440d.f429413d;
        C47440d c47440d2 = (C47440d) aVar;
        if (L.f(c47440d2.f429413d, map)) {
            map = null;
        }
        C47440d.b bVar = c47440d2.f429414e;
        C47440d.b bVar2 = c47440d.f429414e;
        if (L.f(bVar, bVar2)) {
            bVar2 = null;
        }
        f fVar = new f(map, bVar2 != null ? Integer.valueOf(bVar2.f429420a) : null);
        if (map == null && bVar2 == null) {
            return null;
        }
        return fVar;
    }
}
