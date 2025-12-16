package com.avito.android.str_seller_orders.strsellerorders.mvi.entity;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a;", "", "a", "b", "c", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a$a;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a$b;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a$a;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders.strsellerorders.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8739a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C8739a f289904a = new C8739a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C8739a);
        }

        public final int hashCode() {
            return 157788029;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a$b;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final BF0.a f289905a;

        public b(@l BF0.a aVar) {
            this.f289905a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f289905a, ((b) obj).f289905a);
        }

        public final int hashCode() {
            BF0.a aVar = this.f289905a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "Loaded(banner=" + this.f289905a + ')';
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a$c;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f289906a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1168888463;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
