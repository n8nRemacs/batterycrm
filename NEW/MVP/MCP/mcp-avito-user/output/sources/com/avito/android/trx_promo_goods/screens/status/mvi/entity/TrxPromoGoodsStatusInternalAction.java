package com.avito.android.trx_promo_goods.screens.status.mvi.entity;

import AK.c;
import JF0.g;
import Y61.k;
import Y61.l;
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

/* compiled from: TrxPromoGoodsStatusInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "Error", "FinishFlow", "HandleDeeplink", "Loading", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$Close;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$Content;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$Error;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$FinishFlow;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$Loading;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TrxPromoGoodsStatusInternalAction extends n {

    /* compiled from: TrxPromoGoodsStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$Close;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TrxPromoGoodsStatusInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f303845b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1498203696;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TrxPromoGoodsStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$Content;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TrxPromoGoodsStatusInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final g f303846b;

        public Content(@k g gVar) {
            this.f303846b = gVar;
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
            return (obj instanceof Content) && L.f(this.f303846b, ((Content) obj).f303846b);
        }

        public final int hashCode() {
            return this.f303846b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f303846b + ')';
        }
    }

    /* compiled from: TrxPromoGoodsStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$Error;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements TrxPromoGoodsStatusInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f303847b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f303848c;

        public Error(@k ApiException apiException) {
            this.f303847b = apiException;
            this.f303848c = new J.a(apiException);
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
            return (obj instanceof Error) && this.f303847b.equals(((Error) obj).f303847b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF301235c() {
            return this.f303848c;
        }

        public final int hashCode() {
            return this.f303847b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("Error(error="), this.f303847b, ')');
        }
    }

    /* compiled from: TrxPromoGoodsStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$FinishFlow;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements TrxPromoGoodsStatusInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f303849b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return -1936327895;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: TrxPromoGoodsStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TrxPromoGoodsStatusInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f303850b;

        public HandleDeeplink(@l DeepLink deepLink) {
            this.f303850b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleDeeplink) && L.f(this.f303850b, ((HandleDeeplink) obj).f303850b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f303850b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f303850b, ')');
        }
    }

    /* compiled from: TrxPromoGoodsStatusInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TrxPromoGoodsStatusInternalAction {
    }
}
