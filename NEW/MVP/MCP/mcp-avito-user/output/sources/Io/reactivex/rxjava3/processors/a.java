package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: AsyncProcessor.java */
/* loaded from: classes8.dex */
public final class a<T> extends c<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final C11521a[] f404888f = new C11521a[0];

    /* renamed from: g, reason: collision with root package name */
    public static final C11521a[] f404889g = new C11521a[0];

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<C11521a<T>[]> f404890c = new AtomicReference<>(f404888f);

    /* renamed from: d, reason: collision with root package name */
    public Throwable f404891d;

    /* renamed from: e, reason: collision with root package name */
    public T f404892e;

    /* compiled from: AsyncProcessor.java */
    /* renamed from: io.reactivex.rxjava3.processors.a$a, reason: collision with other inner class name */
    public static final class C11521a<T> extends o41.f<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* renamed from: d, reason: collision with root package name */
        public final a<T> f404893d;

        public C11521a(InterfaceC41782o interfaceC41782o, a aVar) {
            super(interfaceC41782o);
            this.f404893d = aVar;
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            if (getAndSet(4) != 4) {
                this.f404893d.A(this);
            }
        }
    }

    public final void A(C11521a<T> c11521a) {
        C11521a<T>[] c11521aArr;
        while (true) {
            AtomicReference<C11521a<T>[]> atomicReference = this.f404890c;
            C11521a<T>[] c11521aArr2 = atomicReference.get();
            int length = c11521aArr2.length;
            if (length == 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    i12 = -1;
                    break;
                } else if (c11521aArr2[i12] == c11521a) {
                    break;
                } else {
                    i12++;
                }
            }
            if (i12 < 0) {
                return;
            }
            if (length == 1) {
                c11521aArr = f404888f;
            } else {
                C11521a<T>[] c11521aArr3 = new C11521a[length - 1];
                System.arraycopy(c11521aArr2, 0, c11521aArr3, 0, i12);
                System.arraycopy(c11521aArr2, i12 + 1, c11521aArr3, i12, (length - i12) - 1);
                c11521aArr = c11521aArr3;
            }
            while (!atomicReference.compareAndSet(c11521aArr2, c11521aArr)) {
                if (atomicReference.get() != c11521aArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // org.reactivestreams.d
    public final void K(@j41.e org.reactivestreams.e eVar) {
        if (this.f404890c.get() == f404889g) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        AtomicReference<C11521a<T>[]> atomicReference = this.f404890c;
        C11521a<T>[] c11521aArr = atomicReference.get();
        C11521a<T>[] c11521aArr2 = f404889g;
        if (c11521aArr == c11521aArr2) {
            return;
        }
        T t12 = this.f404892e;
        C11521a<T>[] andSet = atomicReference.getAndSet(c11521aArr2);
        int i12 = 0;
        if (t12 != null) {
            int length = andSet.length;
            while (i12 < length) {
                andSet[i12].l(t12);
                i12++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i12 < length2) {
            C11521a<T> c11521a = andSet[i12];
            if (!c11521a.m()) {
                c11521a.f419376b.e();
            }
            i12++;
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(@j41.e Throwable th2) {
        io.reactivex.rxjava3.internal.util.h.c(th2, "onError called with a null Throwable.");
        AtomicReference<C11521a<T>[]> atomicReference = this.f404890c;
        C11521a<T>[] c11521aArr = atomicReference.get();
        C11521a<T>[] c11521aArr2 = f404889g;
        if (c11521aArr == c11521aArr2) {
            C47998a.b(th2);
            return;
        }
        this.f404892e = null;
        this.f404891d = th2;
        C11521a<T>[] andSet = atomicReference.getAndSet(c11521aArr2);
        for (C11521a<T> c11521a : andSet) {
            if (c11521a.m()) {
                C47998a.b(th2);
            } else {
                c11521a.f419376b.onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(@j41.e T t12) {
        io.reactivex.rxjava3.internal.util.h.c(t12, "onNext called with a null value.");
        if (this.f404890c.get() == f404889g) {
            return;
        }
        this.f404892e = t12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(@j41.e org.reactivestreams.d<? super T> dVar) {
        C11521a<T> c11521a = new C11521a<>((InterfaceC41782o) dVar, this);
        dVar.K(c11521a);
        while (true) {
            AtomicReference<C11521a<T>[]> atomicReference = this.f404890c;
            C11521a<T>[] c11521aArr = atomicReference.get();
            if (c11521aArr != f404889g) {
                int length = c11521aArr.length;
                C11521a<T>[] c11521aArr2 = new C11521a[length + 1];
                System.arraycopy(c11521aArr, 0, c11521aArr2, 0, length);
                c11521aArr2[length] = c11521a;
                while (!atomicReference.compareAndSet(c11521aArr, c11521aArr2)) {
                    if (atomicReference.get() != c11521aArr) {
                        break;
                    }
                }
                if (c11521a.m()) {
                    A(c11521a);
                    return;
                }
                return;
            }
            Throwable th2 = this.f404891d;
            if (th2 != null) {
                dVar.onError(th2);
                return;
            }
            T t12 = this.f404892e;
            if (t12 != null) {
                c11521a.l(t12);
                return;
            } else {
                if (c11521a.m()) {
                    return;
                }
                c11521a.f419376b.e();
                return;
            }
        }
    }
}
