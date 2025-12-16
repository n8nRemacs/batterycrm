package com.avito.android.trx_promo_goods.screens.configure.mvi.entity;

import AK.c;
import JF0.e;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "Content", "FinishFlow", "HandleDeeplink", "InputChange", "Loading", "ResetChanges", "ScreenError", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$Close;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$Content;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$FinishFlow;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$InputChange;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$Loading;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$ResetChanges;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$ScreenError;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TrxPromoGoodsConfigureInternalAction extends n {

    /* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$Close;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements TrxPromoGoodsConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f303582b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1901177192;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$Content;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content implements TrxPromoGoodsConfigureInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e.b f303583b;

        public Content(@k e.b bVar) {
            this.f303583b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF213278d() {
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
            return (obj instanceof Content) && L.f(this.f303583b, ((Content) obj).f303583b);
        }

        public final int hashCode() {
            return this.f303583b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(data=" + this.f303583b + ')';
        }
    }

    /* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$FinishFlow;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishFlow implements TrxPromoGoodsConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishFlow f303584b = new FinishFlow();

        private FinishFlow() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishFlow);
        }

        public final int hashCode() {
            return -148476991;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$InputChange;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputChange implements TrxPromoGoodsConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Float f303588b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final LocalDate f303589c;

        public InputChange(@l Float f12, @l LocalDate localDate) {
            this.f303588b = f12;
            this.f303589c = localDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputChange)) {
                return false;
            }
            InputChange inputChange = (InputChange) obj;
            return L.f(this.f303588b, inputChange.f303588b) && L.f(this.f303589c, inputChange.f303589c);
        }

        public final int hashCode() {
            Float f12 = this.f303588b;
            int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
            LocalDate localDate = this.f303589c;
            return iHashCode + (localDate != null ? localDate.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputChange(commission=");
            sb2.append(this.f303588b);
            sb2.append(", date=");
            return c.t(sb2, this.f303589c, ')');
        }
    }

    /* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements TrxPromoGoodsConfigureInternalAction {
    }

    /* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$ResetChanges;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetChanges implements TrxPromoGoodsConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetChanges f303590b = new ResetChanges();

        private ResetChanges() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetChanges);
        }

        public final int hashCode() {
            return 1079814612;
        }

        @k
        public final String toString() {
            return "ResetChanges";
        }
    }

    /* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$ScreenError;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenError implements TrxPromoGoodsConfigureInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f303591b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f303592c;

        public ScreenError(@k ApiException apiException) {
            this.f303591b = apiException;
            this.f303592c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF213278d() {
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
            return (obj instanceof ScreenError) && this.f303591b.equals(((ScreenError) obj).f303591b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF299836c() {
            return this.f303592c;
        }

        public final int hashCode() {
            return this.f303591b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ScreenError(error="), this.f303591b, ')');
        }
    }

    /* compiled from: TrxPromoGoodsConfigureInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction$HandleDeeplink;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements TrxPromoGoodsConfigureInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f303585b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f303586c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f303587d;

        public HandleDeeplink(@k DeepLink deepLink, @l Integer num, @l String str) {
            this.f303585b = deepLink;
            this.f303586c = num;
            this.f303587d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f303585b, handleDeeplink.f303585b) && L.f(this.f303586c, handleDeeplink.f303586c) && L.f(this.f303587d, handleDeeplink.f303587d);
        }

        public final int hashCode() {
            int iHashCode = this.f303585b.hashCode() * 31;
            Integer num = this.f303586c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f303587d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f303585b);
            sb2.append(", commission=");
            sb2.append(this.f303586c);
            sb2.append(", date=");
            return C22026a.c(sb2, this.f303587d, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, Integer num, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : str);
        }
    }
}
