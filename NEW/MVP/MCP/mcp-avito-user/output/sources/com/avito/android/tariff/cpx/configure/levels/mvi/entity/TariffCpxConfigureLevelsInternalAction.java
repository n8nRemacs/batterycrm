package com.avito.android.tariff.cpx.configure.levels.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import eC0.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "Error", "FinishFlowWithDeepLink", "HandleDeeplink", "Loading", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Close;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Content;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Error;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCpxConfigureLevelsInternalAction extends n {

    /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Close;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements TariffCpxConfigureLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f296208b = new Close();

        private Close() {
        }
    }

    /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Content;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffCpxConfigureLevelsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final r f296209b;

        public Content(@k r rVar) {
            this.f296209b = rVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Content) && L.f(this.f296209b, ((Content) obj).f296209b);
        }

        public final int hashCode() {
            return this.f296209b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f296209b + ')';
        }
    }

    /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Error;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TariffCpxConfigureLevelsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f296210b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f296211c;

        public Error(@k ApiError apiError) {
            this.f296210b = apiError;
            this.f296211c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF288444d() {
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
            return (obj instanceof Error) && L.f(this.f296210b, ((Error) obj).f296210b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF295421c() {
            return this.f296211c;
        }

        public final int hashCode() {
            return this.f296210b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("Error(error="), this.f296210b, ')');
        }
    }

    /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlowWithDeepLink implements TariffCpxConfigureLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f296212b;

        public FinishFlowWithDeepLink(@l DeepLink deepLink) {
            this.f296212b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishFlowWithDeepLink) && L.f(this.f296212b, ((FinishFlowWithDeepLink) obj).f296212b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f296212b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FinishFlowWithDeepLink(deepLink="), this.f296212b, ')');
        }
    }

    /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "LevelButtonLoading", "NextButtonLoading", "ScreenLoading", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading$LevelButtonLoading;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading$NextButtonLoading;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading$ScreenLoading;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Loading extends TariffCpxConfigureLevelsInternalAction {

        /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading$LevelButtonLoading;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LevelButtonLoading implements Loading {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f296215b;

            /* renamed from: c, reason: collision with root package name */
            public final long f296216c;

            public LevelButtonLoading(boolean z12, long j12) {
                this.f296215b = z12;
                this.f296216c = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LevelButtonLoading)) {
                    return false;
                }
                LevelButtonLoading levelButtonLoading = (LevelButtonLoading) obj;
                return this.f296215b == levelButtonLoading.f296215b && this.f296216c == levelButtonLoading.f296216c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f296216c) + (Boolean.hashCode(this.f296215b) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LevelButtonLoading(isLoading=");
                sb2.append(this.f296215b);
                sb2.append(", levelCardId=");
                return androidx.appcompat.app.r.u(sb2, this.f296216c, ')');
            }
        }

        /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading$NextButtonLoading;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NextButtonLoading implements Loading {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f296217b;

            public NextButtonLoading(boolean z12) {
                this.f296217b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NextButtonLoading) && this.f296217b == ((NextButtonLoading) obj).f296217b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f296217b);
            }

            @k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("NextButtonLoading(isLoading="), this.f296217b, ')');
            }
        }

        /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading$ScreenLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$Loading;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScreenLoading extends TrackableLoadingStarted implements Loading {
        }
    }

    /* compiled from: TariffCpxConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/configure/levels/mvi/entity/TariffCpxConfigureLevelsInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffCpxConfigureLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f296213b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f296214c;

        public HandleDeeplink(@l DeepLink deepLink, @l Bundle bundle) {
            this.f296213b = deepLink;
            this.f296214c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f296213b, handleDeeplink.f296213b) && L.f(this.f296214c, handleDeeplink.f296214c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f296213b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Bundle bundle = this.f296214c;
            return iHashCode + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deepLink=");
            sb2.append(this.f296213b);
            sb2.append(", bundle=");
            return H.m(sb2, this.f296214c, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }
}
