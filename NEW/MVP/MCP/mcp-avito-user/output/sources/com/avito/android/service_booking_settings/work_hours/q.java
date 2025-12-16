package com.avito.android.service_booking_settings.work_hours;

import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingWorkHoursStateRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/SchedulePeriod;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/SchedulePeriod;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class q extends N implements Y41.l<SchedulePeriod, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f278132l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(h hVar) {
        super(1);
        this.f278132l = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(SchedulePeriod schedulePeriod) {
        this.f278132l.f277936b.accept(new a.i(schedulePeriod));
        return G0.f406611a;
    }
}
