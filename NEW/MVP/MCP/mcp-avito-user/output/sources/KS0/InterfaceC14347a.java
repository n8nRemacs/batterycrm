package Ks0;

import J81.d;
import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.service_booking.remote.timeslots.ServiceBookingTimeslotsResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingM2Api.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LKs0/a;", "", "", "advertId", "dayTimestamp", "", "params", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/service_booking/remote/timeslots/ServiceBookingTimeslotsResult;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Ks0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14347a {

    /* compiled from: ServiceBookingM2Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ks0.a$a, reason: collision with other inner class name */
    public static final class C0599a {
    }

    @o("1/serviceBooking/form/slotDay")
    @e
    @l
    Object a(@J81.c("advertId") @l String str, @J81.c(SelectionType.TYPE_DAY) @k String str2, @d @k Map<String, String> map, @k Continuation<? super TypedResult<ServiceBookingTimeslotsResult>> continuation);
}
