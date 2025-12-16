package Ys0;

import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_booking_calendar.data.model.ServiceBookingFlexibleScheduleResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingCalendarApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0001\u0010\u000e\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"LYs0/a;", "", "", "dayFrom", "dayTo", "Lcom/avito/android/remote/model/TypedResult;", "LZs0/b;", "b", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lcom/avito/android/service_booking_calendar/data/model/a;", "c", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timestamp", "Lcom/avito/android/service_booking_calendar/data/model/ServiceBookingFlexibleScheduleResult;", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Ys0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC18323a {

    /* compiled from: ServiceBookingCalendarApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ys0.a$a, reason: collision with other inner class name */
    public static final class C1405a {
    }

    @o("1/serviceBooking/flexibleSchedule/dayDetails")
    @J81.e
    @l
    Object a(@J81.c("timestamp") @k String str, @k Continuation<? super TypedResult<ServiceBookingFlexibleScheduleResult>> continuation);

    @o("1/serviceBooking/flexibleSchedule/calendar")
    @J81.e
    @l
    Object b(@J81.c("dayFrom") @l Integer num, @J81.c("dayTo") @l Integer num2, @k Continuation<? super TypedResult<Zs0.b>> continuation);

    @o("1/serviceBooking/calendar/dayDetails")
    @J81.e
    @l
    Object c(@J81.c("id") @k String str, @k Continuation<? super TypedResult<com.avito.android.service_booking_calendar.data.model.a>> continuation);
}
