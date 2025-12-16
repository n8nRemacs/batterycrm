package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.InterfaceC41771d;
import io.reactivex.rxjava3.core.InterfaceC41774g;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: CompletableConcat.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.completable.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41813d extends AbstractC41768a {

    /* compiled from: CompletableConcat.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.completable.d$a */
    public static final class a extends AtomicInteger implements InterfaceC41782o<InterfaceC41774g>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 9032184911934499404L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41771d f402222b;

        /* renamed from: f, reason: collision with root package name */
        public int f402226f;

        /* renamed from: g, reason: collision with root package name */
        public int f402227g;

        /* renamed from: h, reason: collision with root package name */
        public q41.g<InterfaceC41774g> f402228h;

        /* renamed from: i, reason: collision with root package name */
        public org.reactivestreams.e f402229i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f402230j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f402231k;

        /* renamed from: d, reason: collision with root package name */
        public final C11448a f402224d = new C11448a(this);

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f402225e = new AtomicBoolean();

        /* renamed from: c, reason: collision with root package name */
        public final int f402223c = 0;

        /* compiled from: CompletableConcat.java */
        /* renamed from: io.reactivex.rxjava3.internal.operators.completable.d$a$a, reason: collision with other inner class name */
        public static final class C11448a extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements InterfaceC41771d {
            private static final long serialVersionUID = -5454794857847146511L;

            /* renamed from: b, reason: collision with root package name */
            public final a f402232b;

            public C11448a(a aVar) {
                this.f402232b = aVar;
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void b(io.reactivex.rxjava3.disposables.d dVar) {
                DisposableHelper.c(this, dVar);
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void e() {
                a aVar = this.f402232b;
                aVar.f402231k = false;
                aVar.a();
            }

            @Override // io.reactivex.rxjava3.core.InterfaceC41771d
            public final void onError(Throwable th2) {
                a aVar = this.f402232b;
                if (!aVar.f402225e.compareAndSet(false, true)) {
                    C47998a.b(th2);
                } else {
                    aVar.f402229i.cancel();
                    aVar.f402222b.onError(th2);
                }
            }
        }

        public a(InterfaceC41771d interfaceC41771d) {
            this.f402222b = interfaceC41771d;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            if (SubscriptionHelper.i(this.f402229i, eVar)) {
                this.f402229i = eVar;
                long j12 = 0;
                if (eVar instanceof q41.d) {
                    q41.d dVar = (q41.d) eVar;
                    int iV2 = dVar.v(3);
                    if (iV2 == 1) {
                        this.f402226f = iV2;
                        this.f402228h = dVar;
                        this.f402230j = true;
                        this.f402222b.b(this);
                        a();
                        return;
                    }
                    if (iV2 == 2) {
                        this.f402226f = iV2;
                        this.f402228h = dVar;
                        this.f402222b.b(this);
                        eVar.request(j12);
                        return;
                    }
                }
                this.f402228h = new q41.h(0);
                this.f402222b.b(this);
                eVar.request(j12);
            }
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!getF318621e()) {
                if (!this.f402231k) {
                    boolean z12 = this.f402230j;
                    try {
                        InterfaceC41774g interfaceC41774gPoll = this.f402228h.poll();
                        boolean z13 = interfaceC41774gPoll == null;
                        if (z12 && z13) {
                            this.f402222b.e();
                            return;
                        }
                        if (!z13) {
                            this.f402231k = true;
                            interfaceC41774gPoll.a(this.f402224d);
                            if (this.f402226f != 1) {
                                int i12 = this.f402227g + 1;
                                if (i12 == this.f402223c) {
                                    this.f402227g = 0;
                                    this.f402229i.request(i12);
                                } else {
                                    this.f402227g = i12;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        if (!this.f402225e.compareAndSet(false, true)) {
                            C47998a.b(th2);
                            return;
                        } else {
                            this.f402229i.cancel();
                            this.f402222b.onError(th2);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f402229i.cancel();
            DisposableHelper.a(this.f402224d);
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402230j = true;
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return DisposableHelper.b(this.f402224d.get());
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            if (!this.f402225e.compareAndSet(false, true)) {
                C47998a.b(th2);
            } else {
                DisposableHelper.a(this.f402224d);
                this.f402222b.onError(th2);
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(Object obj) {
            InterfaceC41774g interfaceC41774g = (InterfaceC41774g) obj;
            if (this.f402226f != 0 || this.f402228h.offer(interfaceC41774g)) {
                a();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41768a
    public final void w(InterfaceC41771d interfaceC41771d) {
        new a(interfaceC41771d);
        throw null;
    }
}
