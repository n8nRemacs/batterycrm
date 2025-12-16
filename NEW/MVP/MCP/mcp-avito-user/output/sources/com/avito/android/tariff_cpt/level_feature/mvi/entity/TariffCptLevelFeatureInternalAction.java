package com.avito.android.tariff_cpt.level_feature.mvi.entity;

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
import com.avito.android.tariff_cpt.level_feature.domain.TariffCptLevelFeatureContent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptLevelFeaturesInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Error", "FinishFlowWithDeepLink", "HandleDeeplink", "OpenScreen", "ProgressChange", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Close;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Error;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$OpenScreen;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$ProgressChange;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCptLevelFeatureInternalAction extends n {

    /* compiled from: TariffCptLevelFeaturesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Close;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TariffCptLevelFeatureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f298483b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 2091317951;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffCptLevelFeaturesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Error;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "OnScreenError", "ScreenError", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Error$OnScreenError;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Error$ScreenError;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error implements TariffCptLevelFeatureInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f298484b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f298485c;

        /* compiled from: TariffCptLevelFeaturesInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Error$OnScreenError;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Error;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OnScreenError extends Error {
        }

        /* compiled from: TariffCptLevelFeaturesInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Error$ScreenError;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$Error;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScreenError extends Error {
        }

        public Error(Throwable th2, C42822w c42822w) {
            this.f298484b = th2;
            this.f298485c = new J.a(th2);
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
        public final J.a getF257499c() {
            return this.f298485c;
        }
    }

    /* compiled from: TariffCptLevelFeaturesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlowWithDeepLink implements TariffCptLevelFeatureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f298486b;

        public FinishFlowWithDeepLink(@l DeepLink deepLink) {
            this.f298486b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishFlowWithDeepLink) && L.f(this.f298486b, ((FinishFlowWithDeepLink) obj).f298486b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f298486b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FinishFlowWithDeepLink(deeplink="), this.f298486b, ')');
        }
    }

    /* compiled from: TariffCptLevelFeaturesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffCptLevelFeatureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f298487b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f298487b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f298487b, ((HandleDeeplink) obj).f298487b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f298487b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f298487b, ')');
        }
    }

    /* compiled from: TariffCptLevelFeaturesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$OpenScreen;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenScreen implements TariffCptLevelFeatureInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TariffCptLevelFeatureContent f298488b;

        public OpenScreen(@k TariffCptLevelFeatureContent tariffCptLevelFeatureContent) {
            this.f298488b = tariffCptLevelFeatureContent;
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
            return (obj instanceof OpenScreen) && L.f(this.f298488b, ((OpenScreen) obj).f298488b);
        }

        public final int hashCode() {
            return this.f298488b.f298470b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenScreen(content=" + this.f298488b + ')';
        }
    }

    /* compiled from: TariffCptLevelFeaturesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction$ProgressChange;", "Lcom/avito/android/tariff_cpt/level_feature/mvi/entity/TariffCptLevelFeatureInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgressChange implements TariffCptLevelFeatureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f298489b;

        public ProgressChange(boolean z12) {
            this.f298489b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressChange) && this.f298489b == ((ProgressChange) obj).f298489b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f298489b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ProgressChange(isLoading="), this.f298489b, ')');
        }
    }
}
