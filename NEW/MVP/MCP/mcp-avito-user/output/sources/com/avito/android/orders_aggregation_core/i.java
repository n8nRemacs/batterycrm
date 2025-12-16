package com.avito.android.orders_aggregation_core;

import Y61.l;
import androidx.fragment.app.Fragment;
import javax.inject.Inject;
import kotlin.Metadata;
import n50.InterfaceC44197c;

/* compiled from: OrdersTabFragmentFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders_aggregation_core/i;", "Lcom/avito/android/orders_aggregation_core/h;", "Ln50/c;", "_avito_orders-aggregation-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements h, InterfaceC44197c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.orders.feature.beduin_orders_list.g f210387a;

    @Inject
    public i(@Y61.k com.avito.android.orders.feature.beduin_orders_list.g gVar) {
        this.f210387a = gVar;
    }

    @Override // n50.InterfaceC44197c
    @Y61.k
    public final Fragment a(@l String str, @l String str2) {
        return this.f210387a.a(str, str2);
    }
}
