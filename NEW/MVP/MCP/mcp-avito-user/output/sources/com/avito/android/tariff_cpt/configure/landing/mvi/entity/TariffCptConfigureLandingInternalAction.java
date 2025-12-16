package com.avito.android.tariff_cpt.configure.landing.mvi.entity;

import AK.c;
import KC0.d;
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
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCptConfigureLandingInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "Content", "Error", "HandleDeeplink", "Loading", "Redirect", "ShowButtonProgress", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Back;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Content;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Error;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Loading;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Redirect;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$ShowButtonProgress;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCptConfigureLandingInternalAction extends n {

    /* compiled from: TariffCptConfigureLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Back;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements TariffCptConfigureLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f297775b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1149401931;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: TariffCptConfigureLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Content;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffCptConfigureLandingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d.b f297776b;

        public Content(@k d.b bVar) {
            this.f297776b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF120323d() {
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
            return (obj instanceof Content) && L.f(this.f297776b, ((Content) obj).f297776b);
        }

        public final int hashCode() {
            return this.f297776b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f297776b + ')';
        }
    }

    /* compiled from: TariffCptConfigureLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Error;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TariffCptConfigureLandingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f297777b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f297778c;

        public Error(@k ApiException apiException) {
            this.f297777b = apiException;
            this.f297778c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF120323d() {
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
            return (obj instanceof Error) && this.f297777b.equals(((Error) obj).f297777b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF120321c() {
            return this.f297778c;
        }

        public final int hashCode() {
            return this.f297777b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(throwable="), this.f297777b, ')');
        }
    }

    /* compiled from: TariffCptConfigureLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffCptConfigureLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f297779b;

        public HandleDeeplink(@k DeepLink deepLink) {
            this.f297779b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f297779b, ((HandleDeeplink) obj).f297779b);
        }

        public final int hashCode() {
            return this.f297779b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f297779b, ')');
        }
    }

    /* compiled from: TariffCptConfigureLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Loading;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TariffCptConfigureLandingInternalAction {
    }

    /* compiled from: TariffCptConfigureLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$Redirect;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Redirect implements TariffCptConfigureLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d.a f297780b;

        public Redirect(@k d.a aVar) {
            this.f297780b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Redirect) && L.f(this.f297780b, ((Redirect) obj).f297780b);
        }

        public final int hashCode() {
            return this.f297780b.hashCode();
        }

        @k
        public final String toString() {
            return "Redirect(action=" + this.f297780b + ')';
        }
    }

    /* compiled from: TariffCptConfigureLandingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction$ShowButtonProgress;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowButtonProgress implements TariffCptConfigureLandingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f297781b;

        public ShowButtonProgress(boolean z12) {
            this.f297781b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowButtonProgress) && this.f297781b == ((ShowButtonProgress) obj).f297781b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f297781b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowButtonProgress(isShow="), this.f297781b, ')');
        }
    }
}
