package wt0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.service_booking_day_settings.daysettings.domain.events.SwitchBookingStatusEvent;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsInternalAction;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.SaveDayInternalAction;
import com.avito.android.service_booking_day_settings.di.d;
import com.avito.android.service_booking_schedule_repetition_public.ServiceBookingScheduleRepetitionLink;
import com.avito.android.service_booking_utils.events.ActionIntentByClickEvent;
import com.avito.android.service_booking_utils.events.ActionStatusEvent;
import com.avito.android.service_booking_utils.events.ScreenFailedToOpenEvent;
import com.avito.android.service_booking_utils.events.ScreenOpenedEvent;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import gu0.C40738a;
import javax.inject.Inject;
import kotlin.Metadata;
import org.threeten.bp.f;
import org.threeten.bp.q;

/* compiled from: DaySettingsAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwt0/b;", "Lwt0/a;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC49682a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f441839a;

    /* renamed from: b, reason: collision with root package name */
    public final f f441840b;

    @Inject
    public b(@k InterfaceC28373a interfaceC28373a, @d @k String str) {
        this.f441839a = interfaceC28373a;
        this.f441840b = f.H(Long.parseLong(str), 0, q.f422106g);
    }

    @Override // wt0.InterfaceC49682a
    public final void a(@k DaySettingsInternalAction daySettingsInternalAction) {
        ActionStatusEvent.Source source;
        boolean z12 = daySettingsInternalAction instanceof DaySettingsInternalAction.SuccessContent;
        f fVar = this.f441840b;
        InterfaceC28373a interfaceC28373a = this.f441839a;
        if (z12) {
            interfaceC28373a.c(new ScreenOpenedEvent(ScreenOpenedEvent.Screen.f278358c, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.ShowError) {
            interfaceC28373a.c(new ScreenFailedToOpenEvent(ScreenFailedToOpenEvent.Screen.f278346c, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.FromTimeChanged) {
            interfaceC28373a.c(new ActionIntentByClickEvent(ActionIntentByClickEvent.Screen.f278295c, ActionIntentByClickEvent.Action.f278286c, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.ToTimeChanged) {
            interfaceC28373a.c(new ActionIntentByClickEvent(ActionIntentByClickEvent.Screen.f278296d, ActionIntentByClickEvent.Action.f278287d, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.OnClickTimeFrom) {
            interfaceC28373a.c(new ScreenOpenedEvent(ScreenOpenedEvent.Screen.f278359d, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.OnClickTimeTo) {
            interfaceC28373a.c(new ScreenOpenedEvent(ScreenOpenedEvent.Screen.f278360e, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.SetViewEnabled) {
            if (((DaySettingsInternalAction.SetViewEnabled) daySettingsInternalAction).f276955b) {
                return;
            }
            interfaceC28373a.c(new ActionIntentByClickEvent(ActionIntentByClickEvent.Screen.f278297e, ActionIntentByClickEvent.Action.f278288e, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.OpenDeepLink) {
            if (((DaySettingsInternalAction.OpenDeepLink) daySettingsInternalAction).f276954b instanceof ServiceBookingScheduleRepetitionLink) {
                interfaceC28373a.c(new ActionIntentByClickEvent(ActionIntentByClickEvent.Screen.f278297e, ActionIntentByClickEvent.Action.f278289f, fVar));
                return;
            }
            return;
        }
        if (daySettingsInternalAction instanceof SaveDayInternalAction.SaveShowSuccess) {
            interfaceC28373a.c(new ActionStatusEvent(((SaveDayInternalAction.SaveShowSuccess) daySettingsInternalAction).f277035c, ActionStatusEvent.Status.f278326c, this.f441840b, null, 8, null));
            return;
        }
        if (daySettingsInternalAction instanceof SaveDayInternalAction.SaveShowError) {
            interfaceC28373a.c(new ActionStatusEvent(ActionStatusEvent.Action.f278311c, ActionStatusEvent.Status.f278327d, this.f441840b, null, 8, null));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.OnDayToggleClicked) {
            interfaceC28373a.c(new SwitchBookingStatusEvent(((DaySettingsInternalAction.OnDayToggleClicked) daySettingsInternalAction).f276942b ? SwitchBookingStatusEvent.Status.f276798c : SwitchBookingStatusEvent.Status.f276799d, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.OnSaveDialogShown) {
            interfaceC28373a.c(new com.avito.android.service_booking_utils.events.a(((DaySettingsInternalAction.OnSaveDialogShown) daySettingsInternalAction).f276944b));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.OnActionButtonSaveDialogClicked) {
            DaySettingsInternalAction.OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = (DaySettingsInternalAction.OnActionButtonSaveDialogClicked) daySettingsInternalAction;
            interfaceC28373a.c(new WorkHoursSaveClickEvent(onActionButtonSaveDialogClicked.f276935b, onActionButtonSaveDialogClicked.f276936c.f278375b));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.AddEmptyBreak) {
            interfaceC28373a.c(new C40738a());
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.DeleteBreak) {
            interfaceC28373a.c(new gu0.b());
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.OpenBreakStartTimePicker) {
            interfaceC28373a.c(new ScreenOpenedEvent(ScreenOpenedEvent.Screen.f278364i, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.OpenBreakEndTimePicker) {
            interfaceC28373a.c(new ScreenOpenedEvent(ScreenOpenedEvent.Screen.f278365j, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.BreakStartTimeChanged) {
            interfaceC28373a.c(new ActionIntentByClickEvent(ActionIntentByClickEvent.Screen.f278299g, ActionIntentByClickEvent.Action.f278291h, fVar));
            return;
        }
        if (daySettingsInternalAction instanceof DaySettingsInternalAction.BreakEndTimeChanged) {
            interfaceC28373a.c(new ActionIntentByClickEvent(ActionIntentByClickEvent.Screen.f278300h, ActionIntentByClickEvent.Action.f278290g, fVar));
        } else {
            if (!(daySettingsInternalAction instanceof DaySettingsInternalAction.UpdateBreaksDescriptions) || (source = ((DaySettingsInternalAction.UpdateBreaksDescriptions) daySettingsInternalAction).f276962c) == null) {
                return;
            }
            interfaceC28373a.c(new ActionStatusEvent(ActionStatusEvent.Action.f278311c, ActionStatusEvent.Status.f278327d, fVar, source));
        }
    }
}
