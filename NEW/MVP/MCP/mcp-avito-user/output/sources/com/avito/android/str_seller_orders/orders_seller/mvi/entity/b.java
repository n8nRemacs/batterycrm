package com.avito.android.str_seller_orders.orders_seller.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import j.InterfaceC42150f;
import j.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/b;", "", "a", "b", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/b$a;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/b$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders.orders_seller.mvi.entity.a f289597a;

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/b$a;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.str_seller_orders.orders_seller.mvi.entity.a f289598b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f289599c;

        public a(@k com.avito.android.str_seller_orders.orders_seller.mvi.entity.a aVar, @k List<? extends TV0.a> list) {
            super(aVar, null);
            this.f289598b = aVar;
            this.f289599c = list;
        }

        @Override // com.avito.android.str_seller_orders.orders_seller.mvi.entity.b
        @k
        /* renamed from: a, reason: from getter */
        public final com.avito.android.str_seller_orders.orders_seller.mvi.entity.a getF289597a() {
            return this.f289598b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f289598b, aVar.f289598b) && L.f(this.f289599c, aVar.f289599c);
        }

        public final int hashCode() {
            return this.f289599c.hashCode() + (this.f289598b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(toolbarState=");
            sb2.append(this.f289598b);
            sb2.append(", items=");
            return H.n(sb2, this.f289599c, ')');
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/b$b;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders.orders_seller.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C8726b extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.str_seller_orders.orders_seller.mvi.entity.a f289600b;

        /* renamed from: c, reason: collision with root package name */
        public final int f289601c;

        /* renamed from: d, reason: collision with root package name */
        public final int f289602d;

        /* renamed from: e, reason: collision with root package name */
        public final int f289603e;

        public C8726b(@k com.avito.android.str_seller_orders.orders_seller.mvi.entity.a aVar, @InterfaceC42150f int i12, @e0 int i13, @e0 int i14) {
            super(aVar, null);
            this.f289600b = aVar;
            this.f289601c = i12;
            this.f289602d = i13;
            this.f289603e = i14;
        }

        @Override // com.avito.android.str_seller_orders.orders_seller.mvi.entity.b
        @k
        /* renamed from: a, reason: from getter */
        public final com.avito.android.str_seller_orders.orders_seller.mvi.entity.a getF289597a() {
            return this.f289600b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8726b)) {
                return false;
            }
            C8726b c8726b = (C8726b) obj;
            return L.f(this.f289600b, c8726b.f289600b) && this.f289601c == c8726b.f289601c && this.f289602d == c8726b.f289602d && this.f289603e == c8726b.f289603e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f289603e) + r.e(this.f289602d, r.e(this.f289601c, this.f289600b.hashCode() * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(toolbarState=");
            sb2.append(this.f289600b);
            sb2.append(", image=");
            sb2.append(this.f289601c);
            sb2.append(", title=");
            sb2.append(this.f289602d);
            sb2.append(", subtitle=");
            return r.t(sb2, this.f289603e, ')');
        }
    }

    public b(com.avito.android.str_seller_orders.orders_seller.mvi.entity.a aVar, C42822w c42822w) {
        this.f289597a = aVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public com.avito.android.str_seller_orders.orders_seller.mvi.entity.a getF289597a() {
        return this.f289597a;
    }
}
