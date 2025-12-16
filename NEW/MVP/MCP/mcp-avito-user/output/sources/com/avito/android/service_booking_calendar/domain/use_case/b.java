package com.avito.android.service_booking_calendar.domain.use_case;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_calendar.day.schedule.mvi.entity.DayScheduleInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LoadDayScheduleUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/use_case/b;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Integer f275561a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f275562b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f275563c;

    public b(@l Integer num, boolean z12, boolean z13) {
        this.f275561a = num;
        this.f275562b = z12;
        this.f275563c = z13;
    }

    @k
    public abstract InterfaceC43160i<DayScheduleInternalAction> a(@k String str, boolean z12);
}
