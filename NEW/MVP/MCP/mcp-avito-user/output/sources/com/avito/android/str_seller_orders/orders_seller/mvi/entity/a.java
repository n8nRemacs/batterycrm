package com.avito.android.str_seller_orders.orders_seller.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a;", "", "a", "b", "c", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a$a;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a$b;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a$a;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders.orders_seller.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8725a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C8725a f289594a = new C8725a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C8725a);
        }

        public final int hashCode() {
            return 1760361380;
        }

        @k
        public final String toString() {
            return "Invisible";
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a$b;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f289595a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -329928973;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a$c;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f289596a;

        public c(@k PrintableText printableText) {
            this.f289596a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f289596a, ((c) obj).f289596a);
        }

        public final int hashCode() {
            return this.f289596a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Visible(header="), this.f289596a, ')');
        }
    }
}
