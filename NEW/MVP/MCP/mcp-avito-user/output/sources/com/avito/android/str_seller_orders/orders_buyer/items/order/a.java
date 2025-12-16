package com.avito.android.str_seller_orders.orders_buyer.items.order;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.str_seller_orders.orders_buyer.mvi.entity.SizeViewType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OrderBlueprintBig.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_buyer/items/order/a;", "LTV0/b;", "Lcom/avito/android/str_seller_orders/orders_buyer/items/order/i;", "Lcom/avito/android/str_seller_orders/orders_buyer/items/order/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements TV0.b<i, e> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f289023a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f289024b = new g.a<>(R.layout.str_orders_buyer_section_big_item, C8703a.f289025l);

    /* compiled from: OrderBlueprintBig.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/str_seller_orders/orders_buyer/items/order/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/str_seller_orders/orders_buyer/items/order/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.str_seller_orders.orders_buyer.items.order.a$a, reason: collision with other inner class name */
    public static final class C8703a extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public static final C8703a f289025l = new C8703a();

        public C8703a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view);
        }
    }

    @Inject
    public a(@k g gVar) {
        this.f289023a = gVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f289023a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f289024b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof e) {
            if (((e) aVar).f289032c == SizeViewType.f289081b) {
                return true;
            }
        }
        return false;
    }
}
