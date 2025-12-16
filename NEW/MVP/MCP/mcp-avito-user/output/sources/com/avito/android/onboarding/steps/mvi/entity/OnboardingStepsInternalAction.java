package com.avito.android.onboarding.steps.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.OnboardingStepsResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingStepsInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "OnPageSelected", "ShowError", "ShowLoadedPage", "ShowLoading", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$CloseScreen;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$OnPageSelected;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$ShowError;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$ShowLoadedPage;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$ShowLoading;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface OnboardingStepsInternalAction extends n {

    /* compiled from: OnboardingStepsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$CloseScreen;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements OnboardingStepsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f209336b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 1215917479;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: OnboardingStepsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$OnPageSelected;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPageSelected implements OnboardingStepsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f209337b;

        public OnPageSelected(int i12) {
            this.f209337b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPageSelected) && this.f209337b == ((OnPageSelected) obj).f209337b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f209337b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnPageSelected(page="), this.f209337b, ')');
        }
    }

    /* compiled from: OnboardingStepsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$ShowError;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements OnboardingStepsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f209338b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f209339c;

        public ShowError(@k ApiError apiError) {
            this.f209338b = apiError;
            this.f209339c = new J.a(apiError);
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
            return (obj instanceof ShowError) && L.f(this.f209338b, ((ShowError) obj).f209338b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF200426c() {
            return this.f209339c;
        }

        public final int hashCode() {
            return this.f209338b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ShowError(error="), this.f209338b, ')');
        }
    }

    /* compiled from: OnboardingStepsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$ShowLoadedPage;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadedPage implements OnboardingStepsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final OnboardingStepsResult f209340b;

        public ShowLoadedPage(@k OnboardingStepsResult onboardingStepsResult) {
            this.f209340b = onboardingStepsResult;
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
            return (obj instanceof ShowLoadedPage) && L.f(this.f209340b, ((ShowLoadedPage) obj).f209340b);
        }

        public final int hashCode() {
            return this.f209340b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowLoadedPage(data=" + this.f209340b + ')';
        }
    }

    /* compiled from: OnboardingStepsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction$ShowLoading;", "Lcom/avito/android/onboarding/steps/mvi/entity/OnboardingStepsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading extends TrackableLoadingStarted implements OnboardingStepsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f209341d;

        public ShowLoading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLoading) && L.f(this.f209341d, ((ShowLoading) obj).f209341d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f209341d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("ShowLoading(stub="), this.f209341d, ')');
        }

        public ShowLoading(G0 g02, int i12, C42822w c42822w) {
            this.f209341d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }
}
