package com.avito.android.tariff.cpx.info.mvi.entity;

import UB0.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "ChangeFeatureGroups", "Close", "Content", "Error", "HandleDeeplink", "Loading", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Back;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$ChangeFeatureGroups;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Close;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Content;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Error;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Loading;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffCpxInfoInternalAction extends n {

    /* compiled from: TariffCpxInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Back;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Back implements TariffCpxInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f296711b = new Back();

        private Back() {
        }
    }

    /* compiled from: TariffCpxInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$ChangeFeatureGroups;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeFeatureGroups implements TariffCpxInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f296712b;

        public ChangeFeatureGroups(@l String str) {
            this.f296712b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeFeatureGroups) && L.f(this.f296712b, ((ChangeFeatureGroups) obj).f296712b);
        }

        public final int hashCode() {
            String str = this.f296712b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeFeatureGroups(groupSlug="), this.f296712b, ')');
        }
    }

    /* compiled from: TariffCpxInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Close;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements TariffCpxInfoInternalAction {
        static {
            new Close();
        }

        private Close() {
        }
    }

    /* compiled from: TariffCpxInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Content;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffCpxInfoInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c f296713b;

        public Content(@k c cVar) {
            this.f296713b = cVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
            return (obj instanceof Content) && L.f(this.f296713b, ((Content) obj).f296713b);
        }

        public final int hashCode() {
            return this.f296713b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f296713b + ')';
        }
    }

    /* compiled from: TariffCpxInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Error;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "OnScreenError", "ScreenError", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Error$OnScreenError;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Error$ScreenError;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error implements TariffCpxInfoInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f296714b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f296715c;

        /* compiled from: TariffCpxInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Error$OnScreenError;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Error;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OnScreenError extends Error {
        }

        /* compiled from: TariffCpxInfoInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Error$ScreenError;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Error;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ScreenError extends Error {
        }

        public Error(ApiError apiError, C42822w c42822w) {
            this.f296714b = apiError;
            this.f296715c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
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
        public final J.a getF278764b() {
            return this.f296715c;
        }
    }

    /* compiled from: TariffCpxInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffCpxInfoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f296716b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f296716b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f296716b, ((HandleDeeplink) obj).f296716b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f296716b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f296716b, ')');
        }
    }

    /* compiled from: TariffCpxInfoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction$Loading;", "Lcom/avito/android/tariff/cpx/info/mvi/entity/TariffCpxInfoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TariffCpxInfoInternalAction {
    }
}
