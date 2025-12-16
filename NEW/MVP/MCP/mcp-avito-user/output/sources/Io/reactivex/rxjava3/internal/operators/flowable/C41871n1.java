package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableRetryPredicate.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.n1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41871n1<T> extends AbstractC41833b<T, T> {

    /* renamed from: d, reason: collision with root package name */
    public final l41.r<? super Throwable> f402901d;

    /* renamed from: e, reason: collision with root package name */
    public final long f402902e;

    /* compiled from: FlowableRetryPredicate.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.n1$a */
    public static final class a<T> extends AtomicInteger implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f402903b;

        /* renamed from: c, reason: collision with root package name */
        public final o41.h f402904c;

        /* renamed from: d, reason: collision with root package name */
        public final org.reactivestreams.c<? extends T> f402905d;

        /* renamed from: e, reason: collision with root package name */
        public final l41.r<? super Throwable> f402906e;

        /* renamed from: f, reason: collision with root package name */
        public long f402907f;

        /* renamed from: g, reason: collision with root package name */
        public long f402908g;

        public a(InterfaceC41782o interfaceC41782o, long j12, l41.r rVar, o41.h hVar, org.reactivestreams.c cVar) {
            this.f402903b = interfaceC41782o;
            this.f402904c = hVar;
            this.f402905d = cVar;
            this.f402906e = rVar;
            this.f402907f = j12;
        }

        @Override // org.reactivestreams.d
        public final void K(org.reactivestreams.e eVar) {
            this.f402904c.g(eVar);
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f402904c.f419386h) {
                    long j12 = this.f402908g;
                    if (j12 != 0) {
                        this.f402908g = 0L;
                        this.f402904c.f(j12);
                    }
                    this.f402905d.d(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            this.f402903b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            long j12 = this.f402907f;
            if (j12 != Long.MAX_VALUE) {
                this.f402907f = j12 - 1;
            }
            InterfaceC41782o interfaceC41782o = this.f402903b;
            if (j12 == 0) {
                interfaceC41782o.onError(th2);
                return;
            }
            try {
                this.f402906e.test(th2);
                a();
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                interfaceC41782o.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402908g++;
            this.f402903b.onNext(t12);
        }
    }

    public C41871n1(AbstractC41777j<T> abstractC41777j, long j12, l41.r<? super Throwable> rVar) {
        super(abstractC41777j);
        this.f402901d = rVar;
        this.f402902e = j12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        o41.h hVar = new o41.h(false);
        dVar.K(hVar);
        InterfaceC41782o interfaceC41782o = (InterfaceC41782o) dVar;
        new a(interfaceC41782o, this.f402902e, this.f402901d, hVar, this.f402624c).a();
    }
}
