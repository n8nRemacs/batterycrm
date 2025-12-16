package com.avito.android.service_booking_day_settings.daysettings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_day_settings.daysettings.adapter.SettingsBreakItem;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.avito.android.service_booking_utils.events.ActionStatusEvent;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.threeten.bp.f;
import org.threeten.bp.g;
import org.webrtc.h;

/* compiled from: DaySettingsInternalAction.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456¨\u00067"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddEmptyBreak", "BreakEndTimeChanged", "BreakStartTimeChanged", "DeleteBreak", "Finish", "FromTimeChanged", "Loading", "OnActionButtonSaveDialogClicked", "OnChangeSaveDialogVisibility", "OnClickTimeFrom", "OnClickTimeTo", "OnDayToggleClicked", "OnOpenAvitoUrl", "OnRepetitionCanceled", "OnSaveDialogShown", "OnStartLoading", "OnTooltipButtonClicked", "OnTooltipDismiss", "OpenBreakEndTimePicker", "OpenBreakStartTimePicker", "OpenDeepLink", "SetViewEnabled", "ShowError", "SuccessContent", "ToTimeChanged", "UpdateBreaksDescriptions", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$AddEmptyBreak;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$BreakEndTimeChanged;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$BreakStartTimeChanged;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$DeleteBreak;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$Finish;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$FromTimeChanged;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$Loading;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnActionButtonSaveDialogClicked;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnChangeSaveDialogVisibility;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnClickTimeFrom;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnClickTimeTo;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnDayToggleClicked;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnOpenAvitoUrl;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnRepetitionCanceled;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnSaveDialogShown;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnStartLoading;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnTooltipButtonClicked;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnTooltipDismiss;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OpenBreakEndTimePicker;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OpenBreakStartTimePicker;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OpenDeepLink;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$SetViewEnabled;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$ShowError;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$SuccessContent;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$ToTimeChanged;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$UpdateBreaksDescriptions;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/SaveDayInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DaySettingsInternalAction extends n {

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$AddEmptyBreak;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddEmptyBreak implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AddEmptyBreak f276926b = new AddEmptyBreak();

        private AddEmptyBreak() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AddEmptyBreak);
        }

        public final int hashCode() {
            return -127458506;
        }

        @k
        public final String toString() {
            return "AddEmptyBreak";
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$BreakEndTimeChanged;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BreakEndTimeChanged implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SettingsBreakItem> f276927b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f276928c;

        public BreakEndTimeChanged(@k List<SettingsBreakItem> list, @k String str) {
            this.f276927b = list;
            this.f276928c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreakEndTimeChanged)) {
                return false;
            }
            BreakEndTimeChanged breakEndTimeChanged = (BreakEndTimeChanged) obj;
            return L.f(this.f276927b, breakEndTimeChanged.f276927b) && L.f(this.f276928c, breakEndTimeChanged.f276928c);
        }

        public final int hashCode() {
            return this.f276928c.hashCode() + (this.f276927b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BreakEndTimeChanged(breaks=");
            sb2.append(this.f276927b);
            sb2.append(", selectId=");
            return C22026a.c(sb2, this.f276928c, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$BreakStartTimeChanged;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BreakStartTimeChanged implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SettingsBreakItem> f276929b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f276930c;

        public BreakStartTimeChanged(@k List<SettingsBreakItem> list, @k String str) {
            this.f276929b = list;
            this.f276930c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BreakStartTimeChanged)) {
                return false;
            }
            BreakStartTimeChanged breakStartTimeChanged = (BreakStartTimeChanged) obj;
            return L.f(this.f276929b, breakStartTimeChanged.f276929b) && L.f(this.f276930c, breakStartTimeChanged.f276930c);
        }

        public final int hashCode() {
            return this.f276930c.hashCode() + (this.f276929b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BreakStartTimeChanged(breaks=");
            sb2.append(this.f276929b);
            sb2.append(", selectId=");
            return C22026a.c(sb2, this.f276930c, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$DeleteBreak;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeleteBreak implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f276931b;

        public DeleteBreak(@k ArrayList arrayList) {
            this.f276931b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteBreak) && this.f276931b.equals(((DeleteBreak) obj).f276931b);
        }

        public final int hashCode() {
            return this.f276931b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("DeleteBreak(breaks="), this.f276931b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$Finish;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f276932b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final BookingSettingsStatus f276933c;

        public Finish(boolean z12, @k BookingSettingsStatus bookingSettingsStatus) {
            this.f276932b = z12;
            this.f276933c = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Finish)) {
                return false;
            }
            Finish finish = (Finish) obj;
            return this.f276932b == finish.f276932b && this.f276933c == finish.f276933c;
        }

        public final int hashCode() {
            return this.f276933c.hashCode() + (Boolean.hashCode(this.f276932b) * 31);
        }

        @k
        public final String toString() {
            return "Finish(isSettingsChanged=" + this.f276932b + ", settingsStatus=" + this.f276933c + ')';
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$FromTimeChanged;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FromTimeChanged implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f276934b;

        public FromTimeChanged(@k g gVar) {
            this.f276934b = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FromTimeChanged) && L.f(this.f276934b, ((FromTimeChanged) obj).f276934b);
        }

        public final int hashCode() {
            return this.f276934b.hashCode();
        }

        @k
        public final String toString() {
            return h.f(new StringBuilder("FromTimeChanged(time="), this.f276934b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$Loading;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements DaySettingsInternalAction {
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnActionButtonSaveDialogClicked;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnActionButtonSaveDialogClicked implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276935b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final WorkHoursSaveClickEvent.SaveDialogActionType f276936c;

        public OnActionButtonSaveDialogClicked(@k String str, @k WorkHoursSaveClickEvent.SaveDialogActionType saveDialogActionType) {
            this.f276935b = str;
            this.f276936c = saveDialogActionType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionButtonSaveDialogClicked)) {
                return false;
            }
            OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = (OnActionButtonSaveDialogClicked) obj;
            return L.f(this.f276935b, onActionButtonSaveDialogClicked.f276935b) && this.f276936c == onActionButtonSaveDialogClicked.f276936c;
        }

        public final int hashCode() {
            return this.f276936c.hashCode() + (this.f276935b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OnActionButtonSaveDialogClicked(fromPage=" + this.f276935b + ", actionType=" + this.f276936c + ')';
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnChangeSaveDialogVisibility;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnChangeSaveDialogVisibility implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f276937b;

        public OnChangeSaveDialogVisibility(boolean z12) {
            this.f276937b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnChangeSaveDialogVisibility) && this.f276937b == ((OnChangeSaveDialogVisibility) obj).f276937b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f276937b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnChangeSaveDialogVisibility(visible="), this.f276937b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnClickTimeFrom;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnClickTimeFrom implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f276938b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final f f276939c;

        public OnClickTimeFrom(@k f fVar, @k f fVar2) {
            this.f276938b = fVar;
            this.f276939c = fVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnClickTimeFrom)) {
                return false;
            }
            OnClickTimeFrom onClickTimeFrom = (OnClickTimeFrom) obj;
            return L.f(this.f276938b, onClickTimeFrom.f276938b) && L.f(this.f276939c, onClickTimeFrom.f276939c);
        }

        public final int hashCode() {
            return this.f276939c.hashCode() + (this.f276938b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OnClickTimeFrom(date=" + this.f276938b + ", maxDate=" + this.f276939c + ')';
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnClickTimeTo;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnClickTimeTo implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f276940b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final f f276941c;

        public OnClickTimeTo(@k f fVar, @k f fVar2) {
            this.f276940b = fVar;
            this.f276941c = fVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnClickTimeTo)) {
                return false;
            }
            OnClickTimeTo onClickTimeTo = (OnClickTimeTo) obj;
            return L.f(this.f276940b, onClickTimeTo.f276940b) && L.f(this.f276941c, onClickTimeTo.f276941c);
        }

        public final int hashCode() {
            return this.f276941c.hashCode() + (this.f276940b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OnClickTimeTo(date=" + this.f276940b + ", minDate=" + this.f276941c + ')';
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnDayToggleClicked;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnDayToggleClicked implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f276942b;

        public OnDayToggleClicked(boolean z12) {
            this.f276942b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDayToggleClicked) && this.f276942b == ((OnDayToggleClicked) obj).f276942b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f276942b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnDayToggleClicked(isChecked="), this.f276942b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnOpenAvitoUrl;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnOpenAvitoUrl implements DaySettingsInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOpenAvitoUrl)) {
                return false;
            }
            ((OnOpenAvitoUrl) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return -1335681739;
        }

        @k
        public final String toString() {
            return "OnOpenAvitoUrl(url=https://support.avito.ru/articles/2796)";
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnRepetitionCanceled;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnRepetitionCanceled implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BookingSettingsStatus f276943b;

        public OnRepetitionCanceled(@l BookingSettingsStatus bookingSettingsStatus) {
            this.f276943b = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRepetitionCanceled) && this.f276943b == ((OnRepetitionCanceled) obj).f276943b;
        }

        public final int hashCode() {
            BookingSettingsStatus bookingSettingsStatus = this.f276943b;
            if (bookingSettingsStatus == null) {
                return 0;
            }
            return bookingSettingsStatus.hashCode();
        }

        @k
        public final String toString() {
            return "OnRepetitionCanceled(settingsStatus=" + this.f276943b + ')';
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnSaveDialogShown;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSaveDialogShown implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276944b;

        public OnSaveDialogShown(@k String str) {
            this.f276944b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSaveDialogShown) && L.f(this.f276944b, ((OnSaveDialogShown) obj).f276944b);
        }

        public final int hashCode() {
            return this.f276944b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSaveDialogShown(fromPage="), this.f276944b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnStartLoading;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnStartLoading implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnStartLoading f276945b = new OnStartLoading();

        private OnStartLoading() {
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnTooltipButtonClicked;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTooltipButtonClicked implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnTooltipButtonClicked f276946b = new OnTooltipButtonClicked();

        private OnTooltipButtonClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnTooltipButtonClicked);
        }

        public final int hashCode() {
            return 1647728942;
        }

        @k
        public final String toString() {
            return "OnTooltipButtonClicked";
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OnTooltipDismiss;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTooltipDismiss implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnTooltipDismiss f276947b = new OnTooltipDismiss();

        private OnTooltipDismiss() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnTooltipDismiss);
        }

        public final int hashCode() {
            return 1860029923;
        }

        @k
        public final String toString() {
            return "OnTooltipDismiss";
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OpenBreakEndTimePicker;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBreakEndTimePicker implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276948b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final f f276949c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final f f276950d;

        public OpenBreakEndTimePicker(@k String str, @k f fVar, @k f fVar2) {
            this.f276948b = str;
            this.f276949c = fVar;
            this.f276950d = fVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenBreakEndTimePicker)) {
                return false;
            }
            OpenBreakEndTimePicker openBreakEndTimePicker = (OpenBreakEndTimePicker) obj;
            return L.f(this.f276948b, openBreakEndTimePicker.f276948b) && L.f(this.f276949c, openBreakEndTimePicker.f276949c) && L.f(this.f276950d, openBreakEndTimePicker.f276950d);
        }

        public final int hashCode() {
            return this.f276950d.hashCode() + ((this.f276949c.hashCode() + (this.f276948b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "OpenBreakEndTimePicker(selectId=" + this.f276948b + ", selectedDate=" + this.f276949c + ", minDate=" + this.f276950d + ')';
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OpenBreakStartTimePicker;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBreakStartTimePicker implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f276951b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final f f276952c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final f f276953d;

        public OpenBreakStartTimePicker(@k String str, @k f fVar, @k f fVar2) {
            this.f276951b = str;
            this.f276952c = fVar;
            this.f276953d = fVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenBreakStartTimePicker)) {
                return false;
            }
            OpenBreakStartTimePicker openBreakStartTimePicker = (OpenBreakStartTimePicker) obj;
            return L.f(this.f276951b, openBreakStartTimePicker.f276951b) && L.f(this.f276952c, openBreakStartTimePicker.f276952c) && L.f(this.f276953d, openBreakStartTimePicker.f276953d);
        }

        public final int hashCode() {
            return this.f276953d.hashCode() + ((this.f276952c.hashCode() + (this.f276951b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "OpenBreakStartTimePicker(selectId=" + this.f276951b + ", selectedDate=" + this.f276952c + ", maxDate=" + this.f276953d + ')';
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$OpenDeepLink;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f276954b;

        public OpenDeepLink(@k DeepLink deepLink) {
            this.f276954b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeepLink) && L.f(this.f276954b, ((OpenDeepLink) obj).f276954b);
        }

        public final int hashCode() {
            return this.f276954b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f276954b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$SetViewEnabled;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetViewEnabled implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f276955b;

        public SetViewEnabled(boolean z12) {
            this.f276955b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetViewEnabled) && this.f276955b == ((SetViewEnabled) obj).f276955b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f276955b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetViewEnabled(isViewEnabled="), this.f276955b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$ShowError;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements DaySettingsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f276956b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f276957c;

        public ShowError(@k Throwable th2) {
            this.f276956b = th2;
            this.f276957c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f276956b, ((ShowError) obj).f276956b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF257709c() {
            return this.f276957c;
        }

        public final int hashCode() {
            return this.f276956b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowError(throwable="), this.f276956b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$SuccessContent;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessContent implements DaySettingsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DaySettingsState.DayScheduleInfo f276958b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DaySettingsState.BreaksInfo f276959c;

        public SuccessContent(@k DaySettingsState.DayScheduleInfo dayScheduleInfo, @l DaySettingsState.BreaksInfo breaksInfo) {
            this.f276958b = dayScheduleInfo;
            this.f276959c = breaksInfo;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201644d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessContent)) {
                return false;
            }
            SuccessContent successContent = (SuccessContent) obj;
            return L.f(this.f276958b, successContent.f276958b) && L.f(this.f276959c, successContent.f276959c);
        }

        public final int hashCode() {
            int iHashCode = this.f276958b.hashCode() * 31;
            DaySettingsState.BreaksInfo breaksInfo = this.f276959c;
            return iHashCode + (breaksInfo == null ? 0 : breaksInfo.hashCode());
        }

        @k
        public final String toString() {
            return "SuccessContent(dayScheduleInfo=" + this.f276958b + ", breaksInfo=" + this.f276959c + ')';
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$ToTimeChanged;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToTimeChanged implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f276960b;

        public ToTimeChanged(@k g gVar) {
            this.f276960b = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToTimeChanged) && L.f(this.f276960b, ((ToTimeChanged) obj).f276960b);
        }

        public final int hashCode() {
            return this.f276960b.hashCode();
        }

        @k
        public final String toString() {
            return h.f(new StringBuilder("ToTimeChanged(time="), this.f276960b, ')');
        }
    }

    /* compiled from: DaySettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction$UpdateBreaksDescriptions;", "Lcom/avito/android/service_booking_day_settings/daysettings/mvi/entity/DaySettingsInternalAction;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateBreaksDescriptions implements DaySettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SettingsBreakItem> f276961b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ActionStatusEvent.Source f276962c;

        public UpdateBreaksDescriptions(@k List<SettingsBreakItem> list, @l ActionStatusEvent.Source source) {
            this.f276961b = list;
            this.f276962c = source;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateBreaksDescriptions)) {
                return false;
            }
            UpdateBreaksDescriptions updateBreaksDescriptions = (UpdateBreaksDescriptions) obj;
            return L.f(this.f276961b, updateBreaksDescriptions.f276961b) && this.f276962c == updateBreaksDescriptions.f276962c;
        }

        public final int hashCode() {
            int iHashCode = this.f276961b.hashCode() * 31;
            ActionStatusEvent.Source source = this.f276962c;
            return iHashCode + (source == null ? 0 : source.hashCode());
        }

        @k
        public final String toString() {
            return "UpdateBreaksDescriptions(breaks=" + this.f276961b + ", error=" + this.f276962c + ')';
        }

        public /* synthetic */ UpdateBreaksDescriptions(List list, ActionStatusEvent.Source source, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? null : source);
        }
    }
}
