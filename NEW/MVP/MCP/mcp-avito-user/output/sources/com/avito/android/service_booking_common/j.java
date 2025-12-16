package com.avito.android.service_booking_common;

import com.avito.android.service_booking_common.blueprints.SbInputItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qt0.C47439c;
import qt0.C47440d;
import qt0.C47442f;
import qt0.C47443g;
import qt0.C47444h;

/* compiled from: ServiceBookingItemComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/j;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements com.avito.android.recycler.data_aware.b {
    @Inject
    public j() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF273715b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF273715b()) : null)) {
            return false;
        }
        if ((aVar instanceof C47439c) && (aVar2 instanceof C47439c)) {
            C47439c c47439c = (C47439c) aVar;
            C47439c c47439c2 = (C47439c) aVar2;
            if (c47439c.f429403e != c47439c2.f429403e || !L.f(c47439c.f429404f, c47439c2.f429404f)) {
                return false;
            }
        } else if ((aVar instanceof C47440d) && (aVar2 instanceof C47440d)) {
            C47440d c47440d = (C47440d) aVar;
            C47440d c47440d2 = (C47440d) aVar2;
            if (!L.f(c47440d.f429413d, c47440d2.f429413d) || !L.f(c47440d.f429414e, c47440d2.f429414e)) {
                return false;
            }
        } else {
            if ((aVar instanceof com.avito.android.service_booking_common.blueprints.comment.c) && (aVar2 instanceof com.avito.android.service_booking_common.blueprints.comment.c)) {
                return L.f(((com.avito.android.service_booking_common.blueprints.comment.c) aVar).f276275e, ((com.avito.android.service_booking_common.blueprints.comment.c) aVar2).f276275e);
            }
            if ((aVar instanceof qt0.i) && (aVar2 instanceof qt0.i)) {
                qt0.i iVar = (qt0.i) aVar;
                qt0.i iVar2 = (qt0.i) aVar2;
                if (!iVar.f429449d.equals(iVar2.f429449d) || !L.f(iVar.f429448c, iVar2.f429448c)) {
                    return false;
                }
            } else {
                if ((aVar instanceof C47444h) && (aVar2 instanceof C47444h)) {
                    return L.f(((C47444h) aVar).f429446c, ((C47444h) aVar2).f429446c);
                }
                if ((aVar instanceof C47443g) && (aVar2 instanceof C47443g)) {
                    return L.f(((C47443g) aVar).f429444c, ((C47443g) aVar2).f429444c);
                }
                if ((aVar instanceof SbInputItem) && (aVar2 instanceof SbInputItem)) {
                    SbInputItem sbInputItem = (SbInputItem) aVar;
                    SbInputItem sbInputItem2 = (SbInputItem) aVar2;
                    if (!L.f(sbInputItem.f276228c, sbInputItem2.f276228c) || !L.f(sbInputItem.f276231f, sbInputItem2.f276231f)) {
                        return false;
                    }
                } else if ((aVar instanceof qt0.k) && (aVar2 instanceof qt0.k)) {
                    qt0.k kVar = (qt0.k) aVar;
                    qt0.k kVar2 = (qt0.k) aVar2;
                    if (!L.f(kVar.f429464c, kVar2.f429464c) || !L.f(kVar.f429465d, kVar2.f429465d)) {
                        return false;
                    }
                } else if ((aVar instanceof com.avito.android.service_booking_common.blueprints.contact.c) && (aVar2 instanceof com.avito.android.service_booking_common.blueprints.contact.c)) {
                    com.avito.android.service_booking_common.blueprints.contact.c cVar = (com.avito.android.service_booking_common.blueprints.contact.c) aVar;
                    com.avito.android.service_booking_common.blueprints.contact.c cVar2 = (com.avito.android.service_booking_common.blueprints.contact.c) aVar2;
                    if (!L.f(cVar.f276288c, cVar2.f276288c) || cVar.f276289d != cVar2.f276289d || !L.f(cVar.f276290e, cVar2.f276290e) || !L.f(cVar.f276295j, cVar2.f276295j) || cVar.f276294i != cVar2.f276294i) {
                        return false;
                    }
                } else {
                    if (!(aVar instanceof C47442f) || !(aVar2 instanceof C47442f)) {
                        return false;
                    }
                    C47442f c47442f = (C47442f) aVar;
                    C47442f c47442f2 = (C47442f) aVar2;
                    if (!L.f(c47442f.f429439b, c47442f2.f429439b) || !L.f(c47442f.f429440c, c47442f2.f429440c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
