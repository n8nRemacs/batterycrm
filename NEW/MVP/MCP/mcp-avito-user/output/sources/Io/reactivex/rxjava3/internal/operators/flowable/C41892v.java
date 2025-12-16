package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FlowableConcatArray.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41892v<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final org.reactivestreams.c<? extends T>[] f403039c;

    /* compiled from: FlowableConcatArray.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.flowable.v$a */
    public static final class a<T> extends o41.h implements InterfaceC41782o<T> {
        private static final long serialVersionUID = -8158322871608889516L;

        /* renamed from: j, reason: collision with root package name */
        public final InterfaceC41782o f403040j;

        /* renamed from: k, reason: collision with root package name */
        public final org.reactivestreams.c<? extends T>[] f403041k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicInteger f403042l;

        /* renamed from: m, reason: collision with root package name */
        public int f403043m;

        /* renamed from: n, reason: collision with root package name */
        public long f403044n;

        public a(org.reactivestreams.c[] cVarArr, InterfaceC41782o interfaceC41782o) {
            super(false);
            this.f403040j = interfaceC41782o;
            this.f403041k = cVarArr;
            this.f403042l = new AtomicInteger();
        }

        @Override // org.reactivestreams.d
        public final void e() {
            AtomicInteger atomicInteger = this.f403042l;
            if (atomicInteger.getAndIncrement() == 0) {
                org.reactivestreams.c<? extends T>[] cVarArr = this.f403041k;
                int length = cVarArr.length;
                int i12 = this.f403043m;
                do {
                    InterfaceC41782o interfaceC41782o = this.f403040j;
                    if (i12 == length) {
                        interfaceC41782o.e();
                        return;
                    }
                    org.reactivestreams.c<? extends T> cVar = cVarArr[i12];
                    if (cVar == null) {
                        interfaceC41782o.onError(new NullPointerException("A Publisher entry is null"));
                        return;
                    }
                    long j12 = this.f403044n;
                    if (j12 != 0) {
                        this.f403044n = 0L;
                        f(j12);
                    }
                    cVar.d(this);
                    i12++;
                    this.f403043m = i12;
                } while (atomicInteger.decrementAndGet() != 0);
            }
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            this.f403040j.onError(th2);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f403044n++;
            this.f403040j.onNext(t12);
        }
    }

    public C41892v(org.reactivestreams.c[] cVarArr) {
        this.f403039c = cVarArr;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        a aVar = new a(this.f403039c, (InterfaceC41782o) dVar);
        dVar.K(aVar);
        aVar.e();
    }
}
