package com.avito.android.str_seller_orders.strsellerorders.di;

import com.avito.android.str_seller_orders.strsellerorders.StrSellerOrdersActivity;
import com.avito.android.str_seller_orders.strsellerorders.di.c;

/* compiled from: DaggerStrSellerOrdersActivityComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerStrSellerOrdersActivityComponent.java */
    public static final class b implements c.a {
        public b() {
        }

        @Override // com.avito.android.str_seller_orders.strsellerorders.di.c.a
        public final com.avito.android.str_seller_orders.strsellerorders.di.c a(cz0.e eVar) {
            return new c(eVar, null);
        }
    }

    /* compiled from: DaggerStrSellerOrdersActivityComponent.java */
    public static final class c implements com.avito.android.str_seller_orders.strsellerorders.di.c {

        /* renamed from: a, reason: collision with root package name */
        public final cz0.e f289710a;

        public c(cz0.e eVar, C8732a c8732a) {
            this.f289710a = eVar;
        }

        @Override // com.avito.android.str_seller_orders.strsellerorders.di.c
        public final void a(StrSellerOrdersActivity strSellerOrdersActivity) {
            strSellerOrdersActivity.f289652m = this.f289710a.J();
        }
    }

    public static c.a a() {
        return new b();
    }
}
