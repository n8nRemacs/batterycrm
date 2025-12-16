package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import s41.C47998a;

/* compiled from: FlowableFromStream.java */
/* renamed from: io.reactivex.rxjava3.internal.jdk8.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41802h<T> extends AbstractC41777j<T> {

    /* compiled from: FlowableFromStream.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.h$a */
    public static abstract class a<T> extends AtomicLong implements q41.d<T> {
        private static final long serialVersionUID = -9082954702547571853L;

        /* renamed from: b, reason: collision with root package name */
        public Iterator<T> f402051b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f402052c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f402053d;

        public abstract void a(long j12);

        @Override // org.reactivestreams.e
        public final void cancel() {
            this.f402052c = true;
            request(1L);
        }

        @Override // q41.g
        public final void clear() {
            this.f402051b = null;
        }

        @Override // q41.g
        public final boolean isEmpty() {
            Iterator<T> it = this.f402051b;
            if (it == null) {
                return true;
            }
            if (!this.f402053d || it.hasNext()) {
                return false;
            }
            this.f402051b = null;
            return true;
        }

        @Override // q41.g
        public final boolean offer(@j41.e T t12) {
            throw new UnsupportedOperationException();
        }

        @Override // q41.g
        @j41.f
        public final T poll() {
            Iterator<T> it = this.f402051b;
            if (it == null) {
                return null;
            }
            if (!this.f402053d) {
                this.f402053d = true;
            } else if (!it.hasNext()) {
                this.f402051b = null;
                return null;
            }
            T next = this.f402051b.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12) && io.reactivex.rxjava3.internal.util.c.a(this, j12) == 0) {
                a(j12);
            }
        }

        @Override // q41.InterfaceC47200c
        public final int v(int i12) {
            if ((i12 & 1) == 0) {
                return 0;
            }
            lazySet(Long.MAX_VALUE);
            return 1;
        }
    }

    /* compiled from: FlowableFromStream.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.h$b */
    public static final class b<T> extends a<T> {
        private static final long serialVersionUID = -9082954702547571853L;

        @Override // io.reactivex.rxjava3.internal.jdk8.C41802h.a
        public final void a(long j12) {
            Iterator<T> it = this.f402051b;
            if (this.f402052c) {
                this.f402051b = null;
                return;
            }
            try {
                Objects.requireNonNull(it.next(), "The Stream's Iterator returned a null value");
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                throw null;
            }
        }
    }

    /* compiled from: FlowableFromStream.java */
    /* renamed from: io.reactivex.rxjava3.internal.jdk8.h$c */
    public static final class c<T> extends a<T> {
        private static final long serialVersionUID = -9082954702547571853L;

        @Override // io.reactivex.rxjava3.internal.jdk8.C41802h.a
        public final void a(long j12) {
            Iterator<T> it = this.f402051b;
            if (this.f402052c) {
                this.f402051b = null;
                return;
            }
            try {
                Objects.requireNonNull(it.next(), "The Stream's Iterator returned a null value");
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                throw null;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        InterfaceC41782o interfaceC41782o = (InterfaceC41782o) dVar;
        try {
            throw null;
        } finally {
            try {
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                C47998a.b(th2);
            }
        }
    }
}
