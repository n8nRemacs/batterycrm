package com.avito.android.activeOrders;

import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.clientEventBus.k;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ClientEventBuses.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmx0/a;", "EventT", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/clientEventBus/k;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/clientEventBus/r", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f68223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.clientEventBus.a f68224c;

    public j(AtomicLong atomicLong, com.avito.android.clientEventBus.a aVar) {
        this.f68223b = atomicLong;
        this.f68224c = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iOrdinal = ((ConnectionState) obj).ordinal();
        AtomicLong atomicLong = this.f68223b;
        if (iOrdinal == 0) {
            return z.g0(new Date().getTime() - atomicLong.get() >= 300000 ? z.c0(new k.b()) : U.f403867b, this.f68224c.c(M40.a.class).l0(i.f68222b).d0(h.f68221b));
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        atomicLong.set(new Date().getTime());
        return U.f403867b;
    }
}
