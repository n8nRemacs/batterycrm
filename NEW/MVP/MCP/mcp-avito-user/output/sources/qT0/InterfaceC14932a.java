package Qt0;

import J81.d;
import J81.e;
import J81.o;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import e30.InterfaceC39936a;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ServiceBookingSettingApi.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JD\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQt0/a;", "", "", MessageBody.SystemMessageBody.Platform.FLOW, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/service_booking/api/models/work_hours/ServiceBookingWorkHours;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeToSave", "timeGap", "schedulePeriod", "Lkotlin/G0;", "b", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Qt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14932a {
    @o("1/serviceBooking/schedule/workHours/get")
    @e
    @l
    Object a(@J81.c(MessageBody.SystemMessageBody.Platform.FLOW) @l String str, @k Continuation<? super TypedResult<ServiceBookingWorkHours>> continuation);

    @o("1/serviceBooking/schedule/workHours/save")
    @e
    @l
    Object b(@d @k Map<String, String> map, @J81.c("timeGap") @l String str, @J81.c("schedulePeriod") @l String str2, @k Continuation<? super TypedResult<G0>> continuation);
}
