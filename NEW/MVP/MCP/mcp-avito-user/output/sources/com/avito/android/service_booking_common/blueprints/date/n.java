package com.avito.android.service_booking_common.blueprints.date;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qt0.C47440d;

/* compiled from: SbDateTimeListItemComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/n;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements com.avito.android.recycler.data_aware.b {
    @Inject
    public n() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        return L.f(aVar != null ? Long.valueOf(aVar.getF117182c()) : null, aVar2 != null ? Long.valueOf(aVar2.getF117182c()) : null) && (aVar instanceof C47440d.a) && (aVar2 instanceof C47440d.a) && ((C47440d.a) aVar).f429418e == ((C47440d.a) aVar2).f429418e;
    }
}
