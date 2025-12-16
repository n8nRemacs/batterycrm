package com.avito.android.str_booking.mvi.entity;

import AK.c;
import Ux0.d;
import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_booking.network.models.sections.UpdatedTimeContent;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingInternalAction.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0019\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u0082\u0001\u0019\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AnimateInfoClick", "CallUser", "CloseScreen", "Error", "GetRequestSuccess", "GuestProfileTooltipShown", "HideFooter", "Init", "Loaded", "OnBoardingTooltipInfoLoaded", "OpenDeeplink", "OpenGalleryScreen", "OpenMap", "OpenWebView", "PostRequestSuccess", "ShowConfirmBottomSheet", "ShowFooter", "ShowStartAnimation", "StartBannerButtonLoading", "StartLoading", "StartPolling", "StopBannerButtonLoading", "StopPolling", "ToggleCollapsableCalculation", "UpdateScrollStates", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$AnimateInfoClick;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$CallUser;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$CloseScreen;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$Error;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$GetRequestSuccess;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$GuestProfileTooltipShown;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$HideFooter;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$Init;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$Loaded;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OnBoardingTooltipInfoLoaded;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenDeeplink;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenGalleryScreen;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenMap;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenWebView;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$PostRequestSuccess;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$ShowConfirmBottomSheet;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$ShowFooter;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$ShowStartAnimation;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StartBannerButtonLoading;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StartLoading;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StartPolling;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StopBannerButtonLoading;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StopPolling;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$ToggleCollapsableCalculation;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$UpdateScrollStates;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrBookingInternalAction extends n {

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$AnimateInfoClick;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnimateInfoClick implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AnimateInfoClick f285747b = new AnimateInfoClick();

        private AnimateInfoClick() {
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$CallUser;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallUser implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f285748b;

        public CallUser(@k String str) {
            this.f285748b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallUser) && L.f(this.f285748b, ((CallUser) obj).f285748b);
        }

        public final int hashCode() {
            return this.f285748b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CallUser(url="), this.f285748b, ')');
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$CloseScreen;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f285749b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$Error;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements StrBookingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f285750b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f285751c;

        public Error(@k ApiException apiException) {
            this.f285750b = apiException;
            this.f285751c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF201222d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.f285750b.equals(((Error) obj).f285750b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF230606c() {
            return this.f285751c;
        }

        public final int hashCode() {
            return this.f285750b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f285750b, ')');
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$GetRequestSuccess;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GetRequestSuccess implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GetRequestSuccess f285752b = new GetRequestSuccess();

        private GetRequestSuccess() {
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$GuestProfileTooltipShown;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GuestProfileTooltipShown implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GuestProfileTooltipShown f285753b = new GuestProfileTooltipShown();

        private GuestProfileTooltipShown() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GuestProfileTooltipShown);
        }

        public final int hashCode() {
            return -1907783293;
        }

        @k
        public final String toString() {
            return "GuestProfileTooltipShown";
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$HideFooter;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideFooter implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideFooter f285754b = new HideFooter();

        private HideFooter() {
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$Init;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f285755b;

        public Init(boolean z12) {
            this.f285755b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && this.f285755b == ((Init) obj).f285755b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f285755b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Init(shouldShowGuestProfileTooltip="), this.f285755b, ')');
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$Loaded;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<d> f285756b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final List<d> f285757c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f285758d;

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(@k List<? extends d> list, @l List<? extends d> list2, boolean z12) {
            this.f285756b = list;
            this.f285757c = list2;
            this.f285758d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return L.f(this.f285756b, loaded.f285756b) && L.f(this.f285757c, loaded.f285757c) && this.f285758d == loaded.f285758d;
        }

        public final int hashCode() {
            int iHashCode = this.f285756b.hashCode() * 31;
            List<d> list = this.f285757c;
            return Boolean.hashCode(this.f285758d) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(mainItems=");
            sb2.append(this.f285756b);
            sb2.append(", headerItems=");
            sb2.append(this.f285757c);
            sb2.append(", isEventBusUpdateEnabled=");
            return r.x(sb2, this.f285758d, ')');
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OnBoardingTooltipInfoLoaded;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBoardingTooltipInfoLoaded implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.str_booking.domain.c f285759b;

        public OnBoardingTooltipInfoLoaded(@k com.avito.android.str_booking.domain.c cVar) {
            this.f285759b = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBoardingTooltipInfoLoaded) && L.f(this.f285759b, ((OnBoardingTooltipInfoLoaded) obj).f285759b);
        }

        public final int hashCode() {
            return this.f285759b.hashCode();
        }

        @k
        public final String toString() {
            return "OnBoardingTooltipInfoLoaded(tooltipInfo=" + this.f285759b + ')';
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenDeeplink;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Deeplink", "Link", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenDeeplink$Deeplink;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenDeeplink$Link;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OpenDeeplink extends StrBookingInternalAction {

        /* compiled from: StrBookingInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenDeeplink$Deeplink;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenDeeplink;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Deeplink implements OpenDeeplink {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f285760b;

            public Deeplink(@k DeepLink deepLink) {
                this.f285760b = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Deeplink) && L.f(this.f285760b, ((Deeplink) obj).f285760b);
            }

            public final int hashCode() {
                return this.f285760b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Deeplink(deeplink="), this.f285760b, ')');
            }
        }

        /* compiled from: StrBookingInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenDeeplink$Link;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenDeeplink;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Link implements OpenDeeplink {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f285761b;

            public Link(@k String str) {
                this.f285761b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Link) && L.f(this.f285761b, ((Link) obj).f285761b);
            }

            public final int hashCode() {
                return this.f285761b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Link(url="), this.f285761b, ')');
            }
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenGalleryScreen;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenGalleryScreen implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Image> f285762b;

        /* renamed from: c, reason: collision with root package name */
        public final int f285763c;

        public OpenGalleryScreen(@k List<Image> list, int i12) {
            this.f285762b = list;
            this.f285763c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenGalleryScreen)) {
                return false;
            }
            OpenGalleryScreen openGalleryScreen = (OpenGalleryScreen) obj;
            return L.f(this.f285762b, openGalleryScreen.f285762b) && this.f285763c == openGalleryScreen.f285763c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f285763c) + (this.f285762b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGalleryScreen(images=");
            sb2.append(this.f285762b);
            sb2.append(", position=");
            return r.t(sb2, this.f285763c, ')');
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenMap;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMap implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Coordinates f285764b;

        public OpenMap(@k Coordinates coordinates) {
            this.f285764b = coordinates;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenMap) && L.f(this.f285764b, ((OpenMap) obj).f285764b);
        }

        public final int hashCode() {
            return this.f285764b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenMap(coordinates=" + this.f285764b + ')';
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$OpenWebView;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenWebView implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f285765b;

        public OpenWebView(@k String str) {
            this.f285765b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenWebView) && L.f(this.f285765b, ((OpenWebView) obj).f285765b);
        }

        public final int hashCode() {
            return this.f285765b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenWebView(url="), this.f285765b, ')');
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$PostRequestSuccess;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PostRequestSuccess implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PostRequestSuccess f285766b = new PostRequestSuccess();

        private PostRequestSuccess() {
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$ShowConfirmBottomSheet;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfirmBottomSheet implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f285767b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f285768c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f285769d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f285770e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final a.i f285771f;

        public ShowConfirmBottomSheet(@k String str, @k String str2, @k String str3, @l AttributedText attributedText, @k a.i iVar) {
            this.f285767b = str;
            this.f285768c = str2;
            this.f285769d = str3;
            this.f285770e = attributedText;
            this.f285771f = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowConfirmBottomSheet)) {
                return false;
            }
            ShowConfirmBottomSheet showConfirmBottomSheet = (ShowConfirmBottomSheet) obj;
            return L.f(this.f285767b, showConfirmBottomSheet.f285767b) && L.f(this.f285768c, showConfirmBottomSheet.f285768c) && L.f(this.f285769d, showConfirmBottomSheet.f285769d) && L.f(this.f285770e, showConfirmBottomSheet.f285770e) && L.f(this.f285771f, showConfirmBottomSheet.f285771f);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f285767b.hashCode() * 31, 31, this.f285768c), 31, this.f285769d);
            AttributedText attributedText = this.f285770e;
            return this.f285771f.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "ShowConfirmBottomSheet(title=" + this.f285767b + ", approveButtonText=" + this.f285768c + ", cancelButtonText=" + this.f285769d + ", bodyText=" + this.f285770e + ", approveAction=" + this.f285771f + ')';
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$ShowFooter;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowFooter implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowFooter f285772b = new ShowFooter();

        private ShowFooter() {
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$ShowStartAnimation;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowStartAnimation implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AnimationOverlayUrl f285773b;

        public ShowStartAnimation(@k AnimationOverlayUrl animationOverlayUrl) {
            this.f285773b = animationOverlayUrl;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowStartAnimation) && L.f(this.f285773b, ((ShowStartAnimation) obj).f285773b);
        }

        public final int hashCode() {
            return this.f285773b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowStartAnimation(startAnimation=" + this.f285773b + ')';
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StartBannerButtonLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartBannerButtonLoading extends TrackableLoadingStarted implements StrBookingInternalAction {
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StartLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements StrBookingInternalAction {
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StartPolling;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartPolling implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UpdatedTimeContent f285774b;

        public StartPolling(@l UpdatedTimeContent updatedTimeContent) {
            this.f285774b = updatedTimeContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartPolling) && L.f(this.f285774b, ((StartPolling) obj).f285774b);
        }

        public final int hashCode() {
            UpdatedTimeContent updatedTimeContent = this.f285774b;
            if (updatedTimeContent == null) {
                return 0;
            }
            return updatedTimeContent.hashCode();
        }

        @k
        public final String toString() {
            return "StartPolling(updatedTimeContent=" + this.f285774b + ')';
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StopBannerButtonLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StopBannerButtonLoading extends TrackableLoadingStarted implements StrBookingInternalAction {
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$StopPolling;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StopPolling implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StopPolling f285775b = new StopPolling();

        private StopPolling() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StopPolling);
        }

        public final int hashCode() {
            return -1389825155;
        }

        @k
        public final String toString() {
            return "StopPolling";
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$ToggleCollapsableCalculation;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleCollapsableCalculation implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f285776b;

        public ToggleCollapsableCalculation(@l String str) {
            this.f285776b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleCollapsableCalculation) && L.f(this.f285776b, ((ToggleCollapsableCalculation) obj).f285776b);
        }

        public final int hashCode() {
            String str = this.f285776b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToggleCollapsableCalculation(id="), this.f285776b, ')');
        }
    }

    /* compiled from: StrBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction$UpdateScrollStates;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateScrollStates implements StrBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Float f285777b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Parcelable f285778c;

        public UpdateScrollStates(@l Float f12, @l Parcelable parcelable) {
            this.f285777b = f12;
            this.f285778c = parcelable;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateScrollStates)) {
                return false;
            }
            UpdateScrollStates updateScrollStates = (UpdateScrollStates) obj;
            return L.f(this.f285777b, updateScrollStates.f285777b) && L.f(this.f285778c, updateScrollStates.f285778c);
        }

        public final int hashCode() {
            Float f12 = this.f285777b;
            int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
            Parcelable parcelable = this.f285778c;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateScrollStates(motionScrollProgress=");
            sb2.append(this.f285777b);
            sb2.append(", mainItemsScrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f285778c, ')');
        }
    }
}
