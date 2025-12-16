package com.avito.android.activeOrders;

import com.avito.android.account.E;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.rx3.y;

/* compiled from: UpdatedActiveOrdersInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/activeOrders/r;", "Lcom/avito/android/activeOrders/e;", "_avito_active-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f68251a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f68252b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f68253c;

    @Inject
    public r(@Y61.k com.avito.android.clientEventBus.a aVar, @Y61.k c cVar, @Y61.k E e12) {
        this.f68251a = aVar;
        this.f68252b = cVar;
        this.f68253c = e12;
    }

    @Override // com.avito.android.activeOrders.e
    @Y61.k
    public final kotlinx.coroutines.flow.internal.l a(@Y61.l Boolean bool) {
        return C43175k.Y(y.a(this.f68253c.g()), new q(null, bool, this));
    }
}
