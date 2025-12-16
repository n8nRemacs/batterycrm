package com.avito.android.tariff_select.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import cE0.C27030a;
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

/* compiled from: TariffSelectInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "Content", "Error", "HandleDeeplink", "Loading", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$Back;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$Content;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$Error;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$Loading;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TariffSelectInternalAction extends n {

    /* compiled from: TariffSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$Back;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "<init>", "()V", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Back implements TariffSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f301232b = new Back();

        private Back() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -148491705;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: TariffSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$Content;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TariffSelectInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C27030a f301233b;

        public Content(@k C27030a c27030a) {
            this.f301233b = c27030a;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof Content) && L.f(this.f301233b, ((Content) obj).f301233b);
        }

        public final int hashCode() {
            return this.f301233b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(result=" + this.f301233b + ')';
        }
    }

    /* compiled from: TariffSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$Error;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TariffSelectInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f301234b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f301235c;

        public Error(@k ApiException apiException) {
            this.f301234b = apiException;
            this.f301235c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF115373d() {
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
            return (obj instanceof Error) && this.f301234b.equals(((Error) obj).f301234b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF265582c() {
            return this.f301235c;
        }

        public final int hashCode() {
            return this.f301234b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f301234b, ')');
        }
    }

    /* compiled from: TariffSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$HandleDeeplink;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TariffSelectInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f301236b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f301236b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f301236b, ((HandleDeeplink) obj).f301236b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f301236b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f301236b, ')');
        }
    }

    /* compiled from: TariffSelectInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction$Loading;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TariffSelectInternalAction {
    }
}
