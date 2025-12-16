package com.avito.android.mortgage.landing.mvi.entity;

import AK.c;
import MZ.g;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.OffersResult;
import com.avito.android.mortgage.landing.list.items.chips.ChipsItem;
import com.avito.android.mortgage.landing.list.items.select.SelectItem;
import com.avito.android.mortgage.landing.model.LandingArguments;
import com.avito.android.mortgage_invite.model.participant.ParticipantArguments;
import com.avito.android.remote.error.ApiError;
import com.avito.android.select.Arguments;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LandingInternalAction.kt */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:/\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0\u0082\u0001/123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_¨\u0006`"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ApplicationCreated", "ApplicationIdLoadingCompleted", "ApplicationIdLoadingFailed", "ApplicationIdLoadingStarted", "ApplyBusinessRules", "CalculationLoadingCompleted", "CalculationLoadingFailed", "CalculationLoadingStarted", "ChipSelected", "Close", "CollapseHeader", "CreateApplicationClicked", "HandleBottomUspBannerDeeplink", "HandleDeeplink", "HandleHeaderActionDeeplink", "HandlePreApprovalBannerDeeplink", "Init", "InputFieldFilled", "ItemExpanded", "NavigateToApplication", "NavigateToParticipants", "OfferClicked", "OffersLoadingCompleted", "OffersLoadingFailed", "OffersLoadingStarted", "OffersScrollStarted", "OpenAlreadyHaveApplicationDialog", "OpenApplicationClicked", "OpenSelectorDialog", "ProgramTabInDialogSelected", "ProgramUpdated", "ProgramsInfoClicked", "ProgramsScrollStarted", "ProgramsScrolled", "RequestAuthorization", "ScreenClosed", "ScreenOpened", "ScreenScrolled", "ScrollToOffersClicked", "SliderFilled", "SubmitLoadingFailed", "SubmitLoadingStarted", "UpdateApplicationClicked", "ValueSelected", "ValueUpdated", "ValueUpdatedByPredefined", "ValueUpdatedBySlider", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplicationCreated;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplicationIdLoadingCompleted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplicationIdLoadingFailed;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplicationIdLoadingStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplyBusinessRules;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CalculationLoadingCompleted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CalculationLoadingFailed;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CalculationLoadingStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ChipSelected;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$Close;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CollapseHeader;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CreateApplicationClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$HandleBottomUspBannerDeeplink;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$HandleHeaderActionDeeplink;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$HandlePreApprovalBannerDeeplink;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$Init;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$InputFieldFilled;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ItemExpanded;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$NavigateToApplication;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$NavigateToParticipants;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OfferClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OffersLoadingCompleted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OffersLoadingFailed;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OffersLoadingStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OffersScrollStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OpenAlreadyHaveApplicationDialog;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OpenApplicationClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OpenSelectorDialog;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramTabInDialogSelected;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramUpdated;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramsInfoClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramsScrollStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramsScrolled;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$RequestAuthorization;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ScreenClosed;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ScreenOpened;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ScreenScrolled;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ScrollToOffersClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$SliderFilled;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$SubmitLoadingFailed;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$SubmitLoadingStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$UpdateApplicationClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ValueSelected;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ValueUpdated;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ValueUpdatedByPredefined;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ValueUpdatedBySlider;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LandingInternalAction extends n {

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplicationCreated;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationCreated implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200157b;

        public ApplicationCreated(@k String str) {
            this.f200157b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationCreated) && L.f(this.f200157b, ((ApplicationCreated) obj).f200157b);
        }

        public final int hashCode() {
            return this.f200157b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApplicationCreated(applicationId="), this.f200157b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplicationIdLoadingCompleted;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationIdLoadingCompleted implements TrackableContent, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200158b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f200159c;

        public ApplicationIdLoadingCompleted(@k String str, @k DeepLink deepLink) {
            this.f200158b = str;
            this.f200159c = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_calculation";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_calculation";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApplicationIdLoadingCompleted)) {
                return false;
            }
            ApplicationIdLoadingCompleted applicationIdLoadingCompleted = (ApplicationIdLoadingCompleted) obj;
            return L.f(this.f200158b, applicationIdLoadingCompleted.f200158b) && L.f(this.f200159c, applicationIdLoadingCompleted.f200159c);
        }

        public final int hashCode() {
            return this.f200159c.hashCode() + (this.f200158b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplicationIdLoadingCompleted(applicationId=");
            sb2.append(this.f200158b);
            sb2.append(", deeplink=");
            return a.v(sb2, this.f200159c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplicationIdLoadingFailed;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationIdLoadingFailed implements TrackableError, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f200160b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f200161c;

        public ApplicationIdLoadingFailed(@k ApiError apiError) {
            this.f200160b = apiError;
            this.f200161c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_calculation";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_calculation";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationIdLoadingFailed) && L.f(this.f200160b, ((ApplicationIdLoadingFailed) obj).f200160b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF174163b() {
            return this.f200161c;
        }

        public final int hashCode() {
            return this.f200160b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ApplicationIdLoadingFailed(error="), this.f200160b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplicationIdLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplicationIdLoadingStarted extends TrackableLoadingStarted implements LandingInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f200162d = "landing_calculation";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f200162d;
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ApplyBusinessRules;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyBusinessRules implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ApplyBusinessRules f200163b = new ApplyBusinessRules();

        private ApplyBusinessRules() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ApplyBusinessRules);
        }

        public final int hashCode() {
            return -1581974644;
        }

        @k
        public final String toString() {
            return "ApplyBusinessRules";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CalculationLoadingCompleted;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalculationLoadingCompleted implements TrackableContent, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f200164b;

        public CalculationLoadingCompleted(@k g gVar) {
            this.f200164b = gVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_calculation";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_calculation";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CalculationLoadingCompleted) && L.f(this.f200164b, ((CalculationLoadingCompleted) obj).f200164b);
        }

        public final int hashCode() {
            return this.f200164b.hashCode();
        }

        @k
        public final String toString() {
            return "CalculationLoadingCompleted(calculation=" + this.f200164b + ')';
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CalculationLoadingFailed;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalculationLoadingFailed implements TrackableError, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f200165b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f200166c;

        public CalculationLoadingFailed(@k ApiError apiError) {
            this.f200165b = apiError;
            this.f200166c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_calculation";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_calculation";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CalculationLoadingFailed) && L.f(this.f200165b, ((CalculationLoadingFailed) obj).f200165b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF174163b() {
            return this.f200166c;
        }

        public final int hashCode() {
            return this.f200165b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("CalculationLoadingFailed(error="), this.f200165b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CalculationLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CalculationLoadingStarted extends TrackableLoadingStarted implements LandingInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f200167d = "landing_calculation";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f200167d;
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ChipSelected;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChipSelected implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200168b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ChipsItem.Chip f200169c;

        public ChipSelected(@k String str, @k ChipsItem.Chip chip) {
            this.f200168b = str;
            this.f200169c = chip;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChipSelected)) {
                return false;
            }
            ChipSelected chipSelected = (ChipSelected) obj;
            return L.f(this.f200168b, chipSelected.f200168b) && L.f(this.f200169c, chipSelected.f200169c);
        }

        public final int hashCode() {
            return this.f200169c.hashCode() + (this.f200168b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ChipSelected(fieldId=" + this.f200168b + ", chip=" + this.f200169c + ')';
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$Close;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f200170b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 412316117;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CollapseHeader;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CollapseHeader implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CollapseHeader f200171b = new CollapseHeader();

        private CollapseHeader() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CollapseHeader);
        }

        public final int hashCode() {
            return 1097544029;
        }

        @k
        public final String toString() {
            return "CollapseHeader";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$CreateApplicationClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateApplicationClicked implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CreateApplicationClicked f200172b = new CreateApplicationClicked();

        private CreateApplicationClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CreateApplicationClicked);
        }

        public final int hashCode() {
            return 1025031126;
        }

        @k
        public final String toString() {
            return "CreateApplicationClicked";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$HandleBottomUspBannerDeeplink;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBottomUspBannerDeeplink implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f200173b;

        public HandleBottomUspBannerDeeplink(@k DeepLink deepLink) {
            this.f200173b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBottomUspBannerDeeplink) && L.f(this.f200173b, ((HandleBottomUspBannerDeeplink) obj).f200173b);
        }

        public final int hashCode() {
            return this.f200173b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleBottomUspBannerDeeplink(deeplink="), this.f200173b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$HandleDeeplink;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f200174b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f200174b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f200174b, ((HandleDeeplink) obj).f200174b);
        }

        public final int hashCode() {
            return this.f200174b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f200174b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$HandleHeaderActionDeeplink;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleHeaderActionDeeplink implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f200175b;

        public HandleHeaderActionDeeplink(@k DeepLink deepLink) {
            this.f200175b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleHeaderActionDeeplink) && L.f(this.f200175b, ((HandleHeaderActionDeeplink) obj).f200175b);
        }

        public final int hashCode() {
            return this.f200175b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleHeaderActionDeeplink(deeplink="), this.f200175b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$HandlePreApprovalBannerDeeplink;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandlePreApprovalBannerDeeplink implements LandingInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandlePreApprovalBannerDeeplink)) {
                return false;
            }
            ((HandlePreApprovalBannerDeeplink) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "HandlePreApprovalBannerDeeplink(deeplink=null)";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$Init;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LandingArguments f200176b;

        public Init(@k LandingArguments landingArguments) {
            this.f200176b = landingArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f200176b, ((Init) obj).f200176b);
        }

        public final int hashCode() {
            return this.f200176b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(arguments=" + this.f200176b + ')';
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$InputFieldFilled;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputFieldFilled implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200177b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f200178c;

        public InputFieldFilled(@k String str, @k String str2) {
            this.f200177b = str;
            this.f200178c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputFieldFilled)) {
                return false;
            }
            InputFieldFilled inputFieldFilled = (InputFieldFilled) obj;
            return L.f(this.f200177b, inputFieldFilled.f200177b) && L.f(this.f200178c, inputFieldFilled.f200178c);
        }

        public final int hashCode() {
            return this.f200178c.hashCode() + (this.f200177b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputFieldFilled(fieldId=");
            sb2.append(this.f200177b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f200178c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ItemExpanded;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemExpanded implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200179b;

        public ItemExpanded(@k String str) {
            this.f200179b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemExpanded) && L.f(this.f200179b, ((ItemExpanded) obj).f200179b);
        }

        public final int hashCode() {
            return this.f200179b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ItemExpanded(fieldId="), this.f200179b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$NavigateToApplication;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToApplication implements TrackableContent, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200180b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f200181c;

        public NavigateToApplication(@k String str, @k DeepLink deepLink) {
            this.f200180b = str;
            this.f200181c = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_submit";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_submit";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToApplication)) {
                return false;
            }
            NavigateToApplication navigateToApplication = (NavigateToApplication) obj;
            return L.f(this.f200180b, navigateToApplication.f200180b) && L.f(this.f200181c, navigateToApplication.f200181c);
        }

        public final int hashCode() {
            return this.f200181c.hashCode() + (this.f200180b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigateToApplication(applicationId=");
            sb2.append(this.f200180b);
            sb2.append(", deeplink=");
            return a.v(sb2, this.f200181c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$NavigateToParticipants;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateToParticipants implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ParticipantArguments f200182b;

        public NavigateToParticipants(@k ParticipantArguments participantArguments) {
            this.f200182b = participantArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToParticipants) && L.f(this.f200182b, ((NavigateToParticipants) obj).f200182b);
        }

        public final int hashCode() {
            return this.f200182b.hashCode();
        }

        @k
        public final String toString() {
            return "NavigateToParticipants(arguments=" + this.f200182b + ')';
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OfferClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OfferClicked implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200183b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f200184c;

        public OfferClicked(@k String str, boolean z12) {
            this.f200183b = str;
            this.f200184c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferClicked)) {
                return false;
            }
            OfferClicked offerClicked = (OfferClicked) obj;
            return L.f(this.f200183b, offerClicked.f200183b) && this.f200184c == offerClicked.f200184c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f200184c) + (this.f200183b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OfferClicked(offerId=");
            sb2.append(this.f200183b);
            sb2.append(", isSelected=");
            return r.x(sb2, this.f200184c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OffersLoadingCompleted;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OffersLoadingCompleted implements TrackableContent, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f200185b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final OffersResult f200186c;

        public OffersLoadingCompleted(@k g gVar, @k OffersResult offersResult) {
            this.f200185b = gVar;
            this.f200186c = offersResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_offers";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_offers";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OffersLoadingFailed;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OffersLoadingFailed implements TrackableError, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f200187b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f200188c;

        public OffersLoadingFailed(@k g gVar, @k ApiError apiError) {
            this.f200187b = gVar;
            this.f200188c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_calculation";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_calculation";
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF174163b() {
            return this.f200188c;
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OffersLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OffersLoadingStarted extends TrackableLoadingStarted implements LandingInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final g f200189d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f200190e = "landing_offers";

        public OffersLoadingStarted(@k g gVar) {
            this.f200189d = gVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f200190e;
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OffersScrollStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OffersScrollStarted implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OffersScrollStarted f200191b = new OffersScrollStarted();

        private OffersScrollStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OffersScrollStarted);
        }

        public final int hashCode() {
            return 1980545466;
        }

        @k
        public final String toString() {
            return "OffersScrollStarted";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OpenAlreadyHaveApplicationDialog;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAlreadyHaveApplicationDialog implements TrackableContent, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200192b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f200193c;

        public OpenAlreadyHaveApplicationDialog(@k String str, @k DeepLink deepLink) {
            this.f200192b = str;
            this.f200193c = deepLink;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_submit";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_submit";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAlreadyHaveApplicationDialog)) {
                return false;
            }
            OpenAlreadyHaveApplicationDialog openAlreadyHaveApplicationDialog = (OpenAlreadyHaveApplicationDialog) obj;
            return L.f(this.f200192b, openAlreadyHaveApplicationDialog.f200192b) && L.f(this.f200193c, openAlreadyHaveApplicationDialog.f200193c);
        }

        public final int hashCode() {
            return this.f200193c.hashCode() + (this.f200192b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenAlreadyHaveApplicationDialog(applicationId=");
            sb2.append(this.f200192b);
            sb2.append(", deeplink=");
            return a.v(sb2, this.f200193c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OpenApplicationClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenApplicationClicked implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200194b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f200195c;

        public OpenApplicationClicked(@k String str, @k DeepLink deepLink) {
            this.f200194b = str;
            this.f200195c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenApplicationClicked)) {
                return false;
            }
            OpenApplicationClicked openApplicationClicked = (OpenApplicationClicked) obj;
            return L.f(this.f200194b, openApplicationClicked.f200194b) && L.f(this.f200195c, openApplicationClicked.f200195c);
        }

        public final int hashCode() {
            return this.f200195c.hashCode() + (this.f200194b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenApplicationClicked(applicationId=");
            sb2.append(this.f200194b);
            sb2.append(", deeplink=");
            return a.v(sb2, this.f200195c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OpenSelectorDialog;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSelectorDialog implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Arguments f200196b;

        public OpenSelectorDialog(@k Arguments arguments) {
            this.f200196b = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSelectorDialog) && L.f(this.f200196b, ((OpenSelectorDialog) obj).f200196b);
        }

        public final int hashCode() {
            return this.f200196b.hashCode();
        }

        @k
        public final String toString() {
            return c.p(new StringBuilder("OpenSelectorDialog(bottomArguments="), this.f200196b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramTabInDialogSelected;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgramTabInDialogSelected implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200197b;

        public ProgramTabInDialogSelected(@k String str) {
            this.f200197b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgramTabInDialogSelected) && L.f(this.f200197b, ((ProgramTabInDialogSelected) obj).f200197b);
        }

        public final int hashCode() {
            return this.f200197b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ProgramTabInDialogSelected(programId="), this.f200197b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramUpdated;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgramUpdated implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200198b;

        public ProgramUpdated(@k String str) {
            this.f200198b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgramUpdated) && L.f(this.f200198b, ((ProgramUpdated) obj).f200198b);
        }

        public final int hashCode() {
            return this.f200198b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ProgramUpdated(programId="), this.f200198b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramsInfoClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgramsInfoClicked implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200199b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f200200c;

        public ProgramsInfoClicked(@k String str, @k ArrayList arrayList) {
            this.f200199b = str;
            this.f200200c = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgramsInfoClicked)) {
                return false;
            }
            ProgramsInfoClicked programsInfoClicked = (ProgramsInfoClicked) obj;
            return this.f200199b.equals(programsInfoClicked.f200199b) && this.f200200c.equals(programsInfoClicked.f200200c);
        }

        public final int hashCode() {
            return this.f200200c.hashCode() + (this.f200199b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProgramsInfoClicked(selectedProgram=");
            sb2.append(this.f200199b);
            sb2.append(", programs=");
            return e.p(sb2, this.f200200c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramsScrollStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgramsScrollStarted implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ProgramsScrollStarted f200201b = new ProgramsScrollStarted();

        private ProgramsScrollStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ProgramsScrollStarted);
        }

        public final int hashCode() {
            return -1452112734;
        }

        @k
        public final String toString() {
            return "ProgramsScrollStarted";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ProgramsScrolled;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgramsScrolled implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f200202b;

        /* renamed from: c, reason: collision with root package name */
        public final int f200203c;

        public ProgramsScrolled(int i12, int i13) {
            this.f200202b = i12;
            this.f200203c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgramsScrolled)) {
                return false;
            }
            ProgramsScrolled programsScrolled = (ProgramsScrolled) obj;
            return this.f200202b == programsScrolled.f200202b && this.f200203c == programsScrolled.f200203c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f200203c) + (Integer.hashCode(this.f200202b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProgramsScrolled(firstVisibleItemPosition=");
            sb2.append(this.f200202b);
            sb2.append(", lastVisibleItemPosition=");
            return r.t(sb2, this.f200203c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$RequestAuthorization;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestAuthorization implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f200204b;

        /* JADX WARN: Multi-variable type inference failed */
        public RequestAuthorization() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestAuthorization) && L.f(this.f200204b, ((RequestAuthorization) obj).f200204b);
        }

        public final int hashCode() {
            ApiError apiError = this.f200204b;
            if (apiError == null) {
                return 0;
            }
            return apiError.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("RequestAuthorization(error="), this.f200204b, ')');
        }

        public RequestAuthorization(@l ApiError apiError) {
            this.f200204b = apiError;
        }

        public /* synthetic */ RequestAuthorization(ApiError apiError, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : apiError);
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ScreenClosed;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenClosed implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScreenClosed f200205b = new ScreenClosed();

        private ScreenClosed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScreenClosed);
        }

        public final int hashCode() {
            return -1295231365;
        }

        @k
        public final String toString() {
            return "ScreenClosed";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ScreenOpened;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenOpened implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScreenOpened f200206b = new ScreenOpened();

        private ScreenOpened() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScreenOpened);
        }

        public final int hashCode() {
            return -948290184;
        }

        @k
        public final String toString() {
            return "ScreenOpened";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ScreenScrolled;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenScrolled implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f200207b;

        /* renamed from: c, reason: collision with root package name */
        public final int f200208c;

        public ScreenScrolled(int i12, int i13) {
            this.f200207b = i12;
            this.f200208c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenScrolled)) {
                return false;
            }
            ScreenScrolled screenScrolled = (ScreenScrolled) obj;
            return this.f200207b == screenScrolled.f200207b && this.f200208c == screenScrolled.f200208c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f200208c) + (Integer.hashCode(this.f200207b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenScrolled(firstVisibleItemPosition=");
            sb2.append(this.f200207b);
            sb2.append(", lastVisibleItemPosition=");
            return r.t(sb2, this.f200208c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ScrollToOffersClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToOffersClicked implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f200209b;

        public ScrollToOffersClicked(int i12) {
            this.f200209b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToOffersClicked) && this.f200209b == ((ScrollToOffersClicked) obj).f200209b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f200209b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToOffersClicked(itemIndex="), this.f200209b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$SliderFilled;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SliderFilled implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200210b;

        /* renamed from: c, reason: collision with root package name */
        public final float f200211c;

        public SliderFilled(@k String str, float f12) {
            this.f200210b = str;
            this.f200211c = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SliderFilled)) {
                return false;
            }
            SliderFilled sliderFilled = (SliderFilled) obj;
            return L.f(this.f200210b, sliderFilled.f200210b) && Float.compare(this.f200211c, sliderFilled.f200211c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f200211c) + (this.f200210b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SliderFilled(fieldId=");
            sb2.append(this.f200210b);
            sb2.append(", value=");
            return r.k(')', this.f200211c, sb2);
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$SubmitLoadingFailed;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitLoadingFailed implements TrackableError, LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f200212b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f200213c;

        public SubmitLoadingFailed(@k ApiError apiError) {
            this.f200212b = apiError;
            this.f200213c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return "landing_submit";
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return "landing_submit";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitLoadingFailed) && L.f(this.f200212b, ((SubmitLoadingFailed) obj).f200212b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF174163b() {
            return this.f200213c;
        }

        public final int hashCode() {
            return this.f200212b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SubmitLoadingFailed(error="), this.f200212b, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$SubmitLoadingStarted;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SubmitLoadingStarted extends TrackableLoadingStarted implements LandingInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f200214d = "landing_submit";

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d, reason: from getter */
        public final String getF111994d() {
            return this.f200214d;
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$UpdateApplicationClicked;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateApplicationClicked implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateApplicationClicked f200215b = new UpdateApplicationClicked();

        private UpdateApplicationClicked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateApplicationClicked);
        }

        public final int hashCode() {
            return -632563101;
        }

        @k
        public final String toString() {
            return "UpdateApplicationClicked";
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ValueSelected;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValueSelected implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200216b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SelectItem.Option f200217c;

        public ValueSelected(@k String str, @k SelectItem.Option option) {
            this.f200216b = str;
            this.f200217c = option;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValueSelected)) {
                return false;
            }
            ValueSelected valueSelected = (ValueSelected) obj;
            return L.f(this.f200216b, valueSelected.f200216b) && L.f(this.f200217c, valueSelected.f200217c);
        }

        public final int hashCode() {
            return this.f200217c.hashCode() + (this.f200216b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ValueSelected(fieldId=" + this.f200216b + ", value=" + this.f200217c + ')';
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ValueUpdated;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValueUpdated implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200218b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f200219c;

        public ValueUpdated(@k String str, @k String str2) {
            this.f200218b = str;
            this.f200219c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValueUpdated)) {
                return false;
            }
            ValueUpdated valueUpdated = (ValueUpdated) obj;
            return L.f(this.f200218b, valueUpdated.f200218b) && L.f(this.f200219c, valueUpdated.f200219c);
        }

        public final int hashCode() {
            return this.f200219c.hashCode() + (this.f200218b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValueUpdated(fieldId=");
            sb2.append(this.f200218b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f200219c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ValueUpdatedByPredefined;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValueUpdatedByPredefined implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200220b;

        /* renamed from: c, reason: collision with root package name */
        public final int f200221c;

        public ValueUpdatedByPredefined(@k String str, int i12) {
            this.f200220b = str;
            this.f200221c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValueUpdatedByPredefined)) {
                return false;
            }
            ValueUpdatedByPredefined valueUpdatedByPredefined = (ValueUpdatedByPredefined) obj;
            return L.f(this.f200220b, valueUpdatedByPredefined.f200220b) && this.f200221c == valueUpdatedByPredefined.f200221c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f200221c) + (this.f200220b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValueUpdatedByPredefined(fieldId=");
            sb2.append(this.f200220b);
            sb2.append(", value=");
            return r.t(sb2, this.f200221c, ')');
        }
    }

    /* compiled from: LandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$ValueUpdatedBySlider;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValueUpdatedBySlider implements LandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f200222b;

        /* renamed from: c, reason: collision with root package name */
        public final float f200223c;

        public ValueUpdatedBySlider(@k String str, float f12) {
            this.f200222b = str;
            this.f200223c = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValueUpdatedBySlider)) {
                return false;
            }
            ValueUpdatedBySlider valueUpdatedBySlider = (ValueUpdatedBySlider) obj;
            return L.f(this.f200222b, valueUpdatedBySlider.f200222b) && Float.compare(this.f200223c, valueUpdatedBySlider.f200223c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f200223c) + (this.f200222b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ValueUpdatedBySlider(fieldId=");
            sb2.append(this.f200222b);
            sb2.append(", value=");
            return r.k(')', this.f200223c, sb2);
        }
    }
}
