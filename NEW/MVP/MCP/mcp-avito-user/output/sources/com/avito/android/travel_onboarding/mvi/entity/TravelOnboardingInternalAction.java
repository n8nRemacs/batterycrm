package com.avito.android.travel_onboarding.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import YE0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "Init", "LoadingComplete", "LoadingError", "LoadingStarted", "OpenAuthWithRedirectDeeplink", "OpenDeeplink", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$CloseScreen;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$Init;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$LoadingComplete;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$LoadingError;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$LoadingStarted;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$OpenAuthWithRedirectDeeplink;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$OpenDeeplink;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TravelOnboardingInternalAction extends n {

    /* compiled from: TravelOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$CloseScreen;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements TravelOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f302306b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -72003678;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: TravelOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$Init;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements TravelOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f302307b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f302308c;

        public Init(@k String str, @k DeepLink deepLink) {
            this.f302307b = str;
            this.f302308c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f302307b, init.f302307b) && L.f(this.f302308c, init.f302308c);
        }

        public final int hashCode() {
            return this.f302308c.hashCode() + (this.f302307b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(onboardingId=");
            sb2.append(this.f302307b);
            sb2.append(", onboardingDeeplink=");
            return a.v(sb2, this.f302308c, ')');
        }
    }

    /* compiled from: TravelOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$LoadingComplete;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingComplete implements TravelOnboardingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f302309b;

        public LoadingComplete(@k b bVar) {
            this.f302309b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof LoadingComplete) && L.f(this.f302309b, ((LoadingComplete) obj).f302309b);
        }

        public final int hashCode() {
            return this.f302309b.hashCode();
        }

        @k
        public final String toString() {
            return "LoadingComplete(blocksInfo=" + this.f302309b + ')';
        }
    }

    /* compiled from: TravelOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$LoadingError;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements TravelOnboardingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f302310b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f302311c;

        public LoadingError(@k ApiError apiError) {
            this.f302310b = apiError;
            J.a.f90383b.getClass();
            this.f302311c = J.a.C2676a.b(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF198624d() {
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
            return (obj instanceof LoadingError) && L.f(this.f302310b, ((LoadingError) obj).f302310b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF296987c() {
            return this.f302311c;
        }

        public final int hashCode() {
            return this.f302310b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(apiError="), this.f302310b, ')');
        }
    }

    /* compiled from: TravelOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$LoadingStarted;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingStarted extends TrackableLoadingStarted implements TravelOnboardingInternalAction {
    }

    /* compiled from: TravelOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$OpenAuthWithRedirectDeeplink;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAuthWithRedirectDeeplink implements TravelOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f302312b;

        public OpenAuthWithRedirectDeeplink(@k DeepLink deepLink) {
            this.f302312b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAuthWithRedirectDeeplink) && L.f(this.f302312b, ((OpenAuthWithRedirectDeeplink) obj).f302312b);
        }

        public final int hashCode() {
            return this.f302312b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenAuthWithRedirectDeeplink(redirectDeeplink="), this.f302312b, ')');
        }
    }

    /* compiled from: TravelOnboardingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction$OpenDeeplink;", "Lcom/avito/android/travel_onboarding/mvi/entity/TravelOnboardingInternalAction;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements TravelOnboardingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f302313b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f302313b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f302313b, ((OpenDeeplink) obj).f302313b);
        }

        public final int hashCode() {
            return this.f302313b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f302313b, ')');
        }
    }
}
