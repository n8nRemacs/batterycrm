package Kt0;

import J81.d;
import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.service_booking_schedule_repetition_impl.model.ServiceBookingRepetitionResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingRepetitionApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JT\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\u0014\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKt0/a;", "", "", SelectionType.TYPE_DAY, "", "isActive", "", "workHoursFrom", "workHoursTo", "", "", "data", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/service_booking_schedule_repetition_impl/model/ServiceBookingRepetitionResult;", "a", "(JZIILjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Kt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14349a {
    @o("1/serviceBooking/flexibleSchedule/monthSchedule")
    @e
    @l
    Object a(@J81.c(SelectionType.TYPE_DAY) long j12, @J81.c("active") boolean z12, @J81.c("workHoursFrom") int i12, @J81.c("workHoursTo") int i13, @d @k Map<String, String> map, @k Continuation<? super TypedResult<ServiceBookingRepetitionResult>> continuation);
}
