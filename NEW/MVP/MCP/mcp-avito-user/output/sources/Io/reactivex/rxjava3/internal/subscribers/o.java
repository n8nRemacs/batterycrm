package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: QueueDrainSubscriber.java */
/* loaded from: classes8.dex */
public abstract class o<T, U, V> extends s implements InterfaceC41782o<T>, io.reactivex.rxjava3.internal.util.o<U, V> {

    /* renamed from: d, reason: collision with root package name */
    public final io.reactivex.rxjava3.subscribers.e f404795d;

    /* renamed from: e, reason: collision with root package name */
    public final io.reactivex.rxjava3.internal.queue.a f404796e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f404797f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f404798g;

    public o(io.reactivex.rxjava3.subscribers.e eVar, io.reactivex.rxjava3.internal.queue.a aVar) {
        this.f404795d = eVar;
        this.f404796e = aVar;
    }

    public boolean a(io.reactivex.rxjava3.subscribers.e eVar, Object obj) {
        return false;
    }

    public final boolean b() {
        return this.f404800b.getAndIncrement() == 0;
    }

    public final void c(Object obj, io.reactivex.rxjava3.disposables.d dVar) {
        io.reactivex.rxjava3.subscribers.e eVar = this.f404795d;
        io.reactivex.rxjava3.internal.queue.a aVar = this.f404796e;
        AtomicInteger atomicInteger = this.f404800b;
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            long j12 = this.f404799c.get();
            if (j12 == 0) {
                this.f404797f = true;
                dVar.dispose();
                throw null;
            }
            if (aVar.isEmpty()) {
                if (a(eVar, obj) && j12 != Long.MAX_VALUE) {
                    f();
                }
                if (this.f404800b.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                aVar.offer(obj);
            }
        } else {
            aVar.offer(obj);
            if (!b()) {
                return;
            }
        }
        io.reactivex.rxjava3.internal.util.p.c(aVar, eVar, dVar, this);
    }

    public final int d(int i12) {
        return this.f404800b.addAndGet(i12);
    }

    public final long f() {
        return this.f404799c.addAndGet(-1L);
    }

    public final long g() {
        return this.f404799c.get();
    }

    public void request(long j12) {
        if (SubscriptionHelper.h(j12)) {
            io.reactivex.rxjava3.internal.util.c.a(this.f404799c, j12);
        }
    }
}
