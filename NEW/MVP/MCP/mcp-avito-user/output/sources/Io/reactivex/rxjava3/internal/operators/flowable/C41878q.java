package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: FlowableBufferTimed.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41878q<T, U extends Collection<? super T>> extends AbstractC41833b<T, U> {

    /* compiled from: FlowableBufferTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q$a */
    public static final class a<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.o<T, U, U> implements org.reactivestreams.e, Runnable, io.reactivex.rxjava3.disposables.d {

        /* renamed from: h, reason: collision with root package name */
        public U f402936h;

        /* renamed from: i, reason: collision with root package name */
        public org.reactivestreams.e f402937i;

        /* renamed from: j, reason: collision with root package name */
        public long f402938j;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402937i, eVar)) {
                this.f402937i = eVar;
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    throw null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.o, io.reactivex.rxjava3.internal.util.o
        public final boolean a(io.reactivex.rxjava3.subscribers.e eVar, Object obj) {
            eVar.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f404797f) {
                return;
            }
            this.f404797f = true;
            dispose();
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            synchronized (this) {
                this.f402936h = null;
            }
            this.f402937i.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            U u12;
            synchronized (this) {
                u12 = this.f402936h;
                this.f402936h = null;
            }
            if (u12 != null) {
                this.f404796e.offer(u12);
                this.f404798g = true;
                if (!b()) {
                    throw null;
                }
                io.reactivex.rxjava3.internal.util.p.c(this.f404796e, this.f404795d, this, this);
                throw null;
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            synchronized (this) {
                this.f402936h = null;
            }
            this.f404795d.onError(th2);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            synchronized (this) {
                try {
                    U u12 = this.f402936h;
                    if (u12 == null) {
                        return;
                    }
                    u12.add(t12);
                    if (u12.size() < 0) {
                        return;
                    }
                    this.f402936h = null;
                    this.f402938j++;
                    c(u12, this);
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        cancel();
                        this.f404795d.onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                this.f404795d.onError(th2);
            }
        }
    }

    /* compiled from: FlowableBufferTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q$b */
    public static final class b<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.o<T, U, U> implements org.reactivestreams.e, Runnable, io.reactivex.rxjava3.disposables.d {

        /* renamed from: h, reason: collision with root package name */
        public org.reactivestreams.e f402939h;

        public b() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402939h, eVar)) {
                this.f402939h = eVar;
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    cancel();
                    throw null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.o, io.reactivex.rxjava3.internal.util.o
        public final boolean a(io.reactivex.rxjava3.subscribers.e eVar, Object obj) {
            this.f404795d.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f404797f = true;
            this.f402939h.cancel();
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            DisposableHelper.a(null);
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            synchronized (this) {
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                throw null;
            }
        }
    }

    /* compiled from: FlowableBufferTimed.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q$c */
    public static final class c<T, U extends Collection<? super T>> extends io.reactivex.rxjava3.internal.subscribers.o<T, U, U> implements org.reactivestreams.e, Runnable {

        /* renamed from: h, reason: collision with root package name */
        public org.reactivestreams.e f402940h;

        /* compiled from: FlowableBufferTimed.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.q$c$a */
        public final class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public c() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402940h, eVar)) {
                this.f402940h = eVar;
                try {
                    throw null;
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    throw null;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.o, io.reactivex.rxjava3.internal.util.o
        public final boolean a(io.reactivex.rxjava3.subscribers.e eVar, Object obj) {
            eVar.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f404797f = true;
            this.f402940h.cancel();
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void e() {
            synchronized (this) {
                new ArrayList((Collection) null);
                throw null;
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f404798g = true;
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            synchronized (this) {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f404797f) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                cancel();
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super U> dVar) {
        throw null;
    }
}
