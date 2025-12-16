package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: PublishProcessor.java */
/* loaded from: classes8.dex */
public final class e<T> extends c<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final a[] f404914e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    public static final a[] f404915f = new a[0];

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f404916c = new AtomicReference<>(f404915f);

    /* renamed from: d, reason: collision with root package name */
    public Throwable f404917d;

    /* compiled from: PublishProcessor.java */
    public static final class a<T> extends AtomicLong implements org.reactivestreams.e {
        private static final long serialVersionUID = 3562861878281475070L;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC41782o f404918b;

        /* renamed from: c, reason: collision with root package name */
        public final e<T> f404919c;

        public a(InterfaceC41782o interfaceC41782o, e eVar) {
            this.f404918b = interfaceC41782o;
            this.f404919c = eVar;
        }

        @Override // org.reactivestreams.e
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f404919c.A(this);
            }
        }

        @Override // org.reactivestreams.e
        public final void request(long j12) {
            if (SubscriptionHelper.h(j12)) {
                io.reactivex.rxjava3.internal.util.c.b(this, j12);
            }
        }
    }

    public final void A(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f404916c;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == f404914e || aVarArr2 == (aVarArr = f404915f)) {
                return;
            }
            int length = aVarArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                } else if (aVarArr2[i12] == aVar) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i12);
                System.arraycopy(aVarArr2, i12 + 1, aVarArr, i12, (length - i12) - 1);
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // org.reactivestreams.d
    public final void K(@j41.e org.reactivestreams.e eVar) {
        if (this.f404916c.get() == f404914e) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        AtomicReference<a<T>[]> atomicReference = this.f404916c;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f404914e;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.f404918b.e();
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(@j41.e Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        AtomicReference<a<T>[]> atomicReference = this.f404916c;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = f404914e;
        if (aVarArr == aVarArr2) {
            C47998a.b(th2);
            return;
        }
        this.f404917d = th2;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.f404918b.onError(th2);
            } else {
                C47998a.b(th2);
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(@j41.e T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        for (a<T> aVar : this.f404916c.get()) {
            long j12 = aVar.get();
            if (j12 != Long.MIN_VALUE) {
                InterfaceC41782o interfaceC41782o = aVar.f404918b;
                if (j12 != 0) {
                    interfaceC41782o.onNext(t12);
                    io.reactivex.rxjava3.internal.util.c.f(aVar, 1L);
                } else {
                    aVar.cancel();
                    interfaceC41782o.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(@j41.e org.reactivestreams.d<? super T> dVar) {
        a<T> aVar = new a<>((InterfaceC41782o) dVar, this);
        dVar.K(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f404916c;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f404914e) {
                Throwable th2 = this.f404917d;
                if (th2 != null) {
                    dVar.onError(th2);
                    return;
                } else {
                    dVar.e();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.get() == Long.MIN_VALUE) {
                A(aVar);
                return;
            }
            return;
        }
    }
}
