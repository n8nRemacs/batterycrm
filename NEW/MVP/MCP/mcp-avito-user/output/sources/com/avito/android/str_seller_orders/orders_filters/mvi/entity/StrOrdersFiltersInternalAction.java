package com.avito.android.str_seller_orders.orders_filters.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersOpenParams;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ClearSelectedToggles", "Close", "CloseWithResult", "Init", "UpdateToggleSelected", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$ClearSelectedToggles;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$Close;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$CloseWithResult;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$Init;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$UpdateToggleSelected;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrOrdersFiltersInternalAction extends n {

    /* compiled from: StrOrdersFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$ClearSelectedToggles;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearSelectedToggles implements StrOrdersFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ClearSelectedToggles f289191b = new ClearSelectedToggles();

        private ClearSelectedToggles() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ClearSelectedToggles);
        }

        public final int hashCode() {
            return 1801611547;
        }

        @k
        public final String toString() {
            return "ClearSelectedToggles";
        }
    }

    /* compiled from: StrOrdersFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$Close;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements StrOrdersFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f289192b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1701265364;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: StrOrdersFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$CloseWithResult;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseWithResult implements StrOrdersFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrOrdersFiltersResult f289193b;

        public CloseWithResult(@k StrOrdersFiltersResult strOrdersFiltersResult) {
            this.f289193b = strOrdersFiltersResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseWithResult) && L.f(this.f289193b, ((CloseWithResult) obj).f289193b);
        }

        public final int hashCode() {
            return this.f289193b.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithResult(result=" + this.f289193b + ')';
        }
    }

    /* compiled from: StrOrdersFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$Init;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements StrOrdersFiltersInternalAction, TrackablePreloadedContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final StrOrdersFiltersOpenParams f289194b;

        public Init(@k StrOrdersFiltersOpenParams strOrdersFiltersOpenParams) {
            this.f289194b = strOrdersFiltersOpenParams;
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
            return (obj instanceof Init) && L.f(this.f289194b, ((Init) obj).f289194b);
        }

        public final int hashCode() {
            return this.f289194b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(openParams=" + this.f289194b + ')';
        }
    }

    /* compiled from: StrOrdersFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction$UpdateToggleSelected;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateToggleSelected implements StrOrdersFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f289195b;

        public UpdateToggleSelected(@k String str) {
            this.f289195b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateToggleSelected) && L.f(this.f289195b, ((UpdateToggleSelected) obj).f289195b);
        }

        public final int hashCode() {
            return this.f289195b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateToggleSelected(optionId="), this.f289195b, ')');
        }
    }
}
