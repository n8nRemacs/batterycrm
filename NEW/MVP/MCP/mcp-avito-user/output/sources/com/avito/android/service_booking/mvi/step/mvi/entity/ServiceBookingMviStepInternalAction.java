package com.avito.android.service_booking.mvi.step.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepState;
import com.avito.android.service_booking.remote.result.ServiceBookingError;
import com.avito.android.service_booking.remote.result.ServiceBookingResult;
import com.avito.android.service_booking_common.blueprints.SbInputItem;
import com.avito.android.service_booking_common.blueprints.comment.c;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qt0.C47439c;
import qt0.C47440d;

/* compiled from: ServiceBookingMviStepInternalAction.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001a\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Finish", "Loading", "None", "OnAnySpecialistClicked", "OnCommentEdited", "OnDayScrolled", "OnDaySelected", "OnInputChanged", "OnInputFocused", "OnServiceClicked", "OnServiceGroupClicked", "OnServiceInfoClicked", "OnShowAnimationOverlay", "OnShowOnboarding", "OnSlotSelected", "OnSpecialistClicked", "OpenDeeplink", "OpenNextStep", "OpenPreviousStep", "ProcessJsonView", "ServiceBookingErrorAction", "ShowError", "ShowToastError", "SuccessContent", "SuccessSaveRequest", "TimeSlotsInternalAction", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$Finish;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$Loading;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$None;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnAnySpecialistClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnCommentEdited;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnDayScrolled;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnDaySelected;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnInputChanged;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnInputFocused;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnServiceClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnServiceGroupClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnServiceInfoClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnShowAnimationOverlay;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnShowOnboarding;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnSlotSelected;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnSpecialistClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OpenDeeplink;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OpenNextStep;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OpenPreviousStep;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ProcessJsonView;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ServiceBookingErrorAction;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ShowError;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ShowToastError;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$SuccessContent;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$SuccessSaveRequest;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$TimeSlotsInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingMviStepInternalAction extends n {

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$Finish;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Finish implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ServiceBookingFlowIntentFactory.Result f274674b;

        public Finish(@k ServiceBookingFlowIntentFactory.Result result) {
            this.f274674b = result;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Finish) && L.f(this.f274674b, ((Finish) obj).f274674b);
        }

        public final int hashCode() {
            return this.f274674b.hashCode();
        }

        @k
        public final String toString() {
            return "Finish(result=" + this.f274674b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$Loading;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f274675b;

        public Loading(@k String str) {
            this.f274675b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f274675b, ((Loading) obj).f274675b);
        }

        public final int hashCode() {
            return this.f274675b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Loading(loadStepId="), this.f274675b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$None;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "<init>", "()V", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class None implements ServiceBookingMviStepInternalAction {
        static {
            new None();
        }

        private None() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -1032231874;
        }

        @k
        public final String toString() {
            return "None";
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnAnySpecialistClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnAnySpecialistClicked implements ServiceBookingMviStepInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAnySpecialistClicked)) {
                return false;
            }
            ((OnAnySpecialistClicked) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OnAnySpecialistClicked(specialist=null)";
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnCommentEdited;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCommentEdited implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f274676b;

        public OnCommentEdited(@k c cVar) {
            this.f274676b = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCommentEdited) && L.f(this.f274676b, ((OnCommentEdited) obj).f274676b);
        }

        public final int hashCode() {
            return this.f274676b.hashCode();
        }

        @k
        public final String toString() {
            return "OnCommentEdited(comment=" + this.f274676b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnDayScrolled;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnDayScrolled implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47440d f274677b;

        public OnDayScrolled(@k C47440d c47440d) {
            this.f274677b = c47440d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDayScrolled) && L.f(this.f274677b, ((OnDayScrolled) obj).f274677b);
        }

        public final int hashCode() {
            return this.f274677b.hashCode();
        }

        @k
        public final String toString() {
            return "OnDayScrolled(scrollDay=" + this.f274677b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnDaySelected;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnDaySelected implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47440d.a f274678b;

        public OnDaySelected(@k C47440d.a aVar) {
            this.f274678b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDaySelected) && L.f(this.f274678b, ((OnDaySelected) obj).f274678b);
        }

        public final int hashCode() {
            return this.f274678b.hashCode();
        }

        @k
        public final String toString() {
            return "OnDaySelected(day=" + this.f274678b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnInputChanged;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnInputChanged implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SbInputItem f274679b;

        public OnInputChanged(@k SbInputItem sbInputItem) {
            this.f274679b = sbInputItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnInputChanged) && L.f(this.f274679b, ((OnInputChanged) obj).f274679b);
        }

        public final int hashCode() {
            return this.f274679b.hashCode();
        }

        @k
        public final String toString() {
            return "OnInputChanged(input=" + this.f274679b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnInputFocused;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnInputFocused implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SbInputItem f274680b;

        public OnInputFocused(@k SbInputItem sbInputItem) {
            this.f274680b = sbInputItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnInputFocused) && L.f(this.f274680b, ((OnInputFocused) obj).f274680b);
        }

        public final int hashCode() {
            return this.f274680b.hashCode();
        }

        @k
        public final String toString() {
            return "OnInputFocused(input=" + this.f274680b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnServiceClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnServiceClicked implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47439c.a f274681b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f274682c;

        public OnServiceClicked(@k C47439c.a aVar, @k String str) {
            this.f274681b = aVar;
            this.f274682c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnServiceClicked)) {
                return false;
            }
            OnServiceClicked onServiceClicked = (OnServiceClicked) obj;
            return L.f(this.f274681b, onServiceClicked.f274681b) && L.f(this.f274682c, onServiceClicked.f274682c);
        }

        public final int hashCode() {
            return this.f274682c.hashCode() + (this.f274681b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnServiceClicked(value=");
            sb2.append(this.f274681b);
            sb2.append(", paramId=");
            return C22026a.c(sb2, this.f274682c, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnServiceGroupClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnServiceGroupClicked implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47439c f274683b;

        public OnServiceGroupClicked(@k C47439c c47439c) {
            this.f274683b = c47439c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnServiceGroupClicked) && L.f(this.f274683b, ((OnServiceGroupClicked) obj).f274683b);
        }

        public final int hashCode() {
            return this.f274683b.hashCode();
        }

        @k
        public final String toString() {
            return "OnServiceGroupClicked(priceGroup=" + this.f274683b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnServiceInfoClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnServiceInfoClicked implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47439c.a f274684b;

        public OnServiceInfoClicked(@k C47439c.a aVar) {
            this.f274684b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnServiceInfoClicked) && L.f(this.f274684b, ((OnServiceInfoClicked) obj).f274684b);
        }

        public final int hashCode() {
            return this.f274684b.hashCode();
        }

        @k
        public final String toString() {
            return "OnServiceInfoClicked(info=" + this.f274684b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnShowAnimationOverlay;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnShowAnimationOverlay implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ServiceBookingMviStepState.ServiceBookingAnimationUrl f274685b;

        public OnShowAnimationOverlay(@l ServiceBookingMviStepState.ServiceBookingAnimationUrl serviceBookingAnimationUrl) {
            this.f274685b = serviceBookingAnimationUrl;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShowAnimationOverlay) && L.f(this.f274685b, ((OnShowAnimationOverlay) obj).f274685b);
        }

        public final int hashCode() {
            ServiceBookingMviStepState.ServiceBookingAnimationUrl serviceBookingAnimationUrl = this.f274685b;
            if (serviceBookingAnimationUrl == null) {
                return 0;
            }
            return serviceBookingAnimationUrl.hashCode();
        }

        @k
        public final String toString() {
            return "OnShowAnimationOverlay(animationUrl=" + this.f274685b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnShowOnboarding;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnShowOnboarding implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f274686b;

        public OnShowOnboarding(@k DeepLink deepLink) {
            this.f274686b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnShowOnboarding) && L.f(this.f274686b, ((OnShowOnboarding) obj).f274686b);
        }

        public final int hashCode() {
            return this.f274686b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnShowOnboarding(deepLink="), this.f274686b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnSlotSelected;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSlotSelected implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47440d.a f274687b;

        public OnSlotSelected(@k C47440d.a aVar) {
            this.f274687b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSlotSelected) && L.f(this.f274687b, ((OnSlotSelected) obj).f274687b);
        }

        public final int hashCode() {
            return this.f274687b.hashCode();
        }

        @k
        public final String toString() {
            return "OnSlotSelected(slot=" + this.f274687b + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OnSpecialistClicked;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSpecialistClicked implements ServiceBookingMviStepInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSpecialistClicked)) {
                return false;
            }
            ((OnSpecialistClicked) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OnSpecialistClicked(specialist=null)";
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OpenDeeplink;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f274688b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f274688b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f274688b, ((OpenDeeplink) obj).f274688b);
        }

        public final int hashCode() {
            return this.f274688b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f274688b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OpenPreviousStep;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenPreviousStep implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f274692b;

        public OpenPreviousStep(@k String str) {
            this.f274692b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPreviousStep) && L.f(this.f274692b, ((OpenPreviousStep) obj).f274692b);
        }

        public final int hashCode() {
            return this.f274692b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPreviousStep(currentStepId="), this.f274692b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ProcessJsonView;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProcessJsonView implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f274693b;

        public ProcessJsonView(@k String str) {
            this.f274693b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProcessJsonView) && L.f(this.f274693b, ((ProcessJsonView) obj).f274693b);
        }

        public final int hashCode() {
            return this.f274693b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ProcessJsonView(bduiContent="), this.f274693b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ServiceBookingErrorAction;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "Failure", "PartnerServiceError", "WrongSlotError", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class ServiceBookingErrorAction implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ServiceBookingError f274694b;

        /* compiled from: ServiceBookingMviStepInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ServiceBookingErrorAction$Failure;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ServiceBookingErrorAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Failure extends ServiceBookingErrorAction {

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ServiceBookingResult.Failure f274695c;

            public Failure(@k ServiceBookingResult.Failure failure) {
                super(failure);
                this.f274695c = failure;
            }

            @Override // com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction.ServiceBookingErrorAction
            @k
            /* renamed from: c */
            public final ServiceBookingError getF274694b() {
                return this.f274695c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && this.f274695c.equals(((Failure) obj).f274695c);
            }

            public final int hashCode() {
                return this.f274695c.hashCode();
            }

            @k
            public final String toString() {
                return "Failure(error=" + this.f274695c + ')';
            }
        }

        /* compiled from: ServiceBookingMviStepInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ServiceBookingErrorAction$PartnerServiceError;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ServiceBookingErrorAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PartnerServiceError extends ServiceBookingErrorAction {

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ServiceBookingResult.PartnerServiceError f274696c;

            public PartnerServiceError(@k ServiceBookingResult.PartnerServiceError partnerServiceError) {
                super(partnerServiceError);
                this.f274696c = partnerServiceError;
            }

            @Override // com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction.ServiceBookingErrorAction
            @k
            /* renamed from: c */
            public final ServiceBookingError getF274694b() {
                return this.f274696c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PartnerServiceError) && this.f274696c.equals(((PartnerServiceError) obj).f274696c);
            }

            public final int hashCode() {
                return this.f274696c.hashCode();
            }

            @k
            public final String toString() {
                return "PartnerServiceError(error=" + this.f274696c + ')';
            }
        }

        /* compiled from: ServiceBookingMviStepInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ServiceBookingErrorAction$WrongSlotError;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ServiceBookingErrorAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WrongSlotError extends ServiceBookingErrorAction {

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ServiceBookingResult.WrongSlotError f274697c;

            public WrongSlotError(@k ServiceBookingResult.WrongSlotError wrongSlotError) {
                super(wrongSlotError);
                this.f274697c = wrongSlotError;
            }

            @Override // com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction.ServiceBookingErrorAction
            @k
            /* renamed from: c */
            public final ServiceBookingError getF274694b() {
                return this.f274697c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WrongSlotError) && this.f274697c.equals(((WrongSlotError) obj).f274697c);
            }

            public final int hashCode() {
                return this.f274697c.hashCode();
            }

            @k
            public final String toString() {
                return "WrongSlotError(error=" + this.f274697c + ')';
            }
        }

        public ServiceBookingErrorAction(@k ServiceBookingError serviceBookingError) {
            this.f274694b = serviceBookingError;
        }

        @k
        /* renamed from: c, reason: from getter */
        public ServiceBookingError getF274694b() {
            return this.f274694b;
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ShowError;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f274698b;

        public ShowError(@k Throwable th2) {
            this.f274698b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f274698b, ((ShowError) obj).f274698b);
        }

        public final int hashCode() {
            return this.f274698b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowError(throwable="), this.f274698b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$ShowToastError;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastError implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f274699b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f274700c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f274701d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ServiceBookingError f274702e;

        public ShowToastError(PrintableText printableText, boolean z12, String str, ServiceBookingError serviceBookingError, int i12, C42822w c42822w) {
            z12 = (i12 & 2) != 0 ? true : z12;
            str = (i12 & 4) != 0 ? null : str;
            serviceBookingError = (i12 & 8) != 0 ? null : serviceBookingError;
            this.f274699b = printableText;
            this.f274700c = z12;
            this.f274701d = str;
            this.f274702e = serviceBookingError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToastError)) {
                return false;
            }
            ShowToastError showToastError = (ShowToastError) obj;
            return L.f(this.f274699b, showToastError.f274699b) && this.f274700c == showToastError.f274700c && L.f(this.f274701d, showToastError.f274701d) && L.f(this.f274702e, showToastError.f274702e);
        }

        public final int hashCode() {
            int i12 = r.i(this.f274699b.hashCode() * 31, 31, this.f274700c);
            String str = this.f274701d;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            ServiceBookingError serviceBookingError = this.f274702e;
            return iHashCode + (serviceBookingError != null ? serviceBookingError.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowToastError(message=" + this.f274699b + ", popBack=" + this.f274700c + ", loadStepId=" + this.f274701d + ", customError=" + this.f274702e + ')';
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$SuccessContent;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessContent implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ServiceBookingMviStepState.ServiceBookingContent f274703b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f274704c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f274705d;

        public SuccessContent(@k ServiceBookingMviStepState.ServiceBookingContent serviceBookingContent, boolean z12, @k ArrayList arrayList) {
            this.f274703b = serviceBookingContent;
            this.f274704c = z12;
            this.f274705d = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessContent)) {
                return false;
            }
            SuccessContent successContent = (SuccessContent) obj;
            return this.f274703b.equals(successContent.f274703b) && this.f274704c == successContent.f274704c && this.f274705d.equals(successContent.f274705d);
        }

        public final int hashCode() {
            return this.f274705d.hashCode() + r.i(this.f274703b.hashCode() * 31, 31, this.f274704c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuccessContent(content=");
            sb2.append(this.f274703b);
            sb2.append(", allRequiredFilled=");
            sb2.append(this.f274704c);
            sb2.append(", selectedIdToValue=");
            return e.p(sb2, this.f274705d, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$SuccessSaveRequest;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuccessSaveRequest implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f274706b;

        public SuccessSaveRequest(@k DeepLink deepLink) {
            this.f274706b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuccessSaveRequest) && L.f(this.f274706b, ((SuccessSaveRequest) obj).f274706b);
        }

        public final int hashCode() {
            return this.f274706b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SuccessSaveRequest(redirectUri="), this.f274706b, ')');
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$TimeSlotsInternalAction;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "OnTimeSlotRequest", "TimeslotsError", "TimeslotsLoaded", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class TimeSlotsInternalAction implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Q<C47440d.a, C47440d.c> f274707b;

        /* compiled from: ServiceBookingMviStepInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$TimeSlotsInternalAction$OnTimeSlotRequest;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$TimeSlotsInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnTimeSlotRequest extends TimeSlotsInternalAction {

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Q<C47440d.a, C47440d.c> f274708c;

            /* JADX WARN: Multi-variable type inference failed */
            public OnTimeSlotRequest(@k Q<C47440d.a, ? extends C47440d.c> q12) {
                super(q12);
                this.f274708c = q12;
            }

            @Override // com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction.TimeSlotsInternalAction
            @k
            public final Q<C47440d.a, C47440d.c> c() {
                return this.f274708c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnTimeSlotRequest) && L.f(this.f274708c, ((OnTimeSlotRequest) obj).f274708c);
            }

            public final int hashCode() {
                return this.f274708c.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("OnTimeSlotRequest(content="), this.f274708c, ')');
            }
        }

        /* compiled from: ServiceBookingMviStepInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$TimeSlotsInternalAction$TimeslotsError;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$TimeSlotsInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimeslotsError extends TimeSlotsInternalAction {

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Q<C47440d.a, C47440d.c> f274709c;

            /* JADX WARN: Multi-variable type inference failed */
            public TimeslotsError(@k Q<C47440d.a, ? extends C47440d.c> q12) {
                super(q12);
                this.f274709c = q12;
            }

            @Override // com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction.TimeSlotsInternalAction
            @k
            public final Q<C47440d.a, C47440d.c> c() {
                return this.f274709c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimeslotsError) && L.f(this.f274709c, ((TimeslotsError) obj).f274709c);
            }

            public final int hashCode() {
                return this.f274709c.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("TimeslotsError(content="), this.f274709c, ')');
            }
        }

        /* compiled from: ServiceBookingMviStepInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$TimeSlotsInternalAction$TimeslotsLoaded;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$TimeSlotsInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TimeslotsLoaded extends TimeSlotsInternalAction {

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Q<C47440d.a, C47440d.c> f274710c;

            /* JADX WARN: Multi-variable type inference failed */
            public TimeslotsLoaded(@k Q<C47440d.a, ? extends C47440d.c> q12) {
                super(q12);
                this.f274710c = q12;
            }

            @Override // com.avito.android.service_booking.mvi.step.mvi.entity.ServiceBookingMviStepInternalAction.TimeSlotsInternalAction
            @k
            public final Q<C47440d.a, C47440d.c> c() {
                return this.f274710c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimeslotsLoaded) && L.f(this.f274710c, ((TimeslotsLoaded) obj).f274710c);
            }

            public final int hashCode() {
                return this.f274710c.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.authorization.auto_recovery.phone_confirm.b.i(new StringBuilder("TimeslotsLoaded(content="), this.f274710c, ')');
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TimeSlotsInternalAction(@k Q<C47440d.a, ? extends C47440d.c> q12) {
            this.f274707b = q12;
        }

        @k
        public Q<C47440d.a, C47440d.c> c() {
            return this.f274707b;
        }
    }

    /* compiled from: ServiceBookingMviStepInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction$OpenNextStep;", "Lcom/avito/android/service_booking/mvi/step/mvi/entity/ServiceBookingMviStepInternalAction;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenNextStep implements ServiceBookingMviStepInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f274689b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, Set<Object>> f274690c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f274691d;

        /* JADX WARN: Multi-variable type inference failed */
        public OpenNextStep(@k String str, @k Map<String, ? extends Set<? extends Object>> map, @l String str2) {
            this.f274689b = str;
            this.f274690c = map;
            this.f274691d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenNextStep)) {
                return false;
            }
            OpenNextStep openNextStep = (OpenNextStep) obj;
            return L.f(this.f274689b, openNextStep.f274689b) && L.f(this.f274690c, openNextStep.f274690c) && L.f(this.f274691d, openNextStep.f274691d);
        }

        public final int hashCode() {
            int iC2 = AK.c.c(this.f274689b.hashCode() * 31, 31, this.f274690c);
            String str = this.f274691d;
            return iC2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenNextStep(nextStepId=");
            sb2.append(this.f274689b);
            sb2.append(", selectedValues=");
            sb2.append(this.f274690c);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f274691d, ')');
        }

        public /* synthetic */ OpenNextStep(String str, Map map, String str2, int i12, C42822w c42822w) {
            this(str, map, (i12 & 4) != 0 ? null : str2);
        }
    }
}
