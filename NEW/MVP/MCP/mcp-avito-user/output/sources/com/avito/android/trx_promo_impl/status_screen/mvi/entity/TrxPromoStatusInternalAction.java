package com.avito.android.trx_promo_impl.status_screen.mvi.entity;

import WF0.c;
import Y61.k;
import Y61.l;
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

/* compiled from: TrxPromoStatusInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Back", "Close", "Content", "Error", "HandleDeeplink", "Loading", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Back;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Close;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Content;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Error;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Loading;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TrxPromoStatusInternalAction extends n {

    /* compiled from: TrxPromoStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Back;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Back implements TrxPromoStatusInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Back f304460b = new Back();

        private Back() {
        }
    }

    /* compiled from: TrxPromoStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Close;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close implements TrxPromoStatusInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f304461b = new Close();

        private Close() {
        }
    }

    /* compiled from: TrxPromoStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Content;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Forbidden", "Success", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Content$Forbidden;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Content$Success;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Content extends TrxPromoStatusInternalAction, TrackableContent {

        /* compiled from: TrxPromoStatusInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Content$Forbidden;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Content;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Forbidden implements Content {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final c f304462b;

            public Forbidden(@k c cVar) {
                this.f304462b = cVar;
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
                return (obj instanceof Forbidden) && L.f(this.f304462b, ((Forbidden) obj).f304462b);
            }

            public final int hashCode() {
                return this.f304462b.hashCode();
            }

            @k
            public final String toString() {
                return "Forbidden(data=" + this.f304462b + ')';
            }
        }

        /* compiled from: TrxPromoStatusInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Content$Success;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Content;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success implements Content {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final XF0.c f304463b;

            public Success(@k XF0.c cVar) {
                this.f304463b = cVar;
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
                return (obj instanceof Success) && L.f(this.f304463b, ((Success) obj).f304463b);
            }

            public final int hashCode() {
                return this.f304463b.hashCode();
            }

            @k
            public final String toString() {
                return "Success(data=" + this.f304463b + ')';
            }
        }

        /* compiled from: TrxPromoStatusInternalAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }
    }

    /* compiled from: TrxPromoStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Error;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TrxPromoStatusInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f304464b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f304465c;

        public Error(@k ApiError apiError) {
            this.f304464b = apiError;
            this.f304465c = new J.a(apiError);
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
            return (obj instanceof Error) && L.f(this.f304464b, ((Error) obj).f304464b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF303848c() {
            return this.f304465c;
        }

        public final int hashCode() {
            return this.f304464b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f304464b, ')');
        }
    }

    /* compiled from: TrxPromoStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TrxPromoStatusInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f304466b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f304466b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f304466b, ((HandleDeeplink) obj).f304466b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f304466b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f304466b, ')');
        }
    }

    /* compiled from: TrxPromoStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TrxPromoStatusInternalAction {
    }
}
