package com.avito.android.str_seller_orders.orders.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import lz0.C43851a;

/* compiled from: StrOrdersInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "NewSelectedTab", "ShowContent", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction$NewSelectedTab;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction$ShowContent;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrOrdersInternalAction extends n {

    /* compiled from: StrOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements StrOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f288887b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: StrOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction$NewSelectedTab;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewSelectedTab implements StrOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f288888b;

        public NewSelectedTab(int i12) {
            this.f288888b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NewSelectedTab) && this.f288888b == ((NewSelectedTab) obj).f288888b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f288888b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("NewSelectedTab(selectedTabPosition="), this.f288888b, ')');
        }
    }

    /* compiled from: StrOrdersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction$ShowContent;", "Lcom/avito/android/str_seller_orders/orders/mvi/entity/StrOrdersInternalAction;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements StrOrdersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C43851a> f288889b;

        /* renamed from: c, reason: collision with root package name */
        public final int f288890c;

        public ShowContent(@k List<C43851a> list, int i12) {
            this.f288889b = list;
            this.f288890c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowContent)) {
                return false;
            }
            ShowContent showContent = (ShowContent) obj;
            return L.f(this.f288889b, showContent.f288889b) && this.f288890c == showContent.f288890c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f288890c) + (this.f288889b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(providerTabs=");
            sb2.append(this.f288889b);
            sb2.append(", selectedTabPosition=");
            return r.t(sb2, this.f288890c, ')');
        }
    }
}
