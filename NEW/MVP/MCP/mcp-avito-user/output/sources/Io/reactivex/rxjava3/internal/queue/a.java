package io.reactivex.rxjava3.internal.queue;

import java.util.concurrent.atomic.AtomicReference;
import q41.f;

/* compiled from: MpscLinkedQueue.java */
/* loaded from: classes8.dex */
public final class a<T> implements f<T> {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<C11515a<T>> f404660b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<C11515a<T>> f404661c;

    /* compiled from: MpscLinkedQueue.java */
    /* renamed from: io.reactivex.rxjava3.internal.queue.a$a, reason: collision with other inner class name */
    public static final class C11515a<E> extends AtomicReference<C11515a<E>> {
        private static final long serialVersionUID = 2404266111789071508L;

        /* renamed from: b, reason: collision with root package name */
        public E f404662b;
    }

    public a() {
        AtomicReference<C11515a<T>> atomicReference = new AtomicReference<>();
        this.f404660b = atomicReference;
        AtomicReference<C11515a<T>> atomicReference2 = new AtomicReference<>();
        this.f404661c = atomicReference2;
        C11515a<T> c11515a = new C11515a<>();
        atomicReference2.lazySet(c11515a);
        atomicReference.getAndSet(c11515a);
    }

    @Override // q41.g
    public final void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    @Override // q41.g
    public final boolean isEmpty() {
        return this.f404661c.get() == this.f404660b.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q41.g
    public final boolean offer(T t12) {
        if (t12 == 0) {
            throw new NullPointerException("Null is not a valid element");
        }
        C11515a<T> c11515a = new C11515a<>();
        c11515a.f404662b = t12;
        this.f404660b.getAndSet(c11515a).lazySet(c11515a);
        return true;
    }

    @Override // q41.g
    @j41.f
    public final T poll() {
        C11515a<T> c11515a;
        AtomicReference<C11515a<T>> atomicReference = this.f404661c;
        C11515a<T> c11515a2 = atomicReference.get();
        C11515a<T> c11515a3 = (C11515a) c11515a2.get();
        if (c11515a3 != null) {
            T t12 = c11515a3.f404662b;
            c11515a3.f404662b = null;
            atomicReference.lazySet(c11515a3);
            return t12;
        }
        if (c11515a2 == this.f404660b.get()) {
            return null;
        }
        do {
            c11515a = (C11515a) c11515a2.get();
        } while (c11515a == null);
        T t13 = c11515a.f404662b;
        c11515a.f404662b = null;
        atomicReference.lazySet(c11515a);
        return t13;
    }
}
