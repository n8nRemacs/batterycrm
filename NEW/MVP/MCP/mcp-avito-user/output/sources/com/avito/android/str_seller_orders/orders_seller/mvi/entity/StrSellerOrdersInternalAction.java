package com.avito.android.str_seller_orders.orders_seller.mvi.entity;

import AK.c;
import SK0.f;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import com.avito.android.util.ApiException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import sz0.AbstractC48441b;
import sz0.C48445f;

/* compiled from: StrSellerOrdersInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BannerLoaded", "BannerLoading", "BannerLoadingError", "CloseScreen", "ContentError", "ContentLoaded", "ContentLoading", "Init", "OpenDeeplink", "OpenFilters", "UpdateFilters", "UxInfoLoadingComplete", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$BannerLoaded;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$BannerLoading;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$BannerLoadingError;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$ContentError;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$ContentLoaded;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$ContentLoading;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$Init;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$OpenDeeplink;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$OpenFilters;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$UpdateFilters;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$UxInfoLoadingComplete;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrSellerOrdersInternalAction extends n {

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$BannerLoaded;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerLoaded implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BF0.a f289559b;

        public BannerLoaded(@l BF0.a aVar) {
            this.f289559b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerLoaded) && L.f(this.f289559b, ((BannerLoaded) obj).f289559b);
        }

        public final int hashCode() {
            BF0.a aVar = this.f289559b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "BannerLoaded(banner=" + this.f289559b + ')';
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$BannerLoading;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerLoading implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BannerLoading f289560b = new BannerLoading();

        private BannerLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BannerLoading);
        }

        public final int hashCode() {
            return -953115676;
        }

        @k
        public final String toString() {
            return "BannerLoading";
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$BannerLoadingError;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerLoadingError implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BannerLoadingError f289561b = new BannerLoadingError();

        private BannerLoadingError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BannerLoadingError);
        }

        public final int hashCode() {
            return 1057690756;
        }

        @k
        public final String toString() {
            return "BannerLoadingError";
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f289562b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return 601508088;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$ContentError;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements StrSellerOrdersInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiException f289563b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f289564c;

        public ContentError(@k ApiException apiException) {
            this.f289563b = apiException;
            this.f289564c = new J.a(apiException);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return (obj instanceof ContentError) && this.f289563b.equals(((ContentError) obj).f289563b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF221518d() {
            return this.f289564c;
        }

        public final int hashCode() {
            return this.f289563b.hashCode();
        }

        @k
        public final String toString() {
            return c.q(new StringBuilder("ContentError(error="), this.f289563b, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$ContentLoaded;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements StrSellerOrdersInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C48445f f289565b;

        public ContentLoaded(@k C48445f c48445f) {
            this.f289565b = c48445f;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF221519d() {
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
            return (obj instanceof ContentLoaded) && L.f(this.f289565b, ((ContentLoaded) obj).f289565b);
        }

        public final int hashCode() {
            return this.f289565b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(data=" + this.f289565b + ')';
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$ContentLoading;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoading extends TrackableLoadingStarted implements StrSellerOrdersInternalAction {

        /* renamed from: d, reason: collision with root package name */
        public final boolean f289566d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f289567e;

        public ContentLoading(boolean z12, boolean z13) {
            this.f289566d = z12;
            this.f289567e = z13;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLoading)) {
                return false;
            }
            ContentLoading contentLoading = (ContentLoading) obj;
            return this.f289566d == contentLoading.f289566d && this.f289567e == contentLoading.f289567e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return Boolean.hashCode(this.f289567e) + (Boolean.hashCode(this.f289566d) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoading(isInitial=");
            sb2.append(this.f289566d);
            sb2.append(", isSilent=");
            return r.x(sb2, this.f289567e, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$Init;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f289568b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, String> f289569c;

        public Init(boolean z12, @k Map<String, String> map) {
            this.f289568b = z12;
            this.f289569c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return this.f289568b == init.f289568b && L.f(this.f289569c, init.f289569c);
        }

        public final int hashCode() {
            return this.f289569c.hashCode() + (Boolean.hashCode(this.f289568b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(isToolbarVisible=");
            sb2.append(this.f289568b);
            sb2.append(", sellerFilters=");
            return r.w(sb2, this.f289569c, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$OpenDeeplink;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f289570b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f289570b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f289570b, ((OpenDeeplink) obj).f289570b);
        }

        public final int hashCode() {
            return this.f289570b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f289570b, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$OpenFilters;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFilters implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrOrdersFiltersOpenParams f289571b;

        public OpenFilters(@k StrOrdersFiltersOpenParams strOrdersFiltersOpenParams) {
            this.f289571b = strOrdersFiltersOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenFilters) && L.f(this.f289571b, ((OpenFilters) obj).f289571b);
        }

        public final int hashCode() {
            return this.f289571b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenFilters(openParams=" + this.f289571b + ')';
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$UpdateFilters;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateFilters implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AbstractC48441b> f289572b;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateFilters(@k List<? extends AbstractC48441b> list) {
            this.f289572b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateFilters) && L.f(this.f289572b, ((UpdateFilters) obj).f289572b);
        }

        public final int hashCode() {
            return this.f289572b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("UpdateFilters(newFilters="), this.f289572b, ')');
        }
    }

    /* compiled from: StrSellerOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction$UxInfoLoadingComplete;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UxInfoLoadingComplete implements StrSellerOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final f f289573b;

        public UxInfoLoadingComplete(@l f fVar) {
            this.f289573b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UxInfoLoadingComplete) && L.f(this.f289573b, ((UxInfoLoadingComplete) obj).f289573b);
        }

        public final int hashCode() {
            f fVar = this.f289573b;
            if (fVar == null) {
                return 0;
            }
            return fVar.f14906a.hashCode();
        }

        @k
        public final String toString() {
            return "UxInfoLoadingComplete(properties=" + this.f289573b + ')';
        }
    }
}
