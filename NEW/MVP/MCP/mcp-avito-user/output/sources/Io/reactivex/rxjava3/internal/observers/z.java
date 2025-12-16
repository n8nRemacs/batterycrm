package io.reactivex.rxjava3.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: QueueDrainObserver.java */
/* loaded from: classes8.dex */
public abstract class z<T, U, V> extends B implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.internal.util.l<U, V> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.observers.m f402138c;

    /* renamed from: d, reason: collision with root package name */
    public final io.reactivex.rxjava3.internal.queue.a f402139d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f402140e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f402141f;

    public z(io.reactivex.rxjava3.observers.m mVar, io.reactivex.rxjava3.internal.queue.a aVar) {
        this.f402138c = mVar;
        this.f402139d = aVar;
    }

    public final boolean c() {
        return this.f402094b.getAndIncrement() == 0;
    }

    public final void d(Object obj, io.reactivex.rxjava3.disposables.d dVar) {
        AtomicInteger atomicInteger = this.f402094b;
        int i12 = atomicInteger.get();
        io.reactivex.rxjava3.observers.m mVar = this.f402138c;
        io.reactivex.rxjava3.internal.queue.a aVar = this.f402139d;
        if (i12 == 0 && atomicInteger.compareAndSet(0, 1)) {
            a(mVar, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            aVar.offer(obj);
            if (!c()) {
                return;
            }
        }
        io.reactivex.rxjava3.internal.util.p.b(aVar, mVar, dVar, this);
    }

    public final void f(Object obj, io.reactivex.rxjava3.disposables.d dVar) {
        AtomicInteger atomicInteger = this.f402094b;
        int i12 = atomicInteger.get();
        io.reactivex.rxjava3.observers.m mVar = this.f402138c;
        io.reactivex.rxjava3.internal.queue.a aVar = this.f402139d;
        if (i12 != 0 || !atomicInteger.compareAndSet(0, 1)) {
            aVar.offer(obj);
            if (!c()) {
                return;
            }
        } else if (aVar.isEmpty()) {
            a(mVar, obj);
            if (atomicInteger.addAndGet(-1) == 0) {
                return;
            }
        } else {
            aVar.offer(obj);
        }
        io.reactivex.rxjava3.internal.util.p.b(aVar, mVar, dVar, this);
    }

    public final int g(int i12) {
        return this.f402094b.addAndGet(i12);
    }

    @Override // io.reactivex.rxjava3.internal.util.l
    public void a(io.reactivex.rxjava3.observers.m mVar, Object obj) {
    }
}
