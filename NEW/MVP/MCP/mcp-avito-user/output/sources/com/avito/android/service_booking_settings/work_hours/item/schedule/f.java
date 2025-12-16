package com.avito.android.service_booking_settings.work_hours.item.schedule;

import Ut0.C15567b;
import com.avito.android.service_booking_settings.work_hours.item.schedule.h;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingWorkHourDayPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule/f;", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule/c;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h.c f277991b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h.d f277992c;

    @Inject
    public f(@Y61.k h.c cVar, @Y61.k h.d dVar) {
        this.f277991b = cVar;
        this.f277992c = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        C15567b c15567b = (C15567b) aVar;
        ((h) eVar).oM(c15567b, new d(this, c15567b), new e(this, c15567b));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        C15567b c15567b = (C15567b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof m) {
                obj = obj2;
            }
        }
        m mVar = (m) (obj instanceof m ? obj : null);
        if (mVar == null) {
            hVar.oM(c15567b, new d(this, c15567b), new e(this, c15567b));
        } else {
            hVar.cv(mVar.f278019a);
            hVar.Qq(mVar.f278020b, mVar.f278021c, c15567b.f16717c);
        }
    }
}
