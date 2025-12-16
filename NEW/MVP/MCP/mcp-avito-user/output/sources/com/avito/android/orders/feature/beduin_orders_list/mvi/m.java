package com.avito.android.orders.feature.beduin_orders_list.mvi;

import com.avito.android.clientEventBus.ConnectionState;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ClientEventBuses.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx0/a;", "EventT", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/clientEventBus/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.clientEventBus.a f210128b;

    public m(com.avito.android.clientEventBus.a aVar) {
        this.f210128b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return k.f210126a[((ConnectionState) obj).ordinal()] == 1 ? this.f210128b.c(M40.a.class).l0(l.f210127b) : U.f403867b;
    }
}
