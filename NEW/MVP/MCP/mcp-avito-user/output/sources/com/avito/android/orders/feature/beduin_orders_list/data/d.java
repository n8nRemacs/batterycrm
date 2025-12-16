package com.avito.android.orders.feature.beduin_orders_list.data;

import Y61.k;
import Y61.l;
import com.avito.android.orders.feature.beduin_orders_list.i;
import com.avito.android.util.R0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: BeduinOrdersRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders/feature/beduin_orders_list/data/d;", "Lcom/avito/android/orders/feature/beduin_orders_list/data/a;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f210012a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<X40.a> f210013b;

    @Inject
    public d(@k R0 r02, @k h31.e<X40.a> eVar) {
        this.f210012a = r02;
        this.f210013b = eVar;
    }

    @Override // com.avito.android.orders.feature.beduin_orders_list.data.a
    @l
    public final Object a(@l i iVar, @k Map map, @k SuspendLambda suspendLambda) {
        return C43259k.g(this.f210012a.a(), new b(this, iVar, map, null), suspendLambda);
    }

    @Override // com.avito.android.orders.feature.beduin_orders_list.data.a
    @l
    public final Object b(@k String str, @k Continuation continuation) {
        return C43259k.g(this.f210012a.a(), new c(this, str, null), continuation);
    }
}
