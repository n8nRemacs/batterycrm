package Lt0;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_schedule_repetition_impl.model.ServiceBookingRepetitionResult;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SaveScheduleInfoConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLt0/b;", "LLt0/a;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC14438a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking.data.preferences.a f10166a;

    @Inject
    public b(@k com.avito.android.service_booking.data.preferences.a aVar) {
        this.f10166a = aVar;
    }

    @Override // Lt0.InterfaceC14438a
    @l
    public final ScheduleRepetitionState.Content.SaveScheduleInfo a(@l ServiceBookingRepetitionResult.ServiceBookingSaveScheduleInfo serviceBookingSaveScheduleInfo) {
        if (serviceBookingSaveScheduleInfo == null || this.f10166a.b()) {
            return null;
        }
        return new ScheduleRepetitionState.Content.SaveScheduleInfo(serviceBookingSaveScheduleInfo.getTitle(), serviceBookingSaveScheduleInfo.getDescription(), d.a(serviceBookingSaveScheduleInfo.getAcceptButton()), d.a(serviceBookingSaveScheduleInfo.getCancelButton()), serviceBookingSaveScheduleInfo.getFromPage());
    }
}
