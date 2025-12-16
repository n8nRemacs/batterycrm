package com.avito.android.service_booking_calendar.day.schedule;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.service_booking_calendar.domain.TimeSlotItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DayScheduleFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$BusyTimeSlotItem;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/service_booking_calendar/domain/TimeSlotItem$BusyTimeSlotItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DayScheduleFragment f275380b;

    public g(DayScheduleFragment dayScheduleFragment) {
        this.f275380b = dayScheduleFragment;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        DeepLink deepLink = ((TimeSlotItem.BusyTimeSlotItem) obj).f275518j;
        if (deepLink != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f275380b.f275264u0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
