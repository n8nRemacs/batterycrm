package hu.akarnokd.rxjava3.basetypes;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import s41.C47998a;

/* compiled from: NonoProcessor.java */
/* loaded from: classes8.dex */
public final class V extends AbstractC41062i implements org.reactivestreams.b<Void, Void> {

    /* renamed from: e, reason: collision with root package name */
    public static final a[] f397634e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    public static final a[] f397635f = new a[0];

    /* renamed from: b, reason: collision with root package name */
    public Throwable f397636b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<a[]> f397637c = new AtomicReference<>(f397634e);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f397638d = new AtomicBoolean();

    /* compiled from: NonoProcessor.java */
    public static final class a extends AbstractC41041b {

        /* renamed from: b, reason: collision with root package name */
        public final org.reactivestreams.d<? super Void> f397639b;

        public a(org.reactivestreams.d dVar) {
            this.f397639b = dVar;
        }
    }

    @Override // org.reactivestreams.d
    public final void K(org.reactivestreams.e eVar) {
        if (this.f397637c.get() == f397635f) {
            eVar.cancel();
        } else {
            eVar.request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [hu.akarnokd.rxjava3.basetypes.V$a, java.util.concurrent.atomic.AtomicInteger, org.reactivestreams.e] */
    @Override // hu.akarnokd.rxjava3.basetypes.AbstractC41062i
    public final void a(org.reactivestreams.d<? super Void> dVar) {
        a[] aVarArr;
        ?? aVar = new a(dVar);
        dVar.K(aVar);
        while (true) {
            AtomicReference<a[]> atomicReference = this.f397637c;
            a[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == f397635f) {
                Throwable th2 = this.f397636b;
                if (th2 != null) {
                    if (aVar.compareAndSet(0, 1)) {
                        aVar.f397639b.onError(th2);
                        return;
                    }
                    return;
                } else {
                    if (aVar.compareAndSet(0, 1)) {
                        aVar.f397639b.e();
                        return;
                    }
                    return;
                }
            }
            int length = aVarArr2.length;
            a[] aVarArr3 = new a[length + 1];
            System.arraycopy(aVarArr2, 0, aVarArr3, 0, length);
            aVarArr3[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr3)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            if (aVar.get() != 0) {
                while (true) {
                    a[] aVarArr4 = atomicReference.get();
                    int length2 = aVarArr4.length;
                    if (length2 == 0) {
                        return;
                    }
                    int i12 = 0;
                    while (true) {
                        if (i12 >= aVarArr4.length) {
                            i12 = -1;
                            break;
                        } else if (aVarArr4[i12] == aVar) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (i12 < 0) {
                        return;
                    }
                    if (length2 == 1) {
                        aVarArr = f397634e;
                    } else {
                        a[] aVarArr5 = new a[length2 - 1];
                        System.arraycopy(aVarArr4, 0, aVarArr5, 0, i12);
                        System.arraycopy(aVarArr4, i12 + 1, aVarArr5, i12, (length2 - i12) - 1);
                        aVarArr = aVarArr5;
                    }
                    while (!atomicReference.compareAndSet(aVarArr4, aVarArr)) {
                        if (atomicReference.get() != aVarArr4) {
                            break;
                        }
                    }
                    return;
                }
            }
            return;
        }
    }

    @Override // org.reactivestreams.d
    public final void e() {
        if (this.f397638d.compareAndSet(false, true)) {
            for (a aVar : this.f397637c.getAndSet(f397635f)) {
                if (aVar.compareAndSet(0, 1)) {
                    aVar.f397639b.e();
                }
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onError(Throwable th2) {
        if (!this.f397638d.compareAndSet(false, true)) {
            C47998a.b(th2);
            return;
        }
        if (th2 == null) {
            th2 = new NullPointerException();
        }
        this.f397636b = th2;
        for (a aVar : this.f397637c.getAndSet(f397635f)) {
            if (aVar.compareAndSet(0, 1)) {
                aVar.f397639b.onError(th2);
            }
        }
    }

    @Override // org.reactivestreams.d
    public final void onNext(Object obj) {
        throw null;
    }
}
