package com.avito.android.tariff.cpx.level.feature.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.tariff.cpx.level.feature.domain.TariffCpxLevelFeatureContent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxLevelFeatureInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Error", "FinishFlowWithDeepLink", "HandleDeeplink", "OpenScreen", "ProgressChange", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Close;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Error;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$OpenScreen;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$ProgressChange;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCpxLevelFeatureInternalAction extends n {

    /* compiled from: TariffCpxLevelFeatureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Close;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements TariffCpxLevelFeatureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f296985b = new Close();

        private Close() {
        }
    }

    /* compiled from: TariffCpxLevelFeatureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Error;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "OnScreenError", "ScreenError", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Error$OnScreenError;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Error$ScreenError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error implements TariffCpxLevelFeatureInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f296986b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f296987c;

        /* compiled from: TariffCpxLevelFeatureInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Error$OnScreenError;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Error;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OnScreenError extends Error {
        }

        /* compiled from: TariffCpxLevelFeatureInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Error$ScreenError;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$Error;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScreenError extends Error {
        }

        public Error(ApiError apiError, C42822w c42822w) {
            this.f296986b = apiError;
            this.f296987c = new J.a(apiError);
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

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF278452c() {
            return this.f296987c;
        }
    }

    /* compiled from: TariffCpxLevelFeatureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlowWithDeepLink implements TariffCpxLevelFeatureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f296988b;

        public FinishFlowWithDeepLink(@l DeepLink deepLink) {
            this.f296988b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishFlowWithDeepLink) && L.f(this.f296988b, ((FinishFlowWithDeepLink) obj).f296988b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f296988b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FinishFlowWithDeepLink(deepLink="), this.f296988b, ')');
        }
    }

    /* compiled from: TariffCpxLevelFeatureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffCpxLevelFeatureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f296989b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f296989b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f296989b, ((HandleDeeplink) obj).f296989b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f296989b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f296989b, ')');
        }
    }

    /* compiled from: TariffCpxLevelFeatureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$OpenScreen;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScreen implements TariffCpxLevelFeatureInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TariffCpxLevelFeatureContent f296990b;

        public OpenScreen(@k TariffCpxLevelFeatureContent tariffCpxLevelFeatureContent) {
            this.f296990b = tariffCpxLevelFeatureContent;
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
            return (obj instanceof OpenScreen) && L.f(this.f296990b, ((OpenScreen) obj).f296990b);
        }

        public final int hashCode() {
            return this.f296990b.f296972b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(content=" + this.f296990b + ')';
        }
    }

    /* compiled from: TariffCpxLevelFeatureInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction$ProgressChange;", "Lcom/avito/android/tariff/cpx/level/feature/mvi/entity/TariffCpxLevelFeatureInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgressChange implements TariffCpxLevelFeatureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f296991b;

        public ProgressChange(boolean z12) {
            this.f296991b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressChange) && this.f296991b == ((ProgressChange) obj).f296991b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f296991b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ProgressChange(isLoading="), this.f296991b, ')');
        }
    }
}
