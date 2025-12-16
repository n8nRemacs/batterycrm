package com.avito.android.str_seller_orders.orders_seller.items;

import Y41.l;
import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.str_seller_orders.common.items.order_stub.g;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import tz0.InterfaceC48745a;

/* compiled from: StrSellerOrdersScrolledToStubsListener.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/items/c;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC48745a, G0> f289425b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super InterfaceC48745a, G0> lVar) {
        this.f289425b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iM1 = linearLayoutManager.M1();
        Integer numValueOf = iM1 != -1 ? Integer.valueOf(iM1) : null;
        if (numValueOf == null || !(recyclerView.P(numValueOf.intValue()) instanceof g)) {
            return;
        }
        this.f289425b.invoke(InterfaceC48745a.k.f439709a);
    }
}
