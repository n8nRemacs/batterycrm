package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: ReplayProcessor.java */
/* loaded from: classes8.dex */
public final class f<T> extends io.reactivex.rxjava3.processors.c<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f404920c = new Object[0];

    /* compiled from: ReplayProcessor.java */
    public static final class a<T> extends AtomicReference<a<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
    }

    /* compiled from: ReplayProcessor.java */
    public interface b<T> {
    }

    /* compiled from: ReplayProcessor.java */
    public static final class c<T> extends AtomicInteger implements org.reactivestreams.e {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f404921b;

        /* renamed from: c, reason: collision with root package name */
        public final f<T> f404922c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f404923d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f404924e;

        public c(InterfaceC41782o interfaceC41782o, f fVar) {
            this.f404921b = interfaceC41782o;
            this.f404922c = fVar;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (this.f404924e) {
                return;
            }
            this.f404924e = true;
            this.f404922c.getClass();
            throw null;
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.a(this.f404923d, j12);
                this.f404922c.getClass();
                throw null;
            }
        }
    }

    /* compiled from: ReplayProcessor.java */
    public static final class d<T> implements b<T> {
    }

    /* compiled from: ReplayProcessor.java */
    public static final class e<T> implements b<T> {
    }

    /* compiled from: ReplayProcessor.java */
    /* renamed from: io.reactivex.rxjava3.processors.f$f, reason: collision with other inner class name */
    public static final class C11522f<T> extends AtomicReference<C11522f<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        public C11522f() {
            throw null;
        }
    }

    /* compiled from: ReplayProcessor.java */
    public static final class g<T> implements b<T> {
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        eVar.cancel();
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        C47998a.b(th2);
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new c((InterfaceC41782o) dVar, this));
        throw null;
    }

    @Override // org.reactivestreams.d
    public final void e() {
    }
}
