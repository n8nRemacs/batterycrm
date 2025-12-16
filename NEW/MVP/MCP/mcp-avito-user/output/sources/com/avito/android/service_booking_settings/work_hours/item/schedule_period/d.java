package com.avito.android.service_booking_settings.work_hours.item.schedule_period;

import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingSchedulePeriodItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f278027l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SchedulePeriod f278028m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, SchedulePeriod schedulePeriod) {
        super(0);
        this.f278027l = fVar;
        this.f278028m = schedulePeriod;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f278027l.f278030b.K5(this.f278028m);
        return G0.f406611a;
    }
}
