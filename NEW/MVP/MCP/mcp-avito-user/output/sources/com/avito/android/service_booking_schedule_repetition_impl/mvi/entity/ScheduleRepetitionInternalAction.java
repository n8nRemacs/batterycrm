package com.avito.android.service_booking_schedule_repetition_impl.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_booking_calendar.a;
import com.avito.android.service_booking_calendar.view.day.d;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import com.avito.android.service_booking_utils.events.WorkHoursSaveClickEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScheduleRepetitionInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Clear", "CloseAsSuccessSave", "HideSaveLoading", "OnActionButtonSaveDialogClicked", "OnChangeSaveDialogVisibility", "OnSaveDialogShown", "ScrollToPosition", "ShowDefaultError", "ShowErrorToast", "ShowLoadError", "ShowLoadedContent", "ShowLoading", "ShowSaveLoading", "ToggleDay", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$Clear;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$CloseAsSuccessSave;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$HideSaveLoading;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$OnActionButtonSaveDialogClicked;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$OnChangeSaveDialogVisibility;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$OnSaveDialogShown;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ScrollToPosition;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowDefaultError;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowErrorToast;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowLoadError;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowLoadedContent;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowLoading;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowSaveLoading;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ToggleDay;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ScheduleRepetitionInternalAction extends n {

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$Clear;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Clear implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Clear f277688b = new Clear();

        private Clear() {
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$CloseAsSuccessSave;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseAsSuccessSave implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f277689b;

        public CloseAsSuccessSave(@l String str) {
            this.f277689b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseAsSuccessSave) && L.f(this.f277689b, ((CloseAsSuccessSave) obj).f277689b);
        }

        public final int hashCode() {
            String str = this.f277689b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CloseAsSuccessSave(message="), this.f277689b, ')');
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$HideSaveLoading;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideSaveLoading implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideSaveLoading f277690b = new HideSaveLoading();

        private HideSaveLoading() {
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$OnActionButtonSaveDialogClicked;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnActionButtonSaveDialogClicked implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277691b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final WorkHoursSaveClickEvent.SaveDialogActionType f277692c;

        public OnActionButtonSaveDialogClicked(@k String str, @k WorkHoursSaveClickEvent.SaveDialogActionType saveDialogActionType) {
            this.f277691b = str;
            this.f277692c = saveDialogActionType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionButtonSaveDialogClicked)) {
                return false;
            }
            OnActionButtonSaveDialogClicked onActionButtonSaveDialogClicked = (OnActionButtonSaveDialogClicked) obj;
            return L.f(this.f277691b, onActionButtonSaveDialogClicked.f277691b) && this.f277692c == onActionButtonSaveDialogClicked.f277692c;
        }

        public final int hashCode() {
            return this.f277692c.hashCode() + (this.f277691b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OnActionButtonSaveDialogClicked(fromPage=" + this.f277691b + ", actionType=" + this.f277692c + ')';
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$OnChangeSaveDialogVisibility;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnChangeSaveDialogVisibility implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f277693b;

        public OnChangeSaveDialogVisibility(boolean z12) {
            this.f277693b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnChangeSaveDialogVisibility) && this.f277693b == ((OnChangeSaveDialogVisibility) obj).f277693b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f277693b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnChangeSaveDialogVisibility(visible="), this.f277693b, ')');
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$OnSaveDialogShown;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSaveDialogShown implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277694b;

        public OnSaveDialogShown(@k String str) {
            this.f277694b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSaveDialogShown) && L.f(this.f277694b, ((OnSaveDialogShown) obj).f277694b);
        }

        public final int hashCode() {
            return this.f277694b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSaveDialogShown(fromPage="), this.f277694b, ')');
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ScrollToPosition;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToPosition implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f277695b;

        public ScrollToPosition(int i12) {
            this.f277695b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToPosition) && this.f277695b == ((ScrollToPosition) obj).f277695b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f277695b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f277695b, ')');
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowDefaultError;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDefaultError implements ScheduleRepetitionInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f277696b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f277697c;

        public ShowDefaultError(@k Throwable th2) {
            this.f277696b = th2;
            this.f277697c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
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
            return (obj instanceof ShowDefaultError) && L.f(this.f277696b, ((ShowDefaultError) obj).f277696b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF267995c() {
            return this.f277697c;
        }

        public final int hashCode() {
            return this.f277696b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowDefaultError(throwable="), this.f277696b, ')');
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowErrorToast;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f277698b;

        public ShowErrorToast(@k PrintableText printableText) {
            this.f277698b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowErrorToast) && L.f(this.f277698b, ((ShowErrorToast) obj).f277698b);
        }

        public final int hashCode() {
            return this.f277698b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowErrorToast(message="), this.f277698b, ')');
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowLoadError;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadError implements ScheduleRepetitionInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f277699b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f277700c;

        public ShowLoadError(@k ApiError apiError) {
            this.f277699b = apiError;
            this.f277700c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
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
            return (obj instanceof ShowLoadError) && L.f(this.f277699b, ((ShowLoadError) obj).f277699b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF267995c() {
            return this.f277700c;
        }

        public final int hashCode() {
            return this.f277699b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowLoadError(apiError="), this.f277699b, ')');
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowLoadedContent;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadedContent implements ScheduleRepetitionInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f277701b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f277702c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<a> f277703d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ScheduleRepetitionState.Content.SaveScheduleInfo f277704e;

        /* JADX WARN: Multi-variable type inference failed */
        public ShowLoadedContent(@k String str, @k String str2, @k List<? extends a> list, @l ScheduleRepetitionState.Content.SaveScheduleInfo saveScheduleInfo) {
            this.f277701b = str;
            this.f277702c = str2;
            this.f277703d = list;
            this.f277704e = saveScheduleInfo;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF267993e() {
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
            if (!(obj instanceof ShowLoadedContent)) {
                return false;
            }
            ShowLoadedContent showLoadedContent = (ShowLoadedContent) obj;
            return L.f(this.f277701b, showLoadedContent.f277701b) && L.f(this.f277702c, showLoadedContent.f277702c) && L.f(this.f277703d, showLoadedContent.f277703d) && L.f(this.f277704e, showLoadedContent.f277704e);
        }

        public final int hashCode() {
            int iE2 = H.e(H.d(this.f277701b.hashCode() * 31, 31, this.f277702c), 31, this.f277703d);
            ScheduleRepetitionState.Content.SaveScheduleInfo saveScheduleInfo = this.f277704e;
            return iE2 + (saveScheduleInfo == null ? 0 : saveScheduleInfo.hashCode());
        }

        @k
        public final String toString() {
            return "ShowLoadedContent(title=" + this.f277701b + ", actionTitle=" + this.f277702c + ", calendarItems=" + this.f277703d + ", saveScheduleInfo=" + this.f277704e + ')';
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading extends TrackableLoadingStarted implements ScheduleRepetitionInternalAction {
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ShowSaveLoading;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "()V", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowSaveLoading implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSaveLoading f277705b = new ShowSaveLoading();

        private ShowSaveLoading() {
        }
    }

    /* compiled from: ScheduleRepetitionInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction$ToggleDay;", "Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/entity/ScheduleRepetitionInternalAction;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleDay implements ScheduleRepetitionInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d.a f277706b;

        public ToggleDay(@k d.a aVar) {
            this.f277706b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleDay) && L.f(this.f277706b, ((ToggleDay) obj).f277706b);
        }

        public final int hashCode() {
            return this.f277706b.hashCode();
        }

        @k
        public final String toString() {
            return "ToggleDay(day=" + this.f277706b + ')';
        }
    }
}
