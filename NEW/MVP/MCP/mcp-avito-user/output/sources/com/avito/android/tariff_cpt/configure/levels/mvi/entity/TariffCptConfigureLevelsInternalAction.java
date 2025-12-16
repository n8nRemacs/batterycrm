package com.avito.android.tariff_cpt.configure.levels.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import vC0.g;

/* compiled from: TariffCptConfigureLevelsInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "Error", "FinishFlowWithDeepLink", "HandleDeeplink", "Loading", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Close;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Content;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Error;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCptConfigureLevelsInternalAction extends n {

    /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Close;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TariffCptConfigureLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f297894b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 195002188;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Content;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffCptConfigureLevelsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f297895b;

        public Content(@k g gVar) {
            this.f297895b = gVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof Content) && L.f(this.f297895b, ((Content) obj).f297895b);
        }

        public final int hashCode() {
            return this.f297895b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(response=" + this.f297895b + ')';
        }
    }

    /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Error;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TariffCptConfigureLevelsInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f297896b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f297897c;

        public Error(@k ApiException apiException) {
            this.f297896b = apiException;
            this.f297897c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF294761d() {
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
            return (obj instanceof Error) && this.f297896b.equals(((Error) obj).f297896b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF294759c() {
            return this.f297897c;
        }

        public final int hashCode() {
            return this.f297896b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f297896b, ')');
        }
    }

    /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$FinishFlowWithDeepLink;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlowWithDeepLink implements TariffCptConfigureLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f297898b;

        public FinishFlowWithDeepLink(@k DeepLink deepLink) {
            this.f297898b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FinishFlowWithDeepLink) && L.f(this.f297898b, ((FinishFlowWithDeepLink) obj).f297898b);
        }

        public final int hashCode() {
            return this.f297898b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FinishFlowWithDeepLink(deeplink="), this.f297898b, ')');
        }
    }

    /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "LevelButtonLoading", "NextButtonLoading", "ScreenLoading", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading$LevelButtonLoading;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading$NextButtonLoading;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading$ScreenLoading;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Loading extends TariffCptConfigureLevelsInternalAction {

        /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading$LevelButtonLoading;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LevelButtonLoading implements Loading {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f297901b;

            /* renamed from: c, reason: collision with root package name */
            public final long f297902c;

            public LevelButtonLoading(boolean z12, long j12) {
                this.f297901b = z12;
                this.f297902c = j12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LevelButtonLoading)) {
                    return false;
                }
                LevelButtonLoading levelButtonLoading = (LevelButtonLoading) obj;
                return this.f297901b == levelButtonLoading.f297901b && this.f297902c == levelButtonLoading.f297902c;
            }

            public final int hashCode() {
                return Long.hashCode(this.f297902c) + (Boolean.hashCode(this.f297901b) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("LevelButtonLoading(isLoading=");
                sb2.append(this.f297901b);
                sb2.append(", levelCardId=");
                return r.u(sb2, this.f297902c, ')');
            }
        }

        /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading$NextButtonLoading;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NextButtonLoading implements Loading {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f297903b;

            public NextButtonLoading(boolean z12) {
                this.f297903b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NextButtonLoading) && this.f297903b == ((NextButtonLoading) obj).f297903b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f297903b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("NextButtonLoading(isLoading="), this.f297903b, ')');
            }
        }

        /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading$ScreenLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$Loading;", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScreenLoading extends TrackableLoadingStarted implements Loading {
        }
    }

    /* compiled from: TariffCptConfigureLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffCptConfigureLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f297899b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f297900c;

        public HandleDeeplink(@l DeepLink deepLink, @l Bundle bundle) {
            this.f297899b = deepLink;
            this.f297900c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f297899b, handleDeeplink.f297899b) && L.f(this.f297900c, handleDeeplink.f297900c);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f297899b;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            Bundle bundle = this.f297900c;
            return iHashCode + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f297899b);
            sb2.append(", bundle=");
            return H.m(sb2, this.f297900c, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }
}
