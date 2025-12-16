package ru.avito.messenger.internal.connection;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lru/avito/websocket/u$c;", "", "it", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f431244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47754g f431245c;

    public D(AtomicInteger atomicInteger, C47754g c47754g) {
        this.f431244b = atomicInteger;
        this.f431245c = c47754g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int andIncrement = this.f431244b.getAndIncrement();
        C47754g c47754g = this.f431245c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jA2 = c47754g.f431310e.a(andIncrement, timeUnit);
        c47754g.f431311f.b("Reconnect after " + (jA2 / 1000.0d) + " seconds");
        return io.reactivex.rxjava3.core.z.F0(jA2, timeUnit, c47754g.f431312g.c());
    }
}
