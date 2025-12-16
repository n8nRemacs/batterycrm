package com.avito.android.activeOrders;

import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: ActiveOrdersInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/activeOrders/c;", "Lcom/avito/android/activeOrders/a;", "_avito_active-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<E3.a> f68215a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f68216b;

    @Inject
    public c(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f68215a = eVar;
        this.f68216b = r02;
    }

    @Override // com.avito.android.activeOrders.a
    @Y61.l
    public final Object a(@Y61.k SuspendLambda suspendLambda) {
        return C43259k.g(this.f68216b.a(), new b(this, null), suspendLambda);
    }
}
