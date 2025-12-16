package com.avito.android.services_onboarding.mvi.entity;

import Y61.k;
import Y61.l;
import Zu0.c;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServicesOnboardingInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "LoadContentFirstTime", "Loading", "OpenDeeplink", "RestoreStep", "ShowError", "SwipeToNextPage", "VisiblePositionChanged", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$LoadContentFirstTime;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$Loading;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$OpenDeeplink;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$RestoreStep;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$ShowError;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$SwipeToNextPage;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$VisiblePositionChanged;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServicesOnboardingInternalAction extends n {

    /* compiled from: ServicesOnboardingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$LoadContentFirstTime;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadContentFirstTime implements ServicesOnboardingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f279943b;

        public LoadContentFirstTime(@k c cVar) {
            this.f279943b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadContentFirstTime) && L.f(this.f279943b, ((LoadContentFirstTime) obj).f279943b);
        }

        public final int hashCode() {
            return this.f279943b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadContentFirstTime(state=" + this.f279943b + ')';
        }
    }

    /* compiled from: ServicesOnboardingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "()V", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements ServicesOnboardingInternalAction {
    }

    /* compiled from: ServicesOnboardingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$OpenDeeplink;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenDeeplink implements ServicesOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f279944b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f279944b = deepLink;
        }
    }

    /* compiled from: ServicesOnboardingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$RestoreStep;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RestoreStep implements ServicesOnboardingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        public final int f279945b;

        public RestoreStep(int i12) {
            this.f279945b = i12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestoreStep) && this.f279945b == ((RestoreStep) obj).f279945b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f279945b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("RestoreStep(step="), this.f279945b, ')');
        }
    }

    /* compiled from: ServicesOnboardingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$ShowError;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements ServicesOnboardingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f279946b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f279947c;

        public ShowError(@k ApiError apiError) {
            this.f279946b = apiError;
            this.f279947c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF211967d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f279946b, ((ShowError) obj).f279946b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF211965c() {
            return this.f279947c;
        }

        public final int hashCode() {
            return this.f279946b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowError(error="), this.f279946b, ')');
        }
    }

    /* compiled from: ServicesOnboardingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$SwipeToNextPage;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "()V", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SwipeToNextPage implements ServicesOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SwipeToNextPage f279948b = new SwipeToNextPage();

        private SwipeToNextPage() {
        }
    }

    /* compiled from: ServicesOnboardingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction$VisiblePositionChanged;", "Lcom/avito/android/services_onboarding/mvi/entity/ServicesOnboardingInternalAction;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VisiblePositionChanged implements ServicesOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f279949b;

        public VisiblePositionChanged(int i12) {
            this.f279949b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VisiblePositionChanged) && this.f279949b == ((VisiblePositionChanged) obj).f279949b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f279949b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("VisiblePositionChanged(newVisiblePosition="), this.f279949b, ')');
        }
    }
}
