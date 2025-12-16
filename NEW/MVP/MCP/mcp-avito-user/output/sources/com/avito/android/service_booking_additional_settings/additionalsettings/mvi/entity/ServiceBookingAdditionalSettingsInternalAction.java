package com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity.ServiceBookingAdditionalSettingsState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Finish", "Loading", "OnOpenDeeplink", "OnSendDataShowLoader", "OnShowSelectSheet", "OnTechBreakItemSelected", "OnTimeGapItemSelected", "ShowError", "SuccessContent", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$Finish;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$Loading;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnOpenDeeplink;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnSendDataShowLoader;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnShowSelectSheet;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnTechBreakItemSelected;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnTimeGapItemSelected;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$ShowError;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$SuccessContent;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsToastInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingAdditionalSettingsInternalAction extends n {

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$Finish;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Finish implements ServiceBookingAdditionalSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Finish f274980b = new Finish();

        private Finish() {
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$Loading;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ServiceBookingAdditionalSettingsInternalAction {
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnOpenDeeplink;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnOpenDeeplink implements ServiceBookingAdditionalSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f274981b;

        public OnOpenDeeplink(@k DeepLink deepLink) {
            this.f274981b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnOpenDeeplink) && L.f(this.f274981b, ((OnOpenDeeplink) obj).f274981b);
        }

        public final int hashCode() {
            return this.f274981b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OnOpenDeeplink(avitoDomainLink="), this.f274981b, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnSendDataShowLoader;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSendDataShowLoader implements ServiceBookingAdditionalSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final com.avito.android.analytics.provider.clickstream.a f274982b;

        /* JADX WARN: Multi-variable type inference failed */
        public OnSendDataShowLoader() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSendDataShowLoader) && L.f(this.f274982b, ((OnSendDataShowLoader) obj).f274982b);
        }

        public final int hashCode() {
            com.avito.android.analytics.provider.clickstream.a aVar = this.f274982b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "OnSendDataShowLoader(event=" + this.f274982b + ')';
        }

        public OnSendDataShowLoader(@l com.avito.android.analytics.provider.clickstream.a aVar) {
            this.f274982b = aVar;
        }

        public /* synthetic */ OnSendDataShowLoader(com.avito.android.analytics.provider.clickstream.a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar);
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnShowSelectSheet;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnShowSelectSheet implements ServiceBookingAdditionalSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f274983b;

        public OnShowSelectSheet(@k Arguments arguments) {
            this.f274983b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShowSelectSheet) && L.f(this.f274983b, ((OnShowSelectSheet) obj).f274983b);
        }

        public final int hashCode() {
            return this.f274983b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("OnShowSelectSheet(arguments="), this.f274983b, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnTechBreakItemSelected;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTechBreakItemSelected implements ServiceBookingAdditionalSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f274984b;

        public OnTechBreakItemSelected(@l String str) {
            this.f274984b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTechBreakItemSelected) && L.f(this.f274984b, ((OnTechBreakItemSelected) obj).f274984b);
        }

        public final int hashCode() {
            String str = this.f274984b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnTechBreakItemSelected(techBreakId="), this.f274984b, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$OnTimeGapItemSelected;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTimeGapItemSelected implements ServiceBookingAdditionalSettingsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f274985b;

        public OnTimeGapItemSelected(@l String str) {
            this.f274985b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTimeGapItemSelected) && L.f(this.f274985b, ((OnTimeGapItemSelected) obj).f274985b);
        }

        public final int hashCode() {
            String str = this.f274985b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnTimeGapItemSelected(timeGapId="), this.f274985b, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$ShowError;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ServiceBookingAdditionalSettingsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f274986b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f274987c;

        public ShowError(@k Throwable th2) {
            this.f274986b = th2;
            this.f274987c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            return (obj instanceof ShowError) && L.f(this.f274986b, ((ShowError) obj).f274986b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF146466c() {
            return this.f274987c;
        }

        public final int hashCode() {
            return this.f274986b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowError(throwable="), this.f274986b, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction$SuccessContent;", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessContent implements ServiceBookingAdditionalSettingsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent f274988b;

        public SuccessContent(@k ServiceBookingAdditionalSettingsState.ServiceBookingAdditionalSettingsContent serviceBookingAdditionalSettingsContent) {
            this.f274988b = serviceBookingAdditionalSettingsContent;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF146467d() {
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
            return (obj instanceof SuccessContent) && L.f(this.f274988b, ((SuccessContent) obj).f274988b);
        }

        public final int hashCode() {
            return this.f274988b.hashCode();
        }

        @k
        public final String toString() {
            return "SuccessContent(settingsContent=" + this.f274988b + ')';
        }
    }
}
