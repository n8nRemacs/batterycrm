package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.G;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: HalfSerializer.java */
/* loaded from: classes8.dex */
public final class i {
    public i() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(G<?> g12, AtomicInteger atomicInteger, b bVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            bVar.e(g12);
        }
    }

    public static void b(org.reactivestreams.d<?> dVar, AtomicInteger atomicInteger, b bVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            bVar.g(dVar);
        }
    }

    public static void c(G<?> g12, Throwable th2, AtomicInteger atomicInteger, b bVar) {
        if (bVar.b(th2) && atomicInteger.getAndIncrement() == 0) {
            bVar.e(g12);
        }
    }

    public static void d(org.reactivestreams.d<?> dVar, Throwable th2, AtomicInteger atomicInteger, b bVar) {
        if (bVar.b(th2) && atomicInteger.getAndIncrement() == 0) {
            bVar.g(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(G<? super T> g12, T t12, AtomicInteger atomicInteger, b bVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            g12.onNext(t12);
            if (atomicInteger.decrementAndGet() != 0) {
                bVar.e(g12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean f(org.reactivestreams.d<? super T> dVar, T t12, AtomicInteger atomicInteger, b bVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            dVar.onNext(t12);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            bVar.g(dVar);
        }
        return false;
    }
}
