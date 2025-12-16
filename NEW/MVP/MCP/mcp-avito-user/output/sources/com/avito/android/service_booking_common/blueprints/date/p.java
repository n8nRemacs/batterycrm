package com.avito.android.service_booking_common.blueprints.date;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qt0.C47440d;

/* compiled from: SbDateTimeListItemPayloadCreator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/p;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements com.avito.android.recycler.data_aware.a {
    @Inject
    public p() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!L.f(aVar != null ? Long.valueOf(aVar.getF207385b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF207385b()) : null) || !(aVar instanceof C47440d.a) || !(aVar2 instanceof C47440d.a)) {
            return null;
        }
        C47440d.a aVar3 = (C47440d.a) aVar2;
        Boolean boolValueOf = Boolean.valueOf(aVar3.f429418e);
        if (((C47440d.a) aVar).f429418e == aVar3.f429418e) {
            boolValueOf = null;
        }
        m mVar = new m(boolValueOf);
        if (boolValueOf != null) {
            return mVar;
        }
        return null;
    }
}
