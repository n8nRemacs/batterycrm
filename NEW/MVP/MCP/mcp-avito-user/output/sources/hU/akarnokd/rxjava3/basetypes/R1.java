package hu.akarnokd.rxjava3.basetypes;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: SoloProcessor.java */
/* loaded from: classes8.dex */
public final class R1<T> extends AbstractC41073l1<T> implements org.reactivestreams.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    public static final a[] f397610f = new a[0];

    /* renamed from: g, reason: collision with root package name */
    public static final a[] f397611g = new a[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<a<T>[]> f397612b = new AtomicReference<>(f397610f);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f397613c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public T f397614d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f397615e;

    /* compiled from: SoloProcessor.java */
    public static final class a<T> extends o41.f<T> {
        private static final long serialVersionUID = -8241863418761502064L;

        /* renamed from: d, reason: collision with root package name */
        public final R1<T> f397616d;

        public a(org.reactivestreams.d<? super T> dVar, R1<T> r12) {
            super(dVar);
            this.f397616d = r12;
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f397616d.b(this);
        }
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (this.f397612b.get() == f397611g) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }

    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41073l1
    public final void a(org.reactivestreams.d<? super T> dVar) {
        a<T> aVar = new a<>(dVar, this);
        dVar.K(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f397612b;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == f397611g) {
                Throwable th2 = this.f397615e;
                if (th2 != null) {
                    aVar.f419376b.onError(th2);
                    return;
                } else {
                    aVar.l(this.f397614d);
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
            if (aVar.m()) {
                b(aVar);
                return;
            }
            return;
        }
    }

    public final void b(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.f397612b;
            a<T>[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
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
            if (length == 1) {
                aVarArr = f397610f;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i12);
                System.arraycopy(aVarArr2, i12 + 1, aVarArr3, i12, (length - i12) - 1);
                aVarArr = aVarArr3;
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
    public final void e() {
        AtomicBoolean atomicBoolean = this.f397613c;
        if (atomicBoolean.get()) {
            return;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            NoSuchElementException noSuchElementException = new NoSuchElementException();
            this.f397615e = noSuchElementException;
            for (a<T> aVar : this.f397612b.getAndSet(f397611g)) {
                aVar.f419376b.onError(noSuchElementException);
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        if (!this.f397613c.compareAndSet(false, true)) {
            C47998a.b(th2);
            return;
        }
        this.f397615e = th2;
        for (a<T> aVar : this.f397612b.getAndSet(f397611g)) {
            aVar.f419376b.onError(th2);
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(T t12) {
        if (this.f397613c.compareAndSet(false, true)) {
            this.f397614d = t12;
            for (a<T> aVar : this.f397612b.getAndSet(f397611g)) {
                aVar.l(t12);
            }
        }
    }
}
