package com.avito.android.str_seller_orders.orders_buyer.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import pz0.InterfaceC47171b;

/* compiled from: StrOrdersBuyerInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "OpenDeeplink", "ShowContent", "ShowLoading", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction$OpenDeeplink;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction$ShowContent;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction$ShowLoading;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrOrdersBuyerInternalAction extends n {

    /* compiled from: StrOrdersBuyerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements StrOrdersBuyerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f289085b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: StrOrdersBuyerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction$OpenDeeplink;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements StrOrdersBuyerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f289086b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f289086b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f289086b, ((OpenDeeplink) obj).f289086b);
        }

        public final int hashCode() {
            return this.f289086b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f289086b, ')');
        }
    }

    /* compiled from: StrOrdersBuyerInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction$ShowContent;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements StrOrdersBuyerInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC47171b f289087b;

        public ShowContent(@k InterfaceC47171b interfaceC47171b) {
            this.f289087b = interfaceC47171b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowContent) && L.f(this.f289087b, ((ShowContent) obj).f289087b);
        }

        public final int hashCode() {
            return this.f289087b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(domainState=" + this.f289087b + ')';
        }
    }

    /* compiled from: StrOrdersBuyerInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction$ShowLoading;", "Lcom/avito/android/str_seller_orders/orders_buyer/mvi/entity/StrOrdersBuyerInternalAction;", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowLoading implements StrOrdersBuyerInternalAction {
        static {
            new ShowLoading();
        }

        private ShowLoading() {
        }
    }
}
