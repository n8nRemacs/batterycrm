package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableMergeWithCompletable.java */
/* loaded from: classes8.dex */
public final class K0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableMergeWithCompletable.java */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T>, org.reactivestreams.e {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402393b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<org.reactivestreams.e> f402394c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        public final C11454a f402395d = new C11454a(this);

        /* renamed from: e, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.util.b f402396e = new io.reactivex.rxjava3.internal.util.b();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f402397f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f402398g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f402399h;

        /* compiled from: FlowableMergeWithCompletable.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.K0$a$a, reason: collision with other inner class name */
        public static final class C11454a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b, reason: collision with root package name */
            public final a<?> f402400b;

            public C11454a(a<?> aVar) {
                this.f402400b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.e(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a<?> aVar = this.f402400b;
                aVar.f402399h = true;
                if (aVar.f402398g) {
                    io.reactivex.rxjava3.internal.util.i.b(aVar.f402393b, aVar, aVar.f402396e);
                }
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a<?> aVar = this.f402400b;
                SubscriptionHelper.a(aVar.f402394c);
                io.reactivex.rxjava3.internal.util.i.d(aVar.f402393b, th2, aVar, aVar.f402396e);
            }
        }

        public a(InterfaceC41782o interfaceC41782o) {
            this.f402393b = interfaceC41782o;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            SubscriptionHelper.c(this.f402394c, this.f402397f, eVar);
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            SubscriptionHelper.a(this.f402394c);
            DisposableHelper.a(this.f402395d);
            this.f402396e.c();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402398g = true;
            if (this.f402399h) {
                io.reactivex.rxjava3.internal.util.i.b(this.f402393b, this, this.f402396e);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            DisposableHelper.a(this.f402395d);
            io.reactivex.rxjava3.internal.util.i.d(this.f402393b, th2, this, this.f402396e);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            io.reactivex.rxjava3.internal.util.i.f(this.f402393b, t12, this, this.f402396e);
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            SubscriptionHelper.b(this.f402394c, this.f402397f, j12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a((InterfaceC41782o) dVar);
        dVar.K(aVar);
        this.f402624c.q(aVar);
        throw null;
    }
}
