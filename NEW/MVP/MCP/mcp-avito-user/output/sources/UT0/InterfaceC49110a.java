package ut0;

import J81.d;
import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SimpleMessageResult;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DayScheduleApi.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\rJT\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lut0/a;", "", "", "", "data", "", "active", "batch", "", "workHoursFrom", "workHoursTo", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/SimpleMessageResult;", "a", "(Ljava/util/Map;ZZIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: ut0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49110a {

    /* compiled from: DayScheduleApi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lut0/a$a;", "", "<init>", "()V", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ut0.a$a, reason: collision with other inner class name */
    public static final class C12734a {
        static {
            new C12734a();
        }
    }

    @o("1/serviceBooking/flexibleSchedule/saveSchedule")
    @e
    @l
    Object a(@d @k Map<String, String> map, @J81.c("active") boolean z12, @J81.c("batch") boolean z13, @J81.c("workHoursFrom") int i12, @J81.c("workHoursTo") int i13, @k Continuation<? super TypedResult<SimpleMessageResult>> continuation);
}
