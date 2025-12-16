package vt0;

import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.service_booking_day_settings.daysettings.data.remote.model.DayScheduleResult;
import e30.InterfaceC39936a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DaySettingsApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvt0/a;", "", "", SelectionType.TYPE_DAY, "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/service_booking_day_settings/daysettings/data/remote/model/DayScheduleResult;", "a", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: vt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49381a {
    @o("1/serviceBooking/flexibleSchedule/daySchedule")
    @l
    Object a(@t(SelectionType.TYPE_DAY) long j12, @k Continuation<? super TypedResult<DayScheduleResult>> continuation);
}
