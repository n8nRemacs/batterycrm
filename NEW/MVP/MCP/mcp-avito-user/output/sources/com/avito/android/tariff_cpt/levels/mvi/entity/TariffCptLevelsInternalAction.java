package com.avito.android.tariff_cpt.levels.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.chips.h;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import xC0.f;

/* compiled from: TariffCptLevelsInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseWithResult", "Content", "Error", "HandleDeeplink", "LevelSelect", "Loading", "ProgressChanged", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$CloseWithResult;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$Content;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$Error;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$LevelSelect;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$Loading;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$ProgressChanged;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCptLevelsInternalAction extends n {

    /* compiled from: TariffCptLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$CloseWithResult;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithResult implements TariffCptLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f298639b;

        public CloseWithResult(@l DeepLink deepLink) {
            this.f298639b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWithResult) && L.f(this.f298639b, ((CloseWithResult) obj).f298639b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f298639b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("CloseWithResult(deeplink="), this.f298639b, ')');
        }
    }

    /* compiled from: TariffCptLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$Content;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TrackableContent, TariffCptLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f298640b;

        public Content(@k f fVar) {
            this.f298640b = fVar;
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
            return (obj instanceof Content) && L.f(this.f298640b, ((Content) obj).f298640b);
        }

        public final int hashCode() {
            return this.f298640b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(response=" + this.f298640b + ')';
        }
    }

    /* compiled from: TariffCptLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$Error;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TrackableError, TariffCptLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f298641b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f298642c;

        public Error(@k ApiException apiException) {
            this.f298641b = apiException;
            this.f298642c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f298641b.equals(((Error) obj).f298641b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF248721e() {
            return this.f298642c;
        }

        public final int hashCode() {
            return this.f298641b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f298641b, ')');
        }
    }

    /* compiled from: TariffCptLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffCptLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f298643b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f298643b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f298643b, ((HandleDeeplink) obj).f298643b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f298643b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f298643b, ')');
        }
    }

    /* compiled from: TariffCptLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$LevelSelect;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LevelSelect implements TariffCptLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final h f298644b;

        public LevelSelect(@k h hVar) {
            this.f298644b = hVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LevelSelect) && L.f(this.f298644b, ((LevelSelect) obj).f298644b);
        }

        public final int hashCode() {
            return this.f298644b.hashCode();
        }

        @k
        public final String toString() {
            return "LevelSelect(level=" + this.f298644b + ')';
        }
    }

    /* compiled from: TariffCptLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TariffCptLevelsInternalAction {
    }

    /* compiled from: TariffCptLevelsInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction$ProgressChanged;", "Lcom/avito/android/tariff_cpt/levels/mvi/entity/TariffCptLevelsInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProgressChanged implements TariffCptLevelsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f298645b;

        public ProgressChanged(boolean z12) {
            this.f298645b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProgressChanged) && this.f298645b == ((ProgressChanged) obj).f298645b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f298645b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ProgressChanged(isLoading="), this.f298645b, ')');
        }
    }
}
