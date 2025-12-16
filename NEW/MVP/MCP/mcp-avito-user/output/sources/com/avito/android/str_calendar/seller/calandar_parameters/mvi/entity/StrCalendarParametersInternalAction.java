package com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity;

import AK.c;
import Fy0.InterfaceC13856a;
import JO.m;
import SK0.f;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.SwitcherItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.StrSellerCalendarParameters;
import com.avito.android.remote.model.StrSellerCalendarParametersWarningDialog;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarParametersInternalAction.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\"\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#\u0082\u0001\"$%&'()*+,-./0123456789:;<=>?@ABCDE¨\u0006F"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddChildrenAgeParameter", "AddDurationDiscountSelect", "ApplyValidationResult", "CancellationSettingsItemShowTracked", "ChangeRdsInput", "ChangeRefundSelectedValue", "CloseBottomPicker", "CloseScreen", "ContentError", "ContentLoaded", "ContentLoading", "EarlyBookingEnabledChange", "Init", "InitUxfProperties", "OpenBottomPicker", "OpenCancellationSettings", "OpenDeeplink", "OpenKeyboard", "OpenUrl", "RemoveChildrenAgeParameter", "RemoveDurationDiscountSelect", "ScrollToPosition", "SelectCheckmark", "SelectChips", "SelectRadioGroup", "ShowContent", "ShowLastMinuteOffer", "ShowRejectInfo", "ShowToast", "ShowTooltipAtPosition", "ShowWarningDialog", "ToggleSwitcher", "UpdateRefundGroupTitle", "WarningAcceptedChange", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$AddChildrenAgeParameter;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$AddDurationDiscountSelect;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ApplyValidationResult;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$CancellationSettingsItemShowTracked;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ChangeRdsInput;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ChangeRefundSelectedValue;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$CloseBottomPicker;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ContentError;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ContentLoaded;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ContentLoading;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$EarlyBookingEnabledChange;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$Init;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$InitUxfProperties;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenBottomPicker;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenCancellationSettings;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenDeeplink;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenKeyboard;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenUrl;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$RemoveChildrenAgeParameter;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$RemoveDurationDiscountSelect;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ScrollToPosition;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$SelectCheckmark;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$SelectChips;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$SelectRadioGroup;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowContent;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowLastMinuteOffer;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowRejectInfo;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowToast;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowTooltipAtPosition;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowWarningDialog;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ToggleSwitcher;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$UpdateRefundGroupTitle;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$WarningAcceptedChange;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrCalendarParametersInternalAction extends n {

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$AddChildrenAgeParameter;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddChildrenAgeParameter implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AddChildrenAgeParameter f287342b = new AddChildrenAgeParameter();

        private AddChildrenAgeParameter() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AddChildrenAgeParameter);
        }

        public final int hashCode() {
            return -1705496638;
        }

        @k
        public final String toString() {
            return "AddChildrenAgeParameter";
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$AddDurationDiscountSelect;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddDurationDiscountSelect implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AddDurationDiscountSelect f287343b = new AddDurationDiscountSelect();

        private AddDurationDiscountSelect() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AddDurationDiscountSelect);
        }

        public final int hashCode() {
            return -840935222;
        }

        @k
        public final String toString() {
            return "AddDurationDiscountSelect";
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ApplyValidationResult;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyValidationResult implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, String> f287344b;

        public ApplyValidationResult(@k Map<String, String> map) {
            this.f287344b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyValidationResult) && L.f(this.f287344b, ((ApplyValidationResult) obj).f287344b);
        }

        public final int hashCode() {
            return this.f287344b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("ApplyValidationResult(errorsMap="), this.f287344b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$CancellationSettingsItemShowTracked;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CancellationSettingsItemShowTracked implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CancellationSettingsItemShowTracked f287345b = new CancellationSettingsItemShowTracked();

        private CancellationSettingsItemShowTracked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CancellationSettingsItemShowTracked);
        }

        public final int hashCode() {
            return -871407188;
        }

        @k
        public final String toString() {
            return "CancellationSettingsItemShowTracked";
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ChangeRdsInput;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeRdsInput implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287346b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f287347c;

        public ChangeRdsInput(@k String str, @k String str2) {
            this.f287346b = str;
            this.f287347c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeRdsInput)) {
                return false;
            }
            ChangeRdsInput changeRdsInput = (ChangeRdsInput) obj;
            return L.f(this.f287346b, changeRdsInput.f287346b) && L.f(this.f287347c, changeRdsInput.f287347c);
        }

        public final int hashCode() {
            return this.f287347c.hashCode() + (this.f287346b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeRdsInput(paramId=");
            sb2.append(this.f287346b);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f287347c, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ChangeRefundSelectedValue;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeRefundSelectedValue implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287348b;

        public ChangeRefundSelectedValue(@k String str) {
            this.f287348b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeRefundSelectedValue)) {
                return false;
            }
            ChangeRefundSelectedValue changeRefundSelectedValue = (ChangeRefundSelectedValue) obj;
            changeRefundSelectedValue.getClass();
            return L.f(this.f287348b, changeRefundSelectedValue.f287348b);
        }

        public final int hashCode() {
            return this.f287348b.hashCode() - 611292765;
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeRefundSelectedValue(paramId=refundDaysPopup, newValue="), this.f287348b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$CloseBottomPicker;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseBottomPicker implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseBottomPicker f287349b = new CloseBottomPicker();

        private CloseBottomPicker() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseBottomPicker);
        }

        public final int hashCode() {
            return -2130631895;
        }

        @k
        public final String toString() {
            return "CloseBottomPicker";
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$CloseScreen;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f287350b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC13856a f287351c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UpdatedParametersInfo f287352d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f287353e;

        public CloseScreen(@k InterfaceC13856a interfaceC13856a, @l UpdatedParametersInfo updatedParametersInfo, boolean z12, boolean z13) {
            this.f287350b = z12;
            this.f287351c = interfaceC13856a;
            this.f287352d = updatedParametersInfo;
            this.f287353e = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseScreen)) {
                return false;
            }
            CloseScreen closeScreen = (CloseScreen) obj;
            return this.f287350b == closeScreen.f287350b && L.f(this.f287351c, closeScreen.f287351c) && L.f(this.f287352d, closeScreen.f287352d) && this.f287353e == closeScreen.f287353e;
        }

        public final int hashCode() {
            int iHashCode = (this.f287351c.hashCode() + (Boolean.hashCode(this.f287350b) * 31)) * 31;
            UpdatedParametersInfo updatedParametersInfo = this.f287352d;
            return Boolean.hashCode(this.f287353e) + ((iHashCode + (updatedParametersInfo == null ? 0 : updatedParametersInfo.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreen(updateCalendar=");
            sb2.append(this.f287350b);
            sb2.append(", uxfState=");
            sb2.append(this.f287351c);
            sb2.append(", updatedParametersInfo=");
            sb2.append(this.f287352d);
            sb2.append(", shouldCloseFlow=");
            return r.x(sb2, this.f287353e, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ContentError;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements StrCalendarParametersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f287354b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f287355c;

        public ContentError(@k ApiError apiError) {
            this.f287354b = apiError;
            this.f287355c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentError) && L.f(this.f287354b, ((ContentError) obj).f287354b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF325569c() {
            return this.f287355c;
        }

        public final int hashCode() {
            return this.f287354b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ContentError(apiError="), this.f287354b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ContentLoaded;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements StrCalendarParametersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final StrSellerCalendarParameters f287356b;

        public ContentLoaded(@l StrSellerCalendarParameters strSellerCalendarParameters) {
            this.f287356b = strSellerCalendarParameters;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f287356b, ((ContentLoaded) obj).f287356b);
        }

        public final int hashCode() {
            StrSellerCalendarParameters strSellerCalendarParameters = this.f287356b;
            if (strSellerCalendarParameters == null) {
                return 0;
            }
            return strSellerCalendarParameters.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(data=" + this.f287356b + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ContentLoading;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements StrCalendarParametersInternalAction {
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$EarlyBookingEnabledChange;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EarlyBookingEnabledChange implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f287357b;

        public EarlyBookingEnabledChange(boolean z12) {
            this.f287357b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EarlyBookingEnabledChange) && this.f287357b == ((EarlyBookingEnabledChange) obj).f287357b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f287357b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("EarlyBookingEnabledChange(isEnabled="), this.f287357b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$Init;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287358b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Date f287359c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Date f287360d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f287361e;

        public Init(@k String str, @l Date date, @l Date date2, boolean z12) {
            this.f287358b = str;
            this.f287359c = date;
            this.f287360d = date2;
            this.f287361e = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f287358b, init.f287358b) && L.f(this.f287359c, init.f287359c) && L.f(this.f287360d, init.f287360d) && this.f287361e == init.f287361e;
        }

        public final int hashCode() {
            int iHashCode = this.f287358b.hashCode() * 31;
            Date date = this.f287359c;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.f287360d;
            return Boolean.hashCode(this.f287361e) + ((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(advertId=");
            sb2.append(this.f287358b);
            sb2.append(", startDate=");
            sb2.append(this.f287359c);
            sb2.append(", endDate=");
            sb2.append(this.f287360d);
            sb2.append(", shouldCloseFlowAfterApply=");
            return r.x(sb2, this.f287361e, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$InitUxfProperties;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitUxfProperties implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f287362b;

        public InitUxfProperties(@k f fVar) {
            this.f287362b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitUxfProperties) && L.f(this.f287362b, ((InitUxfProperties) obj).f287362b);
        }

        public final int hashCode() {
            return this.f287362b.f14906a.hashCode();
        }

        @k
        public final String toString() {
            return "InitUxfProperties(uxFbProperties=" + this.f287362b + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenBottomPicker;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBottomPicker implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ParameterElement.C.b f287363b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f287364c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f287365d;

        public OpenBottomPicker(@k ParameterElement.C.b bVar, @l Integer num, @k String str) {
            this.f287363b = bVar;
            this.f287364c = num;
            this.f287365d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenBottomPicker)) {
                return false;
            }
            OpenBottomPicker openBottomPicker = (OpenBottomPicker) obj;
            return L.f(this.f287363b, openBottomPicker.f287363b) && L.f(this.f287364c, openBottomPicker.f287364c) && L.f(this.f287365d, openBottomPicker.f287365d);
        }

        public final int hashCode() {
            int iHashCode = this.f287363b.hashCode() * 31;
            Integer num = this.f287364c;
            return this.f287365d.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenBottomPicker(item=");
            sb2.append(this.f287363b);
            sb2.append(", targetPosition=");
            sb2.append(this.f287364c);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f287365d, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenCancellationSettings;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenCancellationSettings implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f287366b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f287367c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f287368d;

        public OpenCancellationSettings(long j12, @l String str, @l String str2) {
            this.f287366b = j12;
            this.f287367c = str;
            this.f287368d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenCancellationSettings)) {
                return false;
            }
            OpenCancellationSettings openCancellationSettings = (OpenCancellationSettings) obj;
            return this.f287366b == openCancellationSettings.f287366b && L.f(this.f287367c, openCancellationSettings.f287367c) && L.f(this.f287368d, openCancellationSettings.f287368d);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f287366b) * 31;
            String str = this.f287367c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f287368d;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenCancellationSettings(itemId=");
            sb2.append(this.f287366b);
            sb2.append(", startDate=");
            sb2.append(this.f287367c);
            sb2.append(", endDate=");
            return C22026a.c(sb2, this.f287368d, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenDeeplink;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f287369b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f287369b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f287369b, ((OpenDeeplink) obj).f287369b);
        }

        public final int hashCode() {
            return this.f287369b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f287369b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenKeyboard;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenKeyboard implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f287370b;

        public OpenKeyboard(boolean z12) {
            this.f287370b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenKeyboard) && this.f287370b == ((OpenKeyboard) obj).f287370b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f287370b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OpenKeyboard(isKeyboardVisible="), this.f287370b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$OpenUrl;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287371b;

        public OpenUrl(@k String str) {
            this.f287371b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && L.f(this.f287371b, ((OpenUrl) obj).f287371b);
        }

        public final int hashCode() {
            return this.f287371b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f287371b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$RemoveChildrenAgeParameter;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveChildrenAgeParameter implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287372b;

        public RemoveChildrenAgeParameter(@k String str) {
            this.f287372b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveChildrenAgeParameter) && L.f(this.f287372b, ((RemoveChildrenAgeParameter) obj).f287372b);
        }

        public final int hashCode() {
            return this.f287372b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemoveChildrenAgeParameter(parameterId="), this.f287372b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$RemoveDurationDiscountSelect;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveDurationDiscountSelect implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287373b;

        public RemoveDurationDiscountSelect(@k String str) {
            this.f287373b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveDurationDiscountSelect) && L.f(this.f287373b, ((RemoveDurationDiscountSelect) obj).f287373b);
        }

        public final int hashCode() {
            return this.f287373b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemoveDurationDiscountSelect(parameterId="), this.f287373b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ScrollToPosition;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToPosition implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f287374b;

        public ScrollToPosition(int i12) {
            this.f287374b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToPosition) && this.f287374b == ((ScrollToPosition) obj).f287374b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f287374b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f287374b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$SelectCheckmark;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectCheckmark implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final m f287375b;

        public SelectCheckmark(@k m mVar) {
            this.f287375b = mVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectCheckmark) && L.f(this.f287375b, ((SelectCheckmark) obj).f287375b);
        }

        public final int hashCode() {
            return this.f287375b.hashCode();
        }

        @k
        public final String toString() {
            return "SelectCheckmark(item=" + this.f287375b + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$SelectChips;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectChips implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287376b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f287377c;

        public SelectChips(@k String str, @k String str2) {
            this.f287376b = str;
            this.f287377c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectChips)) {
                return false;
            }
            SelectChips selectChips = (SelectChips) obj;
            return L.f(this.f287376b, selectChips.f287376b) && L.f(this.f287377c, selectChips.f287377c);
        }

        public final int hashCode() {
            return this.f287377c.hashCode() + (this.f287376b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectChips(paramId=");
            sb2.append(this.f287376b);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f287377c, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$SelectRadioGroup;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectRadioGroup implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287378b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f287379c;

        public SelectRadioGroup(@k String str, @k String str2) {
            this.f287378b = str;
            this.f287379c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectRadioGroup)) {
                return false;
            }
            SelectRadioGroup selectRadioGroup = (SelectRadioGroup) obj;
            return L.f(this.f287378b, selectRadioGroup.f287378b) && L.f(this.f287379c, selectRadioGroup.f287379c);
        }

        public final int hashCode() {
            return this.f287379c.hashCode() + (this.f287378b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectRadioGroup(paramId=");
            sb2.append(this.f287378b);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f287379c, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowContent;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowContent f287380b = new ShowContent();

        private ShowContent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowContent);
        }

        public final int hashCode() {
            return 1544578868;
        }

        @k
        public final String toString() {
            return "ShowContent";
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowLastMinuteOffer;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLastMinuteOffer implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287381b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final SelectedDateRange f287382c;

        public ShowLastMinuteOffer(@k String str, @l SelectedDateRange selectedDateRange) {
            this.f287381b = str;
            this.f287382c = selectedDateRange;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowLastMinuteOffer)) {
                return false;
            }
            ShowLastMinuteOffer showLastMinuteOffer = (ShowLastMinuteOffer) obj;
            return L.f(this.f287381b, showLastMinuteOffer.f287381b) && L.f(this.f287382c, showLastMinuteOffer.f287382c);
        }

        public final int hashCode() {
            int iHashCode = this.f287381b.hashCode() * 31;
            SelectedDateRange selectedDateRange = this.f287382c;
            return iHashCode + (selectedDateRange == null ? 0 : selectedDateRange.hashCode());
        }

        @k
        public final String toString() {
            return "ShowLastMinuteOffer(advertId=" + this.f287381b + ", dateRange=" + this.f287382c + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowRejectInfo;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowRejectInfo implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSellerCalendarRejectInfo f287383b;

        public ShowRejectInfo(@k StrSellerCalendarRejectInfo strSellerCalendarRejectInfo) {
            this.f287383b = strSellerCalendarRejectInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowRejectInfo) && L.f(this.f287383b, ((ShowRejectInfo) obj).f287383b);
        }

        public final int hashCode() {
            return this.f287383b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowRejectInfo(rejectInfo=" + this.f287383b + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowToast;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f287384b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.avito.android.component.toast.f f287385c;

        public ShowToast(@k PrintableText printableText, @k com.avito.android.component.toast.f fVar) {
            this.f287384b = printableText;
            this.f287385c = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ShowToast showToast = (ShowToast) obj;
            return L.f(this.f287384b, showToast.f287384b) && L.f(this.f287385c, showToast.f287385c);
        }

        public final int hashCode() {
            return this.f287385c.hashCode() + (this.f287384b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(text=" + this.f287384b + ", type=" + this.f287385c + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowTooltipAtPosition;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowTooltipAtPosition implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f287386b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final GroupParameter.OnboardingTooltip f287387c;

        public ShowTooltipAtPosition(int i12, @k GroupParameter.OnboardingTooltip onboardingTooltip) {
            this.f287386b = i12;
            this.f287387c = onboardingTooltip;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowTooltipAtPosition)) {
                return false;
            }
            ShowTooltipAtPosition showTooltipAtPosition = (ShowTooltipAtPosition) obj;
            return this.f287386b == showTooltipAtPosition.f287386b && L.f(this.f287387c, showTooltipAtPosition.f287387c);
        }

        public final int hashCode() {
            return this.f287387c.hashCode() + (Integer.hashCode(this.f287386b) * 31);
        }

        @k
        public final String toString() {
            return "ShowTooltipAtPosition(position=" + this.f287386b + ", tooltip=" + this.f287387c + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ShowWarningDialog;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowWarningDialog implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrSellerCalendarParametersWarningDialog f287388b;

        public ShowWarningDialog(@k StrSellerCalendarParametersWarningDialog strSellerCalendarParametersWarningDialog) {
            this.f287388b = strSellerCalendarParametersWarningDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowWarningDialog) && L.f(this.f287388b, ((ShowWarningDialog) obj).f287388b);
        }

        public final int hashCode() {
            return this.f287388b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowWarningDialog(warningDialog=" + this.f287388b + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$ToggleSwitcher;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleSwitcher implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SwitcherItem f287389b;

        static {
            Parcelable.Creator<SwitcherItem> creator = SwitcherItem.CREATOR;
        }

        public ToggleSwitcher(@k SwitcherItem switcherItem) {
            this.f287389b = switcherItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSwitcher) && L.f(this.f287389b, ((ToggleSwitcher) obj).f287389b);
        }

        public final int hashCode() {
            return this.f287389b.hashCode();
        }

        @k
        public final String toString() {
            return "ToggleSwitcher(item=" + this.f287389b + ')';
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$UpdateRefundGroupTitle;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateRefundGroupTitle implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287390b;

        public UpdateRefundGroupTitle(@k String str) {
            this.f287390b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateRefundGroupTitle) && L.f(this.f287390b, ((UpdateRefundGroupTitle) obj).f287390b);
        }

        public final int hashCode() {
            return this.f287390b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateRefundGroupTitle(newParameterTitle="), this.f287390b, ')');
        }
    }

    /* compiled from: StrCalendarParametersInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction$WarningAcceptedChange;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WarningAcceptedChange implements StrCalendarParametersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f287391b;

        public WarningAcceptedChange(boolean z12) {
            this.f287391b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WarningAcceptedChange) && this.f287391b == ((WarningAcceptedChange) obj).f287391b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f287391b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("WarningAcceptedChange(isWarningAccepted="), this.f287391b, ')');
        }
    }
}
