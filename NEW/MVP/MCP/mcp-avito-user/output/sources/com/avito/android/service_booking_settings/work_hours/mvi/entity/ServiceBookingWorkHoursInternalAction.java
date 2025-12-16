package com.avito.android.service_booking_settings.work_hours.mvi.entity;

import AK.c;
import Ut0.C15566a;
import Ut0.C15567b;
import Ut0.C15568c;
import Ut0.e;
import Ut0.g;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking.api.models.work_hours.ServiceBookingWorkHours;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.SchedulePeriod;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursInternalAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoadingError", "ContentLoadingSuccess", "OnActionButtonSaveDialogClicked", "OnBackButtonClicked", "OnChangeSaveDialogVisibility", "OnDayCheckedChanged", "OnDayTimeChanged", "OnFromSelectClicked", "OnSaveDialogShown", "OnSchedulePeriodInputClicked", "OnSchedulePeriodOptionSelected", "OnTimeRestrictionClicked", "OnTimeRestrictionOptionSelected", "OnToSelectClicked", "SaveSettingsError", "SaveSettingsInProgress", "SaveSettingsSuccess", "ShowLoading", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$ContentLoadingError;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$ContentLoadingSuccess;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnActionButtonSaveDialogClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnBackButtonClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnChangeSaveDialogVisibility;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnDayCheckedChanged;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnDayTimeChanged;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnFromSelectClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnSaveDialogShown;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnSchedulePeriodInputClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnSchedulePeriodOptionSelected;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnTimeRestrictionClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnTimeRestrictionOptionSelected;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnToSelectClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$SaveSettingsError;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$SaveSettingsInProgress;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$SaveSettingsSuccess;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$ShowLoading;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingWorkHoursInternalAction extends n {

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$ContentLoadingError;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoadingError implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278065b;

        public ContentLoadingError(@k String str) {
            this.f278065b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoadingError) && L.f(this.f278065b, ((ContentLoadingError) obj).f278065b);
        }

        public final int hashCode() {
            return this.f278065b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ContentLoadingError(message="), this.f278065b, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$ContentLoadingSuccess;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoadingSuccess implements ServiceBookingWorkHoursInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278066b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f278067c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f278068d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ServiceBookingWorkHours.WorkHoursLink f278069e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Ut0.k f278070f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final SchedulePeriod f278071g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final C15566a f278072h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final g f278073i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final e f278074j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final C15568c f278075k;

        public ContentLoadingSuccess(@k String str, @k String str2, @k ArrayList arrayList, @l ServiceBookingWorkHours.WorkHoursLink workHoursLink, @l Ut0.k kVar, @l SchedulePeriod schedulePeriod, @l C15566a c15566a, @l g gVar, @l e eVar, @k C15568c c15568c) {
            this.f278066b = str;
            this.f278067c = str2;
            this.f278068d = arrayList;
            this.f278069e = workHoursLink;
            this.f278070f = kVar;
            this.f278071g = schedulePeriod;
            this.f278072h = c15566a;
            this.f278073i = gVar;
            this.f278074j = eVar;
            this.f278075k = c15568c;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
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
            if (!(obj instanceof ContentLoadingSuccess)) {
                return false;
            }
            ContentLoadingSuccess contentLoadingSuccess = (ContentLoadingSuccess) obj;
            return L.f(this.f278066b, contentLoadingSuccess.f278066b) && L.f(this.f278067c, contentLoadingSuccess.f278067c) && this.f278068d.equals(contentLoadingSuccess.f278068d) && L.f(this.f278069e, contentLoadingSuccess.f278069e) && L.f(this.f278070f, contentLoadingSuccess.f278070f) && L.f(this.f278071g, contentLoadingSuccess.f278071g) && L.f(this.f278072h, contentLoadingSuccess.f278072h) && L.f(this.f278073i, contentLoadingSuccess.f278073i) && L.f(this.f278074j, contentLoadingSuccess.f278074j) && this.f278075k.equals(contentLoadingSuccess.f278075k);
        }

        public final int hashCode() {
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f278068d, H.d(this.f278066b.hashCode() * 31, 31, this.f278067c), 31);
            ServiceBookingWorkHours.WorkHoursLink workHoursLink = this.f278069e;
            int iHashCode = (iG2 + (workHoursLink == null ? 0 : workHoursLink.hashCode())) * 31;
            Ut0.k kVar = this.f278070f;
            int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
            SchedulePeriod schedulePeriod = this.f278071g;
            int iHashCode3 = (iHashCode2 + (schedulePeriod == null ? 0 : schedulePeriod.hashCode())) * 31;
            C15566a c15566a = this.f278072h;
            int iHashCode4 = (iHashCode3 + (c15566a == null ? 0 : c15566a.hashCode())) * 31;
            g gVar = this.f278073i;
            int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            e eVar = this.f278074j;
            return this.f278075k.hashCode() + ((iHashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "ContentLoadingSuccess(title=" + this.f278066b + ", actionTitle=" + this.f278067c + ", days=" + this.f278068d + ", linkToRedirect=" + this.f278069e + ", timeGap=" + this.f278070f + ", schedulePeriod=" + this.f278071g + ", contentDescription=" + this.f278072h + ", saveScheduleInfo=" + this.f278073i + ", licenseAgreement=" + this.f278074j + ", initialState=" + this.f278075k + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnActionButtonSaveDialogClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnActionButtonSaveDialogClicked implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278076b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final WorkHoursSaveClickEvent.SaveDialogActionType f278077c;

        public OnActionButtonSaveDialogClicked(@k String str, @k WorkHoursSaveClickEvent.SaveDialogActionType saveDialogActionType) {
            this.f278076b = str;
            this.f278077c = saveDialogActionType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionButtonSaveDialogClicked)) {
                return false;
            }
            OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = (OnActionButtonSaveDialogClicked) obj;
            return L.f(this.f278076b, onActionButtonSaveDialogClicked.f278076b) && this.f278077c == onActionButtonSaveDialogClicked.f278077c;
        }

        public final int hashCode() {
            return this.f278077c.hashCode() + (this.f278076b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OnActionButtonSaveDialogClicked(fromPage=" + this.f278076b + ", actionType=" + this.f278077c + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnBackButtonClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBackButtonClicked implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BookingSettingsStatus f278078b;

        public OnBackButtonClicked(@k BookingSettingsStatus bookingSettingsStatus) {
            this.f278078b = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBackButtonClicked) && this.f278078b == ((OnBackButtonClicked) obj).f278078b;
        }

        public final int hashCode() {
            return this.f278078b.hashCode();
        }

        @k
        public final String toString() {
            return "OnBackButtonClicked(status=" + this.f278078b + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnChangeSaveDialogVisibility;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnChangeSaveDialogVisibility implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f278079b;

        public OnChangeSaveDialogVisibility(boolean z12) {
            this.f278079b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnChangeSaveDialogVisibility) && this.f278079b == ((OnChangeSaveDialogVisibility) obj).f278079b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f278079b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnChangeSaveDialogVisibility(visible="), this.f278079b, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnDayCheckedChanged;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnDayCheckedChanged implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f278080b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final C15567b f278081c;

        public OnDayCheckedChanged(boolean z12, @k C15567b c15567b) {
            this.f278080b = z12;
            this.f278081c = c15567b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDayCheckedChanged)) {
                return false;
            }
            OnDayCheckedChanged onDayCheckedChanged = (OnDayCheckedChanged) obj;
            return this.f278080b == onDayCheckedChanged.f278080b && L.f(this.f278081c, onDayCheckedChanged.f278081c);
        }

        public final int hashCode() {
            return this.f278081c.hashCode() + (Boolean.hashCode(this.f278080b) * 31);
        }

        @k
        public final String toString() {
            return "OnDayCheckedChanged(isChecked=" + this.f278080b + ", day=" + this.f278081c + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnDayTimeChanged;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnDayTimeChanged implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final org.threeten.bp.g f278082b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final org.threeten.bp.g f278083c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final C15567b f278084d;

        public OnDayTimeChanged(@k org.threeten.bp.g gVar, @k org.threeten.bp.g gVar2, @k C15567b c15567b) {
            this.f278082b = gVar;
            this.f278083c = gVar2;
            this.f278084d = c15567b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDayTimeChanged)) {
                return false;
            }
            OnDayTimeChanged onDayTimeChanged = (OnDayTimeChanged) obj;
            return L.f(this.f278082b, onDayTimeChanged.f278082b) && L.f(this.f278083c, onDayTimeChanged.f278083c) && L.f(this.f278084d, onDayTimeChanged.f278084d);
        }

        public final int hashCode() {
            return this.f278084d.hashCode() + ((this.f278083c.hashCode() + (this.f278082b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "OnDayTimeChanged(selectedFromTime=" + this.f278082b + ", selectedToTime=" + this.f278083c + ", day=" + this.f278084d + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnFromSelectClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnFromSelectClicked implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f278085b;

        public OnFromSelectClicked(int i12) {
            this.f278085b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFromSelectClicked) && this.f278085b == ((OnFromSelectClicked) obj).f278085b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f278085b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnFromSelectClicked(remoteId="), this.f278085b, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnSaveDialogShown;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSaveDialogShown implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278086b;

        public OnSaveDialogShown(@k String str) {
            this.f278086b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSaveDialogShown) && L.f(this.f278086b, ((OnSaveDialogShown) obj).f278086b);
        }

        public final int hashCode() {
            return this.f278086b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSaveDialogShown(fromPage="), this.f278086b, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnSchedulePeriodInputClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSchedulePeriodInputClicked implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f278087b;

        public OnSchedulePeriodInputClicked(@k Arguments arguments) {
            this.f278087b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSchedulePeriodInputClicked) && L.f(this.f278087b, ((OnSchedulePeriodInputClicked) obj).f278087b);
        }

        public final int hashCode() {
            return this.f278087b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("OnSchedulePeriodInputClicked(selectArguments="), this.f278087b, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnSchedulePeriodOptionSelected;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSchedulePeriodOptionSelected implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final SchedulePeriod.ScheduleOptionsItem f278088b;

        public OnSchedulePeriodOptionSelected(@l SchedulePeriod.ScheduleOptionsItem scheduleOptionsItem) {
            this.f278088b = scheduleOptionsItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSchedulePeriodOptionSelected) && L.f(this.f278088b, ((OnSchedulePeriodOptionSelected) obj).f278088b);
        }

        public final int hashCode() {
            SchedulePeriod.ScheduleOptionsItem scheduleOptionsItem = this.f278088b;
            if (scheduleOptionsItem == null) {
                return 0;
            }
            return scheduleOptionsItem.hashCode();
        }

        @k
        public final String toString() {
            return "OnSchedulePeriodOptionSelected(option=" + this.f278088b + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnTimeRestrictionClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTimeRestrictionClicked implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f278089b;

        public OnTimeRestrictionClicked(@k Arguments arguments) {
            this.f278089b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTimeRestrictionClicked) && L.f(this.f278089b, ((OnTimeRestrictionClicked) obj).f278089b);
        }

        public final int hashCode() {
            return this.f278089b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("OnTimeRestrictionClicked(selectArguments="), this.f278089b, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnTimeRestrictionOptionSelected;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTimeRestrictionOptionSelected implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Option f278090b;

        public OnTimeRestrictionOptionSelected(@l Option option) {
            this.f278090b = option;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTimeRestrictionOptionSelected) && L.f(this.f278090b, ((OnTimeRestrictionOptionSelected) obj).f278090b);
        }

        public final int hashCode() {
            Option option = this.f278090b;
            if (option == null) {
                return 0;
            }
            return option.hashCode();
        }

        @k
        public final String toString() {
            return "OnTimeRestrictionOptionSelected(option=" + this.f278090b + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$OnToSelectClicked;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnToSelectClicked implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f278091b;

        public OnToSelectClicked(int i12) {
            this.f278091b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnToSelectClicked) && this.f278091b == ((OnToSelectClicked) obj).f278091b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f278091b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnToSelectClicked(remoteId="), this.f278091b, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$SaveSettingsError;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveSettingsError implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f278092b;

        public SaveSettingsError(@k String str) {
            this.f278092b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveSettingsError) && L.f(this.f278092b, ((SaveSettingsError) obj).f278092b);
        }

        public final int hashCode() {
            return this.f278092b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SaveSettingsError(message="), this.f278092b, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$SaveSettingsInProgress;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SaveSettingsInProgress implements ServiceBookingWorkHoursInternalAction {
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$SaveSettingsSuccess;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveSettingsSuccess implements ServiceBookingWorkHoursInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ServiceBookingWorkHours.WorkHoursLink f278093b;

        public SaveSettingsSuccess(@l ServiceBookingWorkHours.WorkHoursLink workHoursLink) {
            this.f278093b = workHoursLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SaveSettingsSuccess) && L.f(this.f278093b, ((SaveSettingsSuccess) obj).f278093b);
        }

        public final int hashCode() {
            ServiceBookingWorkHours.WorkHoursLink workHoursLink = this.f278093b;
            if (workHoursLink == null) {
                return 0;
            }
            return workHoursLink.hashCode();
        }

        @k
        public final String toString() {
            return "SaveSettingsSuccess(linkToRedirect=" + this.f278093b + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction$ShowLoading;", "Lcom/avito/android/service_booking_settings/work_hours/mvi/entity/ServiceBookingWorkHoursInternalAction;", "()V", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading implements ServiceBookingWorkHoursInternalAction {
    }
}
