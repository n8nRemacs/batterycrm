package com.avito.android.service_booking_settings.work_hours.item.schedule_period;

import Y61.k;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ServiceBookingSchedulePeriodItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/schedule_period/f;", "Lcom/avito/android/service_booking_settings/work_hours/item/schedule_period/c;", "<init>", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f278030b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f278031c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f278032d;

    @Inject
    public f() {
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f278030b = e2VarB;
        this.f278031c = f2.b(0, 1, null, 5);
        this.f278032d = e2VarB;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        SchedulePeriod schedulePeriod = (SchedulePeriod) aVar;
        hVar.setTitle(schedulePeriod.f278058i);
        hVar.setHint(schedulePeriod.f278057h);
        hVar.iq(schedulePeriod.f278059j);
        hVar.setEnabled(schedulePeriod.f278061l);
        hVar.setInputClickListener(new d(this, schedulePeriod));
        hVar.QE(new e(this));
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.schedule_period.c
    @k
    /* renamed from: f, reason: from getter */
    public final e2 getF278032d() {
        return this.f278032d;
    }
}
